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

import java.util.Dictionary;
import java.util.Hashtable;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;

public class CacheAPIActivator implements BundleActivator {

    private ServiceRegistration<CacheFactory> cacheFactoryRegistration;

    @SuppressWarnings("rawtypes")
    private ServiceRegistration<CacheConfiguration> cacheConfigRegistration;

    @Override
    public void start(final BundleContext context) throws Exception {
        Dictionary<String, String> properties = new Hashtable<String, String>(1);
        properties.put("cacheName", "noop");
        cacheFactoryRegistration = context.registerService(CacheFactory.class, new NoOpCacheFactory(),
                properties);
        cacheConfigRegistration = context.registerService(CacheConfiguration.class,
                new NoOpCacheConfiguration<Object, Object>(), properties);
    }

    @Override
    public void stop(final BundleContext context) throws Exception {
        cacheFactoryRegistration.unregister();
        cacheConfigRegistration.unregister();
    }

}
