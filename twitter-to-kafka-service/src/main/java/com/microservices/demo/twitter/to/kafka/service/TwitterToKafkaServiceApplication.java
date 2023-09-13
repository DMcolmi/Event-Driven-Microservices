package com.microservices.demo.twitter.to.kafka.service;

import com.microservices.demo.twitter.to.kafka.service.config.TwitterToKafkaServiceApplicationConfigData;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class TwitterToKafkaServiceApplication implements CommandLineRunner {

    private static final Logger LOG = LoggerFactory.getLogger(TwitterToKafkaServiceApplication.class);
    private final TwitterToKafkaServiceApplicationConfigData twitterToKafkaServiceApplicationConfigData;

    public TwitterToKafkaServiceApplication(TwitterToKafkaServiceApplicationConfigData configData) {
        this.twitterToKafkaServiceApplicationConfigData = configData;
    }

    public static void main(String[] args) {
        SpringApplication.run(TwitterToKafkaServiceApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        LOG.info("App Start");
        LOG.info(Arrays.toString(twitterToKafkaServiceApplicationConfigData.getTwitterKeywords().toArray(new String[0])));
        LOG.info(twitterToKafkaServiceApplicationConfigData.getWelcomeMessage());
    }
}
