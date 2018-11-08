FROM maven:3.5-jdk-10

RUN mkdir -p /usr/src/
WORKDIR /usr/src/

RUN wget http://central.maven.org/maven2/io/swagger/swagger-codegen-cli/2.3.1/swagger-codegen-cli-2.3.1.jar -O swagger-codegen-cli.jar

ADD generate.sh /usr/src/
ADD .swagger-codegen-ignore /usr/src/

ENTRYPOINT [ "/bin/bash", "generate.sh" ]