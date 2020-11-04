package br.com.zgsolucoes.estagio.ednei.taskscheduler

import grails.compiler.GrailsCompileStatic
import grails.gorm.transactions.Transactional

@Transactional
@GrailsCompileStatic
class ClasseExecutavelFactoryService {

	ClasseExecutavel procurarClasseExecutavel(Executavel executavel) {
		final Class clazz = Class.forName(executavel.classeExecutavel)
		final ClasseExecutavel classeExecutavel = (ClasseExecutavel) clazz.newInstance()
		return classeExecutavel
	}

}
