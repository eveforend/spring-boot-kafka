package io.ymq.kafka;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

/**
 * 消费者 spring-kafka 2.0 + 依赖JDK8
 * 
 * @author 科帮网 By https://blog.52itstyle.com
 */
@Component
public class KafkaConsumer {
	/**
	 * 监听seckill主题,有消息就读取
	 * 
	 * @param message
	 */
//	@KafkaListener(topics = { "seckill" }, groupId = "sdk")
//	@KafkaListener(topics = { "seckill" })
	@KafkaListener(topics = { "seckill" }, groupId = "sdk1")
	public void receiveMessage(String message) {
		// 收到通道的消息之后执行秒杀操作
		System.err.println("-----" + message);
	}
}