package com.bridgelabz.designpatterns.factory;
/*************************************************************************************************
 * @author 	:Pramila0526
 * Purpose	:Computer Class For Factory
 *
 *************************************************************************************************/
public abstract class Computer 
{
	//Features
	public abstract String getRAM();
	public abstract String getHDD();
	public abstract String getCPU();
	
	public String toString()
	{
		return "RAM= "+this.getRAM()+", HDD="+this.getHDD()+", CPU="+this.getCPU();
	}
}
