package org.openehr.am_aom2.archetype;

import java.lang.Object;
import java.util.Map;
import org.openehr.am_aom2.terminology.ArchetypeTerminology;

/**
 * Root object of an operational template. An operational template is derived from a `TEMPLATE` definition and the `ARCHETYPEs` and/or `TEMPLATE_OVERLAYs` mentioned by that template by a process of flattening, and potentially removal of unneeded languages and terminologies.
 */
public interface OperationalTemplate extends AuthoredArchetype {
  /**
   * Compendium of flattened terminologies of archetypes  referenced from this template, keyed by archetype identifier. This will almost always be present in a template.
   */
  Map getComponentTerminologies();

  /**
   * Compendium of flattened terminology extracts (i.e. from external terminologies) from archetypes referenced from this template, keyed by archetype identifier.
   */
  Map getTerminologyExtracts();

  ArchetypeTerminology componentTerminology(Object anId);
}
