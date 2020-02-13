package com.example.server.controller;

import com.example.server.pojo.TokenNotification;
import com.example.server.service.TokenService;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.stereotype.Controller;
import reactor.core.publisher.Mono;

@Controller
public class LoginController {

    private TokenService service;

    public LoginController(TokenService service) {
        this.service = service;
    }

    @MessageMapping("/login")
    public Mono<TokenNotification> login(TokenNotification notification) {
        return service.process(notification);
    }
}
