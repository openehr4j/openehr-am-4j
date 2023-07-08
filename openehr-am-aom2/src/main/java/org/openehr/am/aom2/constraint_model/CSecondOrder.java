package org.openehr.am.aom2.constraint_model;

import java.lang.Boolean;
import java.lang.Object;
import java.util.List;

/**
 * Abstract parent of classes defining second order constraints.
 */
public interface CSecondOrder {
  /**
   * Members of this second order constrainer. Normally redefined in descendants.
   */
  List getMembers();

  /**
   * True if constraints represented by this node, ignoring any sub-parts, are narrower or the same as other. Typically used during validation of specialised archetype nodes.
   */
  Boolean cConformsTo(Object other, Object rmcc);

  /**
   * True if constraints represented by this node contain no further redefinitions with respect to the node other. Typically used to test if an inherited node locally contains any constraints.
   */
  Boolean cCongruentTo(Object other);
}
