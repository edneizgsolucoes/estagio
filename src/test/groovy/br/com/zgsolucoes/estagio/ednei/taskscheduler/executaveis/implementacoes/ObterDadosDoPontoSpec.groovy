package br.com.zgsolucoes.estagio.ednei.taskscheduler.executaveis.implementacoes

import spock.lang.Specification

class ObterDadosDoPontoSpec extends Specification {

	def 'obter dados do ponto'() {
		given:
		ObterDadosDoPonto obterDadosDoPonto = new ObterDadosDoPonto()

		when:
		final String dadosPonto = obterDadosDoPonto.obter()
		println(dadosPonto)

		then:
		dadosPonto != '' && dadosPonto != null
	}
}
