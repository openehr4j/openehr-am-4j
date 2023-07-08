package org.openehr.am.aom2.profile;

import java.lang.String;

/**
 * Data object expressing a mapping between two class properties.
 */
public interface AomPropertyMapping {
  /**
   * Name of property in source class.
   */
  String getSourcePropertyName();

  /**
   * Name of property in target class.
   */
  String getTargetPropertyName();
}
