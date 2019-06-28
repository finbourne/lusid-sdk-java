#!/bin/bash -e

if [[ ${#1} -eq 0 ]]; then
    echo
    echo "[ERROR] swagger file not specified"
    exit 1
fi

echo "removing previous sdk"

gen_root=/usr/swagger
sdk_output_folder=$gen_root/sdk
swagger_file=$gen_root/$1

#   remove all previously generated files
shopt -s extglob 
rm -rf $sdk_output_folder/docs
rm -rf $sdk_output_folder/target
rm -rf $sdk_output_folder/src/main/java/com/finbourne/lusid/!(utilities)
rm -rf $sdk_output_folder/src/test/java/com/finbourne/lusid/api
shopt -u extglob 

# ignore files
mkdir -p $sdk_output_folder
cp /usr/src/.openapi-generator-ignore $sdk_output_folder

java -jar openapi-generator-cli.jar generate \
    -i $swagger_file \
    -g java \
    -o $sdk_output_folder \
    -c $gen_root/config.json \
    -t $gen_root/templates

rm $sdk_output_folder/.openapi-generator-ignore

# remove redundant generated build files
rm -rf $sdk_output_folder/.openapi-generator/
rm -rf $sdk_output_folder/gradle/
rm -rf $sdk_output_folder/.gitignore
rm $sdk_output_folder/.travis.yml
rm $sdk_output_folder/build.gradle
rm $sdk_output_folder/build.sbt
rm $sdk_output_folder/git_push.sh
rm $sdk_output_folder/gradle.properties
rm $sdk_output_folder/gradlew
rm $sdk_output_folder/gradlew.bat
rm $sdk_output_folder/settings.gradle
rm $sdk_output_folder/src/main/AndroidManifest.xml

# update pom version
sdk_version=$(cat $swagger_file | jq -r '.info.version')
mvn -f $sdk_output_folder/pom.xml versions:set -DnewVersion=$sdk_version-SNAPSHOT