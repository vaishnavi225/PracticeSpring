package demo;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import sam.Triangle;

public class Test {
	public static void main(String[] args) {
		BeanFactory factory = 
				new XmlBeanFactory(new FileSystemResource("spring.xml"));
		Triangle t = (Triangle) factory.getBean("triangle");
		t.draw();
	}
}
