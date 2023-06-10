package org.openehr.am_aom2.constraint_model;

import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import org.openehr.base_foundation_types.primitive_types.Integer;
import org.openehr.base_foundation_types.terminology.TerminologyCode;

/**
 * Constrainer type for instances of `Terminology_code`. The constraint attribute can contain:
 */
public interface CTerminologyCode extends CPrimitiveObject {
  /**
   * Constraint status of this terminology constraint. If Void, the meaning is as follows:
   */
  Object getConstraintStatus();

  /**
   * Type of individual constraint - a single string that can either be a local at-code, or a local ac-code signifying a locally defined value set. If an ac-code, assumed_value may contain an at-code from the value set of the ac-code.
   */
  String getConstraint();

  /**
   * Assumed Terminology code value.
   */
  TerminologyCode getAssumedValue();

  TerminologyCode getDefaultValue();

  /**
   * True if `_constraint_status_` is defined and equals `required` OR if Void. I.e. in archetypes where `C_TERMINOLOGY_CODE` instances have no `_constraint_status_`, the `required` status is assumed, which applies to all legacy archetypes.
   */
  Boolean constraintRequired();

  /**
   * Return the effective integer value of the `_constraint_status_` field if it exists. If it is null, return 0, i.e. `required`.
   */
  Integer effectiveConstraintStatus();

  /**
   * Effective set of at-code values corresponding to an ac-code for a locally defined value set. Not defined for ac-codes that have no local value set.
   */
  List valueSetExpanded();

  /**
   * For locally defined value sets within individual code bindings: return the term URI(s) substituted from bindings for local at-codes in `_value_set_expanded_`.
   */
  List valueSetSubstituted();

  /**
   * For locally defined value sets within individual code bindings: final set of external codes to which value set is resolved.
   */
  List valueSetResolved();

  /**
   * True if a `_value_` is valid with respect to constraint expressed in concrete instance of this type.
   */
  Boolean validValue(Object aValue);

  /**
   * A generated prototype value from this constraint object.
   */
  TerminologyCode prototypeValue();

  /**
   * True if `_constraint_` is empty.
   */
  Boolean anyAllowed();

  /**
   * True if `_other.any_allowed_` or else every constraint in the `_constraint_` list exists in the `_other.constraint_`, and `_effective_constraint_status()_` is \<= `_other.effective_constraint_status()_`.
   */
  Boolean cValueConformsTo(Object other);

  /**
   * True if `_constraint_` and `_other.constraint_` are both value-set ids, and expand to identical value sets, or else are identical value codes; and `_effective_constraint_status()_` = `_other.effective_constraint_status()_`.
   */
  Boolean cValueCongruentTo(Object other);
}
