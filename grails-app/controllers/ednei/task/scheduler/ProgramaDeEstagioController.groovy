package ednei.task.scheduler

import org.springframework.http.HttpStatus

class ProgramaDeEstagioController {

    def obtenhaNomePrograma() {
        render([contentType: 'application/json', status: HttpStatus.OK], 'Ednei-task-scheduler') as Object
    }
}
