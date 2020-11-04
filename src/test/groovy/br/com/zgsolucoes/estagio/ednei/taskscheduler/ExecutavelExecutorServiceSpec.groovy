package br.com.zgsolucoes.estagio.ednei.taskscheduler

import grails.testing.gorm.DomainUnitTest
import grails.testing.services.ServiceUnitTest
import spock.lang.Specification

class ExecutavelExecutorServiceSpec extends Specification
		implements ServiceUnitTest<ExecutavelExecutorService>, DomainUnitTest<Executavel> {

	def setup() {
		/** vazio */
	}

	void "Executar algum executal com sucesso"() {
		given:
		final ClasseExecutavelFactoryService classeExecutavelFactoryServiceMock = Mock(ClasseExecutavelFactoryService)
		final ClasseExecutavel classeExecutavelMock = Mock(ClasseExecutavel)
		classeExecutavelMock.executar() >> true
		classeExecutavelFactoryServiceMock.procurarClasseExecutavel(_ as Executavel) >> {
			return classeExecutavelMock
		}

		service.classeExecutavelFactoryService = classeExecutavelFactoryServiceMock

		and: 'eu tenho uma executavel'
		final String titulo = 'informar horas completas no dia pelo instagram'
		final String classeExecutavel = 'br.com.zgsolucoes.estagio.ednei.taskscheduler.executaveis.implementacoes.InformarHorasTelegram'
		final Executavel executavel = new Executavel(titulo: titulo, classeExecutavel: classeExecutavel)
		executavel.save()

		when: 'eu disparar a execucao'
		final boolean sucesso = service.executar(executavel.titulo)

		then: ' o retorno deve ser true'
		sucesso

	}

	void "Executar algum executal sem sucesso"() {
		given:
		final ClasseExecutavelFactoryService classeExecutavelFactoryServiceMock = Mock(ClasseExecutavelFactoryService)
		final ClasseExecutavel classeExecutavelMock = Mock(ClasseExecutavel)
		classeExecutavelMock.executar() >> false
		classeExecutavelFactoryServiceMock.procurarClasseExecutavel(_ as Executavel) >> {
			return classeExecutavelMock
		}

		service.classeExecutavelFactoryService = classeExecutavelFactoryServiceMock

		and: 'eu tenho uma executavel'
		final String titulo = 'informar horas completas no dia pelo instagram'
		final String classeExecutavel = 'br.com.zgsolucoes.estagio.ednei.taskscheduler.executaveis.implementacoes.InformarHorasTelegram'
		final Executavel executavel = new Executavel(titulo: titulo, classeExecutavel: classeExecutavel)
		executavel.save()

		when: 'eu disparar a execucao'
		final boolean sucesso = service.executar(executavel.titulo)

		then: ' o retorno deve ser false'
		!sucesso

	}

	def cleanup() {
	}
}
