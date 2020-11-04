package br.com.zgsolucoes.estagio.ednei.taskscheduler

import grails.compiler.GrailsCompileStatic

@GrailsCompileStatic
class Executavel {

    String titulo
    String classeExecutavel

    static constraints = {
        titulo unique: true
    }
}
