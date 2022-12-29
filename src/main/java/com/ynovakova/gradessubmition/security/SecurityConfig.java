package com.ynovakova.gradessubmition.security;

import com.ynovakova.gradessubmition.security.filter.AuthenticationFilter;
import com.ynovakova.gradessubmition.security.filter.ExceptionHandlerFilter;
import com.ynovakova.gradessubmition.security.filter.JWTAuthorizationFilter;
import com.ynovakova.gradessubmition.security.manager.CustomAuthenticationManager;
import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@AllArgsConstructor
public class SecurityConfig {

    CustomAuthenticationManager customAuthenticationManager;

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        AuthenticationFilter authenticationFilter = new AuthenticationFilter(customAuthenticationManager);
        authenticationFilter.setFilterProcessesUrl("/authenticate");
        http
                .headers().frameOptions().disable() // New Line: the h2 console runs on a "frame"
                // . By default, Spring Security prevents rendering within an iframe. This line disables its prevention.
                .and()
                .csrf().disable()
                .authorizeHttpRequests()
                .requestMatchers("/h2/**").permitAll() // New Line: allows us to access the h2 console
                // without the need to authenticate. ' ** '  instead of ' * ' because multiple path levels will follow /h2.
                .requestMatchers(HttpMethod.POST, SecurityConstants.REGISTER_PATH).permitAll()
                .anyRequest().authenticated()
                .and()
                .addFilterBefore(new ExceptionHandlerFilter(), AuthenticationFilter.class)
                .addFilter(authenticationFilter)
                .addFilterAfter(new JWTAuthorizationFilter(), AuthenticationFilter.class)
                .sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS);
        return http.build();
    }
}
