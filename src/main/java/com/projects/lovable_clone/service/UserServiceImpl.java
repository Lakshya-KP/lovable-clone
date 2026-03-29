package com.projects.lovable_clone.service;

import com.projects.lovable_clone.dto.auth.UserProfileResponse;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{
    @Override
    public UserProfileResponse getProfile(Long userId) {
        return null;
    }
}
