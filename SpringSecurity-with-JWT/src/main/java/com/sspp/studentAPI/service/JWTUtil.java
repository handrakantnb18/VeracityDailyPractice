package com.sspp.studentAPI.service;

import java.nio.charset.StandardCharsets;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

import javax.crypto.SecretKey;

import org.springframework.security.core.userdetails.UserDetails;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.security.Keys;

public class JWTUtil {

	// this class is responsible to generate Token, validate token 
	
	private static final String SECRET_KEY = "mysecretkeymysecretkeymysecretkey12345";
	
	private SecretKey getSigningkey()
	{
		return Keys.hmacShaKeyFor(SECRET_KEY.getBytes(StandardCharsets.UTF_8));
		
	}
	
	// JWT - Signature , Payload , Subject
	
	public String extractUsername(String token)
	{
		return Jwts.parser()
				.verifyWith(getSigningkey())
				.build()
				.parseSignedClaims(token)
				.getPayload()
				.getSubject();
	
	}
	
	public Date extractExpirationDate(String token)
	{
		return extractClaim(token, Claims::getExpiration);
	}
	
	public <T> T extractClaim(String token, Function<Claims, T> claimsResolver)
	{
		final Claims claims = extractAllClaims(token);
		return claimsResolver.apply(claims);
	}
	
	private Claims extractAllClaims(String token)
	{
		return Jwts.parser()
				.verifyWith(getSigningkey())
				.build()
				.parseSignedClaims(token)
				.getPayload();
				//.getSubject();
	}
	
	
	private Boolean isTokenExpired(String token)
	{
		return extractExpirationDate(token).before(new Date());
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
				.expiration(new Date(System.currentTimeMillis() + 1000 * 60))
				.signWith(getSigningkey())
				.compact();
	}
	public boolean validateToken(String token)
	{
		try
		{
			Jwts.parser()
			.verifyWith(getSigningkey())
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




//package com.sspp.studentAPI.service;
//
//import java.nio.charset.StandardCharsets;
//import java.util.Date;
//import java.util.HashMap;
//import java.util.Map;
//import java.util.function.Function;
//
//import javax.crypto.SecretKey;
//
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.stereotype.Service;
//
//import io.jsonwebtoken.Claims;
//import io.jsonwebtoken.Jwts;
//import io.jsonwebtoken.security.Keys;
//
//@Service
//public class JWTUtil {
//
//  // Secret key should be at least 32 characters for HS256
//  private static final String SECRET_KEY =
//          "mysecretkeymysecretkeymysecretkey12345";
//
//  // Generate Signing Key
//  private SecretKey getSigningKey() {
//      return Keys.hmacShaKeyFor(SECRET_KEY.getBytes(StandardCharsets.UTF_8));
//  }
//
//  // Extract Username
//  public String extractUsername(String token) {
//      return extractClaim(token, Claims::getSubject);
//  }
//
//  // Extract Expiration Date
//  public Date extractExpiration(String token) {
//      return extractClaim(token, Claims::getExpiration);
//  }
//
//  // Extract Single Claim
//  public <T> T extractClaim(String token, Function<Claims, T> claimsResolver) {
//      Claims claims = extractAllClaims(token);
//      return claimsResolver.apply(claims);
//  }
//
//  // Extract All Claims
//  private Claims extractAllClaims(String token) {
//      return Jwts.parser()
//              .verifyWith(getSigningKey())
//              .build()
//              .parseSignedClaims(token)
//              .getPayload();
//  }
//
//  // Check Token Expiry
//  private boolean isTokenExpired(String token) {
//      return extractExpiration(token).before(new Date());
//  }
//
//  // Generate Token
//  public String generateToken(UserDetails userDetails) {
//      Map<String, Object> claims = new HashMap<>();
//      return createToken(claims, userDetails.getUsername());
//  }
//
//  // Create Token
//  private String createToken(Map<String, Object> claims, String subject) {
//      return Jwts.builder()
//              .claims(claims)
//              .subject(subject)
//              .issuedAt(new Date())
//              .expiration(new Date(System.currentTimeMillis() + 1000 * 60 * 60)) // 1 hour
//              .signWith(getSigningKey())
//              .compact();
//  }
//
//  // Validate Token
//  public boolean validateToken(String token, UserDetails userDetails) {
//
//      final String username = extractUsername(token);
//
//      return (username.equals(userDetails.getUsername()) &&
//              !isTokenExpired(token));
//  }
//
//  // Validate Signature Only
//  public boolean validateToken(String token) {
//
//      try {
//          Jwts.parser()
//                  .verifyWith(getSigningKey())
//                  .build()
//                  .parseSignedClaims(token);
//
//          return true;
//      } catch (Exception e) {
//          return false;
//      }
//  }
//}
