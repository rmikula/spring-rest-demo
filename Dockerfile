FROM mcr.microsoft.com/java/jre:11-zulu-alpine

WORKDIR /app

COPY build/libs/restdemo-*-SNAPSHOT.jar .

EXPOSE 8080

CMD [ "java", "-jar", "restdemo-0.0.2-SNAPSHOT.jar" ]