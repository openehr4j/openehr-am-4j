package org.openehr.am_aom2.constraint_model;

import java.lang.String;

/**
 * A specialisation of `C_COMPLEX_OBJECT` whose node_id attribute is an archetype identifier rather than the normal internal node code (i.e. id-code).
 */
public interface CArchetypeRoot extends CComplexObject {
  /**
   * Reference to archetype is being used to fill a slot or redefine an external reference. Typically an 'interface' archetype id, i.e. identifier with partial version information.
   */
  String getArchetypeRef();
}
