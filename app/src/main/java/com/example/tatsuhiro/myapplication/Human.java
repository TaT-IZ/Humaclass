package com.example.tatsuhiro.myapplication;

import android.util.Log;

/**
 * Created by Tatsuhiro on 2017/09/21.
 */

class Human extends Animal implements Thinkable {

    public Human(String name, int age){
        this.name = name;
        this.age = age;
    }

    @Override
    public void say(){
        Log.d("javatest" + "私の名前は", name + "です。");
        Log.d("javatest" + "年は", age + "です。");
    }

    @Override
    public void think(String name) {
        Log.d("javatest", this.name + "について考える。");
    }
}
