package org.openehr.am_aom2.archetype;

import java.lang.String;
import org.openehr.base_base_types.definitions.VersionStatus;

/**
 * Human-readable structured identifier (HRID) for an archetype or template.
 */
public interface ArchetypeHrid {
  /**
   * Reverse domain name namespace identifier.
   */
  String getNamespace();

  /**
   * Name of the Reference Model publisher.
   */
  String getRmPublisher();

  /**
   * Name of the package in whose reachability graph the `_rm_class_` class is found (there can be more than one possibility in many reference models).
   */
  String getRmPackage();

  /**
   * Name of the root class of this archetype.
   */
  String getRmClass();

  /**
   * The short concept name of the archetype as used in the multi-axial `_archetype_hrid_`.
   */
  String getConceptId();

  /**
   * The full numeric version of this archetype consisting of 3 parts, e.g. `"1.8.2"`. The `_archetype_hrid_` feature includes only the major version.
   */
  String getReleaseVersion();

  /**
   * The status of the version, i.e.:
   */
  VersionStatus getVersionStatus();

  /**
   * The build count since last increment of any version part.
   */
  String getBuildCount();

  /**
   * The 'interface' form of the HRID, i.e. down to the major version.
   */
  String semanticId();

  /**
   * The 'physical' form of the HRID, i.e. with complete version information specified by `_version_id()_`.
   */
  String physicalId();

  /**
   * Full version identifier string, based on `_release_version_`, `_version_status_`, and `_build_count_` e.g. `"1.8.2-rc.4"`.
   */
  String versionId();

  /**
   * Major version of this archetype, extracted from `_release_version_`.
   */
  String majorVersion();

  /**
   * Minor version of this archetype, extracted from `_release_version_`.
   */
  String minorVersion();

  /**
   * Patch version of this archetype, extracted from `_release_version_`. Equivalent to patch version in patch version in `semver.org` sytem.
   */
  String patchVersion();
}
