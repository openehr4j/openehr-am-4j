package org.openehr.am_aom2.archetype;

import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import org.openehr.base_base_types.identification.Uuid;
import org.openehr.base_resource_model.resource.AuthoredResource;

/**
 * Root object of a standalone, authored archetype, including all meta-data, description, other identifiers and lifecycle.
 */
public interface AuthoredArchetype extends Archetype, AuthoredResource {
  /**
   * ADL version if archetype was read in from an ADL sharable archetype.
   */
  String getAdlVersion();

  /**
   * Unique identifier of this archetype artefact instance. A new identifier is assigned every time the content is changed by a tool. Used by tools to distinguish different revisions and/or interim snapshots of the same artefact.
   */
  Uuid getBuildUid();

  /**
   * Semver.org compatible release of the most recent reference model release on which the archetype in its current version is based. This does not imply conformance only to this release, since an archetype may be valid with respect to multiple releases of a reference model.
   */
  String getRmRelease();

  /**
   * If True, indicates that this artefact was machine-generated from some other source, in which case, tools would expect to overwrite this artefact on a new generation. Editing tools should set this value to False when a user starts to manually edit an archetype.
   */
  Boolean getIsGenerated();

  Map getOtherMetaData();
}
