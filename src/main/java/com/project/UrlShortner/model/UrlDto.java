package com.project.UrlShortner.model;

import lombok.Data;

@Data
public class UrlDto
{
    private String url;
    private String expirationDate;

    public UrlDto(String url, String expirationDate) {
        this.url = url;
        this.expirationDate = expirationDate;
    }
}
