package com.solid.isp;

//Robot class implementing both Workable and Rechargeable interfaces
public class Robot implements Workable, Rechargeable {
    @Override
    public void work() {
        System.out.println("Robot is working.");
    }

    @Override
    public void recharge() {
        System.out.println("Robot is recharging.");
    }
}