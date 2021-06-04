package pointcutCombination;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App 
{
	 public static void main( String[] args )
	    {
	    	// read spring config java class
	    			AnnotationConfigApplicationContext context =
	    					new AnnotationConfigApplicationContext(DemoConfig.class);
	    			
	    			// get the bean from spring container
	    			AccountDao theAccountDao=context.getBean("accountDao",AccountDao.class);

	    			theAccountDao.setAccount("Rashi");
	    			theAccountDao.getAccount();


	    			// close the context
	    			context.close();
	    }
}
