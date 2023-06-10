package org.openehr.am_aom2.constraint_model;

import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import org.openehr.base_foundation_types.interval.MultiplicityInterval;
import org.openehr.base_foundation_types.primitive_types.Integer;

/**
 * Abstract model of constraint on any kind of object node.
 */
public interface CObject extends ArchetypeConstraint {
  /**
   * Reference model type that this node corresponds to.
   */
  String getRmTypeName();

  /**
   * Occurrences of this object node in the data, under the owning attribute. Upper limit can only be greater than 1 if owning attribute has a cardinality of more than 1.
   */
  MultiplicityInterval getOccurrences();

  /**
   * Semantic identifier of this node, used to dis-tinguish sibling nodes. All nodes must have a `_node_id_`; for nodes under a container `C_ATTRIBUTE`, the id must be an id-code must be defined in the archetype terminology. For valid structures, all node ids are id-codes.
   */
  String getNodeId();

  /**
   * True if this node and by implication all sub-nodes are deprecated for use.
   */
  Boolean getIsDeprecated();

  /**
   * Optional indicator of order of this node with respect to another sibling. Only meaningful in a specialised archetype for a `C_OBJECT` within a `C_ATTRIBUTE` with `_is_multiple_ = True`.
   */
  SiblingOrder getSiblingOrder();

  /**
   * Level of specialisation of this archetype node, based on its `_node_id_`. The value 0 corresponds to non-specialised, 1 to first-level specialisation and so on. The level is the same as the number of ‘.’ characters in the node_id code. If `_node_id_` is not set, the return value is -1, signifying that the specialisation level should be determined from the nearest parent `C_OBJECT` node having a node_id.
   */
  Integer specialisationDepth();

  /**
   * Compute effective occurrences, where no local occurrences constraint set. If the owning `C_ATTRIBUTE._cardinality_` is set, use its upper value, else use RM multiplicity of the owning attribute.
   */
  MultiplicityInterval effectiveOccurrences();

  /**
   * True if constraints represented by this node, ignoring any sub-parts, are narrower or the same as other.
   */
  Boolean cConformsTo(Object other, Object rmcc);

  /**
   * True if constraints represented by this node contain no further redefinitions with respect to the node `_other_`, with the exception of `_node_id_` redefinition in `C_OBJECT` nodes.
   */
  Boolean cCongruentTo(Object other);

  /**
   * True if this node `_occurrences_` conforms to `_other.occurrences_`; `other` is assumed to be in a flat archetype.
   */
  Boolean occurrencesConformsTo(Object other);

  /**
   * True if this node id conforms to `_other.node_id_`, which includes the ids being identical; `_other_` is assumed to be in a flat archetype.
   */
  Boolean nodeIdConformsTo(Object other);

  /**
   * True if this `C_OBJECT` node is prohibited, i.e. if its `_occurrences_` is `0..0`.
   */
  Boolean isProhibited();
}
