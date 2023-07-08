package org.openehr.am.aom2.terminology;

import java.lang.String;
import java.util.List;

/**
 * Class whose instances represent any kind of 1:N relationship between a source term and 1-N target terms.
 */
public interface TerminologyRelation {
  /**
   * Code of source term of this relation.
   */
  String getId();

  /**
   * List of target terms in this relation.
   */
  List getMembers();
}
