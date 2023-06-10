package org.openehr.am_aom2.archetype;

import java.util.List;

/**
 * Class representing source template, i.e. a kind of archetype that may include template overlays, and may be restricted by tools to only defining mandations, prohibitions, and restrictions on elements already defined in the flat parent.
 */
public interface Template extends AuthoredArchetype {
  /**
   * Overlay archetypes, i.e. partial archetypes that include full definition and terminology, but logically derive all their meta-data from the owning template.
   */
  List getOverlays();
}
