package com.designpattern.strategy;

public class ModelDuck extends Duck{
    public ModelDuck(){
        flyBehavior=new FlyNoWay();
    }
    public void display(){
        System.out.println("I'm a model duck!");
    }
}
