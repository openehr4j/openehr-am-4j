package org.openehr.am.aom2.constraint_model;

import java.lang.Boolean;
import java.lang.Object;
import java.util.List;
import org.openehr.base_base_types.definitions.ValidityKind;
import org.openehr.base_foundation_types.time_types.Iso8601Date;

/**
 * Constraint on instances representing dates in the form either of a set of validity values, or else date ranges based on the `C_ORDERED` list constraint.
 */
public interface CDate extends CTemporal {
  /**
   * Formal constraint on the assumed primitive `Iso8601_date` type, in the form of one or more `Interval<Iso8601_date>`.
   */
  List getConstraint();

  /**
   * Default value set in a template, and present in an operational template. Generally limited to leaf and near-leaf nodes.
   */
  Iso8601Date getDefaultValue();

  /**
   * Value to be assumed if none sent in data.
   */
  Iso8601Date getAssumedValue();

  /**
   * Validity of month in constrained date.
   */
  ValidityKind monthValidity();

  /**
   * Validity of day in constrained date.
   */
  ValidityKind dayValidity();

  /**
   * Return `valid_iso8601_date_constraint_pattern (a_pattern)`
   */
  Boolean validPatternConstraint(Object aPattern);

  /**
   * Return `valid_date_constraint_replacements.has(an_other_pattern.as_upper) and then
   */
  Boolean validPatternConstraintReplacement(Object aPattern, Object anOtherPattern);
}
