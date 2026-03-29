package com.projects.lovable_clone.service;

import com.projects.lovable_clone.dto.subscription.PlanResponse;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlanServiceImpl implements PlanService{
    @Override
    public List<PlanResponse> getAllActivePlans() {
        return List.of();
    }
}
