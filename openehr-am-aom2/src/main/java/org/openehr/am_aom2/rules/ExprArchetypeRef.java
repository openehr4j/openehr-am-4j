package org.openehr.am_aom2.rules;

import java.lang.String;
import org.openehr.am_aom2.constraint_model.ArchetypeConstraint;

/**
 * Expression tree leaf item representing a reference to a value found in data at a location specified by a path in the archetype definition.
 */
public interface ExprArchetypeRef {
  /**
   * The path to the archetype node.
   */
  String getPath();

  ArchetypeConstraint getItem();
}
