package techprimers.techprimers.kafka.domaincrawler;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DomainCrawlerApplication {

	public static void main(String[] args) {
		SpringApplication.run(DomainCrawlerApplication.class, args);
	}

}
//http://localhost:8080/domain/lookup/facebook