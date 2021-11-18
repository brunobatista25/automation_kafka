package kafkaAvro;

import modelAvro.user.UserAvro;
import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.Producer;
import org.apache.kafka.clients.producer.ProducerRecord;

import static utils.DefaultProperties.propertiesProducerAvro;

public class ProducerAvroUser {

    public static void sendMessageTopic(String topic, UserAvro message) {
        String generateKey = String.valueOf(Math.random());
        Producer<String, UserAvro> producer = new KafkaProducer<>(propertiesProducerAvro());
        producer.send(new ProducerRecord<String, UserAvro>(topic, generateKey, message));
        System.out.println("Enviando para o topico a messangem:" + message.toString());
    }
}
