//
//
//// Added by the Spring Security Core plugin:
//grails.plugin.springsecurity.userLookup.userDomainClassName = 'br.com.zgsolucoes.estagio.ednei.ednei.task.scheduler.Usuario'
//grails.plugin.springsecurity.userLookup.authorityJoinClassName = 'br.com.zgsolucoes.estagio.ednei.ednei.task.scheduler.UsuarioPapel'
//grails.plugin.springsecurity.authority.className = 'br.com.zgsolucoes.estagio.ednei.ednei.task.scheduler.Papel'
//grails.plugin.springsecurity.controllerAnnotations.staticRules = [
//	[pattern: '/',               access: ['permitAll']],
//	[pattern: '/error',          access: ['permitAll']],
//	[pattern: '/index',          access: ['permitAll']],
//	[pattern: '/index.gsp',      access: ['permitAll']],
//	[pattern: '/shutdown',       access: ['permitAll']],
//	[pattern: '/assets/**',      access: ['permitAll']],
//	[pattern: '/**/js/**',       access: ['permitAll']],
//	[pattern: '/**/css/**',      access: ['permitAll']],
//	[pattern: '/**/images/**',   access: ['permitAll']],
//	[pattern: '/**/favicon.ico', access: ['permitAll']]
//]
//
//grails.plugin.springsecurity.filterChain.chainMap = [
//	[pattern: '/assets/**',      filters: 'none'],
//	[pattern: '/**/js/**',       filters: 'none'],
//	[pattern: '/**/css/**',      filters: 'none'],
//	[pattern: '/**/images/**',   filters: 'none'],
//	[pattern: '/**/favicon.ico', filters: 'none'],
//	[pattern: '/**',             filters: 'JOINED_FILTERS']
//]
//

grails {
	plugin {
		springsecurity {
			rest {
				token {
					storage {
						jwt {
							secret = 'zgsolucoesTaskSchedulerProgramaDeEstagio'
						}
					}
				}
			}
			securityConfigType = "InterceptUrlMap"
			filterChain {
				chainMap = [
				        [pattern: '/**', filters: 'JOINED_FILTERS,-anonymousAuthenticationFilter,-exceptionTranslationFilter,-authenticationProcessingFilter,-securityContextPersistenceFilter,-rememberMeAuthenticationFilter']
				]
			}
			userLookup {
				userDomainClassName = "br.com.zgsolucoes.estagio.ednei.ednei.task.scheduler.Usuario"
				authorityJoinClassName = "br.com.zgsolucoes.estagio.ednei.ednei.task.scheduler.UsuarioPapel"
			}
			authority {
				className = "br.com.zgsolucoes.estagio.ednei.ednei.task.scheduler.Papel"
			}
			intercerpUrlMap = [
			        [pattern: '/**', access: ['ROLE_ADMIN']]
			]
		}
	}
}