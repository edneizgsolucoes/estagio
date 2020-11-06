package br.com.zgsolucoes.estagio.ednei.taskscheduler

import grails.compiler.GrailsCompileStatic

@GrailsCompileStatic
class Execucao {

    Executavel executavel
    List<ParametroExecucao> parametros;
    List<Evento> eventos
    BigDecimal progresso
    StatusExecucao status

    static constraints = {
    }
}
