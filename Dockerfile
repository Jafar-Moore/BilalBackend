# Stage 1: Build stage using Maven
FROM maven:3.8.5-openjdk-17 AS build

# Set the working directory inside the container
WORKDIR /app

# Copy the entire local directory into the container's working directory
COPY . .

# Run Maven to build the application
RUN mvn clean package -DskipTests

# Stage 2: Run stage using JDK slim image
FROM openjdk:17.0.1-jdk-slim

# Set the working directory inside the container
WORKDIR /app

# Copy the built JAR file from the previous stage into the current image
COPY --from=build /app/target/Bilal-0.0.1-SNAPSHOT.jar Bilal.jar

# Expose port 8080 for the application
EXPOSE 8080

# Specify the command to run on container startup
ENTRYPOINT ["java", "-jar", "Bilal.jar"]

