package org.person;

public class Person {

    public String imPublic;
    private int age;
    private boolean sex;

    public Person(){
        imPublic = "";
        this.age = 0;
        this.sex = true;
        System.out.println("Constructor 0 arg");
    }

    public Person(int age) {
        this();
        this.age = age - 1500;
        System.out.println("Constructor 1 arg");
    }

    public Person(int age_, boolean sex_) {
        this(age_);
        sex = sex_;
        System.out.println("Constructor 2 arg");
    }

    public static void whoAreYou() {
        System.out.println("I'm Human");
    }

    public boolean getSex() {
        return sex;
    }

    public int getAge() {
        return age + 1500;
    }

    public void setAge(int age){
        this.age = age;
        if (age > 50){
            imPublic = "I'm retired";
        }

    }

    public boolean isOldEnough() {
        return getAge() >= 18;

    }

}

// DRY
// WET