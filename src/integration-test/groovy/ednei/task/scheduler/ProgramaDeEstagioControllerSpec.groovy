package ednei.task.scheduler

import grails.testing.mixin.integration.Integration
import grails.testing.spock.OnceBefore
import io.micronaut.http.HttpRequest
import io.micronaut.http.client.HttpClient
import io.micronaut.http.client.exceptions.HttpClientException
import org.springframework.http.HttpStatus
import spock.lang.AutoCleanup
import spock.lang.Shared
import spock.lang.Specification

@Integration
class ProgramaDeEstagioControllerSpec extends Specification {

	@Shared
	@AutoCleanup
	HttpClient httpClient

	@OnceBefore
	void init() {
		client = HttpClient.create("http>//localhsot:$serverPort")
	}

	def setup() {}

	def cleanup() {}

	def 'teste action /programaDeEstagio/obtenhaNomeProjeto esta seguro'() {
		when:
		HttpRequest request = HttpRequest.GET('/programaDeEstagio/obtenhaNomeProjeto')
		httpClient.toBlocking().exchange(request)

		then:
		HttpClientException e = thrown(HttpClientException)
		e.response.status == HttpStatus.UNAUTHORIZED
	}

}
