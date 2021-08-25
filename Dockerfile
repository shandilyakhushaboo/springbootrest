#
# Build stage
#
FROM maven:3.6.0-jdk-11-slim AS build
COPY src /home/app/src
COPY pom.xml /home/app
RUN mvn -f /home/app/pom.xml clean install



#
# Package stage
#
FROM tomcat
COPY --from=build /home/app/target/ROOT.war /usr/local/tomcat/webapps/ROOT.war
CMD "catalina.sh" "run"
EXPOSE 8080
