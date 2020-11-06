package br.com.zgsolucoes.estagio.ednei.taskscheduler

import br.com.zgsolucoes.estagio.ednei.taskscheduler.executaveis.implementacoes.InformarHorasEmail
import br.com.zgsolucoes.estagio.ednei.taskscheduler.executaveis.implementacoes.InformarHorasTelegram
import br.com.zgsolucoes.estagio.ednei.taskscheduler.executaveis.implementacoes.InformarHorasWhatsapp
import grails.testing.gorm.DomainUnitTest
import grails.testing.services.ServiceUnitTest
import org.springframework.context.ApplicationContext
import spock.lang.Specification

class ClasseExecutavelFactoryServiceSpec extends Specification
        implements ServiceUnitTest<ClasseExecutavelFactoryService>,
                DomainUnitTest<Executavel> {

    void "pegar classe executavel InformarHorasTelegram"() {
        given:
        Executavel executavel = new Executavel(classeExecutavel: classe);
        ApplicationContext applicationContext = Mock(ApplicationContext)
        applicationContext.getBean('InformarHorasTelegram', _) >> {
            return new InformarHorasTelegram()
        }
        applicationContext.getBean('InformarHorasWhatsapp', _) >> {
            return new InformarHorasWhatsapp()
        }
        applicationContext.getBean('InformarHorasEmail', _) >> {
            return new InformarHorasEmail()
        }
        service.applicationContext = applicationContext

        when:
        ClasseExecutavel classeExecutavel = service.procurarClasseExecutavel(executavel)

        then:
        classeExecutavel.class.name.find(classe) != null

        where:
        classe                  | _
        'InformarHorasTelegram' | _
        'InformarHorasWhatsapp' | _
        'InformarHorasEmail' | _

    }
}
