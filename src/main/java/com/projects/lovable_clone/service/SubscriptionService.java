package com.projects.lovable_clone.service;

import com.projects.lovable_clone.dto.subscription.CheckoutRequest;
import com.projects.lovable_clone.dto.subscription.CheckoutResponse;
import com.projects.lovable_clone.dto.subscription.PortalResponse;
import com.projects.lovable_clone.dto.subscription.SubscriptionResponse;
import org.jspecify.annotations.Nullable;

public interface SubscriptionService {
    SubscriptionResponse getCurrentSubscription(Long userId);
}
