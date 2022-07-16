FROM java:8

EXPOSE 8080

ADD target/dewni-assignment1.jar dewni-assignment1.jar

ENTRYPOINT ["java","-jar","dewni-assignment1.jar"]