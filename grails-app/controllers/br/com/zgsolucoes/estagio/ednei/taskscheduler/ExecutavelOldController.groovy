package br.com.zgsolucoes.estagio.ednei.taskscheduler


import grails.compiler.GrailsCompileStatic
import org.springframework.http.HttpStatus

@GrailsCompileStatic
class ExecutavelOldController {

	ExecutavelExecutorService executorService;

	//informar horas completas no dia pelo instagram
	def executar(final String titulo) {
		executorService.executar(titulo);
	}
}
