package org.openehr.am.aom2.constraint_model;

import java.lang.Boolean;
import java.lang.Object;
import java.util.List;

/**
 * Abstract parent of primitive constrainer classes based on `Ordered` base types, i.e. types like `Integer`, `Real`, and the Date/Time types. The model constraint is a List of Intervals, which may include point Intervals, and acts as a efficient and formally tractable representation of any number of point values and/or contiguous intervals of an ordered value domain.
 */
public interface COrdered extends CPrimitiveObject {
  /**
   * Constraint in the form of a List of Intervals of the parameter type T. Concrete types generated in descendants via template binding.
   */
  List getConstraint();

  /**
   * Default value set in a template, and present in an operational template. Generally limited to leaf and near-leaf nodes.
   */
  Object getDefaultValue();

  /**
   * Value to be assumed if none sent in data.
   */
  Object getAssumedValue();

  /**
   * True if any value (i.e. instance) of the reference model type would be allowed. Redefined in descendants.
   */
  Boolean anyAllowed();

  /**
   * True if `_other.any_allowed_` or else for every constraint in the `_constraint_` list there is a constraint in `_other.constraint_` that contains it.
   */
  Boolean cValueConformsTo(Object other);

  /**
   * True if the items in `_constraint_` are equal in number and identical pair-wise with those in `_other.constraint_`.
   */
  Boolean cValueCongruentTo(Object other);
}
