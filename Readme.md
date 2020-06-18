# Getting Started

This is a Spring boot service to produce a kafka json message.

## Building
Dependencies:
- Java 11
- Maven
- Kafka
- Zookeeper

Build:
```$xslt
mvn clean install
```
Run:
```$xslt
cd target
java -jar learn-kafkaproducer-springboot-0.0.1-SNAPSHOT.jar
```
### Service Endpoints
- http://localhost:8085/api/v1/kafka/produce

Sample post request:
/produce
```$xslt
{
    "id":131,
    "name":"Inder",
    "email":"inder@somecompany.com"
}
```

