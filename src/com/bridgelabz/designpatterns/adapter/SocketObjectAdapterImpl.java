package com.bridgelabz.designpatterns.adapter;
/************************************************************************************************
 * @author 	Pramila0526
 * Purpose	Using Composition for adapter pattern
 *
 ****************************************************************************************************/
public class SocketObjectAdapterImpl implements SocketAdapter{
	private Socket sock = new Socket();
	public Volt get120Volt() {
		return sock.getVolt();    //It has by default 120 Volt
	}
	public Volt get12Volt() {
		Volt v= sock.getVolt();  //For 12 Volt
		return convertVolt(v,10);
	}
	public Volt get3Volt() {
		Volt v= sock.getVolt();  //For 3 Volt
		return convertVolt(v,40);
	}
	private Volt convertVolt(Volt v, int i) {
		return new Volt(v.getVolts()/i);  //Dividing the volt according to the requirements
	}
}
