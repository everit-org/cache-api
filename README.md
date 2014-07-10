cache-api
=========

Cache instances can be used inside an OSGi environment with this API. The
implementations should provide at least two components. One for CacheFactory
and one for CacheConfiguration.

The cache API registers two no-operation services by default, a CacheFactory and a CacheConfiguration
instance. These can be queried using a `(cacheName=noop)` filter, and can be used for turning off caching
in depending services. 