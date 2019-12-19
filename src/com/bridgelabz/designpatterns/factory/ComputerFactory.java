package com.bridgelabz.designpatterns.factory;
/*************************************************************************************************
 * @author 	:Pramila0526
 * Purpose	:Computer Factory
 *
 *************************************************************************************************/
public class ComputerFactory 
{
	//Factory of all Data
	public static Computer getComputer(String type, String ram, String hdd, String cpu)
	{
		if("PC".equalsIgnoreCase(type)) 
			return new PC(ram, hdd, cpu);
		else if("Server".equalsIgnoreCase(type)) 
			return new Server(ram, hdd, cpu);
		
		return null;
	}
}
