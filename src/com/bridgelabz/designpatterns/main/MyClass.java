package com.bridgelabz.designpatterns.main;
/*************************************************************************************************
 * @author 	:Pramila0526
 * Purpose	:Enum Class
 *
 *************************************************************************************************/
enum Signal {
  RED,
  YELLOW,
  GREEN
}
public class MyClass {
  public static void main(String[] args) {
	  
	  
	  Signal myVar = Signal.RED;
	
    switch(myVar) {
      case RED:
        System.out.println("RED Signal Please Wait");
        break;
      case YELLOW:
         System.out.println("Yellow Signal..Stand By");
        break;
      case GREEN:
        System.out.println("GREEN Signal..Go");
        break;
    }
  }
}