#Package stage
FROM eclipse-temurin:17.0.2_8-jre-alpine
ARG JAR_NAME
COPY ./target/$JAR_NAME.jar /app.jar
EXPOSE 8080
EXPOSE 8000

ENTRYPOINT ["java","-jar", "/app.jar", "-Xmx1500m"]
