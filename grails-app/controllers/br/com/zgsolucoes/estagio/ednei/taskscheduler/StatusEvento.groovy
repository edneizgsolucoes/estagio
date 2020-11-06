package br.com.zgsolucoes.estagio.ednei.taskscheduler

import groovy.transform.CompileStatic

@CompileStatic
enum StatusEvento {

	ERRO('Erro'),
	SUCESSO('Sucesso'),
	ADVERTENCIA('Advertencia')

	String descricao

	StatusEvento(final String descricao) {
		this.descricao = descricao
	}

}