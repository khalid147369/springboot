# 1. Fase de construcción (Build)
FROM maven:3.8.4-openjdk-17 AS build
COPY . .
RUN mvn clean package -DskipTests

# 2. Fase de ejecución (Run)
# Cambiamos la imagen que falló por esta de Eclipse Temurin (muy estable)
FROM eclipse-temurin:17-jre-alpine
COPY --from=build /target/*.jar app.jar
<<<<<<< HEAD:toDoList/DockerFile
ENTRYPOINT ["java","-jar","/app.jar"]
=======
ENTRYPOINT ["java","-jar","/app.jar"] 
>>>>>>> a56dd8b54c0e0fdebb7b8c78733b7005eaa8cfa2:toDoList/Dockerfile
