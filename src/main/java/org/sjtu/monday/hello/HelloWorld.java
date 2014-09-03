/**
 * 
 */
package org.sjtu.monday.hello;
/**
 * Name: Mondaisy
 * Created on: Sep 2, 2014, 2:51:49 PM
 * @author: Monday
 * @version 1.0
 * @since JDK_1.7
 */
/**
 * @author Monday
 *
 * Sep 2, 2014
 */
import org.joda.time.LocalTime;

public class HelloWorld {
  public static void main(String[] args) {
    LocalTime currentTime = new LocalTime();
    System.out.println("The current local time is: " + currentTime);

    Greeter greeter = new Greeter();
    System.out.println(greeter.sayHello());
  }
}