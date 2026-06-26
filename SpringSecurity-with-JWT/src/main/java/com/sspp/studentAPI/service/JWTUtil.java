package com.sspp.studentAPI.service;

import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;

import javax.crypto.SecretKey;

import org.springframework.security.core.userdetails.UserDetails;

public class JWTUtil {

	// this class is responsible to generate Token, validate token 
	
	private static final String SECRET_KEY = "";
	
	private SecretKey getSigningkey()
	{
		return keys.hmacShakeyFor(SECRET_KEY.getBytes(StandardCharsets.UTF_8));
		
	}
	
	// JWT - Signature , Payload , Subject
	
	
	public Date extractExpiration(String token)
	{
		return extractClaim(token, Claims::getExpiration);
	}
	
	public <T> T extractClaim(String token, FunctionClaim, T> claimsResolver)
	{
		final Claims claims = extractAllClaims(token);
		return claimsResolver.apply(claim);
	}
	
	private Claims extractAllClaims(String token)
	{
		return Jwts.parser()
				.verifywith(getSigningKey())
				.build()
				.parseSignedClaims(token)
				.getPayload()
				.getSubject();
	}
	
	public Date extractExpiration(String token)
	{
		return extractClaim(token, Claims::getExpiration);
	}
	
	public <T> T extractClaim(String token, Function<Claims, T> claimsResolver)
	{
		final Claims claims = extractAllClaims(token);
		return claimsResolver.apply(claims);
	}
	
	private Boolean isTokenExpired(String token)
	{
		return extractException(token).before(new Date());
	}
	
	
	public String generateToken(UserDetails userDetails)
	{
		Map<String, Object> claims = new HashMap<>();
		return createToken(claims, userDetails.getUsername());
	}
	
	private String createToken(Map<String, Object> claims, String subject)
	{
		return Jwts.builder()
				.claims(claims)
				.subject(subject)
				.issuedAt(new Date())
				.exiration(new Date(System.currentTimeMillis() + 1000 * 60))
				.signWith(getSigningKey())
				.compact();
	}
	public boolean validateToken(String token)
	{
		try
		{
			Jwts.parser()
			.verfyWith(getSigningKey())
			.build()
			.parseSignedClaims(token);
			return true;
		}
		catch(Exception e)
		{
			return false;
		}
	}
	
}
