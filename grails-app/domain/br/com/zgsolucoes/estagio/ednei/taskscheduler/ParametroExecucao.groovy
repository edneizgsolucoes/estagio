package br.com.zgsolucoes.estagio.ednei.taskscheduler

import grails.compiler.GrailsCompileStatic

@GrailsCompileStatic
class ParametroExecucao {

    Execucao execucao

    Parametro parametro
    String valor

    static constraints = {
        id insert: false, update: false
    }
}
