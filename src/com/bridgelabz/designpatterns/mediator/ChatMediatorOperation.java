package com.bridgelabz.designpatterns.mediator;
import java.util.ArrayList;
import java.util.List;
/*************************************************************************************************
 * @author 	:Pramila0526
 * Purpose	:Chat mediator Operations
 * 
 *
 *************************************************************************************************/
public class ChatMediatorOperation implements ChatMediator {
	private List<User> users;
	public ChatMediatorOperation() 
	{
		super();
		this.users = new ArrayList<>();
	}
	public void sendMessage(String msg, User user) 
	{
		for(User u:this.users)
		{
			//Sender should not get his message
			if(u!=user)
			{
				u.receiveMsg(msg);
			}
		}
	}
	public void addUser(User user) {
		this.users.add(user);
	}
}
