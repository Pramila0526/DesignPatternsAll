package com.bridgelabz.designpatterns.mediator;
/*************************************************************************************************
 * @author 	:Pramila0526
 * Purpose	:Chat mediator
 * 
 *
 *************************************************************************************************/
public interface ChatMediator {
	public void sendMessage(String msg, User user);

	void addUser(User user);
}
