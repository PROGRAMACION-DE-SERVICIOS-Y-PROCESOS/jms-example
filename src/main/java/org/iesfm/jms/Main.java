package org.iesfm.jms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.jms.annotation.EnableJms;

@SpringBootApplication
@EnableJms
public class Main {
    public static void main(String[] args) {
        ConfigurableApplicationContext context =
                SpringApplication.run(Main.class, args);

        context.getBean(HelloWorldEmailSender.class).send();
    }
}
