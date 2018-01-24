package i18n.Java.Multiple;

import java.util.Locale;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class testJavaMultiple {

	public static void main(String[] args) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(i18nJavaMultipleConfig.class);
		
		String key1 = ctx.getMessage("key1",null, Locale.TAIWAN);
		String key2 = ctx.getMessage("key2",new String[] {"A","B","C","D"}, Locale.US);
		String key3 = ctx.getMessage("key3",null, Locale.TAIWAN);
		String key4 = ctx.getMessage("key4",new String[] {"a","b","c","d"}, Locale.US);
		
		System.out.println(key1);
		System.out.println(key2);
		System.out.println(key3);
		System.out.println(key4);
		
		((ConfigurableApplicationContext)ctx).close();
	}

}
