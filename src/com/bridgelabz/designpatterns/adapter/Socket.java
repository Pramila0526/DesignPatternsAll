package com.bridgelabz.designpatterns.adapter;
/*************************************************************************************************
 * @author 	:Pramila0526
 * Purpose	:Socket For Adapter
 *
 *************************************************************************************************/
public class Socket {

	public Volt getVolt()
	{
		return new Volt(120);  //Generating a Default Volt
	}
}
