package com.bridgelabz.designpatterns.singleton;
/******************************************************************************************
 * @author	:Pramila0526
 * Purpose 	:Bill Pugh Singleton
 * Date		:12/12/2019
 *
 ****************************************************************************************/
public class BillPughSingleton 
{
	private BillPughSingleton()
    {}
    // Bill Pugh came up with a different approach to create the Singleton class 
    // using an inner static helper class
    private static class SingletonHelper
    {
        // private inner static class that contains the instance of the singleton class
        private static final BillPughSingleton INSTANCE = new BillPughSingleton();
    }
    
    // SingletonHelper gets loaded only when someone calls the getInstance method, 
	// this class gets loaded and creates the Singleton class instance 
    public static BillPughSingleton getInstance()
    {
    	System.out.println("This is Bill Pugh Singleton");
        return SingletonHelper.INSTANCE;
    }
}

	// When the singleton class is loaded, SingletonHelper class is not loaded into memory 
	
