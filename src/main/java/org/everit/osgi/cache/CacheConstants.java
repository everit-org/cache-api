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
package org.everit.osgi.cache;

import java.util.Map;
import java.util.concurrent.ConcurrentMap;

/**
 * Constants that describes the configuration of the cache implementations.
 */
public final class CacheConstants {

    /**
     * The service property name that describes the driver or the technique of the caching used by the implementation.
     */
    public static final String PROP_CACHE_DRIVER_NAME = "cache.driver.name";

    /**
     * The object class that should be implemented and registered by the implementation in case of thread safety.
     */
    public static final String OBJECT_CLASS_NAME_CONCURRENT_MAP = ConcurrentMap.class.getName();

    /**
     * The object class that should be implemented and registered by the implementation in simple cases.
     */
    public static final String OBJECT_CLASS_NAME_MAP = Map.class.getName();

    private CacheConstants() {
    }

}
