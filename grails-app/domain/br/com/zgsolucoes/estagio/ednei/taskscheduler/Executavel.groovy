package br.com.zgsolucoes.estagio.ednei.taskscheduler

import grails.compiler.GrailsCompileStatic

@GrailsCompileStatic
class Executavel {

    String titulo
    String classeExecutavel
    List<Parametro> parametros;

    static constraints = {
        titulo unique: true
    }
}
