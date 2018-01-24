package i18n.XML;

import java.util.Locale;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class testXML {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("i18nXML/i18n.config.xml");
		
		String key1 = ctx.getMessage("key1", null, Locale.TAIWAN);
		String key2 = ctx.getMessage("key2",new String[] {"A","B","C","D"}, Locale.US);
		
		System.out.println(key1);
		System.out.println(key2);
		
		((ConfigurableApplicationContext) ctx).close();
	}

}
