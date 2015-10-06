cache-api
=========

The are no dedicated interfaces in this API. We use a java.util.Map interface 
for simple cases and java.util.concurrent.ConcurrentMap interface where thread 
safety counts.

This API defines only constants that describes the configuration of the cache 
implementations:
 - **CacheConstants.PROP_CACHE_DRIVER_NAME** (*cache.driver.name*): The service 
 property name that describes the driver or the technique of the caching used 
 by the implementation.
 - **CacheConstants.OBJECT_CLASS_MAP** (*java.util.Map*): The object class
  that should be implemented and registered by an implementation at least.

[![Analytics](https://ga-beacon.appspot.com/UA-15041869-4/everit-org/cache-api)](https://github.com/igrigorik/ga-beacon)
