FROM frolvlad/alpine-oraclejdk8:slim
VOLUME /tmp
ADD sbc-eurekaserver-0.0.1-SNAPSHOT.jar app.jar
#RUN bash -c 'touch /app.jar'
ENTRYPOINT ["java","-jar","/app.jar"]
EXPOSE 8761