FROM java:8


# Install maven
RUN apt-get update
RUN apt-get install -y maven

COPY settings.xml {M2_HOME}/conf/settings.xml
WORKDIR /code

# Prepare by downloading dependencies
ADD pom.xml /code/pom.xml
RUN ["mvn", "dependency:resolve"]
RUN ["mvn", "verify"]

# Adding source, compile and package into a fat jar
ADD src /code/src
RUN ["mvn", "package"]

EXPOSE 4567
CMD ["/usr/lib/jvm/java-8-openjdk-amd64/bin/java", "-jar", "target/sparkmicro-jar-with-dependencies.jar"]