package i18n.Java.Multiple;

import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ResourceBundleMessageSource;

@Configuration
@ComponentScan(basePackages = { "i18n" })
public class i18nJavaMultipleConfig {
	@Bean
	public MessageSource messageSource() {
		ResourceBundleMessageSource rbms = new ResourceBundleMessageSource();
		rbms.setBasenames("i18nXMLMultiple.Message","i18nXMLMultiple.Data");
		return rbms;
	}
}
