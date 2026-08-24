package com.jagannath;

public class HR implements Department{

    public HR(){
        System.out.println("HR initiated...");
    }
    @Override
    public void dept() {
        System.out.println("hr department called");
    }
}
