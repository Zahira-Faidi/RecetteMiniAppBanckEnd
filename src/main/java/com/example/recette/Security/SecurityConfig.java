package com.example.recette.Security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
 @EnableWebSecurity
    public class SecurityConfig extends WebSecurityConfigurerAdapter{
/*
        @Override
        protected void configure(HttpSecurity http) throws Exception {
            http
                    .authorizeRequests()
                    .antMatchers("/api/public/**").permitAll() // Ajoutez des exceptions pour les ressources publiques
                    .anyRequest().authenticated()
                    .and()
                    .formLogin().loginPage("/login").permitAll() // Configurer la page de connexion
                    .and()
                    .logout().logoutSuccessUrl("/login?logout").permitAll(); // Configurer la page de déconnexion
        }

        @Autowired
        public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
            auth
                    .inMemoryAuthentication()
                    .withUser("user").password(passwordEncoder().encode("password")).roles("USER");
        }

        @Bean
        public PasswordEncoder passwordEncoder() {
            return new BCryptPasswordEncoder();
        }
    }
*/
}
