# 1. Fase de construcción (Build)
FROM maven:3.8.4-openjdk-17 AS build
# Añadimos esta línea para evitar el error de "non-directory"
WORKDIR /app
COPY . .
RUN mvn clean package -DskipTests

# 2. Fase de ejecución (Run)
FROM eclipse-temurin:17-jre-alpine
WORKDIR /app
# Ajustamos la ruta para copiar desde la carpeta /app de la fase anterior
COPY --from=build /app/target/*.jar app.jar
ENTRYPOINT ["java","-jar","app.jar"]



