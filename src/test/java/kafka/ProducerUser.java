package kafka;

import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.Producer;
import org.apache.kafka.clients.producer.ProducerRecord;
import user.User;

import static utils.DefaultProperties.propertiesProducer;

public class ProducerUser {

    public static void sendMessageTopic(String topic, User message) {
        String generateKey = String.valueOf(Math.random());
        Producer<String, String> producer = new KafkaProducer<>(propertiesProducer());
        producer.send(new ProducerRecord<>(topic, generateKey, message.toString()));
        System.out.println("Enviando para o topico a messangem:" + message.toString());
    }
}
