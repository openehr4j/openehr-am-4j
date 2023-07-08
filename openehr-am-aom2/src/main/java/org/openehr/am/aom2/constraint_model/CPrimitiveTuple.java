package org.openehr.am.aom2.constraint_model;

import java.lang.Boolean;
import java.lang.Object;
import java.util.List;

/**
 * Class representing a single object tuple instance in a tuple constraint. Each such instance is a vector of object constraints, where each member (each `C_PRIMITIVE_OBJECT`) corresponds to one of the `C_ATTRIBUTEs` referred to by the owning `C_ATTRIBUTE_TUPLE`.
 */
public interface CPrimitiveTuple extends CSecondOrder {
  /**
   * Object constraint members of this tuple group.
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
