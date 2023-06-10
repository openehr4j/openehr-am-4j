package org.openehr.am_aom2.constraint_model;

import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;

/**
 * Archetype equivalent to LOCATABLE class in openEHR Common reference model. Defines common constraints for any inheritor of LOCATABLE in any reference model.
 */
public interface ArchetypeConstraint {
  /**
   * True if constraints represented by this node, ignoring any sub-parts, are narrower or the same as other.
   */
  Boolean isSubsetOf(Object other);

  Boolean isValid();

  /**
   * Path of this node relative to root of archetype.
   */
  String path();

  /**
   * True if the relative path a_path exists at this node.
   */
  Boolean hasPath(Object aPath);
}
