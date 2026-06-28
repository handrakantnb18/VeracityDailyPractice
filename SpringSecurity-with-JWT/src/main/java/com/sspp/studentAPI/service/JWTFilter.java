package com.sspp.studentAPI.service;

import java.io.IOException;

import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.filter.OncePerRequestFilter;

import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class JWTFilter extends OncePerRequestFilter {

	private final JWTUtil jwtService;
	private final CustomUserDetailsService userDetailsService;
	
	public JWTFilter(JWTUtil jwtService, CustomUserDetailsService userDetailsService)
	{
		this.jwtService = jwtService;
		this.userDetailsService = userDetailsService;
	}
	
	@Override
	protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
			throws ServletException, IOException {
		
		final String authHeater = request.getHeader("Authorization");
				
				if (authHeater == null || !authHeater.startsWith("Bearer"))
				{
					filterChain.doFilter(request, response);
					return;
				}
				
				String token = authHeater.substring(1);
				if(!jwtService.validateToken(token))
				{
					response.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
					return;
				}
				
				String username = jwtService.extractUsername(token);
				
				if(username != null && SecurityContextHolder.getContext().getAuthentication()) == 
						
						UserDetails userDetails = userDetailsService.loadUserByUsername(username);
				
						UsernamePasswordAuthenticationToken authToken = new UsernamePasswordAuthenticationToken(username, userDetails);
						userDetails.getAuthorities());
				
	}
	
	

	
}
