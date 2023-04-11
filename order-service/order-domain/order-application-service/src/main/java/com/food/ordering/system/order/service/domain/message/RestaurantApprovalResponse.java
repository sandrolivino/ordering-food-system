package com.food.ordering.system.order.service.domain.message;

import com.food.ordering.system.domain.valueobject.OrderAprovaStatus;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

import java.time.Instant;
import java.util.List;

@Builder
@Getter
@AllArgsConstructor
public class RestaurantApprovalResponse {
    private String id;
    private String sagaId;
    private String orderId;
    private String restaurantId;
    private Instant createdAt;
    private OrderAprovaStatus orderAprovaStatus;
    private List<String> failureMessages;
}
