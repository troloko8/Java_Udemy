package Nathan.spring_security.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfiguration   {

    @Bean
    public PasswordEncoder passwordEncoder() {
        return NoOpPasswordEncoder.getInstance();
    }

    @Autowired
    private UserDetailsService userDetailsService;

    // @Bean
    // public AuthenticationProvider authProvider() {
    //     DaoAuthenticationProvider provider = new DaoAuthenticationProvider();

    //     provider.setUserDetailsService();
    //     provider.setPasswordEncoder(NoOpPasswordEncoder.getInstance());

    //     return provider;
    // }

    @Bean
    public AuthenticationProvider authProvider(UserDetailsService userDetailsService, PasswordEncoder passwordEncoder) {
        DaoAuthenticationProvider provider = new DaoAuthenticationProvider(userDetailsService);

        provider.setPasswordEncoder(passwordEncoder);

        return provider;
    }
    
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
            // .formLogin(Customizer.withDefaults())
            .httpBasic(Customizer.withDefaults())
            .sessionManagement(session -> session.sessionCreationPolicy(SessionCreationPolicy.STATELESS));

        return http.build();
    }

    // Example with static values, not recommended for production

    // @Bean
    // public UserDetailsService userDetailsService() {

    //     UserDetails user = User
    //         .withDefaultPasswordEncoder()
    //         .username("nathan")
    //         .password("1234")
    //         .roles("USER")
    //         .build();


    //     UserDetails admin = User
    //         .withDefaultPasswordEncoder()
    //         .username("alice")
    //         .password("1234")
    //         .roles("ADMIN")
    //         .build();

    //     return new InMemoryUserDetailsManager(user, admin);
    // }
}
