package SpringSecurity;

import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

    @EnableWebSecurity
    public class WebSecurity extends WebSecurityConfigurerAdapter {
        @Override
        protected void configure(AuthenticationManagerBuilder auth) throws Exception {
            auth.inMemoryAuthentication().withUser("pepe").password("pepe").roles("pepe");
            auth.inMemoryAuthentication()
                    .withUser("user").password("user").roles("NEW")
                    .and()
                    .withUser("sudo").password("123").roles("SENSEI");
        }

        @Bean
        public PasswordEncoder getPasswordEncoder() {
            return NoOpPasswordEncoder.getInstance();
        }

        @Override
        public void configure(HttpSecurity http) throws Exception {
            http.authorizeRequests()
                    .antMatchers("/login2").hasRole("SENSEI")
                    .and().formLogin();
        }
    }





