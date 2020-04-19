package com.chrisgya.beerinventoryservice.config.cache;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Data
@Component
@ConfigurationProperties(prefix = "cache.config")
public class CacheSettings {

    private List<CacheSettingsModel> defaultConfigs;

    public Map<String, CacheSettingsModel> getCacheConfigAsMap() {
        return defaultConfigs != null || !defaultConfigs.isEmpty() ?
                defaultConfigs.stream().collect(Collectors.toMap(CacheSettingsModel::getCacheName, c -> c))
                : null;
    }
}
