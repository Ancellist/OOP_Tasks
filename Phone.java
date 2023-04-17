import java.util.Arrays;

public class Phone {
    public String number;
    public String model;
    public double weight;

    public Phone(String number, String model, double weight){
        this.number = number;
        this.model = model;
        this.weight = weight;
    }


    public Phone(String number, String model){
        this.number = number;
        this.model = model;
    }

    public Phone(){
    }

    public void receiveCall(String name){
        System.out.println("Звонит " + name);
    }

    public void receiveCall(String name, String number){
        System.out.println("Звонит " + name +" с номера "+ number);
    }

    public void sendMessage(String... number){
        System.out.println("Этим номерам отправлено сообщение: " + Arrays.toString(number));
    }

    public String getNumber() {
        return number;
    }
}
