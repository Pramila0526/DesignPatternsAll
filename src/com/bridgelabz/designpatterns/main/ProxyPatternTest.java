package com.bridgelabz.designpatterns.main;
import com.bridgelabz.designpatterns.proxy.CommandExecutor;
import com.bridgelabz.designpatterns.proxy.CommandExecutorProxy;
/*************************************************************************************************
 * @author 	:Pramila0526
 * Purpose	:Main Of Proxy
 *
 *************************************************************************************************/
public class ProxyPatternTest 
{
	public static void main(String[] args)
	{
		CommandExecutor executor = new CommandExecutorProxy("Pramila", "J@urnalD$v");
		try 
		{
			executor.runCommand("ls -ltr");
			executor.runCommand(" rm -rf abc.pdf");
		} 
		catch (Exception e) 
		{
			System.out.println("Exception Message::"+e.getMessage());
		}
	}
}
