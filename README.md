# automation_kafka


## Sumário

- [Boas vindas ao repositório do projeto de Testes automatizados com kafka](#boas-vindas-ao-repositório-do-projeto-de-testes-automatizados-de-kafka)
- [1. O que é o Apache Kafka?](#1-o-que-é-o-apache-kafka)
  - [1.1 Primeira coisa vamos falar sobre streaming.](#11-primeira-coisa-vamos-falar-sobre-streaming)
  - [1.2 Para que posso usar o streaming de eventos?](#12-para-que-posso-usar-o-streaming-de-eventos)
  - [1.3 Apache Kafka® é uma plataforma de streaming de eventos. O que isso significa?](#13-apache-kafka-é-uma-plataforma-de-streaming-de-eventos-o-que-isso-significa)
  - [1.4 Como funciona o kafka ](#14-como-funciona-o-kafka)
- [2. O que é o Zookeper](#2-o-que-é-o-zookeper)
- [3. O que é um Tópico](#3-o-que-é-um-tópico)
- [4. Configurando o Ambiente](#4-configurando-o-ambiente)
  - [4.1 Instalar o Kafka](#41-instalar-o-kafka)
  - [4.2 Instalar o Zookepeer](#42-instalar-o-zookepeer)
  - [4.3 Aqui fica sua preferência como executar o kafka e zookeper local ou via docker](#43-aqui-fica-sua-preferência-como-executar-o-kafka-e-zookeper-local-ou-via-docker)
     - [4.3.1 Rodando o Kafka e Zookeeper local via terminal](#431-rodando-o-kafka-e-zookeeper-local-via-terminal)
        - [4.3.1.1 Criando um Tópico via comando](#4311-criando-um-tópico-via-comando)
        - [4.3.1.2 Listando Tópicos via comando](#4312-listando-tópicos-via-comando)
        - [4.3.1.3 Produzindo mensagem para um Tópico via comando](#4313-produzindo-mensagem-para-um-tópico-via-comando)
        - [4.3.1.4 Consumindo um Tópico via comando](#4314-consumindo-um-tópico-via-comando)
     - [4.3.2 Rodando o Kafka e Zookeeper via docker-compose](#432-rodando-o-kafka-e-zookeeper-via-docker-compose)
         - [4.3.2.1 Criando um Tópico via docker-compose](#4321-criando-um-tópico-via-comando-docker-compose)
         - [4.3.2.2 Listando Tópicos via docker-compose](#4323-listando-tópicos-via-docker-compose)
         - [4.3.2.4 Consumindo um Tópico via docker-compose](#4323-consumindo-um-tópico-via-docker-compose)
- [5. Configurando o projeto de automação](#5-configurando-o-projeto-de-automação)
  - [5.1. Rodando kafka e zookeeper no docker](#)
- [6. Referências](#6-referências)
---

### Boas vindas ao repositório do projeto de testes automatizados de kafka.

- Esse repositório foi criado para auxiliar a fazer testes automatizados de streaming de eventos com kafka.

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

 #### Seus muitos exemplos incluem:

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

### 2. O que é o Zookeper?

ZooKeeper é um serviço centralizado para manter informações de configuração, nomenclatura, fornecer sincronização 
distribuída e fornecer serviços de grupo. Todos esses tipos de serviços são usados de uma forma ou de outra por 
aplicativos distribuídos. Cada vez que eles são implementados, há muito trabalho para consertar os bugs e as condições 
de corrida que são inevitáveis. Devido à dificuldade de implementar esses tipos de serviços, os aplicativos geralmente 
os reduzem, o que os torna frágeis na presença de mudanças e difíceis de gerenciar. Mesmo quando feito corretamente, 
diferentes implementações desses serviços levam à complexidade do gerenciamento quando os aplicativos são implantados.

Saiba mais sobre o ZooKeeper no [ZooKeeper Wiki](https://cwiki.apache.org/confluence/display/ZOOKEEPER/Index) .

### 3. O que é um Tópico.

Os eventos são organizados e armazenados de forma duradoura em tópicos . Muito simplificado, um tópico é semelhante a 
uma pasta em um sistema de arquivos, e os eventos são os arquivos dessa pasta. Um exemplo de nome de tópico poderia 
ser "pagamentos". Os tópicos no Kafka são sempre multiprodutor e multi-assinante: um tópico pode ter zero, um ou muitos
produtores que gravam eventos nele, bem como zero, um ou muitos consumidores que assinam esses eventos. Os eventos em 
um tópico podem ser lidos com a frequência necessária - ao contrário dos sistemas de mensagens tradicionais, os eventos 
não são excluídos após o consumo. Em vez disso, você define por quanto tempo o Kafka deve reter seus eventos por meio de
uma definição de configuração por tópico, após o qual os eventos antigos serão descartados. O desempenho do Kafka é 
efetivamente constante em relação ao tamanho dos dados, portanto, armazenar dados por um longo tempo é perfeitamente 
adequado.

Os tópicos são particionados , o que significa que um tópico é espalhado por vários "depósitos" localizados em 
diferentes corretores Kafka. Esse posicionamento distribuído de seus dados é muito importante para a escalabilidade, 
pois permite que os aplicativos clientes leiam e gravem os dados de / para vários corretores ao mesmo tempo. 
Quando um novo evento é publicado em um tópico, ele é, na verdade, anexado a uma das partições do tópico. 
Eventos com a mesma chave de evento (por exemplo, um cliente ou ID de veículo) são gravados na mesma partição, 
e Kafka garante que qualquer consumidor de uma determinada partição de tópico sempre lerá os eventos dessa partição 
exatamente na mesma ordem em que foram gravados.

![topic](./imagens/streams-and-tables-p1_p4.png)

**Figura:** Este tópico de exemplo tem quatro partições P1 – P4. Dois clientes produtores diferentes estão publicando, 
independentemente um do outro, novos eventos no tópico, gravando eventos na rede nas partições do tópico. 
Eventos com a mesma chave (denotados por suas cores na figura) são gravados na mesma partição. Observe que ambos os 
produtores podem gravar na mesma partição, se apropriado.

Para tornar seus dados tolerantes a falhas e altamente disponíveis, todos os tópicos podem ser replicados ,
mesmo em regiões geográficas ou datacenters, para que sempre haja vários corretores que tenham uma cópia dos dados, 
caso algo dê errado, você deseja fazer manutenção nos corretores e assim por diante. Uma configuração de produção comum 
é um fator de replicação de 3, ou seja, sempre haverá três cópias de seus dados. Essa replicação é realizada no nível 
das partições de tópico.

### 4. Configurando o ambiente.

### 4.1 Instalar o Kafka

Link para baixar o [Kafka](https://kafka.apache.org/downloads)

Depois disso você pode descompactar em qualquer pasta `No meu caso eu descompactei na pasta C:`

### 4.2 Instalar o Zookepeer

Link para baixar o [Zookepeer](http://zookeeper.apache.org/releases.html)

Depois disso você pode descompactar em qualquer pasta `No meu caso eu descompactei na pasta C:`

### 4.3 Aqui fica sua preferência como executar o kafka e zookeper local ou via docker

Aqui te dou a escolha de usar o kafka e zookeeper na sua máquina ou usando via docker-compose.

### 4.3.1 Rodando o Kafka e Zookeeper local via terminal

### Rodando o kafka na sua maquina MAC/linux

- Acessar a pasta `seucaminho/kafka.2.12-2.3.1/bin/`
- 
**OBS:** fique atento com a versão que vc baixou 

- Depois Executar o comando:
```
kafka-server-start.sh config/server.properties
```

### Rodando o kafka na sua maquina windows:

- Acessar a a pasta `C://kafka.2.12-2.3.1/bin/windows`.

**OBS:** fique atento com a versão que vc baixou

- Executar o comando:

```
kafka-server-start.bat  C:\kafka_2.12-2.3.1\config\server.properties
```

###  Rodando o zookeper na sua maquina windows

- Acessar a a pasta `seucaminho/kafka.2.12-2.3.1/bin/bin/`.

**OBS:** fique atento com a versão que vc baixou

- Executar o comando:

```
zookeeper-server-start.sh config\zookeeper.properties
```

###  Rodando o zookeper na sua máquina windows

- Acessar a a pasta `C://kafka.2.12-2.3.1/bin/windows`.

**OBS:** fique atento com a versão que vc baixou

- Executar o comando:

```
zookeeper-server-start.bat  C:\kafka_2.12-2.3.1\config\zookeeper.properties
```

### 4.3.1.1 Criando um Tópico via comando

### Criando um tópico no Windows

```
kafka-topics.bat --create --bootstrap-server localhost:9092 --replication-factor 1 --partitions 1 --topic NOME_DO_TOPICO
```

### Criando um tópico no Mac/linux

```
kafka-topics.sh --create --bootstrap-server localhost:9092 --replication-factor 1 --partitions 1 --topic NOME_DO_TOPICO
```

### 4.3.1.2 Listando Tópicos via comando

### Listando um tópico no Windows

```
kafka-topics.bat --list --bootstrap-server localhost:9092
```

### Listando um tópico no Mac/linux

```
kafka-topics.sh --list --bootstrap-server localhost:9092
```

### 4.3.1.3 Produzindo mensagem para um Tópico via comando

### Produzindo uma mensagem em um tópico no Windows

```
kafka-console-producer.bat --broker-list localhost:9092 --topic NOME_DO_TOPICO
```

**OBS:** Após rodar esse comando cada texto que vc digitar no terminal e apertar enter será uma mensagem do tópico

### Produzindo uma mensagem em um tópico no Mac/linux

```
kafka-console-producer.sh --broker-list localhost:9092 --topic NOME_DO_TOPICO
```

**OBS:** Após rodar esse comando cada texto que vc digitar no terminal e apertar enter será uma mensagem do tópico

### 4.3.1.4 Consumindo um Tópico via comando

### Consumindo um tópico no Windows

```
kafka-console-consumer.bat --bootstrap-server localhost:9092 --topic NOME_DO_TOPICO --from-beginning
```

### Consumindo um tópico no Mac/linux

```
kafka-console-consumer.sh --bootstrap-server localhost:9092 --topic NOME_DO_TOPICO --from-beginning
```

### 4.3.2 Rodando o Kafka e Zookeeper via docker-compose

Neste passo e preciso ter o docker na máquina sugiro que siga as instruções deste link [Docker](https://docs.docker.com/get-docker/)

No nosso projeto existe um arquivo `docker-compose.yml` na pasta raiz, basta acessar o terminal e rodar os comandos abaixo

### 4.3.2.1 Criando um Tópico via comando docker-compose

```
docker exec kafka kafka-topics --create --if-not-exists --zookeeper zookeeper:2181 --partitions 1 --replication-factor 1 --topic NOME_DO_TOPICO
```

### 4.3.2.3 Listando Tópicos via docker-compose

```
docker-compose exec kafka kafka-topics --list --bootstrap-server localhost:9092
```

### 4.3.2.3 Consumindo um Tópico via docker-compose

```
docker-compose exec kafka kafka-console-consumer --bootstrap-server localhost:29092 --topic NOME_DO_TOPICO --from-beginning
```

### 5. Configurando o projeto de automação

Para o nosso projeto de automação vamos usar o docker-compose para subir o kafka e o zookeeper para ficar mais facil 
para nossa automação.

### 5.1. Rodando kafka e zookeeper no docker:

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

Para subir um tópico dentro do docker basta executar esse comando


```
docker-compose exec kafka kafka-topics --create --if-not-exists --zookeeper zookeeper:2181
 --partitions 1 --replication-factor 1 --topic topic_user 
```

**OBS:** o docker já cria um tópico chamado `topic_user` caso queira criar outro basta executar esse comando acima

#### COMECAR AQUI AMANHA

pra gente trabalhar com producer e consumer é preciso ter o:
<dependency>
<groupId>org.apache.kafka</groupId>
<artifactId>kafka-clients</artifactId>
<version>3.0.0</version>
</dependency>

### projeto

é necessario ter 
java 8+
maven
kafka
zookeeper
o plugin do lombok

### 6. Referências

### Kafka

https://www.confluent.io/

https://kafka.apache.org/intro

https://kafka.apache.org/21/documentation.html

https://kafka.apache.org/21/documentation.html#consumerconfigs

### Zookeeper

https://zookeeper.apache.org/

https://cwiki.apache.org/confluence/display/ZOOKEEPER/Index

### Docker

https://docs.docker.com/get-docker/
