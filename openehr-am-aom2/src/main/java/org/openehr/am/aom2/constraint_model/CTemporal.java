package org.openehr.am.aom2.constraint_model;

import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;

/**
 * Purpose Abstract parent of `C_ORDERED` types whose base type is an ISO date/time type.
 */
public interface CTemporal extends COrdered {
  /**
   * Optional alternative constraint in the form of a pattern based on ISO8601. See descendants for details.
   */
  String getPatternConstraint();

  /**
   * True if `_a_pattern_` is a valid constraint. Define in concrete descendants.
   */
  Boolean validPatternConstraint(Object aPattern);

  /**
   * Return True if `_a_pattern_` can be replaced by `_an_other_pattern_` in a specialised constraint. Define in concrete subtypes.
   */
  Boolean validPatternConstraintReplacement(Object aPattern, Object anOtherPattern);

  /**
   * True if any value (i.e. instance) of the reference model type would be allowed. Redefined in descendants.
   */
  Boolean anyAllowed();

  /**
   * True if `precursor()` or else `_other.pattern_constraint_` is empty, or else `_pattern_constraint_` is a valid (narrower) replacement for `_other.pattern_constraint_`.
   */
  Boolean cValueConformsTo(Object other);

  /**
   * True if `precursor (other)` and `_pattern_constraint_ ~ _other.pattern_constraint_`, i.e. either both `Void` or else both non-`Void` and identical.
   */
  Boolean cValueCongruentTo(Object other);
}
