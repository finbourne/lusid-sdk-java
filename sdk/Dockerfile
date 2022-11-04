FROM maven:3.6.3-jdk-11 as maven

VOLUME /usr/src
WORKDIR /usr/src

COPY pom.xml /usr/src/
RUN mvn install

ENTRYPOINT mvn -e -fae test