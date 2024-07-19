package com.bilaltours.website.Bilal.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class TourSecurity {

	@Bean(name = "tourSecurityFilterChain")
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
            .authorizeHttpRequests(authorize -> authorize
                .requestMatchers("/Tourbookings/**").permitAll() // Allow unauthenticated access to /bookings endpoints
                .anyRequest().authenticated() // Other requests require authentication
            )
            .csrf(csrf -> csrf.disable()) // Disable CSRF for simplicity in this example (not recommended for production)
            .formLogin(formLogin -> formLogin.disable()); // Disable form login if not needed

        return http.build();
    }
}
