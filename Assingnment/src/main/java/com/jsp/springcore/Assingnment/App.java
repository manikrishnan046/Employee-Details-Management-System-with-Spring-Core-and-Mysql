package com.jsp.springcore.Assingnment;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import com.jsp.springcore.Assingnment.Controller.EmployeeController;
//import com.jsp.springcore.Assingnment.Controller.TomControler;
@ComponentScan(basePackages="com.jsp.springcore.Assingnment")
public class App 
{
    public static void main( String[] args ){
       //@SuppressWarnings("resource")
	ApplicationContext context = new AnnotationConfigApplicationContext(App.class);
      EmployeeController ec = context.getBean(EmployeeController.class);
                         ec.saveEmployee();
     // TomControler tc= context.getBean(TomControler.class);
		// tc.saveTom();

	}
}
