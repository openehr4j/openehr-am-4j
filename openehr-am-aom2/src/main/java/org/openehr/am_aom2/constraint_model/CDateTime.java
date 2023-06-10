package org.openehr.am_aom2.constraint_model;

import java.lang.Boolean;
import java.lang.Object;
import java.util.List;
import org.openehr.base_base_types.definitions.ValidityKind;
import org.openehr.base_foundation_types.time_types.Iso8601DateTime;

/**
 * Constraint on instances representing date/times, i.e. instants in time.
 */
public interface CDateTime extends CTemporal {
  /**
   * Formal constraint on the assumed primitive `Iso8601_date_time` type, in the form of one or more `Interval<Iso8601_date_time>`.
   */
  List getConstraint();

  /**
   * Default value set in a template, and present in an operational template. Generally limited to leaf and near-leaf nodes.
   */
  Iso8601DateTime getDefaultValue();

  /**
   * Value to be assumed if none sent in data.
   */
  Iso8601DateTime getAssumedValue();

  /**
   * Return `valid_iso8601_date_time_constraint_pattern (a_pattern)`
   */
  Boolean validPatternConstraint(Object aPattern);

  /**
   * Return `valid_date_time_constraint_replacements.has(an_other_pattern.as_upper) and then
   */
  Boolean validPatternConstraintReplacement(Object aPattern, Object anOtherPattern);

  /**
   * Validity of month in constrained date.
   */
  ValidityKind monthValidity();

  /**
   * Validity of day in constrained date.
   */
  ValidityKind dayValidity();

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
   * Validity of timezone in constrained date/time.
   */
  ValidityKind timezoneValidity();
}
