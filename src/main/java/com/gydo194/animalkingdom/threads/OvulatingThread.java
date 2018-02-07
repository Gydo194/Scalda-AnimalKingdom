/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gydo194.animalkingdom.threads;

import com.gydo194.animalkingdom.genders.Female;

/**
 *
 * @author gydo194
 */
public class OvulatingThread extends Thread {

    private int initialDelay;
    private Female femaleAnimal;
    private final int delay = 20000;

    public OvulatingThread(Female fem, int delay) {
        this.femaleAnimal = fem;
        this.initialDelay = delay;
    }

    @Override
    public void run() {
        try {
            System.out.println("OvulatingThread sleeping for "+initialDelay);
            sleep(initialDelay);
            while (true) {
                femaleAnimal.ovulate();
                sleep(delay);
                //femaleAnimal.menstruate();
                //sleep(delay);
            }
        } catch (InterruptedException e) {
            System.out.println("Ovulate got interrupted.\naborting ovulation execution.");

        } catch (Exception e) {
            System.out.println("caught exception in OvulatingThread::run()");

        }
    }
}
