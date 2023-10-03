package in.practice.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {


	static {
		System.out.println("SecurityConfigApp.class is loading...");
	}

	public SecurityConfig() {
		System.out.println("SecurityConfigApp.SecurityConfigApp()");
	}

	@Bean
	public SecurityFilterChain userDefinedFilter(HttpSecurity http) throws Exception {
		System.out.println("SecurityConfigApp.userDefinedFilter()");
		
		
		http.authorizeHttpRequests(
				request -> request.
						   requestMatchers("/bank/","/bank/aboutus","/bank/login").
						   permitAll().
						   anyRequest().
						   authenticated()).
						   formLogin();

		return http.build();

	}
}
