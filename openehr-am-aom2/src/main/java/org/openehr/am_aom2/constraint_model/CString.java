package org.openehr.am_aom2.constraint_model;

import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import java.util.List;

/**
 * Constraint on instances of `String`.
 */
public interface CString extends CPrimitiveObject {
  /**
   * String constraint - a list of literal strings and / or regular expression strings delimited by the ‘/’ character.
   */
  List getConstraint();

  /**
   * Default String value.
   */
  String getDefaultValue();

  /**
   * Assumed String value.
   */
  String getAssumedValue();

  String prototypeValue();

  /**
   * True if a_value is valid with respect to constraint expressed in concrete instance of this type.
   */
  Boolean validValue(Object aValue);

  /**
   * True if `_constraint_` is empty or else contains one String for the regex 'any' pattern.
   */
  Boolean anyAllowed();

  /**
   * True if `_other.any_allowed_` or else every constraint in the `_constraint_` list exists in the `_other.constraint_`.
   */
  Boolean cValueConformsTo(Object other);

  /**
   * True if the items in `_constraint_` are equal in number and identical pair-wise with those in `_other.constraint_`.
   */
  Boolean cValueCongruentTo(Object other);
}
