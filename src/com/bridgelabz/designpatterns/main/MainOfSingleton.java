package com.bridgelabz.designpatterns.main;
import com.bridgelabz.designpatterns.singleton.BillPughSingleton;
import com.bridgelabz.designpatterns.singleton.EagerInitializedSingleton;
import com.bridgelabz.designpatterns.singleton.LazyInitializedSingleton;
import com.bridgelabz.designpatterns.singleton.SerializedSingleton;
import com.bridgelabz.designpatterns.singleton.StaticBlockSingleton;
import com.bridgelabz.designpatterns.singleton.ThreadSafeSingleton;
import com.bridgelabz.designpatterns.singleton.ThreadSafeSingletonDoubleCheckedLocking;
import com.bridgelabz.designpatterns.singleton.ThreadStates;
/*************************************************************************************************
 * @author 	:Pramila0526
 * Purpose	:Main Of Singletons
 *
 *************************************************************************************************/
public class MainOfSingleton {
	public static void main(String[] args)
    {
    	EagerInitializedSingleton.getInstance();
	    
    	StaticBlockSingleton.getInstance();
    	
    	BillPughSingleton.getInstance();
    	
    	LazyInitializedSingleton.getInstance();
    	
    	SerializedSingleton.getInstance();
    	
    	ThreadSafeSingleton.getInstance();
    	
    	ThreadSafeSingletonDoubleCheckedLocking.getInstance();
    	
    	ThreadStates object=ThreadStates.DEAD;
    	System.out.println(object);
	}

}
