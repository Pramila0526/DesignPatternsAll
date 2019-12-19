package com.bridgelabz.designpatterns.adapter;
/************************************************************************************************
 * @author 	Pramila0526
 * Purpose	SocketAdapter To get Volts
 *
 ***********************************************************************************************************/
public interface SocketAdapter 
{
	// getting Volts According to the requirements
	public Volt get120Volt();
	public Volt get12Volt();
	public Volt get3Volt();
}
