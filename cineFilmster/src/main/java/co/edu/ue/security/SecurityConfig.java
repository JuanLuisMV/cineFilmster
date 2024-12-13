package co.edu.ue.security;

import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

import io.swagger.v3.oas.models.PathItem.HttpMethod;

@EnableWebSecurity
@Configuration
public class SecurityConfig {

	//Swagger = http://localhost:8080/swagger-ui/index.html
	
	
    @Bean
    public InMemoryUserDetailsManager userManager() {
        List<UserDetails> users = List.of(
                User.withUsername("client").password("{noop}1234")
                        .roles("Users").build(),
                User.withUsername("admin").password("{noop}1234")
                        .roles("Admins").build()
        );
        return new InMemoryUserDetailsManager(users);
    }

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http.csrf(csrf -> csrf.disable())
            .authorizeHttpRequests(auth -> {
            	//authentication Swagger
            	auth.requestMatchers("/swagger-ui/**", "/v3/api-docs/**,\"/swagger-ui.html\", \"/swagger-resources/**").permitAll();
            	//Method Save
                auth.requestMatchers(org.springframework.http.HttpMethod.POST, 
                		"genero-save","admin-save","cliente-save","horario-save"
                		,"pelicula-save","position-save","reserva-save","boleta-save"
                		,"ingreso-save","proveedor-save"
                		).hasRole("Admins");
                //Method up
                auth.requestMatchers(org.springframework.http.HttpMethod.PUT,
                		"genero/up/{id}","admin/up/{id}","cliente/up/{id}"
                		,"horario/up/{id}","pelicula/up/{id}","position/up/{id}"
                		,"reserva/up/{id}","boleta/up/{id}","ingreso/up/{id}","proveedor/up/{id}"
                		
                		).hasRole("Admins");
                //Method Delete
                auth.requestMatchers(org.springframework.http.HttpMethod.DELETE, 
                		"genero/delete/{id}","admin/delete/{id}","cliente/delete/{id}"
                		,"horario/delete/{id}","pelicula/delete/{id}","position/date/{date}"
                		,"reserva/delete/{id}","boleta/delete/{id}","ingreso/delete/{id}",
                		"proveedore/delete/{id}"
                		
                		).hasRole("Admins");
                //Method Find all
                auth.requestMatchers(org.springframework.http.HttpMethod.GET,
                		"genero-all","admin-all","cliente-all","horario-all"
                		,"pelicula-all","position-all","reserva-all","boleta-all","ingreso-all"
                		,"proveedor-all"
                		
                		).hasRole("Users");
                //Method Find By Date
                auth.requestMatchers(org.springframework.http.HttpMethod.GET,
                		"admin/date/{date}","cliente/date/{date}","horario/date/{date}"
                		,"pelicula/date/{date}","position/date/{date}","reserva/date/{date}"
                		,"boleta/date/{date}","ingreso/date/{date}"
                		).hasRole("Users");
                //Method Find By ID
                auth.requestMatchers(org.springframework.http.HttpMethod.GET, 
                		"genero/id/{id}","admin/id/{id}","cliente/id/{id}","horario/id/{id}"
                		,"pelicula/id/{id}","position/id/{id}","reserva/id/{id}"
                		,"boleta/id/{id}","ingreso/id/{id}","proveedor/id/{id}"
                		).hasRole("Users");
                auth.anyRequest().authenticated();
            })
            .httpBasic(Customizer.withDefaults())
            .formLogin(login -> login.permitAll());
        

        return http.build();
    }
}
