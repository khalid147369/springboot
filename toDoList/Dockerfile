# 1. Fase de construcción (Build)
# Usamos una imagen que ya tiene Maven instalado para compilar
FROM maven:3.8.4-openjdk-17 AS build
COPY . .
RUN mvn clean package -DskipTests

# 2. Fase de ejecución (Run)
# Usamos una imagen ligera de Java para que la app corra rápido
FROM openjdk:17-jdk-alpine
# Copiamos el archivo .jar que se acaba de fabricar en la fase anterior
COPY --from=build /target/*.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"] 
