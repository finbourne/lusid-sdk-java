| branch | status |
| --- | --- |
| `master` |  [![Build Status](https://travis-ci.org/finbourne/lusid-sdk-java.svg?branch=master)](https://travis-ci.org/finbourne/lusid-sdk-java) |
| `develop` | [![Build Status](https://travis-ci.org/finbourne/lusid-sdk-java.svg?branch=develop)](https://travis-ci.org/finbourne/lusid-sdk-java) |

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
      <artifactId>lusid-sdk</artifactId>
      <version>{INSERT VERSION}</version>
    </dependency>
    ...
  </dependencies>
  ...
</project>
```

 A pre-generated version of the latest SDK is included in the `sdk` folder based on the OpenAPI specification named lusid.json in the root folder. The most up to date version of the OpenAPI specification can be downloaded from https://api.lusid.com/swagger/v0/swagger.json

In addition to the SDK, a set of examples on how to use the SDK can be found in the [sdk/src/test/java](https://github.com/finbourne/lusid-sdk-java/tree/master/sdk/src/test/java) folder. These exist in the form of unit tests. Further instructions on running them can be found in the [README](https://github.com/finbourne/lusid-sdk-java/blob/master/sdk/tests.md).

# Generating the SDK

If you would prefer to generate the Java SDK locally from the FINBOURNE OpenAPI specification, follow these steps:
  * download the latest swagger.json file from https://api.lusid.com/swagger/index.html
  * save it in this directory as `lusid.json`
  * run `docker-compose up && docker-compose rm -f`
