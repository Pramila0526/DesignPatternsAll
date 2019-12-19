package com.bridgelabz.designpatterns.mediator;
/*************************************************************************************************
 * @author 	:Pramila0526
 * Purpose	:Chat User
 * 
 *
 *************************************************************************************************/
public abstract class User {
	protected ChatMediator cmediator;
	protected String name;
	public User(ChatMediator cmediator, String name) {
		super();
		this.cmediator = cmediator;
		this.name = name;
	}
	public abstract void sendMsg(String msg);
	
	public abstract void receiveMsg(String msg);
}
