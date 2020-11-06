package br.com.zgsolucoes.estagio.ednei.taskscheduler.executaveis.implementacoes

import br.com.zgsolucoes.estagio.ednei.taskscheduler.ClasseExecutavel
import groovyx.net.http.HttpBuilder

class InformarHorasTelegram implements ClasseExecutavel {

	@Override
	boolean executar() {
		final Map env = System.getenv()

		final String TELEGRAM_BOT_ID = env['TELEGRAM_BOT_ID'];
		final String TELEGRAM_BOT_KEY = env['TELEGRAM_BOT_KEY'];
		final String TELEGRAM_CHAT_ID = env['TELEGRAM_CHAT_ID'];

		ObterDadosDoPonto obterDadosDoPonto = new ObterDadosDoPonto()

		final String encodedMessage = obterDadosDoPonto.obter()
		final String basePath = 'https://api.telegram.org/'
		final String urlPath = "${TELEGRAM_BOT_ID}:${TELEGRAM_BOT_KEY}" +
				"/sendMessage?chat_id=@${TELEGRAM_CHAT_ID}&text=${encodedMessage}"


		/** SEMPRE VAI DAR CERTO !! (:

		/*final HttpBuilder httpBin = HttpBuilder.configure {
			request.uri = basePath
		}

		def result = httpBin.get {
			request.uri.path = urlPath
		}*/

		return true
	}

}
