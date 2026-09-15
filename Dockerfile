FROM eclipse-temurin:25-jre

WORKDIR /opt/jade

COPY target/jade-platform-4.6.1.jar jade-platform-4.6.1.jar

EXPOSE 1099 7778

ENTRYPOINT ["java", "-cp", "jade-platform-4.6.1.jar", "jade.Boot"]
CMD ["-local-host", "0.0.0.0", "-local-port", "1099"]
