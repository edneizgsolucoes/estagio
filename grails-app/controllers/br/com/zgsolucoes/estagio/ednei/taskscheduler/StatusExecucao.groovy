package br.com.zgsolucoes.estagio.ednei.taskscheduler

import groovy.transform.CompileStatic

@CompileStatic
enum StatusExecucao {

	ERRO('Erro'),
	CONCLUIDO('Concluido'),
	EM_EXECUCAO('Em execucao')

	String descricao

	StatusExecucao(final String descricao) {
		this.descricao = descricao
	}

}