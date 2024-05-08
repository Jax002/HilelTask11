FROM openjdk:11

WORKDIR /app

COPY target/HilelTask9.jar /app/HilelTask9jar

CMD ["java", "-jar", "HilelTask9.jar"]