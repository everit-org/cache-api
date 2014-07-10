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
package org.everit.osgi.cache.api;

/**
 * A simple API that supports generating cache instances. This interface should be provided as an OSGi service.
 */
public interface CacheFactory {

    /**
     * Creates a key-value cache holder.
     *
     * @param configuration
     *            The configuration of the cache. The type of the configuration must come from the same source as the
     *            caceh factory.
     * @param classLoader
     *            The classLoader that should be used during serializing and deserializing keys and values.
     * @return The Cache holder. Should be closed in the end.
     */
    <K, V> CacheHolder<K, V> createCache(CacheConfiguration<K, V> configuration, ClassLoader classLoader);

}
