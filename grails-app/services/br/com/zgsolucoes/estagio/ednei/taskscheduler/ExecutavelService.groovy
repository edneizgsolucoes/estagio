package br.com.zgsolucoes.estagio.ednei.taskscheduler

import grails.gorm.services.Service

@Service(Executavel)
interface ExecutavelService {

    Executavel get(Serializable id)

    List<Executavel> list(Map args)

    Long count()

    void delete(Serializable id)

    Executavel save(Executavel executavel)

}