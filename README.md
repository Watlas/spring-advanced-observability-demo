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
    docker compose up setup
   ```
5. **Build the services using Docker Compose**:
   ```bash
   docker-compose build
   ```

6. **Start the services using Docker Compose**:
   ```bash
   docker-compose up -d
   ```
To generate an orderDTO and observe the system's logs, metrics, and traces, follow these steps:

1. Access the Order Service:
   - Open your web browser and navigate to http://localhost:8527/swagger-ui/index.html#/Order/save.
   - Use the Swagger UI to generate a new orderDTO by interacting with the available API endpoints.

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

3. Example POST request to create an orderDTO:
   - Alternatively, you can use the following `curl` command to create an orderDTO:

   ```bash
   curl -X POST http://localhost:8527/order \
   -H "Content-Type: application/json" \
   -d '{
     "user": {
       "name": "John Doe"
     },
     "product": {
       "name": "Widget",
       "description": "A very useful widget",
       "price": 19.99
     }
   }'

## Some things you will be able to see when uploading this project

### APM Service Map
![img_2.png](.github/img_2.png)

### APM Traces
![img_1.png](.github/img_1.png)

### APM Dependencies
![img_5.png](.github/img_5.png)

### Dashboard for overview of the system
![img_13.png](.github/img_13.png)


### Kibana Data Discovery
![img_12.png](.github/img_12.png)

### Agent Management with Fleet
![img_3.png](.github/img_3.png)

### Cluster Overview
![img_4.png](.github/img_4.png)

### Grafana Dashboard for Spring  
![img_6.png](.github/img_6.png)

### Grafana Dashboard for OpenTelemetry
![img_7.png](.github/img_7.png)

### Monitoring Trace with Jaeger
![img_8.png](.github/img_8.png)

### Monitoring Trace Details with Jaeger
![img_9.png](.github/img_9.png)

### Monitoring Trace with Zipkin
![img_11.png](.github/img_11.png)

### Monitoring Service Map with Zipkin
![img_10.png](.github/img_10.png)


## Referências

### Spring Boot
- [Spring Boot Documentation](https://docs.spring.io/spring-boot/docs/current/reference/html/)
- [Spring Boot GitHub Repository](https://github.com/spring-projects/spring-boot)
- [Building an Application with Spring Boot](https://spring.io/guides/gs/spring-boot/)

### Docker
- [Docker Documentation](https://docs.docker.com/)
- [Docker GitHub Repository](https://github.com/docker/docker-ce)
- [Getting Started with Docker](https://www.docker.com/get-started)

### OpenTelemetry
- [OpenTelemetry Documentation](https://opentelemetry.io/docs/)
- [OpenTelemetry GitHub Repository](https://github.com/open-telemetry/opentelemetry-java)
- [OpenTelemetry Spring Boot Instrumentation](https://github.com/open-telemetry/opentelemetry-java-instrumentation/tree/main/instrumentation/spring/spring-boot)

### Elastic Stack
- [Elasticsearch Documentation](https://www.elastic.co/guide/en/elasticsearch/reference/current/index.html)
- [Logstash Documentation](https://www.elastic.co/guide/en/logstash/current/index.html)
- [Kibana Documentation](https://www.elastic.co/guide/en/kibana/current/index.html)
- [Elastic APM Documentation](https://www.elastic.co/guide/en/apm/get-started/current/index.html)
- [Fleet and Elastic Agent](https://www.elastic.co/guide/en/fleet/current/index.html)
- [Docker ELK](https://github.com/deviantony/docker-elk)

### Grafana
- [Grafana Documentation](https://grafana.com/docs/grafana/latest/)
- [Grafana GitHub Repository](https://github.com/grafana/grafana)
- [Getting Started with Grafana](https://grafana.com/docs/grafana/latest/getting-started/getting-started-prometheus/)

### Prometheus
- [Prometheus Documentation](https://prometheus.io/docs/introduction/overview/)
- [Prometheus GitHub Repository](https://github.com/prometheus/prometheus)
- [Getting Started with Prometheus](https://prometheus.io/docs/prometheus/latest/getting_started/)

### Jaeger
- [Jaeger Documentation](https://www.jaegertracing.io/docs/latest/)
- [Jaeger GitHub Repository](https://github.com/jaegertracing/jaeger)
- [Getting Started with Jaeger](https://www.jaegertracing.io/docs/latest/getting-started/)

### Zipkin
- [Zipkin Documentation](https://zipkin.io/pages/documentation.html)
- [Zipkin GitHub Repository](https://github.com/openzipkin/zipkin)
- [Getting Started with Zipkin](https://zipkin.io/pages/quickstart)
