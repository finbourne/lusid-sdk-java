FROM maven:3.6-jdk-8

RUN mkdir -p /usr/src
WORKDIR /usr/src

COPY pom.xml /usr/src/
RUN mvn install

ENV FBN_LUSID_API_URL ${FBN_LUSID_API_URL}

ENTRYPOINT mvn -e -fae test