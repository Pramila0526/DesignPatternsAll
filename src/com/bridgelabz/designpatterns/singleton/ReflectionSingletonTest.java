package com.bridgelabz.designpatterns.singleton;
import java.lang.reflect.Constructor;
/******************************************************************************************
 * @author	:Pramila0526
 * Purpose 	:Reflection Singleton Test
 * Date		:12/12/2019
 *
 ****************************************************************************************/
public class ReflectionSingletonTest {
    
    public static void main(String[] args)
    {
    	// Reflection can be used to destroy all the above singleton implementation approaches
        EagerInitializedSingleton instanceOne = EagerInitializedSingleton.getInstance();
        EagerInitializedSingleton instanceTwo = null;
        try 
        {
            @SuppressWarnings("rawtypes")
			Constructor[] constructors = EagerInitializedSingleton.class.getDeclaredConstructors();
            for (Constructor<?> constructor : constructors) 
            {
                //Below code will destroy the singleton pattern
                constructor.setAccessible(true);
                instanceTwo = (EagerInitializedSingleton) constructor.newInstance();
                break;
            }
        } 
        catch (Exception e)
        {
            e.printStackTrace();
        }
        System.out.println(instanceOne.hashCode());
        System.out.println(instanceTwo.hashCode());
    }

}
