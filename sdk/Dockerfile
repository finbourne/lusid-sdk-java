FROM maven:3.6.3-jdk-11 as maven

RUN apt-get update && apt-get install -y jq

RUN mkdir -p /usr/src
WORKDIR /usr/src

COPY pom.xml /usr/src/
RUN mvn install

ENV FBN_LUSID_API_URL ${FBN_LUSID_API_URL}

ENTRYPOINT mvn -e -fae test