package com.bridgelabz.designpatterns.prototype;
import java.util.ArrayList;
import java.util.List;
/*************************************************************************************************
 * @author 	:Pramila0526
 * Purpose	:Employess List in Cloneable
 * 
 *
 *************************************************************************************************/
public class Employees implements Cloneable{
	private List<String> empList;
	public Employees(){
		empList = new ArrayList<String>();
	}
	public Employees(List<String> list){
		this.empList=list;
	}
	public void loadData(){
		//reading all employees from database and put into the list
		empList.add("Neha");
		empList.add("Veena");
		empList.add("Heena");
		empList.add("Shivani");
	}
	
	public List<String> getEmpList() {
		return empList;
	}
	public Object clone() throws CloneNotSupportedException{
			List<String> temp = new ArrayList<String>();
			for(String s : this.getEmpList()){
				temp.add(s);
			}
			return new Employees(temp);
	}
	
}
