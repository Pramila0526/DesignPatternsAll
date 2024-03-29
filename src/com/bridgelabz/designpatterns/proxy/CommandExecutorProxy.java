package com.bridgelabz.designpatterns.proxy;
/*************************************************************************************************
 * @author 	:Pramila0526
 * Purpose	:Command Executor Proxy
 * 
 *
 *************************************************************************************************/
public class CommandExecutorProxy implements CommandExecutor 
{
	private boolean isAdmin;
	private CommandExecutor executor;
	public CommandExecutorProxy(String user, String pwd)
	{
		if("Pramila".equals(user) && "J@urnalD$v".equals(pwd)) 
			isAdmin=true;
		executor = new CommandExecutorImpl();
	}
	public void runCommand(String cmd) throws Exception {
		if(isAdmin)
		{
			executor.runCommand(cmd);
		}
		else
		{
			if(cmd.trim().startsWith("rm"))
			{
				throw new Exception("rm command is not allowed for non-admin users.");
			}
			else
			{
				executor.runCommand(cmd);
			}
		}
	}
}
