package com.faq.imp.program;

public class Strperson{
    private String name;
    private int age;

    public Strperson(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return this.name; 
        
    }

    public int getAge() { 
        return this.age;
        }

    public String toString()
    {
        return getName() + " " + getAge();
    }

    public static void main(String[] args)
    {
       Strperson p = new Strperson("Rushikesh", 21);
       System.out.println(p);
       Teacher p2 = new Teacher("Prashant", 48, "BE in Mechanical");
       System.out.println(p2);
    }
}

class Teacher extends Strperson
// name & age inherit from strperson class... toString() method belongs to object class
{
   private String degree;

    public String getDegree() { 
        return this.degree;
        }

    public String toString()
    {
        return getName() + " " + getAge() + " " + getDegree();
    }

    public Teacher(String name, int age, String thedegree)
    {
        super(name,age);
        this.degree=thedegree;
    }
}