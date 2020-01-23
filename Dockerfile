FROM centos:latest
RUN yum install -y java-11-openjdk-1:11.0.5.10-2.el8_1.x86_64
WORKDIR /opt/test
COPY ./build/libs/test.jar /opt/test
CMD java -jar /opt/test/test.jar
EXPOSE 8080