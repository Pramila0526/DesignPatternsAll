package com.bridgelabz.designpatterns.adapter;
/************************************************************************************************
 * @author	:Pramila0526
 * Purpose 	:Using inheritance for adapter pattern
 *
 **************************************************************************************************/
public class SocketClassAdapterImpl extends Socket implements SocketAdapter
{
	public Volt get120Volt() {
		return getVolt();		 //It has by default 120 Volt
	}
	public Volt get12Volt() {
		Volt v= getVolt();
		return convertVolt(v,10);//For 12 Volt
	}
	public Volt get3Volt() {
		Volt v= getVolt();
		return convertVolt(v,40);//For 3 Volt
	}
	private Volt convertVolt(Volt v, int i) {
		return new Volt(v.getVolts()/i);	//Dividing the volt according to the requirements
	}

}
