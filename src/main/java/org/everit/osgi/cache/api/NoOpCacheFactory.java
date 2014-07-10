package org.everit.osgi.cache.api;

import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentMap;

public class NoOpCacheFactory implements CacheFactory {

    private static class NoOpCacheHolder<K, V> implements CacheHolder<K, V> {

        @Override
        public void close() {

        }

        @Override
        public ConcurrentMap<K, V> getCache() {
            return new NoOpConcurrentMap<K, V>();
        }

    }

    private static class NoOpConcurrentMap<K, V> implements ConcurrentMap<K, V> {

        @Override
        public void clear() {

        }

        @Override
        public boolean containsKey(final Object key) {
            return false;
        }

        @Override
        public boolean containsValue(final Object value) {
            return false;
        }

        @Override
        public Set<java.util.Map.Entry<K, V>> entrySet() {
            return Collections.emptySet();
        }

        @Override
        public V get(final Object key) {
            return null;
        }

        @Override
        public boolean isEmpty() {
            return true;
        }

        @Override
        public Set<K> keySet() {
            return Collections.emptySet();
        }

        @Override
        public V put(final K key, final V value) {
            return null;
        }

        @Override
        public void putAll(final Map<? extends K, ? extends V> m) {

        }

        @Override
        public V putIfAbsent(final K key, final V value) {
            return null;
        }

        @Override
        public V remove(final Object key) {
            return null;
        }

        @Override
        public boolean remove(final Object key, final Object value) {
            return false;
        }

        @Override
        public V replace(final K key, final V value) {
            return null;
        }

        @Override
        public boolean replace(final K key, final V oldValue,
                final V newValue) {
            return false;
        }

        @Override
        public int size() {
            return 0;
        }

        @Override
        public Collection<V> values() {
            return Collections.emptySet();
        }

    }

    @Override
    public <K, V> CacheHolder<K, V> createCache(final CacheConfiguration<K, V> configuration,
            final ClassLoader classLoader) {
        return new NoOpCacheHolder<K, V>();
    }

}
