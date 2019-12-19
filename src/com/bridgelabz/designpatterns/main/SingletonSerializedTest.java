package com.bridgelabz.designpatterns.main;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import com.bridgelabz.designpatterns.singleton.SerializedSingleton;
/*************************************************************************************************
 * @author 	:Pramila0526
 * Purpose	:MAin of Serialized Singleton
 *
 *************************************************************************************************/
public class SingletonSerializedTest 
{
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        SerializedSingleton instanceOne = SerializedSingleton.getInstance();
        ObjectOutput out = new ObjectOutputStream(new FileOutputStream(
                "/home/admin94/Desktop/DesignPatterns/DesignPatterns/ss.txt"));
        out.writeObject(instanceOne);
        out.close();
        
        //deserailize from file to object
        ObjectInput in = new ObjectInputStream(new FileInputStream(
                "/home/admin94/Desktop/DesignPatterns/DesignPatterns/ss.txt"));
        SerializedSingleton instanceTwo = (SerializedSingleton) in.readObject();
        in.close();
        
        System.out.println("instanceOne hashCode="+instanceOne.hashCode());
        System.out.println("instanceTwo hashCode="+instanceTwo.hashCode());
        
    }

}
