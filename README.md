# LUSID<sup>®</sup> Java SDK

Maven artifacts can be downloaded from the Open Source Software Repository Hosting (OSSRH) by adding the following to your pom.xml

```
<project>
  ...
  <repositories>
    <repository>
      <id>osssrh</id>
      <name>OSSRH</name>
      <url>https://oss.sonatype.org/content/repositories/snapshots/</url>
    </repository>
  </repositories>

  <dependencies>
    <dependency>
      <groupId>com.finbourne</groupId>
      <artifactId>edp-portfolios-sdk</artifactId>
      <version>{INSERT VERSION}</version>
    </dependency>
    <dependency>
      <groupId>com.finbourne</groupId>
      <artifactId>edp-lusid-sdk</artifactId>
      <version>{INSERT VERSION}</version>
    </dependency>
    ...
  </dependencies>
  ...
</project>
```

 A pre-generated version of the latest SDK is included in the lusid-sdk-java folder based on the OpenAPI specification named lusid.json in the root folder. The most up to date version of the OpenAPI specification can be downloaded from https://api.lusid.com/swagger/v0/swagger.json

In addition to the SDK, a set of examples on how to use the SDK can be found in the [src/test/java](https://github.com/finbourne/lusid-sdk-java/tree/master/lusid-sdk-java/src/test/java) folder. These exist in the form of unit tests. Further instructions on running them can be found in the [README](https://github.com/finbourne/lusid-sdk-java/blob/master/lusid-sdk-java/readme.md).

# Generating the SDK

If you would prefer to generate the Java SDK locally from the FINBOURNE OpenAPI specification, this can be done using autorest and docker:

```
$ docker-compose up && docker-compose rm -f
```

If `docker` is not available then the SDK can be generated using `autorest` natively using the following command, ensuring this `README.md` is in the same folder as the command is run from:

```
$ autorest --java --use=@microsoft.azure/autorest.modeler@2.3.40
```

For other options on installation see [Installing AutoRest](https://aka.ms/autorest/install) on the AutoRest github page.

> see https://aka.ms/autorest

# Client Runtimes
https://github.com/Azure/autorest/blob/master/docs/developer/architecture/Autorest-and-Clientruntimes.md

---

## Configuration 
The following are the settings for this using this API with AutoRest.

``` yaml
input-file: lusid.json
add-credentials: true
output-folder: ./lusid-sdk-java
namespace: com.finbourne
license-header: "Copyright © 2018 FINBOURNE TECHNOLOGY LTD


Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the \"Software\"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:


The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.


THE SOFTWARE IS PROVIDED \"AS IS\", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE."

```
