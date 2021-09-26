package tests;

import kafka.ConsumerUser;
import kafka.ProducerUser;
import org.junit.Test;
import user.User;

public class KafkaTest {
    User user;

    @Test
    public void example(){
        User users = user.builder().nome("bruno").email("bruno@gmail.com").age(1).build();

        ProducerUser.sendMessageTopic("ECOMMERCE_NEW_ORDER", users);
        ConsumerUser.getMessageTopic("ECOMMERCE_NEW_ORDER");
    }
}
