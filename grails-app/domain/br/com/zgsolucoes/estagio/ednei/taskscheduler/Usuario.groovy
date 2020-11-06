package br.com.zgsolucoes.estagio.ednei.taskscheduler

import groovy.transform.EqualsAndHashCode
import groovy.transform.ToString
import grails.compiler.GrailsCompileStatic

import java.time.LocalDate

@GrailsCompileStatic
@EqualsAndHashCode(includes='username')
@ToString(includes='username', includeNames=true, includePackage=false)
class Usuario implements Serializable {

    private static final long serialVersionUID = 1

    String username
    String password
    String email;
    LocalDate datanNascimento

    boolean enabled = true
    boolean accountExpired = false
    boolean accountLocked = false
    boolean passwordExpired = false

    static hasMany = [authorities: Papel]

    Set<Papel> getAuthorities() {
        (UsuarioPapel.findAllByUsuario(this) as List<UsuarioPapel>)*.papel as Set<Papel>
    }

    static constraints = {
        password nullable: false, blank: false, password: true
        username nullable: false, blank: false, unique: true
    }

    static mapping = {
	    password column: '`password`'
        authorities joinTable: [name: 'usuario_papel', key: 'usuario_id']
    }
}
