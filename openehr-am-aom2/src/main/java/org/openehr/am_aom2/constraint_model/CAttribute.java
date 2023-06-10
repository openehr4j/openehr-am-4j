package org.openehr.am_aom2.constraint_model;

import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import java.util.List;

/**
 * Abstract model of constraint on any kind of attribute node.
 */
public interface CAttribute extends ArchetypeConstraint {
  /**
   * Reference model attribute within the enclosing type represented by a C_OBJECT.
   */
  String getRmAttributeName();

  /**
   * Constraint on every attribute, regardless of whether it is singular or of a container type, which indicates whether its target object exists or not (i.e. is mandatory or not).
   */
  Object getExistence();

  /**
   * Child C_OBJECT nodes. Each such node represents a constraint on the type of this attribute in its reference model. Multiples occur both for multiple items in the case of container attributes, and alternatives in the case of singular attributes.
   */
  List getChildren();

  /**
   * True if any value (i.e. instance) of the reference model attribute represented by this C_ATTIRBUTE is allowed.
   */
  Boolean anyAllowed();
}
