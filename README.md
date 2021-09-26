# automation_kafka


## Sumário

- [Boas vindas ao repositório do projeto de Testes automatizados com kafka](#)
- [O que é o Apache Kafka?](#)
- [O que é o Zookeper](#)
- [O que é um Tópico](#)
- [Configurando o Ambiente](#)
  - [Instalar o Kafka](#)
  - [Instalar o Zookepeer](#)
  - [Rodando o Kafka e Zookeeper](#)
  - [Criando um Tópico via comando](#) 
---

### Boas vindas ao repositório do projeto de testes automatizados de kafka.

### O que é o Apache Kafka?
### O que é o Zookeper?
### O que é um Tópico.
### Configurando o ambiente.

### 1. Baixar o kafka

- https://kafka.apache.org/downloads

### 2. Baixar o zookkeper

- http://zookeeper.apache.org/releases.html

### 3. Rodando o zookeper na sua maquina MAC/linux

- Acessar a a pasta `kafka.2.12-2.3.1/bin/`

- Executar o comando:

```
zookeeper-server-start.sh config/server.properties
```

### 3.1.  Rodando o zookeper na sua maquina windows

- Acessar a a pasta `C://kafka.2.12-2.3.1/bin/windows`.

- Executar o comando:

```
zookeeper-server-start.bat  C:\kafka_2.12-2.3.1\config\zookeeper.properties
```

### 4.  Rodando o kafka na sua maquina MAC/linux

- Acessar a pasta `kafka.2.12-2.3.1/bin/`

- Executar o comando:
```
kafka-server-start.sh config/server.properties
```

### 4.1.  Rodando o kafka na sua maquina windows:

- Acessar a a pasta `C://kafka.2.12-2.3.1/bin/windows`.

- Executar o comando:

```
kafka-server-start.bat  C:\kafka_2.12-2.3.1\config\server.properties
```



### lendo um topico

$ bin/kafka-console-consumer.sh --topic quickstart-events --from-beginning --bootstrap-server localhost:9092


pra gente trabalhar com producer e consumer é preciso ter o:
<dependency>
<groupId>org.apache.kafka</groupId>
<artifactId>kafka-clients</artifactId>
<version>3.0.0</version>
</dependency>

## kafka documentation
https://kafka.apache.org/21/documentation.html

## doc consumer config
https://kafka.apache.org/21/documentation.html#consumerconfigs

## producer config


### projeto

é necessario ter 
java 8+
maven
kafka
zookeeper
o plugin do lombok