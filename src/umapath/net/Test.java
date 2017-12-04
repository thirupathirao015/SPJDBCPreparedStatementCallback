package umapath.net;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Test {

	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
		
		EmployeeDao dao=(EmployeeDao)ctx.getBean("edao");
	Boolean status=dao.saveEmployeeByPreparedStatement(new Employee(6," Balaji ","Bangalore"));
		System.out.println(status);
		
	}

}
