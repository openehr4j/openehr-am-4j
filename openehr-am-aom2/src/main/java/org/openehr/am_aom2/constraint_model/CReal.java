package org.openehr.am_aom2.constraint_model;

import java.lang.Object;
import java.util.List;
import org.openehr.base_foundation_types.primitive_types.Real;

/**
 * Constraint on instances of Real.
 */
public interface CReal {
  /**
   * Set of Reals specifying constraint.
   */
  List getList();

  /**
   * Range of Real specifying constraint.
   */
  Object getRange();

  /**
   * The value to assume if this item is not included in data, due to being part of an optional structure.
   */
  Real getAssumedValue();
}
