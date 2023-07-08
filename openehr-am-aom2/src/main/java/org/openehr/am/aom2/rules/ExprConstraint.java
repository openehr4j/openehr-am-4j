package org.openehr.am.aom2.rules;

import org.openehr.am.aom2.constraint_model.CPrimitiveObject;

/**
 * Expression tree leaf item representing a constraint on a primitive type, expressed in the form of a concrete subtype of C_PRIMITIVE_OBJECT.
 */
public interface ExprConstraint {
  /**
   * The constraint.
   */
  CPrimitiveObject getItem();
}
