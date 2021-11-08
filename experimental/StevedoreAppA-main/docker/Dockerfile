FROM tomcat:9.0.54-jdk11-openjdk-buster

LABEL maintainer="craig.gallen@solent.ac.uk"

ADD ../artifacts /usr/local/tomcat/webapps/web

EXPOSE 8080

CMD ["catalina.sh", "run"]
