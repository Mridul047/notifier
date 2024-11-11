# Start with a base image that includes Java runtime
FROM openjdk:21-jdk-slim

# Set the working directory in the container
WORKDIR /app

# Copy the Spring Boot JAR file into the container
# Replace 'app.jar' with the name of your Spring Boot application's JAR file
COPY target/notifier-0.0.1-SNAPSHOT.jar notifier-0.0.1-SNAPSHOT.jar

# Expose the port that your Spring Boot application listens on
EXPOSE 8080

# Command to run the application
ENTRYPOINT ["java", "-jar", "notifier-0.0.1-SNAPSHOT.jar"]
