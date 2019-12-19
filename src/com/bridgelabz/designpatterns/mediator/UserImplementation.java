package com.bridgelabz.designpatterns.mediator;
/*************************************************************************************************
 * @author 	:Pramila0526
 * Purpose	:User Implementation
 * 
 *
 *************************************************************************************************/
public class UserImplementation extends User {
	public UserImplementation(ChatMediator cmediator, String name) {
		super(cmediator, name);
	}
	public void sendMsg(String msg) {
		System.out.println("                                " + this.name + " Sent a Message--->" + msg);
		cmediator.sendMessage(msg, this);
	}
	public void receiveMsg(String msg) {
		System.out.println("--->" + this.name + " Received a Message:" + msg);
	}
}
