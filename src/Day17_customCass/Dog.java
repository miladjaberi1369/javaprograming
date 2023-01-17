package Day17_customCass;

public class Dog {

    public String name;  // instances variable
    public String breed;
    public String size;
    public char gender;
    public int age;
    public String color;

    public void setInfo(String name, String breed, char gender, int age, String size, String color){
        this.name = name;  // this keyword is used for calling the instance variable name
        this.breed = breed;
        this.gender = gender;
        this.age = age;
        this.size = size;
        this.color = color;
    }// this method can help us to set all the information of the dog at once

    public void eat(){
        System.out.println(name +" is eating");
    }

    public String toString() { // to avoid getting hash-code when we print class object
        return "Dog{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", size='" + size + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", color='" + color + '\'' +
                '}';
    }

    public void drink(){
        System.out.println(name +" is drinking water");
    }
}
