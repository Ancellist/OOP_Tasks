import java.util.Arrays;

public class Reader {
    public static String name;
    public static String surname;
    public static int numReaderTicket;
    public static int DataBorn;
    public static int number;

    public static void takeBook(int num){
        System.out.println("Петров В. В. взял" + num + "книги");
    }

    public static void takeBook(String... nameBook){
        System.out.println("Петров В. В. взял книги:" + Arrays.toString(nameBook));
    }

    public static void takeBook(Object... book){
        System.out.println("Петров В. В. взял книги:" + Arrays.toString(book));
    }

    public static void returnBook(int num){
        System.out.println("Петров В. В. вернул книги:"+ num);
    }

    public static void returnBook(String... nameBook){
        System.out.println("Петров В. В. вернул книги:" + Arrays.toString(nameBook));
    }
    public static void returnBook(Object...book){
        System.out.println("Петров В. В. вернул книги:" + Arrays.toString(book));
    }
}
