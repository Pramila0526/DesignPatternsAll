package com.bridgelabz.designpatterns.singleton;
/******************************************************************************************
 * @author	:Pramila0526
 * Purpose 	:Lazy Initialized Singleton
 * Date		:12/12/2019
 *
 ****************************************************************************************/
public class LazyInitializedSingleton {

    private static LazyInitializedSingleton instance;
    
    private LazyInitializedSingleton(){}
    
    public static LazyInitializedSingleton getInstance(){
        if(instance == null){
        	// LazyInitializedSingleton creates the instance
        	// in the global access method
            instance = new LazyInitializedSingleton();
            System.out.println("This is Lazy Initialized Singleton");
        }
        return instance;
    }
}

	//1) LazyInitializedSingleton works fine in case of the single-threaded environment--
	//2) but when it comes to multi threaded systems, it can cause issues if multiple threads 
	// are inside the if condition at the same time
	//3) It will destroy the singleton pattern and both threads will--
  	// get the different instances of the singleton class