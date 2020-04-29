package org.springframework.learn;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @Description
 * @Author chebo
 * @Date 2020/4/29 2:02 PM
 */
@ComponentScan
@Configuration
class JavaConfig {

	@Bean
	public Person person() {
		return new Person("张三", 3);
	}

}

class Person {
	private String name;
	private Integer age;

	public Person(String name, Integer age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person{" +
				"name='" + name + '\'' +
				", age=" + age +
				'}';
	}
}

/**
 */
public class Main {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ac1 = new AnnotationConfigApplicationContext(JavaConfig.class);
		Person person = (Person) ac1.getBean("person");
		System.out.println(person);
	}
}
