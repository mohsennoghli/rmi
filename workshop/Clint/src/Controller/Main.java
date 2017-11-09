package Controller;
import Entity.Person;
import java.rmi.Naming;
import java.util.Scanner;

/**
 * Created by user on 11/9/2017.
 */
public class Main {
    public static void main(String[] args) throws Exception{

        Insert insert= (Insert) Naming.lookup ("//127.0.0.1/insert");
        Person person=new Person ();
        Scanner scanner = new Scanner(System.in);
        person.setName (scanner.nextLine());
        person.setFamily (scanner.nextLine());
        person.setKodemeli ((int) scanner.nextInt ());
        insert.insert (person);
        //////////////////////////////////////
        Update update= (Update) Naming.lookup ("//127.0.0.1/update");
        Person person2=new Person ();
        person2.setName (scanner.nextLine());
        person2.setFamily (scanner.nextLine());
        person2.setKodemeli ((int) scanner.nextInt ());
        update.Update (person);

        }

}
