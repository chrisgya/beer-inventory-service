package com.chrisgya.beerinventoryservice.config.cache;

import lombok.Data;

@Data
public class CacheSettingsModel {
    private String cacheName;
    private String timeToLiveSeconds;
}
