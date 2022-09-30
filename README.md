# microservices

Experimenting with spring, docker compose and microservices

## Build
```
$ ./customer/mvnw clean package -DskipTests
```

## Run
```
$ docker-compose up -d
$ curl -i -X GET http://localhost:8080/api/v1/customers
```

## Stop
```
$ docker-compose down
```

## Rebuild
```
$ ./customer/mvnw clean package -DskipTests
$ docker rmi microservices-customer:latest
```
