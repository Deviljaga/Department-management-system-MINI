package com.jagannath;

public class Finance implements Department{
    public Finance(){
        System.out.println("Finc initiated...");
    }
    @Override
    public void dept() {
        System.out.println("Finc. department called");
    }
}
