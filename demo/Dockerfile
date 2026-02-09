#use java runtime image
FROM eclipse-temurin:17-jdk-jammy
#set working directory inside  container
WORKDIR /app

#copy compiled class into container
COPY demo/target/demo-0.0.1-SNAPSHOT.jar app.jar

# when container runs run these commands java -jar app.jar and run the app
CMD ["java","-jar","app.jar"]