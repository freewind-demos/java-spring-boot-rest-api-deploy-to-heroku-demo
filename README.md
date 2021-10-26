Java Spring Boot Rest Api Demo
==============================

如何使用SpringBoot来定义RestApi

```
brew install httpie
./mvnw package
java -jar target/demo-0.0.1-SNAPSHOT.jar
```

```
http POST http://localhost:8080/api/messages text=aaa
http POST http://localhost:8080/api/messages text=bbb

http POST http://localhost:8080/api/messages text=aa##bb

http GET http://localhost:8080/api/messages

http GET http://localhost:8080/api/messages/0
```
