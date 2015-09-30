/*
 * Copyright (C) 2011 Everit Kft. (http://www.everit.biz)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.everit.cache;

import java.util.Map;

/**
 * Constants that describes the configuration of the cache implementations.
 */
public final class CacheConstants {

  /**
   * The service property name that describes the driver or the technique of the caching used by the
   * implementation.
   */
  public static final String ATTR_CACHE_DRIVER_NAME = "cache.driver.name";

  /**
   * The object class that should be implemented and registered by the implementation at least.
   */
  public static final String OBJECT_CLASS_NAME_MAP = Map.class.getName();

  private CacheConstants() {
  }

}
