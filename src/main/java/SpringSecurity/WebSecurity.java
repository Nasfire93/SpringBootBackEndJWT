package SpringSecurity;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

    @Configuration
    @EnableWebSecurity
    public class WebSecurity extends WebSecurityConfigurerAdapter {

        @Override
        protected void configure(AuthenticationManagerBuilder auth) throws Exception {


            auth.inMemoryAuthentication().withUser("pepe").password(passwordEncoder().encode("pepe")).roles("pepe");
            auth.inMemoryAuthentication()
                    .withUser("user").password(passwordEncoder().encode("user")).roles("NEW")
                    .and()
                    .withUser("sudo").password(passwordEncoder().encode("123")).roles("SENSEI");
        }

        @Bean
        public PasswordEncoder passwordEncoder() {
            return new BCryptPasswordEncoder();
        }

        @Override
        public void configure(HttpSecurity http) throws Exception {
            http.authorizeRequests()
                    .antMatchers("/login2").hasRole("pepe")
                    .and().formLogin();
        }
    }