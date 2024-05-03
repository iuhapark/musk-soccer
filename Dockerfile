FROM gradle:8.7.0-jdk17-alpine AS builder
WORKDIR /app
COPY --chown=gradle:gradle . /app/
RUN gradle build --no-daemon

FROM openjdk:17-alpine
WORKDIR /app
COPY --from=builder /app/build/libs/*.jar /app/app.jar
ARG PROFILE
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "/app/app.jar"]
