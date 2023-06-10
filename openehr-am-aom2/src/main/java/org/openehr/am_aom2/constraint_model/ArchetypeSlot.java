package org.openehr.am_aom2.constraint_model;

import java.util.List;

/**
 * Constraint describing a  slot' where another archetype can occur.
 */
public interface ArchetypeSlot {
  /**
   * List of constraints defining other archetypes that could be included at this point.
   */
  List getIncludes();

  /**
   * List of constraints defining other archetypes that cannot be included at this point.
   */
  List getExcludes();
}
