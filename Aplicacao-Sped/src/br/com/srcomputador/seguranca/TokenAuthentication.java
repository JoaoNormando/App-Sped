package br.com.srcomputador.seguranca;

import java.util.Collections;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

public class TokenAuthentication {

//	static final long EXPIRATION_TIME = Tempo para o token.
	static final String SECRET = "secret";
	static final String PREFIXO = "Brugnara";
	static final String HEADER_STRING = "Autorizacao";
	
	static void addAuthentication(HttpServletResponse response, String username) {
		String JWT = Jwts.builder()
				.setSubject(username)
				.signWith(SignatureAlgorithm.HS512, SECRET)
				.compact();
		
		response.addHeader(HEADER_STRING, PREFIXO + " " + JWT);
	}
	
	static Authentication getAuthentication(HttpServletRequest request) {
		String token = request.getHeader(HEADER_STRING);
		
		if (token != null) {
			// Token Parsing
			String user = Jwts.parser()
					.setSigningKey(SECRET)
					.parseClaimsJws(token.replace(PREFIXO, ""))
					.getBody()
					.getSubject();
			
			if (user != null) {
				return new UsernamePasswordAuthenticationToken(user, null, Collections.emptyList());
			}
		}
		return null;
}
	
}
