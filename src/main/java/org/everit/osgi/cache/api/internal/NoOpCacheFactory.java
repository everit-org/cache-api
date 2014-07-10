/**
 * This file is part of Everit - Cache API.
 *
 * Everit - Cache API is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * Everit - Cache API is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with Everit - Cache API.  If not, see <http://www.gnu.org/licenses/>.
 */
package org.everit.osgi.cache.api.internal;

import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentMap;

import org.everit.osgi.cache.api.CacheConfiguration;
import org.everit.osgi.cache.api.CacheFactory;
import org.everit.osgi.cache.api.CacheHolder;

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
