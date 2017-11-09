package Controller;
import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;
import java.util.List;
import java.util.Scanner;
import Model.Entity.Person;
import Model.Service.*;
/**
 * Created by user on 11/9/2017.
 */
public class Main {
    public static void main(String[] args)  throws Exception{
            LocateRegistry.createRegistry (1099);
            InsertImpl insertImpli=new InsertImpl ();
            Naming.rebind ("insert",insertImpli);
            ////////////////////////////////////////////////////////
        UpdateImpl update=new UpdateImpl ();
        Naming.rebind ("update",update);
        ////////////////////////////////////////////////////////
        PersonService personService = new PersonService();
        List<Person> personList= personService.getPersons();
           for (Person person : personList) {
                System.out.print(person.getId ());
                System.out.print (person.getName ());
                System.out.print (person.getFamily ());
                System.out.println (person.getKodemeli ());}
    ///////////////////////////////////////////////////////////
        Scanner scanner = new Scanner(System.in);
        personService.del (scanner.nextInt ());
}}
