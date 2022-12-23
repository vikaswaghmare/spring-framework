package com.springcore.BeanManipulationsWrappers;

 
import java.beans.BeanInfo;
import java.beans.IntrospectionException;
import java.beans.MethodDescriptor;
import java.beans.PropertyDescriptor;
import org.springframework.beans.BeanInfoFactory;
import org.springframework.beans.ExtendedBeanInfoFactory;


public class Test {

	public static void main(String[] args) throws IntrospectionException {
//		BeanInfo beanInfo = Introspector.getBeanInfo(Employee.class);
//		 PropertyDescriptor[] property_desc = beanInfo.getPropertyDescriptors();
//		 for(PropertyDescriptor p: property_desc){
//		 System.out.println(p);
//		 }
//		MethodDescriptor[] meths = beanInfo.getMethodDescriptors();
//		 for(MethodDescriptor m: meths){
//		 System.out.println(m.getName());
//	}
		
		BeanInfoFactory factory = new ExtendedBeanInfoFactory();
		 BeanInfo bean_Info = factory.getBeanInfo(Employee.class);
		 System.out.println(bean_Info);
		 PropertyDescriptor[] props = bean_Info.getPropertyDescriptors();
		 for(PropertyDescriptor p: props){
		 System.out.println(p);
		 }
		MethodDescriptor[] meths = bean_Info.getMethodDescriptors();
		 for(MethodDescriptor m: meths){
		 System.out.println(m.getName());

}
}
}