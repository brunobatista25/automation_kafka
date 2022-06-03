package kafka;

import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.Producer;
import org.apache.kafka.clients.producer.ProducerRecord;
import user.User;

import static utils.DefaultProperties.propertiesProducer;

public class ProducerUser {

    public static void sendMessageTopic(String topic, Object message) {
        // Gerando uma key aleatoria
        String generateKey = String.valueOf(Math.random());
        //instanciando o kafka producer passando as propriedades
        Producer<String, String> producer = new KafkaProducer<>(propertiesProducer());
        // Enviando msg para o topico
        producer.send(new ProducerRecord<>(topic, message.toString()));
        // printando a msg enviada
        System.out.println("Enviando para o topico a messangem:" + message.toString());
    }
}
