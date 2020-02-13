package com.example.server.service;

import com.example.server.pojo.TokenNotification;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

import java.util.UUID;

@Service
public class TokenService {

    public Mono<TokenNotification> process(TokenNotification notification) {
        // TODO mock logic: checking transfer token, in this place we need remote API (accounts) that contains token generation, validation, storing & etc.
        if (TokenNotification.Status.NEW.equals(notification.getStatus())) {
            // some logic with remote API

            return Mono.just(new TokenNotification(UUID.randomUUID().toString(), TokenNotification.Status.REGISTERED));
        } else {
            throw new IllegalStateException("Notification status has bad status: " + notification.getStatus().name());
        }
    }

}
