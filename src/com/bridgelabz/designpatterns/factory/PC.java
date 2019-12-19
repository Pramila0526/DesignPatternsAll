package com.bridgelabz.designpatterns.factory;
/*************************************************************************************************
 * @author 	:Pramila0526
 * Purpose	:PC for Features
 *
 *************************************************************************************************/
public class PC extends Computer 
{
	//Features Of PC
	private String ram;
	private String hdd;
	private String cpu;
	
	public PC(String ram, String hdd, String cpu)
	{
		this.ram=ram;
		this.hdd=hdd;
		this.cpu=cpu;
	}
	
	public String getRAM() 
	{
		return this.ram;
	}

	@Override
	public String getHDD()
	{
		return this.hdd;
	}

	public String getCPU() 
	{
		return this.cpu;
	}

}
