package com.shakal.rpg.api.security;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.google.gson.Gson;
import com.shakal.rpg.api.dto.auth.GenericLoginDTO;
import com.shakal.rpg.api.dto.auth.LoginReturnUserDTO;
import com.shakal.rpg.api.handler.SecurityHandlerExceptionBuilder;
import com.shakal.rpg.api.helpers.AuthHelper;
import com.shakal.rpg.api.security.authentication.GenericAuthenticationContext;
import com.shakal.rpg.api.utils.Messages;

import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.AbstractAuthenticationProcessingFilter;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class JwtAuthenticationFilter extends AbstractAuthenticationProcessingFilter {


  

    protected JwtAuthenticationFilter(String url, AuthenticationManager authManager) {
        super(new AntPathRequestMatcher(url));
        setAuthenticationManager(authManager);
    }

    @Override
    public Authentication attemptAuthentication(HttpServletRequest request, HttpServletResponse response) throws AuthenticationException {
    	GenericLoginDTO loginDTO = null;
      
        try{
        	
            loginDTO = AuthHelper.mapLoginStrategy(request.getInputStream());
            
            return getAuthenticationManager().authenticate(
            		new GenericAuthenticationContext(loginDTO)
            		);
        
        }catch(JsonProcessingException e){
            throw new BadCredentialsException(Messages.INVALID_JSON_FORMAT);
        }
        catch(IOException e2){
            throw new BadCredentialsException(Messages.INVALID_JSON_FORMAT);
        }
    }
    @Override
    protected void successfulAuthentication(
            HttpServletRequest req,
            HttpServletResponse res, FilterChain chain,
            Authentication auth) throws IOException, ServletException {
    	GenericAuthenticationContext customAuth = (GenericAuthenticationContext) auth;
    	
    	String token = JwtTokenProvider.addAuthentication(
    			customAuth.getId(),
    			customAuth.getName(),
    			customAuth.getAuthorities());
    	String json = new Gson().toJson( new LoginReturnUserDTO(
    			customAuth.getId(),
    			customAuth.getName(),
    			customAuth.getName(),
    			token
    	));
    	
    	res.setContentType("application/json");
        res.setCharacterEncoding("UTF-8");
        res.getWriter().println(json);
        res.setHeader("Authorization", token);
        res.setStatus(HttpServletResponse.SC_OK);
    	
        
    }


    @Override
    protected void unsuccessfulAuthentication(HttpServletRequest request, HttpServletResponse response, AuthenticationException failed) throws IOException {
        SecurityHandlerExceptionBuilder.handleError(response,HttpServletResponse.SC_UNAUTHORIZED,failed);
    }
}
