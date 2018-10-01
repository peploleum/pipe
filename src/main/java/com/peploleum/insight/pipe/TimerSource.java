package com.peploleum.insight.pipe;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.integration.annotation.InboundChannelAdapter;
import org.springframework.integration.annotation.Poller;
import org.springframework.integration.core.MessageSource;
import org.springframework.messaging.support.GenericMessage;

import java.text.SimpleDateFormat;
import java.util.Date;

@Configuration
//@EnableBinding(Source.class)
public class TimerSource {

    @Value("${format}")
    private String format;

//    @Bean
//    @InboundChannelAdapter(value = Source.OUTPUT, poller = @Poller(fixedDelay = "${fixed-delay}", maxMessagesPerPoll = "1"))
//    public MessageSource<String> timerMessageSource() {
//        return () -> new GenericMessage<>(new SimpleDateFormat(format).format(new Date()));
//    }

}
