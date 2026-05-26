package SSPP.SpringBoot_1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringBoot1Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context =
				SpringApplication.run(SpringBoot1Application.class, args);
		
//		System.err.println(context.getClass().getName());
		
		
	}
	
	public void run(String... args) throws Exception
	{
		// validation
		// Login checking
		// other information before starting the application
		
		for(int i=1;i<=10;i++)
		{
			System.out.println("Chandrakant Bhosale");
			
		}
		
	}

}
