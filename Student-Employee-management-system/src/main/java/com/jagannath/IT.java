package com.jagannath;

public class IT implements Department{
    public IT(){
        System.out.println("IT initiated...");
    }
    @Override
    public void dept() {
        System.out.println("it department called");
    }
}
