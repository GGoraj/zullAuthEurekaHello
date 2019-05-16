package com.gg.dls.service.authentication.message.response;

public class JwtResponse {
    private String token;
    private String type = "Bearer";

    private Long userId;

    public JwtResponse(String accessToken, Long userId) {
        this.token = accessToken;
        this.userId = userId;
    }

    public String getAccessToken() {
        return token;
    }

    public void setAccessToken(String accessToken) {
        this.token = accessToken;
    }

    public String getTokenType() {
        return type;
    }

    public void setTokenType(String tokenType) {
        this.type = tokenType;
    }

    public Long getUserId() {

        return userId;
    }
}