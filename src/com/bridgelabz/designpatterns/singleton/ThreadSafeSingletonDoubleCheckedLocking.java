package com.bridgelabz.designpatterns.singleton;
/******************************************************************************************
 * @author	:Pramila0526
 * Purpose 	:ThreadSafe Singleton DoubleChecked Locking
 * Date		:12/12/2019
 *
 ****************************************************************************************/
public class ThreadSafeSingletonDoubleCheckedLocking 
{
	// Instance should be private
	 private static ThreadSafeSingletonDoubleCheckedLocking instance;
	// private constructor to avoid client applications to use constructor
	 private ThreadSafeSingletonDoubleCheckedLocking()
	 {
		 
	 }
	// public method to provide global access
	 public static ThreadSafeSingletonDoubleCheckedLocking getInstance()
	 {
	        if(instance == null)
	        {
	        	//1) In this approach, the synchronized block is used inside the 
	        	// if condition with an additional check to ensure that only
	        	// one instance of a singleton class is created.
	            synchronized (ThreadSafeSingleton.class) 
	            {
	                if(instance == null)
	                {
	                	System.out.println("This is Thread Safe Singleton DoubleChecked Locking");
	                    instance = new ThreadSafeSingletonDoubleCheckedLocking();
	                }
	            }
	        }
	        return instance;
	    }
}
