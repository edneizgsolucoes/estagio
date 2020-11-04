package br.com.zgsolucoes.estagio.ednei.taskscheduler


import grails.compiler.GrailsCompileStatic
import org.springframework.http.HttpStatus

@GrailsCompileStatic
class ExecutavelController {

	ExecutavelCrudService executavelCrudService;
	ExecutavelExecutorService executorService;

	//http://loalhost:8080/executavel/criarExecutavel
	def criarExecutavel(String titulo, String classeExecutavel) {
		if (!titulo || !classeExecutavel) {
			render { status:
			HttpStatus.BAD_REQUEST }
			return
		}

		executavelCrudService.criarExecutavel(titulo, classeExecutavel);
	}

	//informar horas completas no dia pelo instagram
	def executar(final String titulo) {
		executorService.executar(titulo);
	}
}
