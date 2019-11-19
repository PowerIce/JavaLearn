package com.java.Day7;

public class TestPolym {
    public static void main(String[] args) {
        Animal a = new Animal();
        animalCry(a);
//        Animal d = new Dog();从属于Animal
        Animal d = new Dog();//自动向上转型
//        Dog d = new Dog();
        animalCry(d);
        Cat c = new Cat();
        animalCry(c);
//        d.seeDooot();//向上转型之后只能使用重写父类的方法，不能使用该类的其他方法
        d.shout();
        Dog d2 = (Dog)d;//强制向下转型  自动向上转型之后想使用自身的其他方法需强制转型之后可以使用自身的方法

    }
    static void animalCry(Animal a){
        a.shout();
    }
}
class Animal{
    public void shout(){
        System.out.println("叫了一声");
    }
}
class Dog extends Animal{
    @Override
    public void shout() {
        System.out.println("汪汪汪");
    }
    public void seeDoot(){
        System.out.println("应用于Dog");
    }
}
class Cat extends Animal{
    @Override
    public void shout() {
        System.out.println("喵喵喵");
    }
}
