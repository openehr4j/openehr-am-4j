package org.openehr.am.aom2.constraint_model;

import java.lang.Boolean;

/**
 * Constraint on instances of Boolean. Both attributes cannot be set to False, since this would mean that the Boolean value being constrained cannot be True or False.
 */
public interface CBoolean {
  /**
   * True if the value True is allowed.
   */
  Boolean getTrueValid();

  /**
   * True if the value False is allowed.
   */
  Boolean getFalseValid();

  /**
   * The value to assume if this item is not included in data, due to being part of an optional structure.
   */
  Boolean getAssumedValue();
}
