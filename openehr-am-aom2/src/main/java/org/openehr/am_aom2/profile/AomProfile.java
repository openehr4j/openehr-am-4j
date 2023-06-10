package org.openehr.am_aom2.profile;

import java.lang.String;
import java.util.Map;

/**
 * Profile of common settings relating to use of reference model(s) and terminology for a given archetype developing organisation.
 */
public interface AomProfile {
  /**
   * Name of this profile, usually based on the publisher it pertains to e.g. "openEHR", "cdisc", etc.
   */
  String getProfileName();

  /**
   * Allowed type substitutions: Actual RM type names keyed by AOM built-in types which can substitute for them in an archetype. E.g. `<key = "ISO8601_DATE", value = "String">` means that if RM property `TYPE._some_property_` is of type `String`, an `ISO8601_DATE` is allowed at that position in the archetype.
   */
  Map getAomRmTypeSubstitutions();

  /**
   * List of mappings of lifecycle state names used in archetypes to AOM lifecycle state names:
   */
  Map getAomLifecycleMappings();

  /**
   * Mappings from AOM built-in types to actual types in RM: whenever the type name is encountered in an archetype, it is mapped to a specific RM type.
   */
  Map getAomRmTypeMappings();

  /**
   * Equivalences of RM primitive types to in-built set of primitive types. Used to determine which AOM `C_PRIMITIVE_OBJECT` descendant is used for a primitive type. Typical entries:
   */
  Map getRmPrimitiveTypeEquivalences();
}
