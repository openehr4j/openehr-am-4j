#!/bin/bash

set -e

SCRIPT_DIR=$( cd -- "$( dirname -- "${BASH_SOURCE[0]}" )" &> /dev/null && pwd )

NEW_VERSION=$1

NEW_VERSION_GRADLE="ext['openehrAmVersion'] = '$NEW_VERSION'"
NEW_VERSION_MAVEN="        <openehr.am.version>$NEW_VERSION<\/openehr.am.version>"

perl -pi -e "s/ext\[.*openehrAmVersion.*/$NEW_VERSION_GRADLE/g" $SCRIPT_DIR/../../README.md
perl -pi -e "s/.*<openehr\.am\.version>.*/$NEW_VERSION_MAVEN/g" $SCRIPT_DIR/../../README.md
