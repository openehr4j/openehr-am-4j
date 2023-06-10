package org.openehr.am_aom2.constraint_model;

import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;

/**
 * Parent of types representing constraints on primitive types.
 */
public interface CPrimitiveObject extends CDefinedObject {
  /**
   * Value to be assumed if none sent in data.
   */
  Object getAssumedValue();

  /**
   * True if this object represents a constraint on an enumerated type from the reference model, where the latter is assumed to be based on a primitive type, generally Integer or String.
   */
  Boolean getIsEnumeratedTypeConstraint();

  /**
   * Constraint represented by this object; redefine in descendants.
   */
  Object getConstraint();

  /**
   * True if there is an assumed value.
   */
  Boolean hasAssumedValue();

  /**
   * Generate name of native type that is constrained by this `C_XXX` type. For most types, it is the `C_XXX` typename without the `C_`, i.e. `XXX`. E.g. `C_INTEGER` -> `Integer`. For the date/time types the mapping is different.
   */
  String constrainedTypename();

  /**
   * True if constraints represented by this node, ignoring any sub-parts, are narrower or the same as other.
   */
  Boolean cConformsTo(Object other, Object rmcc);

  /**
   * True if this node expresses a value constraint that conforms to that of `other`. Effected in descendants.
   */
  Boolean cValueConformsTo(Object other);

  /**
   * True if constraints represented by this node contain no further redefinitions with respect to the node `_other_`, with the exception of `_node_id_` redefinition in `C_OBJECT` nodes.
   */
  Boolean cCongruentTo(Object other);

  /**
   * True if this node expresses the same value constraint as `other`. Effected in descendants.
   */
  Boolean cValueCongruentTo(Object other);
}
