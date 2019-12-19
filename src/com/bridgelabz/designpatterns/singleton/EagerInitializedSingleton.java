package com.bridgelabz.designpatterns.singleton;
/******************************************************************************************
 * @author	:Pramila0526
 * Purpose 	:Eager Initialized Singleton
 * Date		:12/12/2019
 *
 ****************************************************************************************/
public class EagerInitializedSingleton 
{
	// Instance should be private
     private static final EagerInitializedSingleton instance= new EagerInitializedSingleton();
    // private constructor to avoid client applications to use constructor
     private EagerInitializedSingleton()
    { }
     // public method to provide global access
    public static EagerInitializedSingleton getInstance()
    {
    	System.out.println("This is Eager Initialized Singleton");
        return instance;
    }
}
