/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threadtest;

import java.util.Random;

public class GreetingProducer extends Thread {

    /**
     * Constructs the producer object.
     *
     * @param aGreeting the greeting to display
     */
    public GreetingProducer(String aGreeting) {
        greeting = aGreeting;
    }

    public void run() {
        try {
            for (int i = 1; i <= REPETITIONS; i++) {
                System.out.println(i + ": " + greeting);
                Thread.sleep(DELAY);
            }
        } catch (InterruptedException exception) {
            System.out.println("Thread Interrupted!");
        }
    }
    private String greeting;
    private static final int REPETITIONS = 10;
    Random randomNumber = new Random();
//int randomInt = randomNumber.nextInt(1);
    private static final int DELAY = 0;
}
