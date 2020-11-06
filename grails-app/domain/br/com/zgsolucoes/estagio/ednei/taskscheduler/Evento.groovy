package br.com.zgsolucoes.estagio.ednei.taskscheduler

import grails.compiler.GrailsCompileStatic

import java.time.LocalDateTime

@GrailsCompileStatic
class Evento {

	Execucao execucao
	String descricao
	StatusEvento status
	LocalDateTime dateTime

	static constraints = {
	}
}
