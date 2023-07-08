package org.openehr.am.aom2.profile;

import java.lang.String;
import java.util.Map;

/**
 * Data object expressing a mapping between two types.
 */
public interface AomTypeMapping {
  /**
   * Name of the AOM type being mapped to an RM type.
   */
  String getSourceClassName();

  /**
   * Name of the RM type in the mapping.
   */
  String getTargetClassName();

  /**
   * List of mappings of properties of this type to another type.
   */
  Map getPropertyMappings();
}
