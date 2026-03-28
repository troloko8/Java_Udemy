package Nathan.spring_security.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.security.core.userdetails.User;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configurers.CsrfConfigurer;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfiguration   {
    
    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {

        // Customizer<CsrfConfigurer<HttpSecurity>> csrfCustomizer = new Customizer<CsrfConfigurer<HttpSecurity>>() {
        //     @Override
        //     public void customize(CsrfConfigurer<HttpSecurity> httpSecurityCsrfConfigurer) {
        //         httpSecurityCsrfConfigurer.disable();
        //     }
        // };

        // lambda solution
        http
            .csrf(customizer -> customizer.disable())
            .authorizeHttpRequests(requsts -> requsts.anyRequest().authenticated())
            .formLogin(Customizer.withDefaults())
            .httpBasic(Customizer.withDefaults())
            .sessionManagement(session -> session.sessionCreationPolicy(SessionCreationPolicy.STATELESS));

        return http.build();
    }

    public UserDetailsService userDetailsService() {

        UserDetails user = User
            .withDefaultPasswordEncoder()
            .username("nathan")
            .password("1234")
            .roles("USER")
            .build();


        UserDetails admin = User
            .withDefaultPasswordEncoder()
            .username("alice")
            .password("1234")
            .roles("ADMIN")
            .build();

        return new InMemoryUserDetailsManager(user, admin);
    }
}
