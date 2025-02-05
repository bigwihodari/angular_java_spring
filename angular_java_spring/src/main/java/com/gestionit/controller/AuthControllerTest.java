package com.gestionit.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.gestionit.entities.AuthResponse;
import com.gestionit.entities.LoginRequest;
import com.gestionit.entities.TokenRefreshRequest;
import com.gestionit.entities.User;
import com.gestionit.repositories.UserRepository;
import com.gestionit.service.JwtTokenProvider;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//import org.junit.jupiter.api.extension.ExtendWith;
//import org.mockito.InjectMocks;
//import org.mockito.Mock;
//import org.mockito.Mockito;
//import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
//import org.springframework.test.web.servlet.MockMvc;
//import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import java.util.Optional;
/*
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
*/

//@ExtendWith(MockitoExtension.class)
class AuthControllerTest {
/*
    @Mock
    private AuthenticationManager authenticationManager;

    @Mock
    private JwtTokenProvider jwtTokenProvider;

    @Mock
    private UserRepository userRepository;

    @InjectMocks
    private AuthController authController;

    private MockMvc mockMvc;

    @Autowired
    private ObjectMapper objectMapper;

    @BeforeEach
    void setUp() {
        mockMvc = MockMvcBuilders.standaloneSetup(authController).build();
        objectMapper = new ObjectMapper();
    }

    @Test
    void testLoginSuccess() throws Exception {
        // Mock des objets
        LoginRequest loginRequest = new LoginRequest("alice.user@example.com", "password123");
        User user = new User();
        user.setEmail("alice.user@example.com");

        Authentication authentication = new UsernamePasswordAuthenticationToken(user.getEmail(), "password");

        when(authenticationManager.authenticate(any())).thenReturn(authentication);
        when(userRepository.findByEmail("test@example.com")).thenReturn(Optional.of(user));
        when(jwtTokenProvider.createToken("test@example.com")).thenReturn("mocked-jwt-token");

        // Exécution du test
        mockMvc.perform(post("/api/auth/login")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(objectMapper.writeValueAsString(loginRequest)))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.token").value("mocked-jwt-token"));
    }

    @Test
    void testLoginFailure_UserNotFound() throws Exception {
        LoginRequest loginRequest = new LoginRequest("alice2.user@example.com", "password455");

        when(userRepository.findByEmail("alice2.user@example.com")).thenReturn(Optional.empty());

        mockMvc.perform(post("/api/auth/login")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(objectMapper.writeValueAsString(loginRequest)))
                .andExpect(status().isUnauthorized());
    }

    @Test
    void testRefreshTokenSuccess() throws Exception {
        TokenRefreshRequest request = new TokenRefreshRequest("valid-refresh-token");
        User user = new User();
        user.setEmail("alice.user@example.com");

        when(jwtTokenProvider.validateToken("valid-refresh-token")).thenReturn(true);
        when(jwtTokenProvider.getUsername("valid-refresh-token")).thenReturn("alice.user@example.com");
        when(userRepository.findByEmail("alice.user@example.com")).thenReturn(Optional.of(user));
        when(jwtTokenProvider.createToken("alice.user@example.com")).thenReturn("new-mocked-jwt-token");

        mockMvc.perform(post("/api/auth/refresh")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(objectMapper.writeValueAsString(request)))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.token").value("new-mocked-jwt-token"));
    }

    @Test
    void testRefreshTokenFailure_InvalidToken() throws Exception {
        TokenRefreshRequest request = new TokenRefreshRequest("invalid-refresh-token");

        when(jwtTokenProvider.validateToken("invalid-refresh-token")).thenReturn(false);

        mockMvc.perform(post("/api/auth/refresh")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(objectMapper.writeValueAsString(request)))
                .andExpect(status().isForbidden());
    }

 */
}
