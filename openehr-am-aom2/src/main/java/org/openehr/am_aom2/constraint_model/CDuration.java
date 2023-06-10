package org.openehr.am_aom2.constraint_model;

import java.lang.Boolean;
import java.lang.Object;
import org.openehr.base_foundation_types.time_types.Iso8601Duration;

/**
 * ISO 8601-compatible constraint on instances of Duration. In ISO 8601 terms, constraints might are of the form “PWD” (weeks and/or days), “PDTHMS” (days, hours, minutes, seconds) and so on.
 */
public interface CDuration {
  Boolean getYearsAllowed();

  /**
   * True if months are allowed in the constrained Duration.
   */
  Boolean getMonthsAllowed();

  Boolean getWeeksAllowed();

  /**
   * True if days are allowed in the constrained Duration.
   */
  Boolean getDaysAllowed();

  /**
   * True if hours are allowed in the constrained Duration.
   */
  Boolean getHoursAllowed();

  /**
   * True if minutes are allowed in the constrained Duration.
   */
  Boolean getMinutesAllowed();

  Boolean getSecondsAllowed();

  /**
   * True if fractional seconds are allowed in the constrained Duration.
   */
  Boolean getFractionalSecondsAllowed();

  /**
   * Range of Durations specifying constraint.
   */
  Object getRange();

  /**
   * The value to assume if this item is not included in data, due to being part of an optional structure.
   */
  Iso8601Duration getAssumedValue();
}
