/* Device Detection Controller
 * Intercept User-Agent request & resolve it
 * to return a String letting us know what type of device we are using
http://spring.io/guides/gs/device-detection/

	Jan 15, 2014*/

package hello;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.boot.SpringApplication;

/*The included libraries here a very important to understand in order to know
whats going on. To quickly sum it up @ComponentScan looks through the 
"hello" package in order to find a @Component(or @Controller) to do the
work in our app. The @EnableAutoConfiguration turns on some reasonable
default behaviours, DispatcherServlet for SpringMVC, Tomcat app server.
They should be reviewed further.*/

@ComponentScan
@EnableAutoConfiguration
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);

	}

}
