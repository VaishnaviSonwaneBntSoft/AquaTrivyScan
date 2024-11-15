# Use a base image with OpenJDK 11
FROM openjdk:latest

# Set the working directory inside the container
WORKDIR /app

# Copy the built jar file into the container
COPY build/libs/TrivyHelloScan-0.0.1-SNAPSHOT.jar app.jar

# Expose the port the app runs on
EXPOSE 8080

# Run the jar file
ENTRYPOINT ["java", "-jar", "app.jar"]
