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