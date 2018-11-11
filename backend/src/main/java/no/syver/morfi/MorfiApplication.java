package no.syver.morfi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("no.syver.morfi")
public class MorfiApplication {

	public static void main(String[] args) {
		SpringApplication.run(MorfiApplication.class, args);
	}
}
