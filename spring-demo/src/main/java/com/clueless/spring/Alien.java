package com.clueless.spring;

public class Alien
{
    private int age;
    private Computer com;
    public Alien(){
        System.out.println("Alien has started...");
    }

    public Alien(int age) {
        this.age = age;
    }

    public Computer getCom() {
        return com;
    }

    public void setCom(Computer com) {
        this.com = com;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void compile(){
        System.out.println("Compile code...");
        com.Code();
    }
}
