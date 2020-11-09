package br.com.zgsolucoes.estagio.ednei.taskscheduler

import grails.compiler.GrailsCompileStatic
import grails.gorm.transactions.Transactional
import org.springframework.context.ApplicationContext

@Transactional
@GrailsCompileStatic
class ClasseExecutavelFactoryService {

	ApplicationContext applicationContext

	ClasseExecutavel procurarClasseExecutavel(Executavel executavel) {
		final Class clazz = Class.forName("br.com.zgsolucoes.estagio.ednei.taskscheduler.executaveis.implementacoes.${executavel.classeExecutavel}")

		final ClasseExecutavel classeExecutavel = (ClasseExecutavel) applicationContext.getBean(executavel.classeExecutavel, clazz);

		return classeExecutavel
	}

}
