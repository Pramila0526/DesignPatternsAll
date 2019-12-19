package com.bridgelabz.designpatterns.singleton;
import java.io.Serializable;
/******************************************************************************************
 * @author	:Pramila0526
 * Purpose 	:Serialized Singleton
 * Date		:12/12/2019
 *
 ****************************************************************************************/
public class SerializedSingleton implements Serializable
{

    private static final long serialVersionUID = -7604766932017737115L;

    private SerializedSingleton()
    {}
    
    private static class SingletonHelper
    {
        private static final SerializedSingleton instance = new SerializedSingleton();
    }
    
    public static SerializedSingleton getInstance()
    {
    	System.out.println("This is Lazy Serialized Singleton");
        return SingletonHelper.instance;
    }
    
}
