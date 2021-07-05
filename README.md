# LUSID<sup>®</sup> Java SDK

This is the Java SDK for [LUSID by FINBOURNE](https://www.finbourne.com/lusid-technology), a bi-temporal investment management data platform with portfolio accounting capabilities. To use it you'll need a LUSID account. [Sign up for free at lusid.com](https://www.lusid.com/app/signup)

![LUSID_by_Finbourne](https://content.finbourne.com/LUSID_repo.png)

## Installation

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

We publish two versions of the Java SDK:

* **lusid-sdk-java (this one) - supports `Production` and `Early Access` API endpoints**
* [lusid-sdk-java-preview](https://github.com/finbourne/lusid-sdk-java-preview) - supports `Production`, `Early Access`, `Beta` and `Experimental` API endpoints.

For more details on API endpoint categories, see [What is the LUSID feature release lifecycle?](https://support.lusid.com/knowledgebase/article/KA-01786/en-us).
To find out which category an API endpoint falls into, see [LUSID API Documentation](https://www.lusid.com/api/swagger/index.html).

## Documentation

For further documentation on building the SDK, running the tutorials and using the SDK please see the [wiki](https://github.com/finbourne/lusid-sdk-java/wiki).

## Build Status 

| branch | status |
| --- | --- |
| `master` | ![Sonatype Nexus (Snapshots)](https://img.shields.io/nexus/s/com.finbourne/lusid-sdk?server=https%3A%2F%2Foss.sonatype.org) ![run-sdk-tests](https://github.com/finbourne/lusid-sdk-java/workflows/run-sdk-tests/badge.svg?branch=master) |
| `develop` | ![run-sdk-tests](https://github.com/finbourne/lusid-sdk-java/workflows/run-sdk-tests/badge.svg?branch=develop) |

