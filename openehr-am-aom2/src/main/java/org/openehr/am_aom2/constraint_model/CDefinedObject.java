package org.openehr.am_aom2.constraint_model;

import java.lang.Boolean;
import java.lang.Object;

/**
 * Abstract parent type of `C_OBJECT` subtypes that are defined by value, i.e. whose definitions are actually in the archetype rather than being by reference.
 */
public interface CDefinedObject extends CObject {
  /**
   * Default value set in a template, and present in an operational template. Generally limited to leaf and near-leaf nodes.
   */
  Object getDefaultValue();

  /**
   * True if any value (i.e. instance) of the reference model type would be allowed. Redefined in descendants.
   */
  Boolean anyAllowed();

  /**
   * True if `_a_value_` is valid with respect to constraint expressed in concrete instance of this type.
   */
  Boolean validValue(Object aValue);

  /**
   * Generate a prototype value from this constraint object.
   */
  Object prototypeValue();

  /**
   * True if there is an assumed value.
   */
  Boolean hasDefaultValue();
}
