package org.springframework.learn;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Description
 * @Author chebo
 * @Date 2020/4/29 7:18 PM
 */
public class Demo {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
		applicationContext.getBean(QueryDao.class).query();
	}
}
