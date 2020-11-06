package br.com.zgsolucoes.estagio.ednei.taskscheduler.executaveis.implementacoes

import spock.lang.Specification


class InformarHorasTelegramSpec extends Specification {

	def 'enviar dados do ponto pelo Telegram'() {
		given:
		final InformarHorasTelegram informarHorasTelegram = new InformarHorasTelegram()

		when:
		final Boolean resultado = informarHorasTelegram.executar()

		then:
		resultado

	}

}
