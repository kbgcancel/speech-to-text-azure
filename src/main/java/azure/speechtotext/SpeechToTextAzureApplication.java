package azure.speechtotext;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@SpringBootApplication
public class SpeechToTextAzureApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpeechToTextAzureApplication.class, args);
	}
	
}
