package com.examenarqui.exam;
import java.util.Date;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


public class loginController {
    
    @PostMapping("/login")
    public LoginResponse login(@RequestBody LoginRequest loginRequest) {
        // Aquí implementarías la lógica de autenticación
        // Simulamos la generación de un token y el timestamp
        String token = "simulated_token"; // Simulación, debería ser un token real generado
        return new LoginResponse(token, new Date());
    }
}

class LoginRequest {
    public String email;
    public String password;
}

class LoginResponse {
    public String token;
    public Date timestamp;

    public LoginResponse(String token, Date timestamp) {
        this.token = token;
        this.timestamp = timestamp;
    }
}
