package tests;

import kafka.ConsumerUser;
import kafka.ProducerUser;
import kafkaAvro.ConsumerAvroUser;
import kafkaAvro.ProducerAvroUser;
import modelAvro.user.UserAvro;
import org.junit.Test;
import user.User;
import utils.ReadYml;

import java.util.Properties;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class KafkaTest {
    User user;

    @Test
    public void enviandoMensagemParaOTopicoComSucesso(){
        // Lendo arquivo yml
        Properties dados = ReadYml.lerArquivoYml("dados");

        // Adicionando valores ao objeto users
        User users = user.builder().nome(dados.getProperty("nome")).email(dados.getProperty("email")).age(1).build();

        // Enviando uma mensagem pro tópico "topic_user" com o valor "{"nome":bruno,"email":bruno@gmail.com,"age":1}"
        ProducerUser.sendMessageTopic("topic_user", users);

        // Consumindo uma mensagem do tópico e validando se esta correto
        assertThat(ConsumerUser.getMessageTopic("topic_user"), is("{\"nome\":bruno,\"email\":bruno@gmail.com,\"age\":1}"));
    }

    @Test
    public void enviandoMensagemParaOTopicoComSucessoComAvro(){
        // Lendo arquivo yml
        Properties dados = ReadYml.lerArquivoYml("dados");

        // setando valores pro objeto UserAvro
        UserAvro avroMessage = UserAvro.newBuilder()
                .setNome("bruno")
                .setEmail("bruno@gmail.com")
                .setAge("31")
                .build();

        // Enviando uma mensagem pro tópico "topic_user" com o valor "{"nome": "bruno","email": "bruno@gmail.com","age": "31" }"
        ProducerAvroUser.sendMessageTopic("topic_user", avroMessage);

        // Consumindo uma mensagem do tópico e validando se esta correto
        assertThat(ConsumerAvroUser.getMessageTopic("topic_user"), is("{\"nome\": \"bruno\", \"email\": \"bruno@gmail.com\", \"age\": \"31\"}"));
    }
}
