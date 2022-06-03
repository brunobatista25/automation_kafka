package kafka;

import org.apache.kafka.clients.consumer.Consumer;
import org.apache.kafka.clients.consumer.ConsumerRecords;
import org.apache.kafka.clients.consumer.KafkaConsumer;

import java.time.Duration;
import java.util.Collections;

import static utils.DefaultProperties.propertiesConsumer;

public class ConsumerUser {

    private static String valorDaMensagem;

    public static String getMessageTopic(String topic) {
        // intanciando o consumer e passando as propriedades
        Consumer<String, String> consumer = new KafkaConsumer<>(propertiesConsumer(topic));
// me conecto com o topico
        consumer.subscribe(Collections.singletonList(topic));
// aqui procuro a(s) mensagem no topico
        final ConsumerRecords<String, String> records = consumer.poll(Duration.ofSeconds(10));
        records.forEach(record -> {
            Object objectTopic = record.value();
            valorDaMensagem = objectTopic.toString();
            System.out.println("Consumindo do topico a messangem:" + valorDaMensagem);
        });

// e fecho a conexao co1516.40m o topico depois que fiz o que tinha que fazer
        consumer.commitAsync();
        consumer.close();

        return valorDaMensagem;

    }
}
