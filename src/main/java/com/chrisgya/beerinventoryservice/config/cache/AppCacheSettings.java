package com.chrisgya.beerinventoryservice.config.cache;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.Map;

@Data
@Component
@ConfigurationProperties( prefix="cache.app-caches")
public class AppCacheSettings {
    private Map<String,String> appCacheMap;
}
