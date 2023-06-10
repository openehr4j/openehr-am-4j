package org.openehr.am_aom2.archetype;

import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import org.openehr.am_aom2.constraint_model.CComplexObject;
import org.openehr.base_base_types.identification.ArchetypeId;
import org.openehr.base_base_types.identification.HierObjectId;
import org.openehr.base_foundation_types.primitive_types.Integer;
import org.openehr.base_resource_model.resource.AuthoredResource;

/**
 * Archetype equivalent to ARCHETYPED class in Common reference model. Defines semantics of identfication, lifecycle, versioning, composition and specialisation.
 */
public interface Archetype extends AuthoredResource {
  /**
   * Root node of the definition of this archetype.
   */
  CComplexObject getDefinition();

  /**
   * The ontology of the archetype.
   */
  Object getOntology();

  /**
   * ADL version if archetype was read in from an ADL sharable archetype.
   */
  String getAdlVersion();

  /**
   * Multi-axial identifier of this archetype in archetype space.
   */
  ArchetypeId getArchetypeId();

  /**
   * The normative meaning of the archetype as a whole, expressed as a local archetype code, typically “at0000”.
   */
  String getConcept();

  /**
   * Identifier of the specialisation parent of this archetype.
   */
  ArchetypeId getParentArchetypeId();

  /**
   * Invariant statements about this object. Statements are expressed in first order predicate logic, and usually refer to at least two attributes.
   */
  List getInvariants();

  /**
   * OID identifier of this archetype.
   */
  HierObjectId getUid();

  /**
   * The concept name of the archetype in language a_lang; corresponds to the term definition of the concept attribute in the archetype ontology.
   */
  String conceptName(Object aLang);

  /**
   * Set of language-independent paths extracted from archetype. Paths obey Xpath-like syntax and are formed from alternations of C_OBJECT.node_id and C_ATTRIBUTE.rm_attribute_name values.
   */
  List physicalPaths();

  /**
   * Set of language-dependent paths extracted from archetype. Paths obey the same syntax as physical_paths, but with node_ids replaced by their meanings from the ontology.
   */
  List logicalPaths(Object lang);

  /**
   * Specialisation depth of this archetype; larger than 0 if this archetype has a parent. Derived from terminology.specialisation_depth.
   */
  Integer specialisationDepth();

  /**
   * True if this archetype is a specialisation of another.
   */
  Boolean isSpecialised();

  /**
   * True if the archetype is valid overall; various tests should be used, including checks on node_ids, internal references, and constraint references.
   */
  Boolean isValid();

  /**
   * True if every node_id found on a C_OBJECT node is found in ontology.term_codes.
   */
  Boolean nodeIdsValid();

  /**
   * Version of predecessor archetype of this archetype, if any.
   */
  String previousVersion();

  /**
   * True if every ARCHETYPE_INTERNAL_REF. target_path refers to a legitimate node in the archetype definition.
   */
  Boolean internalReferencesValid();

  /**
   * True if every CONSTRAINT_REF.reference found on a C_OBJECT node in the archetype definition is found in ontology.constraint_codes.
   */
  Boolean constraintReferencesValid();

  /**
   * The short concept name of the archetype extracted from the archetype_id.
   */
  String shortConceptName();

  String version();
}
