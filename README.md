# automation_kafka


## Sumário

- [Boas vindas ao repositório do projeto de Testes automatizados com kafka](#)
- [1. O que é o Apache Kafka?](#)
  - [1.1 Primeira coisa vamos falar sobre streaming.](#)
  - [1.2 Para que posso usar o streaming de eventos?](#)
  - [1.3 Apache Kafka® é uma plataforma de streaming de eventos. O que isso significa?](#)
  - [1.4 Como funciona o kafka ](#)
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
  - [Referências](#)
---

### Boas vindas ao repositório do projeto de testes automatizados de kafka.

### 1. O que é o Apache Kafka?

### 1.1 Primeira coisa vamos falar sobre streaming.

O streaming de eventos é o equivalente digital do sistema nervoso central do corpo humano. É a base tecnológica para 
o mundo "sempre ativo", onde as empresas são cada vez mais definidas e automatizadas por software e onde o usuário de 
software é mais software.

Tecnicamente falando, o streaming de eventos é a prática de capturar dados em tempo real de fontes de eventos como 
bancos de dados, sensores, dispositivos móveis, serviços em nuvem e aplicativos de software na forma de fluxos de 
eventos; armazenar esses fluxos de eventos de forma durável para recuperação posterior; manipular, processar e reagir 
aos fluxos de eventos em tempo real e também retrospectivamente; e encaminhar os fluxos de eventos para diferentes 
tecnologias de destino, conforme necessário. 

O streaming de eventos, portanto, garante um fluxo contínuo e interpretação dos dados para que as informações certas 
estejam no lugar certo, na hora certa.

### 1.2 Para que posso usar o streaming de eventos?

O streaming de eventos é aplicado a uma ampla variedade de casos de uso em uma infinidade de setores e organizações. 

 ####Seus muitos exemplos incluem:

- Para processar pagamentos e transações financeiras em tempo real, como em bolsas de valores, bancos e seguros.
- Para rastrear e monitorar carros, caminhões, frotas e remessas em tempo real, como na logística e na indústria automotiva.
- Para capturar e analisar continuamente os dados do sensor de dispositivos IoT ou outros equipamentos, como fábricas e parques eólicos.
- Para coletar e reagir imediatamente às interações e pedidos do cliente, como no varejo, no setor de hotéis e viagens e em aplicativos móveis.
- Para monitorar pacientes em cuidados hospitalares e prever mudanças nas condições para garantir o tratamento oportuno em emergências.
- Conectar, armazenar e disponibilizar dados produzidos por diferentes divisões de uma empresa.
- Para servir como base para plataformas de dados, arquiteturas orientadas a eventos e microsserviços.

### 1.3 Apache Kafka® é uma plataforma de streaming de eventos. O que isso significa?

O Kafka combina três recursos principais para que você possa implementar seus casos de uso para streaming de eventos de 
ponta a ponta com uma única solução testada em batalha:

  1) Para publicar (gravar) e assinar (ler) fluxos de eventos, incluindo importação / exportação contínua de seus dados de outros sistemas.
  2) Para armazenar streams de eventos de forma durável e confiável pelo tempo que você quiser.
  3) Para processar fluxos de eventos conforme eles ocorrem ou retrospectivamente.

  E toda essa funcionalidade é fornecida de maneira distribuída, altamente escalável, elástica, tolerante a falhas e 
  segura. O Kafka pode ser implantado em hardware máquinas virtuais e contêineres, e no local, bem como na nuvem. 
  Você pode escolher entre o autogerenciamento de seus ambientes Kafka e o uso de serviços totalmente gerenciados 
  oferecidos por diversos fornecedores.

### 1.4 Como funciona o kafka 

Kafka é um sistema distribuído que consiste em servidores e clientes que se comunicam por meio de um protocolo de rede 
TCP de alto desempenho . Ele pode ser implantado em hardware bare-metal, máquinas virtuais e contêineres no local, 
bem como em ambientes de nuvem.

**Servidores:** O Kafka é executado como um cluster de um ou mais servidores que podem abranger vários datacenters ou 
regiões de nuvem. Alguns desses servidores formam a camada de armazenamento, chamados de corretores. Outros servidores 
executam o Kafka Connect para importar e exportar dados continuamente como fluxos de eventos para integrar o Kafka com 
seus sistemas existentes, como bancos de dados relacionais, bem como outros clusters Kafka. Para permitir que você 
implemente casos de uso de missão crítica, um cluster Kafka é altamente escalonável e tolerante a falhas: se algum de 
seus servidores falhar, os outros servidores assumirão seu trabalho para garantir operações contínuas sem qualquer perda de dados.

**Clientes:** Eles permitem que você escreva aplicativos e microsserviços distribuídos que leem, gravam e processam 
fluxos de eventos em paralelo, em escala e de maneira tolerante a falhas, mesmo no caso de problemas de rede ou 
de máquina. O Kafka vem com alguns desses clientes incluídos, que são aumentados por dezenas de clientes fornecidos pela comunidade 
Kafka: os clientes estão disponíveis para Java e Scala, incluindo a biblioteca Kafka Streams de nível superior , 
para Go, Python, C / C ++ e muitas outras programações linguagens, bem como APIs REST.

### 1. Baixar o kafka

### 1. Baixar o kafka
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


### Referências

### Kafka

https://www.confluent.io/

https://kafka.apache.org/intro

### Zookeeper

https://zookeeper.apache.org/

### Docker

https://docs.docker.com/get-docker/
