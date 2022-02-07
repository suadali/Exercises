package Classes.practice;

public class Main {
    public static void main(String[] args) {
        Person alima = new Person("alima", 24, Eyecolor.brown);




        alima.setAge(25);
        System.out.println(alima);


        Person marcy = new Person();
        marcy.setName("Marcy");
        marcy.setAge(22);
        marcy.setEyecolor(Eyecolor.green);

        System.out.println(marcy);
    }

}
