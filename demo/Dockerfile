
FROM maven:3.9.6-eclipse-temurin-17 AS build
WORKDIR /app
COPY pom.xml
COPY src ./src
RUN mvn clean package -DskipTests
#use java runtime image
FROM eclipse-temurin:17-jdk-jammy
#set working directory inside  container
WORKDIR /app

#copy compiled class into container
COPY --from=build /app/target/app.jar app.jar

# when container runs run these commands java -jar app.jar and run the app
CMD ["java","-jar","app.jar"]