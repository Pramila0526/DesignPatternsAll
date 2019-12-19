package com.bridgelabz.designpatterns.observer;
/*************************************************************************************************
 * @author 	:Pramila0526
 * Purpose	:Interface Observer
 *
 *************************************************************************************************/
public interface Observer {
	//method to update the observer, used by subject
	public void update();
	//attach with subject to observe
	public void setSubject(Subject sub);
}
