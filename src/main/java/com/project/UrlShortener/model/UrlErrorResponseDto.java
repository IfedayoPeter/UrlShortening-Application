package com.project.UrlShortener.model;

import lombok.Data;

@Data
public class UrlErrorResponseDto
{
    private String status;
    private String error;

    public UrlErrorResponseDto(String status, String error) {
        this.status = status;
        this.error = error;
    }

    public UrlErrorResponseDto() {

    }
}
