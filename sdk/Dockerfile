FROM maven:3.5-jdk-10

RUN mkdir -p /usr/src
WORKDIR /usr/src

COPY pom.xml /usr/src/
RUN mvn install

ENV FBN_LUSID_API_URL ${FBN_LUSID_API_URL}

ENTRYPOINT mvn -e -fae -Dtest=LusidApiTests test