package kafkaAvro;

import modelAvro.user.UserAvro;
import org.apache.kafka.clients.consumer.Consumer;
import org.apache.kafka.clients.consumer.ConsumerRecords;
import org.apache.kafka.clients.consumer.KafkaConsumer;

import java.time.Duration;
import java.util.Collections;

import static utils.DefaultProperties.propertiesConsumerAvro;

public class ConsumerAvroUser {

    private static String valorDaMensagem;

    public static String getMessageTopic(String topic) {
        Consumer<String, UserAvro> consumer = new KafkaConsumer<>(propertiesConsumerAvro(topic));
        consumer.subscribe(Collections.singletonList(topic));

        final ConsumerRecords<String, UserAvro> records = consumer.poll(Duration.ofSeconds(10));
        records.forEach(record -> {
            Object objectTopic = record.value();
            valorDaMensagem = objectTopic.toString();
            System.out.println("Consumindo do topico a messangem:" + valorDaMensagem);
        });

        consumer.commitAsync();
        consumer.close();

        return valorDaMensagem;

    }
}
