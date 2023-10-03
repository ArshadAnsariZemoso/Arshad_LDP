package com.solid.isp;

//Regular Employee class implementing Workable interface
public class RegularEmployee implements Workable {
    @Override
    public void work() {
        System.out.println("Regular employee is working.");
    }
}