package pantelisgavalas.lil.sbet.clr.fizz_buzz;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class FizzBuzzApplication {

	private static final Logger LOG = LoggerFactory.getLogger(FizzBuzzApplication.class);

	@Bean
	public RestTemplate restTemplate(RestTemplateBuilder builder) {
		return builder.build();
	}

	@Bean
	public CommandLineRunner run(RestTemplate restTemplate) throws Exception {
		return args -> {
			LOG.info("Starting Fizz-Buzz application");
			for (int i=1; i<= 100; i++) {
				if (i%3==0 && i%5==0) {
					LOG.info("FizzBuzz");
				} else if (i%3==0) {
					LOG.info("Fizz");
				} else if (i%5==0) {
					LOG.info("Buzz");
				} else {
					LOG.info(Integer.toString(i));
				}
			}
			LOG.info("Finishing Fizz-Buzz application");
		};
	}

	public static void main(String[] args) {
		SpringApplication.run(FizzBuzzApplication.class, args);
	}

}
