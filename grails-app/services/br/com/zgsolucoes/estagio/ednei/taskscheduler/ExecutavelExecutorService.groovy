package br.com.zgsolucoes.estagio.ednei.taskscheduler


import grails.compiler.GrailsCompileStatic
import grails.gorm.transactions.Transactional

@Transactional
@GrailsCompileStatic
class ExecutavelExecutorService {

    ClasseExecutavelFactoryService classeExecutavelFactoryService

    //informar horas completas no dia pelo telegram
    def executar(final String titulo) {
        final Executavel executavel = consultarExecutavel(titulo)
        final ClasseExecutavel classeExecutavel = procurarClasseExecutavel(executavel)
        classeExecutavel.executar()
    }

    private Executavel consultarExecutavel(final String titulo) {
        final Executavel executavel = Executavel.findByTitulo(titulo);
        return executavel
    }

    private ClasseExecutavel procurarClasseExecutavel(final Executavel executavel) {
        return classeExecutavelFactoryService.procurarClasseExecutavel(executavel)
    }
}
