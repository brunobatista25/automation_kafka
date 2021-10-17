# automation_kafka


## Sumário

- [Boas vindas ao repositório do projeto de Testes automatizados com kafka](#)
- [O que é o Apache Kafka?](#)
- [O que é o Zookeper](#)
- [O que é um Tópico](#)
- [Configurando o Ambiente](#)
  - [Instalar o Kafka](#)
     - [Instalar o Kafka Linux/Mac](#)
     - [Instalar o Kafka windows](#) 
  - [Instalar o Zookepeer](#)
    - [Instalar o Zookepeer Linux/Mac](#)
    - [Instalar o Zookepeer Windows](#)
  - [Aqui fica sua preferência como executar o kafka e zookeper local ou via docker](#)
     - [Rodando o Kafka e Zookeeper local via terminal](#)
        - [Criando um Tópico via comando](#)
        - [Lendo um Tópico via comando](#)
        - [Deletando um Tópico via comando](#)
     - [Rodando o Kafka e Zookeeper via docker-compose](#)
       - [Criando um Tópico via comando docker-compose](#)
       - [Lendo um Tópico via comando docker-compose](#)
       - [Deletando um Tópico via comando docker-compose](#)
  - [Configurando o projeto de automação](#)
  - 
  - 
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


### RASCUNHO
### 4.2. Rodando kafka e zookeeper no docker:

- No projeto tem um arquivo chamado `docker-compose.yml` que já vai subir uma imagem do kafka e do zookeeper, onde o kafka vai estar na porta `9092` e o zookeeper vai estar na porta `2181`.
- Basta executar o comando no terminal:

```
docker-compose up
```
- Isso ira subir a imagem
- Caso queira derrubar o docker basta executar o comando:

```
docker-compose down
```

OBS: PODE ACONTECER DE SEU WINDOWS NAO CONTER O WSL2 ENTÃO É PRECISO INSTALAR ELE NO POWERSHELL COM O COMANDO:

 - Baixar o wsl neste link [WSL2](Pacote de atualização do kernel do Linux do WSL2 para computadores x64)
 - Depois executar esse comando no powershell:

```
wsl --set-default-version 2
```

subir um topico dentro do docker basta executar esse comando


o docker ja cria um topico caso queira criar outro basta executar esse passando o nome do topico
```
docker-compose exec kafka  kafka-topics --create --if-not-exists --zookeeper zookeeper:2181
 --partitions 1 --replication-factor 1 --topic topic_user 
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