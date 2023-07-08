package org.openehr.am.aom2.rm_overlay;

import java.util.Map;

/**
 * Container object for archetype statements relating to RM attributes, which may be directly on objects constrained within the archetype, or at deeper non-constrained RM paths from an object or the root.
 */
public interface RmOverlay {
  /**
   * Optional structure in which visibility and aliasing of reference model elements can be specified. Key is path to an RM attribute, which is typically formed from a path to an archetyped node concatenated with a further pure RM attribute path; may also refer to a non-archetyped attribute.
   */
  Map getRmVisibility();
}
