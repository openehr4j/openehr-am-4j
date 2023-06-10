package org.openehr.am_aom2.constraint_model;

import java.lang.Boolean;
import java.lang.Object;
import java.util.List;

/**
 * Constraint on complex objects, i.e. any object that consists of other object constraints.
 */
public interface CComplexObject extends CDefinedObject {
  /**
   * List of constraints on attributes of the reference model type represented by this object.
   */
  List getAttributes();

  /**
   * List of attribute tuple constraints under this object constraint, if any.
   */
  List getAttributeTuples();

  /**
   * True if any value (i.e. instance) of the reference model type would be allowed. Redefined in descendants.
   */
  Boolean anyAllowed();

  /**
   * True if constraints represented by this node, ignoring any sub-parts, are narrower or the same as other.
   */
  Boolean cConformsTo(Object other, Object rmcc);

  /**
   * True if constraints represented by this node contain no further redefinitions with respect to the node `_other_`, with the exception of `_node_id_` redefinition in `C_OBJECT` nodes.
   */
  Boolean cCongruentTo(Object other);
}
