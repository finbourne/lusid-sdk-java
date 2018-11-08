sdk_version=$(cat lusid.json | jq -r '.info.version')
mvn -f /usr/src/sdk/pom.xml versions:set -DnewVersion=$sdk_version-SNAPSHOT

mvn -f /usr/src/sdk/pom.xml -s /usr/src/sdk/settings.xml clean install deploy