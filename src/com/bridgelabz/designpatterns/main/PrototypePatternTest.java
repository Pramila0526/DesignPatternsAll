package com.bridgelabz.designpatterns.main;
import java.util.List;
import com.bridgelabz.designpatterns.prototype.Employees;
/*************************************************************************************************
 * @author 	:Pramila0526
 * Purpose	:Main of Prototype
 *
 *************************************************************************************************/
public class PrototypePatternTest 
{
	public static void main(String[] args) throws CloneNotSupportedException 
	{
		Employees emps = new Employees();
		emps.loadData();
		
		//Use the clone method to get the Employee object
		Employees empsNew = (Employees) emps.clone();
		Employees empsNew1 = (Employees) emps.clone();
		
		List<String> list = empsNew.getEmpList();
		list.add("Sayali"); 
		List<String> list1 = empsNew1.getEmpList();
		list1.remove("Pankaj");  //It is not going to delete bcoz Pankaj Doesnt exist in the data
		list1.remove("Shivani");
		
		System.out.println("emps List: "+emps.getEmpList());
		System.out.println("empsNew List: "+list);
		System.out.println("empsNew1 List: "+list1);
	}

}
