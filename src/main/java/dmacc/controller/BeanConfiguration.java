/**
 * @author abhit - aryan9
 * CIS175 - Spring 2023
 * Mar 17, 2023
 */
package dmacc.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import dmacc.beans.Computer;
import dmacc.beans.Details;

@Configuration
public class BeanConfiguration {

	@Bean
		public Computer computer() {
			Computer bean = new Computer("ASUS - ROG Zephyrus M16 GU603 Gaming Laptop");
			//bean.setBrand("ASUS");
			//bean.setModel("Fancy Computer");
			//bean.setRetailPrice("$1249.99");
			return bean;
		}
		
	@Bean
		public Details details() {
			Details bean = new Details("NVIDIA GeForce RTX 3060", "Intel Core i9", "1TB SSD");
			return bean;
		}
}
