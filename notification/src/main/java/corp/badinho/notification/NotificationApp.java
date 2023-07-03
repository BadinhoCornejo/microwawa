package corp.badinho.notification;

import corp.badinho.amqp.RabbitMQMessageProducer;
import corp.badinho.clients.notification.NotificationRequest;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;

@SpringBootApplication(
        scanBasePackages = {
                "corp.badinho.notification",
                "corp.badinho.amqp",
        }
)
@PropertySources({@PropertySource("classpath:clients-${spring.profiles.active}.properties")})
public class NotificationApp {
    public static void main(String[] args) {
        SpringApplication.run(NotificationApp.class, args);
    }

/*
    @Bean
    CommandLineRunner commandLineRunner(
            RabbitMQMessageProducer producer,
            NotificationConfig notificationConfig
    ) {
        return args -> {
            producer.publish(
                    NotificationRequest.builder().toCustomerId(1).toCustomerName("Peralitos").message("peralin").build(),
                    notificationConfig.getInternalExchange(),
                    notificationConfig.getInternalNotificationRoutingKey());
        };
    }
*/
}
