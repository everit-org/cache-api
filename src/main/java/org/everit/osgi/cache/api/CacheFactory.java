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

import javax.cache.Cache;

/**
 * A simple API that supports generating javax.cache.Cache instances.
 */
public interface CacheFactory {

    <K, V> Cache<K, V> createCache(CacheConfiguration<K, V> configuration, ClassLoader classLoader);

}
