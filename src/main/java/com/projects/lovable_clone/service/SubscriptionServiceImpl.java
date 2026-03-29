package com.projects.lovable_clone.service;

import com.projects.lovable_clone.dto.subscription.CheckoutRequest;
import com.projects.lovable_clone.dto.subscription.CheckoutResponse;
import com.projects.lovable_clone.dto.subscription.PortalResponse;
import com.projects.lovable_clone.dto.subscription.SubscriptionResponse;
import org.springframework.stereotype.Service;

@Service
public class SubscriptionServiceImpl implements SubscriptionService{
    @Override
    public SubscriptionResponse getCurrentSubscription(Long userId) {
        return null;
    }

    @Override
    public CheckoutResponse createCheckoutSessionUrl(CheckoutRequest request, Long userId) {
        return null;
    }

    @Override
    public PortalResponse openCustomerPortal(Long userId) {
        return null;
    }
}
