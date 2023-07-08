package org.openehr.am.aom2.constraint_model;

import java.lang.Boolean;
import java.lang.Object;
import java.util.List;

/**
 * Object representing a constraint on an attribute tuple, i.e. a group of attributes that are constrained together. Typically used for representing co-varying constraints like `{units, range}` constraints.
 */
public interface CAttributeTuple extends CSecondOrder {
  /**
   * Tuple definitions.
   */
  List getTuples();

  /**
   * List of `C_ATTRIBUTEs` forming the definition of the tuple.
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
