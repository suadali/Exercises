package Classes.practice;

public class Person {
    private String name;
    private int age;
    private Eyecolor eyecolor;

    public Person() {

    }

    public Person(String name, int age, Eyecolor eyecolor) {
        this.name = name;
        this.age = age;
        this.eyecolor = eyecolor;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setEyecolor(Eyecolor eyecolor) {
        this.eyecolor = eyecolor;
    }

    public String getName() {
        return name;
    }

    public Eyecolor getEyecolor(){
        return eyecolor;
    }

    public int getAge() {
        return age;
    }


    public String toString() {
        return name + " is " + age + " years old and has "
                + eyecolor +  " eye colour";
    }
}
