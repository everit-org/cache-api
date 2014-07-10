package org.everit.osgi.cache.api;

import java.util.Dictionary;
import java.util.Hashtable;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

public class Activator implements BundleActivator {

    @Override
    public void start(final BundleContext context) throws Exception {
        Dictionary<String, String> properties = new Hashtable<String, String>(1);
        properties.put("cacheName", "noop");
        context.registerService(CacheFactory.class, new NoOpCacheFactory(), properties);
    }

    @Override
    public void stop(final BundleContext context) throws Exception {

    }

}
