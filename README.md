DEPRECATED
==========

As a cache we use a java.util.Map interface for simple cases and 
java.util.concurrent.ConcurrentMap interface where thread safety counts.


cache-api
=========

Cache instances can be used inside an OSGi environment with this API. The
implementations should provide at least two components. One for CacheFactory
and one for CacheConfiguration.

## Usage of the API

In case an implementation offers the CacheFactory and CacheConfiguration,
the instances should be used in the following way:

```java
    CacheHolder<String, String> cacheHolder = cacheFactory.createCache(
            cacheConfiguration, this.getClass().getClassLoader());
    ConcurrentMap<String, String> cache = cacheHolder.getCache();
    cache.put("1", "1");
       ...
    cacheHolder.close();
```

[![Analytics](https://ga-beacon.appspot.com/UA-15041869-4/everit-org/cache-api)](https://github.com/igrigorik/ga-beacon)
