package org.openehr.am.aom2.constraint_model;

import java.util.List;
import org.openehr.base_foundation_types.primitive_types.Integer;
import org.openehr.base_foundation_types.primitive_types.Real;

/**
 * Constraint on instances of Integer.
 */
public interface CInteger extends COrdered {
  /**
   * Formal constraint on `Integer`, in the form of one or more `Interval<Integer>`.
   */
  List getConstraint();

  /**
   * Default value set in a template, and present in an operational template. Generally limited to leaf and near-leaf nodes.
   */
  Integer getDefaultValue();

  /**
   * Value to be assumed if none sent in data.
   */
  Real getAssumedValue();
}
