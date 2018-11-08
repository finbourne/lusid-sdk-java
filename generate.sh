#!/bin/bash -e

if [[ ${#1} -eq 0 ]]; then
    echo
    echo "[ERROR] swagger file not specified"
    exit 1
fi

echo "removing previous sdk"

gen_root=/usr/swagger
sdk_output_folder=$gen_root/sdk/

#   remove all previously generated files
shopt -s extglob 
rm -rf $sdk_output_folder/docs
rm -rf $sdk_output_folder/target
rm -rf $sdk_output_folder/src/main/java
rm -rf $sdk_output_folder/src/test/java/com/finbourne/lusid/api
shopt -u extglob 

# ignore files
mkdir -p $sdk_output_folder
cp /usr/src/.swagger-codegen-ignore $sdk_output_folder

# java -jar swagger-codegen-cli.jar swagger-codegen-cli help
java -jar swagger-codegen-cli.jar generate \
    -i $gen_root/$1 \
    -l java \
    -o $sdk_output_folder \
    -c $gen_root/config.json

rm -rf $sdk_output_folder/.gradle
rm -rf $sdk_output_folder/gradle
rm -rf $sdk_output_folder/.swagger-codegen
rm $sdk_output_folder/.swagger-codegen-ignore
rm $sdk_output_folder/.travis.yml
rm $sdk_output_folder/.gitignore
rm $sdk_output_folder/build.gradle
rm $sdk_output_folder/build.sbt
rm $sdk_output_folder/git_push.sh
rm $sdk_output_folder/gradle.properties
rm $sdk_output_folder/gradlew
rm $sdk_output_folder/gradlew.bat
rm $sdk_output_folder/settings.gradle
rm $sdk_output_folder/src/main/AndroidManifest.xml