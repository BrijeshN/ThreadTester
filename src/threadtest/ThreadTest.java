/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threadtest;

/**
 *
 * @author Brijesh
 */
public class ThreadTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Thread t1 = new GreetingProducer("Hello, World!");
        Thread t2 = new GreetingProducer("Goodbye, World!");
        t1.start();
        t2.run();
//Runnable r1 = new
//GreetingProducer("Hello, World!");
//Runnable r2 = new
//GreetingProducer("Goodbye, World!");
//
//Thread t1 = new Thread(r1);
//Thread t2 = new Thread(r2);
//t1.start();
//t2.start();
    }

}
