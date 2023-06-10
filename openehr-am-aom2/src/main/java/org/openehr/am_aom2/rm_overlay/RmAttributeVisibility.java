package org.openehr.am_aom2.rm_overlay;

import org.openehr.base_foundation_types.terminology.TerminologyCode;

/**
 * Definition of visibility of an RM attribute within a larger archetype structure.
 */
public interface RmAttributeVisibility {
  /**
   * Visibility setting of a non-archetyped RM attribute (RM attributes that are constrained or within the archetyped structure are visible by default).
   */
  VisibilityType getVisibility();

  /**
   * Optional alias for the attribute referenced by the path.
   */
  TerminologyCode getAlias();
}
