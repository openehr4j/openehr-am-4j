package org.openehr.am_aom2.rules;

import org.openehr.am_aom2.constraint_model.CString;

/**
 * Expression tree leaf item representing a constraint on an archetype identifier.
 */
public interface ExprArchetypeIdConstraint extends ExprConstraint {
  /**
   * A C_STRING representing a regular expression for matching Archetype identifiers.
   */
  CString getItem();
}
