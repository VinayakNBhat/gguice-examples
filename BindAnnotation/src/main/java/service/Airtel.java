package service;

import base.SIM;

public class Airtel implements SIM {

    public void call() {
        System.out.println("Impelmeting call() inside Airtel");
    }

    public void sms() {
        System.out.println("Impelmeting sms() inside Airtel");
    }
}
