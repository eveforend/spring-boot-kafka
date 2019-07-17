package io.ymq.kafka.run;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import io.ymq.kafka.KafkaSender;

/**
 * 描述:启动服务
 *
 * @author yanpenglei
 * @create 2017-10-16 18:51
 **/
@SpringBootApplication
@ComponentScan(value = {"io.ymq.kafka"})
@EnableConfigurationProperties
public class Startup {

	
    public static void main(String[] args) {
        ApplicationContext applicationContext = SpringApplication.run(Startup.class, args);
//        MsgProducer msgProducer = applicationContext.getBean(MsgProducer.class);
//        msgProducer.sendMessage("topic-1", "SDK No.1");
        KafkaSender kafkaSender = applicationContext.getBean(KafkaSender.class);
        for (int i = 0; i < 10; i++) {
        	kafkaSender.sendChannelMess("seckill", "sdk No.1");
        }
    }
}
