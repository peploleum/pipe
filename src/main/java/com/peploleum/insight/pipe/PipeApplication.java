package com.peploleum.insight.pipe;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;

@SpringBootApplication
//@EnableBinding(value = {Sink.class})
public class PipeApplication {

    public static void main(String[] args) {
        SpringApplication.run(PipeApplication.class, args);

    }

//    @StreamListener(Sink.INPUT)
//    public void handle(String message) {
//        System.out.println("Received: " + message);
//    }
}

