package com.bridgelabz.designpatterns.adapter;
/*************************************************************************************************
 * @author 	:Pramila0526
 * Purpose	:Volt Class
 *
 *************************************************************************************************/
public class Volt {
	private int volts;
	// Constructor Volt
	public Volt(int v)
	{
		this.volts=v;
	}
    //Getters and Settters
	public int getVolts() {
		return volts;
	}
	public void setVolts(int volts) {
		this.volts = volts;
	}
}
