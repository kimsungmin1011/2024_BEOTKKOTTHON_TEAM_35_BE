package com.example.demo.vo.request.user;

import lombok.Data;

@Data
public class RequestUser {
    private Long userId;
    private String oauthId;
    private String oauthProvider;
    private String email;
    private String password1;
    private String password2;
    private Long point;
    private String gender;
    private String nickname;
    private Boolean flagNotification;
    private String deviceToken;
}
