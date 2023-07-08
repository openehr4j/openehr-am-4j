package org.openehr.am.aom2.terminology;

import java.lang.String;
import java.util.List;
import java.util.Map;

/**
 * Representation of any coded entity (term or constraint) in the archetype ontology.
 */
public interface ArchetypeTerm {
  /**
   * Code of this term.
   */
  String getCode();

  /**
   * Hash of keys (“text”, “description” etc) and corresponding values.
   */
  Map getItems();

  /**
   * List of all keys used in this term.
   */
  List keys();
}
