public class Person {
    public String fullName;
    public int age;

    public Person(){
    }

    public Person(String fullName,int age){
        this.age = age;
        this.fullName = fullName;
    }

    public static void move() {
        System.out.println("Такой-то  Person говорит");
    }

    public static void talk(){
        System.out.println("Такой-то  Person говорит");
    }

}
