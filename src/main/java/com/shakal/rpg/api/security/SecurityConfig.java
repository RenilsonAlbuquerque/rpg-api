package com.shakal.rpg.api.security;





import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.domain.AuditorAware;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;

import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.CorsConfigurationSource;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;

import com.shakal.rpg.api.filedata.strategy.DriveExternalFileStorageImplementation;
import com.shakal.rpg.api.filedata.strategy.IExternalFileStorageStrategy;
import com.shakal.rpg.api.filedata.strategy.LocalFileStorageImplementation;
import com.shakal.rpg.api.handler.CustomAccessDeniedHandler;
import com.shakal.rpg.api.utils.Constants;

@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true)
@EnableJpaAuditing
public class SecurityConfig extends WebSecurityConfigurerAdapter {

	

	@Override
	protected void configure(HttpSecurity http) throws Exception {

		http.cors().and().csrf().disable().authorizeRequests().antMatchers(HttpMethod.POST, "/login","/user/").permitAll()
				.antMatchers(Constants.SWAGGER_STRINGS).permitAll()
				.antMatchers(HttpMethod.GET,"/player/state/create/**").permitAll()
				.anyRequest().authenticated().and()
				
				.addFilterBefore(new JwtAuthenticationFilter(Constants.LOGIN_PATH, authenticationManager()),
						UsernamePasswordAuthenticationFilter.class)
				.addFilterBefore(new JwtAuthorizationFilter(),
						UsernamePasswordAuthenticationFilter.class)
				.sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS)
				.and().exceptionHandling().accessDeniedHandler(accessDeniedHandler());

	}

	@Bean
	public CorsConfigurationSource corsConfigurationSource() {
		final UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
		source.registerCorsConfiguration("/**", new CorsConfiguration().applyPermitDefaultValues());
		return source;
	}

	@Bean
	public CustomAccessDeniedHandler accessDeniedHandler() {
		return new CustomAccessDeniedHandler();
	}
	@Override
	public void configure(WebSecurity web) throws Exception {
	    web.ignoring().antMatchers("/user");
	}
	
	@Bean
	public AuditorAware<Long> auditorProvider() {
	   return new SecurityAuditorAware();
	}
	
	@Bean
	public IExternalFileStorageStrategy getExternalFileStorageStrategy() {
		//return new LocalFileStorageImplementation();
		return new DriveExternalFileStorageImplementation();
	}
	
	
	

}