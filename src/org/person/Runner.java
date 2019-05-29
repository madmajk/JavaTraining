package org.person;

public class Runner {

    public void run(){

        Person preson = new Person(10,false);
        System.out.println(preson.getAge());
        System.out.println(preson.isOldEnough());
        System.out.println(preson.getSex());
        Person.whoAreYou();

        Person person0 = new Person();
        System.out.println(person0.getAge());
        person0.imPublic = "Ziuuu";

        Person person1 = new Person(10);
        System.out.println(person1.getAge());

        Person person2 = new Person(29,true);
        System.out.println(person2.getSex());

    }
}
