package org.openehr.am.aom2.constraint_model;

import java.lang.Boolean;
import java.lang.String;

/**
 * Defines the order indicator that can be used on a `C_OBJECT` within a container attribute in a specialised archetype to indicate its order with respect to a sibling defined in a higher specialisation level.
 */
public interface SiblingOrder {
  /**
   * True if the order relationship is ‘before’, if False, it is ‘after’.
   */
  Boolean getIsBefore();

  /**
   * Node identifier of sibling before or after which this node should come.
   */
  String getSiblingNodeId();

  /**
   * True if the order relationship is `_after_`, computed as the negation of `_is_before_`.
   */
  Boolean isAfter();
}
