package Model.Service;
import Model.Entity.Person;
import Model.da.PersonDa;
import java.io.Serializable;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 * Created by user on 11/9/2017.
 */
public class InsertImpl extends UnicastRemoteObject implements Insert, Serializable {
    public InsertImpl() throws RemoteException {}
    @Override
    public void insert(Person person) throws Exception {
        PersonDa personDa = new PersonDa();
        personDa.insert(person);
        personDa.close();
    }
}
