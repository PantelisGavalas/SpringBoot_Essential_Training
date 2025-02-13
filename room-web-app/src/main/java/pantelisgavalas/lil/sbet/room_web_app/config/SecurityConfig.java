package pantelisgavalas.lil.sbet.room_web_app.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

/**
 * Configuration class for Spring Security.
 * This class defines the SecurityFilterChain bean to provide custom security configurations.
 */
@Configuration
@EnableWebSecurity
public class SecurityConfig {

    /**
     * Define the security filter chain.
     *
     * @param http the HttpSecurity object to configure.
     * @return the SecurityFilterChain bean.
     * @throws Exception if an error occurs during configuration.
     */
    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
                // Configure authorization rules
                .authorizeHttpRequests((authorize) -> authorize
                        // Allow access to these paths
                        .requestMatchers("/", "/api/*", "/login", "/logout").permitAll()
                        // Require authentication for any other request
                        .anyRequest().authenticated()
                )
                // Configure form-based login
                .formLogin((form) -> form // Use form login
                        // Specify the custom login page URL
                        .loginPage("/login")
                        // Allow everyone to access the login page
                        .permitAll()
                )
                // Configure logout functionality
                .logout((logout) -> logout
                        // URL for logout (optional, defaults to /logout)
                        .logoutUrl("/logout")
                        // Redirect after logout (optional, defaults to /login?logout)
                        .logoutSuccessUrl("/")
                        // Allow everyone to access the logout functionality
                        .permitAll()
                );

        // Return the configured SecurityFilterChain
        return http.build();
    }

    @Autowired
    public void ConfigureGlobal(AuthenticationManagerBuilder auth) throws Exception {
        /**
         * Set up in-memory authentication, meaning the user credentials are stored directly in memory
         * NoOpPasswordEncoder is a password encoder that does not encrypt the password.  It stores the password in plain text. So:
         * NEVER use deprecated 'NoOpPasswordEncoder' outside of demo purpose
         * Create the user with the specified username, plain text password, and role.
         * For password encoding -> USE BCryptPasswordEncoder
         * */
        auth.inMemoryAuthentication().passwordEncoder(NoOpPasswordEncoder.getInstance())
                .withUser("user").password("password").roles("USER");
    }
}