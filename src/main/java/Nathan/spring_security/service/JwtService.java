package Nathan.spring_security.service;

import java.security.Key;
import java.security.SecureRandom;
import java.util.Base64;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.security.Keys;

@Service
public class JwtService {

    private String SECKRET;

    public JwtService() {
        byte[] key = new byte[32]; // 256-bit
        new SecureRandom().nextBytes(key);

        SECKRET = Base64.getEncoder().encodeToString(key);
    }


    public String generateToken(String username) {
        Map<String, Object> claims = new HashMap<>();

        return Jwts.builder()
            .setClaims(claims)
            .setSubject(username)
            .setIssuedAt(new Date(System.currentTimeMillis()))
            .setExpiration(new Date(System.currentTimeMillis() + 1000 * 60 * 3))
            .signWith(getKey(), SignatureAlgorithm.HS256)
            .compact();
    }

    private Key getKey() {
        return Keys.hmacShaKeyFor(Base64.getDecoder().decode(SECKRET));
    }


    public String extractUsername(String token) {
        
    }


    public boolean validateToken(String token, UserDetails userDetails) {
    }
}
