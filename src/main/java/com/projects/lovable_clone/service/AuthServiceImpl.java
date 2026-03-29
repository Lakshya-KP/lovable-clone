package com.projects.lovable_clone.service;

import com.projects.lovable_clone.dto.auth.AuthResponse;
import com.projects.lovable_clone.dto.auth.LoginRequest;
import com.projects.lovable_clone.dto.auth.SignupRequest;
import org.springframework.stereotype.Service;

@Service
public class AuthServiceImpl implements AuthService {

    @Override
    public AuthResponse signup(SignupRequest request) {
        return null;
    }

    @Override
    public AuthResponse login(LoginRequest request) {
        return null;
    }
}
