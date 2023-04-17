public class PhoneObject {
    public static void main(String[] args) {
        Phone phone1 = new Phone("123-124-532","Honor20",7.8);
        Phone phone2 = new Phone("234-224-532","HonorX",10);
        Phone phone3 = new Phone("334-324-532","HonorIE");

        System.out.println(phone1.getNumber());
        System.out.println(phone1.weight);
        System.out.println(phone1.model);
        phone1.receiveCall("User1");
        phone1.receiveCall("User",phone1.getNumber());

        System.out.println();

        System.out.println(phone2.getNumber());
        System.out.println(phone2.weight);
        System.out.println(phone2.model);
        phone2.receiveCall("User2");

        System.out.println();

        System.out.println(phone3.getNumber());
        System.out.println(phone3.weight);
        System.out.println(phone3.model);
        phone3.receiveCall("User3");

        phone1.sendMessage(phone1.getNumber(),phone2.getNumber());

    }
}
