package i18n.Java;

import java.util.Locale;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class testJava {

	public static void main(String[] args) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(i18nJavaConfig.class);
		
		String key1 = ctx.getMessage("key1",null, Locale.TAIWAN);
		String key2 = ctx.getMessage("key2",new String[] {"A","B","C","D"}, Locale.US);
		
		System.out.println(key1);
		System.out.println(key2);
		
		((ConfigurableApplicationContext)ctx).close();
	}

}
