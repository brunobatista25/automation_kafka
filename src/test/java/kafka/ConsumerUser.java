package kafka;

import org.apache.kafka.clients.consumer.Consumer;
import org.apache.kafka.clients.consumer.ConsumerRecords;
import org.apache.kafka.clients.consumer.KafkaConsumer;

import java.time.Duration;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicBoolean;

import static utils.DefaultProperties.propertiesConsumer;

public class ConsumerUser {



    public static void getMessageTopic(String topic) {
        AtomicBoolean found = new AtomicBoolean(false);
        int limits = 3;
        int noRecords = 0;
        Consumer<String, String> consumer = new KafkaConsumer<>(propertiesConsumer(topic));
        consumer.subscribe(Collections.singletonList(topic));
        while (true) {
            final ConsumerRecords<String, String> records = consumer.poll(Duration.ofSeconds(10));
            if (records.count() == 0) {
                noRecords++;
            }

            if (noRecords >= limits) {
                break;
            }

            records.forEach(record -> {
                found.set(true);
                System.out.println(record.value());
            });
            consumer.commitAsync();
        }
        consumer.close();
    }
}
