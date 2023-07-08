package org.openehr.am.aom2.constraint_model;

import java.lang.Boolean;
import java.lang.Object;
import java.util.List;
import org.openehr.base_base_types.definitions.ValidityKind;
import org.openehr.base_foundation_types.time_types.Iso8601Time;

/**
 * Constraint on instances representing times in the form either of a set of validity values, or else time ranges based on the `C_ORDERED` list constraint.
 */
public interface CTime extends CTemporal {
  /**
   * Formal constraint on the assumed primitive `Iso8601_time` type, in the form of one or more `Interval<Iso8601_time>`.
   */
  List getConstraint();

  /**
   * Default value set in a template, and present in an operational template. Generally limited to leaf and near-leaf nodes.
   */
  Iso8601Time getDefaultValue();

  /**
   * Value to be assumed if none sent in data.
   */
  Iso8601Time getAssumedValue();

  /**
   * Validity of minute in constrained time.
   */
  ValidityKind minuteValidity();

  /**
   * Validity of second in constrained time.
   */
  ValidityKind secondValidity();

  /**
   * Validity of millisecond in constrained time.
   */
  ValidityKind millisecondValidity();

  /**
   * Validity of timezone in constrained time.
   */
  ValidityKind timezoneValidity();

  /**
   * Return `valid_iso8601_time_constraint_pattern (a_pattern)`
   */
  Boolean validPatternConstraint(Object aPattern);

  /**
   * Return `valid_time_constraint_replacements.has(an_other_pattern.as_upper) and then
   */
  Boolean validPatternConstraintReplacement(Object aPattern, Object anOtherPattern);
}
