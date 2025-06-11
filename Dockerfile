# Etapa de construcción
FROM maven:3.9.9-amazoncorretto-17 AS builder
WORKDIR /app

# Copiar archivos necesarios para la construcción
COPY pom.xml . 
COPY src ./src 

# Compilar el proyecto y empaquetar el JAR
RUN mvn clean package -DskipTests

# Etapa de ejecución
FROM amazoncorretto:17-alpine-jdk
WORKDIR /app

# Copiar el JAR generado desde la etapa de construcción
COPY --from=builder /app/target/searchengineapp-0.0.1-SNAPSHOT.jar ./searchengineapp.jar

# Exponer el puerto necesario
EXPOSE 8081

# Comando de inicio
ENTRYPOINT ["java", "-jar", "searchengineapp.jar"]
