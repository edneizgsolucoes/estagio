package ednei.task.scheduler

import org.springframework.http.HttpStatus

class ProgramaDeEstagioController {

    def obtenhaNomeProjeto() {
        render([contentType: 'application/json', status: HttpStatus.OK], 'Ednei-task-scheduler') as Object
    }
}
