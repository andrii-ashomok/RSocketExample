package com.example.server.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class TokenNotification {
    private String token;
    private Status status;

    public enum Status {
        NEW,
        REGISTERED,
        LOG_OUT
    }
}
