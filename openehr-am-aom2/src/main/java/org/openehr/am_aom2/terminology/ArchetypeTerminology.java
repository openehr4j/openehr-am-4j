package org.openehr.am_aom2.terminology;

import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import org.openehr.am_aom2.archetype.Archetype;
import org.openehr.base_foundation_types.primitive_types.Integer;
import org.openehr.base_foundation_types.primitive_types.Uri;

/**
 * Local terminology of an archetype. This class defines the semantics of the terminology of an archetype.
 */
public interface ArchetypeTerminology {
  /**
   * True if this terminology only contains terms relating to a differential specialisation of the owning artefact, rather than a complete set.
   */
  Boolean getIsDifferential();

  /**
   * Original language of the terminology, as set at artefact creation or parsing time; must be a code in the ISO 639-1 2 character language code-set.
   */
  String getOriginalLanguage();

  /**
   * Term code defining the meaning of the artefact as a whole, and always used as the id-code on the root node of the artefact. Must be defined in the `_term_definitions_` property.
   */
  String getConceptCode();

  /**
   * Directory of term definitions as a two-level table. The outer hash keys are language codes, e.g. `"en"`, `"de"`, while the inner hash keys are term codes, e.g. `"id17"`, `"at4"`.
   */
  Map getTermDefinitions();

  /**
   * Directory of bindings to external terminology codes and value sets, as a two-level table. The outer hash keys are terminology ids, e.g. `"SNOMED_CT"`, and the inner hash keys are constraint codes, e.g. `"at4"`, `"ac13"` or paths. The indexed `Uri` objects represent references to externally defined resources, either terms, ontology concepts, or terminology subsets / ref-sets.
   */
  Map getTermBindings();

  /**
   * Archetype that owns this terminology.
   */
  Archetype getOwnerArchetype();

  /**
   * Archetype-local value sets, each keyed by value-set id, i.e. an ac-code.
   */
  Map getValueSets();

  /**
   * Directory of extracts of external terminologies, as a two-level table. The outer hash keys are terminology ids, e.g. `"SNOMED_CT"`, while the inner hash keys are term codes or code-phrases from the relevant terminology, e.g. `"10094842"`.
   */
  Map getTerminologyExtracts();

  /**
   * Specialisation depth of this artefact. Unspecialised artefacts have depth 0, with each additional level of specialisation adding 1 to the specialisation_depth.
   */
  Integer specialisationDepth();

  /**
   * List of all id codes in the terminology., i.e. the 'id' codes in an ADL archetype, which are the `_node_id_` values on `C_OBJECT` descendants.
   */
  List idCodes();

  /**
   * List of all value term codes in the terminology, i.e. the 'at' codes in an ADL archetype, which are used as possible values on terminological constrainer nodes.
   */
  List valueCodes();

  /**
   * List of all value set codes in the terminology defining value sets. These correspond to the 'ac' codes in an ADL archetype.
   */
  List valueSetCodes();

  /**
   * True if language `_a_lang_` is present in archetype terminology.
   */
  Boolean hasLanguage(Object aLang);

  /**
   * True if there are bindings to terminology `_a_terminology_id_` present.
   */
  Boolean hasTerminology(Object aTerminologyId);

  /**
   * True if code `_a_code_` defined in this terminology.
   */
  Boolean hasTermCode(Object aCode);

  /**
   * Term definition for a code, in a specified language.
   */
  ArchetypeTerm termDefinition(Object aLang, Object aCode);

  /**
   * Binding of constraint corresponding to `_a_code_` in target external terminology `_a_terminology_id_`, as a string, which is usually a formal query expression.
   */
  Uri termBinding(Object aTerminology, Object aCode);

  /**
   * List of terminologies to which term or constraint bindings exist in this terminology, computed from bindings.
   */
  List terminologiesAvailable();

  /**
   * Return an `ARCHETYPE_TERM` from specified terminology extract, for specified term code.
   */
  ArchetypeTerm terminologyExtractTerm(Object aTerminologyId, Object aCode);

  /**
   * True if there is a provided terminology extract present.
   */
  Boolean hasTerminologyExtract(Object aTerminologyId);

  /**
   * List of languages in which terms in this terminology are available.
   */
  List languagesAvailable();
}
