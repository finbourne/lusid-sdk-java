#!/bin/bash 

set -e

if [[ (${#1} -eq 0) ]] ; then
    echo 
    echo "[ERROR] missing maven profile"
    echo
    exit 1
fi

profile=$1

sdk_version=$(cat lusid.json | jq -r '.info.version')

mvn -f ./sdk/pom.xml versions:set -DnewVersion=$sdk_version-SNAPSHOT
mvn -f ./sdk/pom.xml -s ./sdk/settings.xml -P$profile clean install deploy -Dmaven.test.skip=true
    