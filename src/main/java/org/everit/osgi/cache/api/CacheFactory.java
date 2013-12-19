package org.everit.osgi.cache.api;

import java.util.Map;

import javax.cache.Cache;

/**
 * A simple API that supports generating javax.cache.Cache instances.
 */
public interface CacheFactory {

    /**
     * Method to get a javax.cache.Cache instance based on the given configuration.
     * 
     * @param maxEntries
     *            Number of maximum entries in the cache
     * @param params
     *            Additional configurations
     * @return
     */
    Cache<String, Object> createCache(int maxEntries, Map<String, Object> params);

}
