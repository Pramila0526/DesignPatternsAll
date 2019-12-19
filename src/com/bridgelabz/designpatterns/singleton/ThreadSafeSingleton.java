package com.bridgelabz.designpatterns.singleton;
/******************************************************************************************
 * @author	:Pramila0526
 * Purpose 	:Thread Safe Singleton
 * Date		:12/12/2019
 *
 ****************************************************************************************/
public class ThreadSafeSingleton {

    private static ThreadSafeSingleton instance;
    
    private ThreadSafeSingleton(){}
    // make the global access method synchronized, so that only one 
    // thread can execute this method at a time
    public static synchronized ThreadSafeSingleton getInstance(){
        if(instance == null){
        	// might create the separate instances
        	System.out.println("This is Thread Safe Singleton");
            instance = new ThreadSafeSingleton();
        }
        return instance;
    }
    
}
