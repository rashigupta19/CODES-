package Editor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Caller {

	public static void main(String[] args) {
		ApplicationContext ac=new ClassPathXmlApplicationContext("SpellCheck.xml");
		TextEditor te=(TextEditor)ac.getBean("texteditor");
		te.spellchecker();
	}
}