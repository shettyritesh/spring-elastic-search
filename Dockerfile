FROM maven:3.5.3-jdk-8
VOLUME /tmp
ARG JAR_FILE
COPY target/springboot-springdata-elasticsearch-pc-1.0.jar plansService.jar
# local application port
EXPOSE 8080
ENTRYPOINT ["/usr/bin/java"]
CMD ["-jar", "plansService.jar"]