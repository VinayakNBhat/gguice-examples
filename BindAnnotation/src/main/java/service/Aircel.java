package service;

import base.SIM;

public class Aircel implements SIM {
    public void call() {
        System.out.println("Impelmeting call() inside Aircel");
    }

    public void sms() {
        System.out.println("Impelmeting sms() inside Aircel");
    }
}
