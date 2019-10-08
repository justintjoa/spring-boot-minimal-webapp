package hello;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {
	public static String index() {	
		String html = "<h1>Hello World!</h1>\n" + "<p>This web app is powered by \n" + "<a href='https://github.com/justintjoa/spring-boot-minimal-webapp'>this github repo</a></p>\n";
		return html;
	}
	public static void main(String[] args) {
    		HelloController.index();
	}	
 
}
