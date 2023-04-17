public class PersonObject {
    public static void main(String[] args) {
        Person person1 = new Person();
        Person person2 = new Person("Имя",5);

        person1.move();
        person2.talk();
    }
}
