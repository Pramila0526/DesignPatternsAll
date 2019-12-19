package com.bridgelabz.designpatterns.main;
import com.bridgelabz.designpatterns.mediator.ChatMediator;
import com.bridgelabz.designpatterns.mediator.ChatMediatorOperation;
import com.bridgelabz.designpatterns.mediator.User;
import com.bridgelabz.designpatterns.mediator.UserImplementation;
/*************************************************************************************************
 * @author 	:Pramila0526
 * Purpose	:Main of Mediator
 *
 *************************************************************************************************/
public class ChatAppMain 
{
public static void main(String[] args) 
{
	ChatMediator mediator=new ChatMediatorOperation(); 
		
	User u1=new UserImplementation(mediator, "Pramila");
	User u2=new UserImplementation(mediator, "Supriya");
	User u3=new UserImplementation(mediator, "Sonam");
	User u4=new UserImplementation(mediator, "Aishwarya");
	User u5=new UserImplementation(mediator, "Pranali");
	User u6=new UserImplementation(mediator, "Surbhi");
	
	mediator.addUser(u1);
	mediator.addUser(u2);
	mediator.addUser(u3);
	mediator.addUser(u4);
	mediator.addUser(u5);
	mediator.addUser(u6);
	
	u1.sendMsg("Hello people");
	u5.sendMsg("Hello");
}
}
