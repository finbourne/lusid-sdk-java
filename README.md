![LUSID_by_Finbourne](https://content.finbourne.com/LUSID_repo.png)

| branch | status |
| --- | --- |
| `master` | ![Sonatype Nexus (Snapshots)](https://img.shields.io/nexus/s/com.finbourne/lusid-sdk?server=https%3A%2F%2Foss.sonatype.org) ![run-sdk-tests](https://github.com/finbourne/lusid-sdk-java/workflows/run-sdk-tests/badge.svg?branch=master) |
| `develop` | ![run-sdk-tests](https://github.com/finbourne/lusid-sdk-java/workflows/run-sdk-tests/badge.svg?branch=develop) |

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


For further documentation on building the SDK, running the tutorials and using the SDK please see the [wiki](https://github.com/finbourne/lusid-sdk-java/wiki).
