# Spring Advanced Observability Demo

[![Elasticsearch](https://img.shields.io/badge/Elasticsearch-005571?logo=elasticsearch&logoColor=white)](https://www.elastic.co/elasticsearch/)
[![Logstash](https://img.shields.io/badge/Logstash-005571?logo=logstash&logoColor=white)](https://www.elastic.co/logstash/)
[![Kibana](https://img.shields.io/badge/Kibana-005571?logo=kibana&logoColor=white)](https://www.elastic.co/kibana/)
[![Fleet](https://img.shields.io/badge/Fleet-005571?logo=elasticstack&logoColor=white)](https://www.elastic.co/fleet/)
[![APM](https://img.shields.io/badge/APM-005571?logo=elasticapm&logoColor=white)](https://www.elastic.co/apm/)
[![Filebeat](https://img.shields.io/badge/Filebeat-005571?logo=filebeat&logoColor=white)](https://www.elastic.co/beats/filebeat)
[![Metricbeat](https://img.shields.io/badge/Metricbeat-005571?logo=metricbeat&logoColor=white)](https://www.elastic.co/beats/metricbeat)
[![Prometheus](https://img.shields.io/badge/Prometheus-E6522C?logo=prometheus&logoColor=white)](https://prometheus.io/)
[![Loki](https://img.shields.io/badge/Loki-3675A9?logo=grafana&logoColor=white)](https://grafana.com/oss/loki/)
[![Grafana](https://img.shields.io/badge/Grafana-F46800?logo=grafana&logoColor=white)](https://grafana.com/)
[![Tempo](https://img.shields.io/badge/Tempo-5A29E4?logo=grafana&logoColor=white)](https://grafana.com/oss/tempo/)
[![Jaeger](https://img.shields.io/badge/Jaeger-FF4D4D?logo=jaeger&logoColor=white)](https://www.jaegertracing.io/)
[![Zipkin](https://img.shields.io/badge/Zipkin-000000?logo=zipkin&logoColor=white)](https://zipkin.io/)
[![OpenTelemetry Collector](https://img.shields.io/badge/OpenTelemetry%20Collector-7B00FF?logo=opentelemetry&logoColor=white)](https://opentelemetry.io/docs/collector/)
[![AKHQ](https://img.shields.io/badge/AKHQ-FF6C37?logo=apachekafka&logoColor=white)](https://akhq.io/)
[![Zookeeper](https://img.shields.io/badge/Zookeeper-FF6C37?logo=apachezookeeper&logoColor=white)](https://zookeeper.apache.org/)
[![Kafka](https://img.shields.io/badge/Kafka-231F20?logo=apachekafka&logoColor=white)](https://kafka.apache.org/)
[![MongoDB](https://img.shields.io/badge/MongoDB-47A248?logo=mongodb&logoColor=white)](https://www.mongodb.com/)
[![Mongo Express](https://img.shields.io/badge/Mongo_Express-47A248?logo=mongodb&logoColor=white)](https://github.com/mongo-express/mongo-express)
[![Axon Server](https://img.shields.io/badge/Axon%20Server-4527A0?logo=axoniq&logoColor=white)](https://axoniq.io/)
[![MinIO](https://img.shields.io/badge/MinIO-00A3E0?logo=minio&logoColor=white)](https://min.io/)
[![PostgreSQL](https://img.shields.io/badge/PostgreSQL-336791?logo=postgresql&logoColor=white)](https://www.postgresql.org/)
[![Java](https://img.shields.io/badge/Java-007396?logo=java&logoColor=red)](https://www.java.com/)
[![Spring Boot](https://img.shields.io/badge/Spring%20Boot-6DB33F?logo=spring-boot&logoColor=white)](https://spring.io/projects/spring-boot)

## Project Overview

The **Spring Advanced Observability Demo** is a comprehensive project designed to demonstrate advanced observability
techniques using the Spring Boot framework. This project integrates multiple powerful tools and technologies to provide
a full-stack observability solution, including tracing, logging, and monitoring of microservices.

## Architecture Overview

![arch.gif](.github/arch.gif)

## Getting Started

1. **Clone the repository**:
   ```bash
   git clone https://github.com/watlas/spring-advanced-observability-demo.git
   ```

2. **Navigate to the project directory**:
   ```bash
   cd spring-advanced-observability-demo
   ```

3. **Enter the docker directory**:
   ```bash
    cd docker
    ```
4. **setup docker compose**:
   ```bash
   docker-compose setup
   ```

5. **Start the services using Docker Compose**:
   ```bash
   docker-compose up -d
   ```
To generate an order and observe the system's logs, metrics, and traces, follow these steps:

1. Access the Order Service:
   - Open your web browser and navigate to http://localhost:8527/swagger.
   - Use the Swagger UI to generate a new order by interacting with the available API endpoints.

2. Observe Logs, Metrics, and Traces:
   
   | Service       | User      | Password   | URL                                       |
   |---------------|-----------|------------|-------------------------------------------|
   | Kibana        | `elastic` | `changeme` | [localhost:5601](http://localhost:5601)   |
   | Grafana       | `grafana` | `changeme` | [localhost:3000](http://localhost:3000)   |
   | Prometheus    | -         | -          | [localhost:9090](http://localhost:9090)   |
   | Jaeger        | -         | -          | [localhost:16686](http://localhost:16686) |
   | Zipkin        | -         | -          | [localhost:9411](http://localhost:9411)   |
   | Mongo Express | `mongo`   | `changeme` | [localhost:8081](http://localhost:8081)   |
   | AKHQ          | -         | -          | [localhost:8080](http://localhost:8080)   |


##
