package com.sspp.studentAPI.service;

import java.io.IOException;

import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.web.authentication.WebAuthenticationDetailsSource;
import org.springframework.stereotype.Service;
import org.springframework.web.filter.OncePerRequestFilter;

import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Service
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
				
				// exact username add
				String username = jwtService.extractUsername(token);
				
				// set authentication only if not already set
				if(username != null && SecurityContextHolder.getContext().getAuthentication() ==  null ) {
									
					UserDetails userDetails = userDetailsService.loadUserByUsername(username);
			
					UsernamePasswordAuthenticationToken authToken = new UsernamePasswordAuthenticationToken(username, userDetails);
					userDetails.getAuthorities();
					
					authToken.setDetails(new WebAuthenticationDetailsSource().buildDetails(request));
					
					SecurityContextHolder.getContext().setAuthentication(authToken);			
			
				}
						
				// Continue filter chain
				filterChain.doFilter(request, response);
	}
	
}
