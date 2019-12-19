package com.bridgelabz.designpatterns.singleton;
/******************************************************************************************
 * @author	:Pramila0526
 * Purpose 	:Static Block Singleton
 * Date		:12/12/2019
 *
 ****************************************************************************************/
public class StaticBlockSingleton 
{
	private static StaticBlockSingleton instance;
    
    private StaticBlockSingleton(){}
    //static block initialization for exception handling
    static
    {
        try
        {
        	// instance of class is created in the static block that provides 
        	// option for exception handling.
            instance = new StaticBlockSingleton();
            System.out.println("This is Static Block Singleton");
        }
        catch(Exception e)
        {
            throw new RuntimeException("Exception occured in creating singleton instance");
        }
    }
    
    public static StaticBlockSingleton getInstance()
    {
        return instance;
    }
}

	// Both eager initialization and static block initialization creates the instance even before it’s being used 
	// and that is not the best practice to use