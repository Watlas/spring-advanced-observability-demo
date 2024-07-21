# Smart Saga Orchestration Docker

Este repositório contém a configuração Docker para um conjunto de microserviços utilizados no projeto de Saga
Orchestration. Abaixo, você encontrará instruções sobre como configurar e iniciar os serviços, bem como uma tabela com
as credenciais de acesso.

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

## Ferramentas Utilizadas

- **Axon Server**: Gerenciamento de comandos, eventos e sagas.
- **Kafka**: Comunicação assíncrona entre serviços.
- **MongoDB**: Armazenamento de estado da saga.
- **S3**: Armazenamento de eventos.
- **Elastic Stack**: Coleta e visualização de logs.
- **Grafana e Prometheus**: Monitoramento de métricas.
- **Zipkin/Jaeger/OpenTelemetry**: Rastreamento distribuído.

## Serviços Docker

### Logs, Métricas e Rastreamento

- `elasticsearch`
- `logstash`
- `kibana`
- `apm-server`
- `prometheus`
- `loki`
- `grafana`
- `tempo`
- `jaeger-all-in-one`
- `zipkin-all-in-one`
- `collector`

### Armazenamento

- `mongodb`
- `mongo-express`

### Mensageria

- `akhq`
- `zookeeper`
- `kafka`

### Saga Orchestration

- `axonserver`

### Tabela de Credenciais

| Serviço       | Usuário             | Senha      |
|---------------|---------------------|------------|
| Elasticsearch | `elastic`           | `changeme` |
| Kibana        | `kibana_system`     | `changeme` |
| Logstash      | `logstash_internal` | `changeme` |
| MongoDB       | `mongo`             | `changeme` |
| Grafana       | `grafana`           | `changeme` |
| APM Server    | `elastic`           | `changeme` |
| Minio         | `minio`             | `changeme` |
| Postgres      | `postgres`          | `changeme` |

### Dependências

Certifique-se de ter os seguintes componentes instalados:

- Docker
- Docker Compose

### Subindo o Ambiente

1. Clone o repositório:
    ```bash
    git clone 
    cd smart-saga-orchestration-docker
    ```

2. Execute a configuração inicial (Caso seja a primeira vez):
    ```bash
    docker compose up setup
    ```

3. Suba todos os serviços:
    ```bash
    docker compose up -d
    ```

4. Acesse os serviços via browser utilizando as portas definidas no `docker-compose.yml`.

### Acessando os Serviços

- **Kibana**: `http://localhost:5601`
- **Grafana**: `http://localhost:3000`
- **Prometheus**: `http://localhost:9090`
- **Zipkin**: `http://localhost:9411`
- **Mongo Express**: `http://localhost:8081`
- **Axon Server**: `http://localhost:8024`
- **AKQH**: `http://localhost:8080`
- **Jaeger**: `http://localhost:16686`
- **Minio (s3)**: `http://localhost:9001`

> [!NOTE]
> Existem outras portas abertas, porem são utilizadas para comunicação interna dos serviços então não é necessário
> acessar.
