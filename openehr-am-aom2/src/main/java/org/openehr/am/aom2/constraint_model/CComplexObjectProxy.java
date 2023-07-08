package org.openehr.am.aom2.constraint_model;

import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;

/**
 * A constraint defined by proxy, using a reference to an object constraint defined elsewhere in the same archetype. Note that since this object refers to another node, there are two objects with available occurrences values. The local occurrences value on a `COMPLEX_OBJECT_PROXY` should always be used; when setting this from a serialised form, if no occurrences is mentioned, the target occurrences should be used (not the standard default of `{1..1}`); otherwise the locally specified occurrences should be used as normal. When serialising out, if the occurrences is the same as that of the target, it can be left out.
 */
public interface CComplexObjectProxy extends CObject {
  /**
   * Reference to an object node using archetype path notation.
   */
  String getTargetPath();

  /**
   * True if target occurrences are to be used as the value of occurrences in this object; by the time of runtime use, the target occurrences value has to be set into this object.
   */
  Boolean useTargetOccurrences();

  /**
   * True if this node occurrences conforms to `_other.occurrences_`; `_other_` is assumed to be in a flat archetype.
   */
  Boolean occurrencesConformsTo(Object other);
}
