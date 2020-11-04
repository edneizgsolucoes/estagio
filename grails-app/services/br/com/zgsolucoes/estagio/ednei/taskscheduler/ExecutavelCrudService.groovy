package br.com.zgsolucoes.estagio.ednei.taskscheduler

import br.com.zgsolucoes.estagio.ednei.taskscheduler.Executavel
import grails.gorm.transactions.Transactional
import groovy.transform.CompileStatic

@Transactional
@CompileStatic
class ExecutavelCrudService {

    def criarExecutavel(final String titulo, final String classeExecutavel) {
        final Executavel executavel = new Executavel(titulo: titulo, classeExecutavel: classeExecutavel);
        executavel.save()
    }
}
