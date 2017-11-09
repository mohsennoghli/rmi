package Model.Service;

import Model.Entity.Person;
import Model.da.PersonDa;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 * Created by user on 11/9/2017.
 */
public class UpdateImpl extends UnicastRemoteObject implements Update {
    public UpdateImpl() throws Exception {
    }
    @Override
        public void Update(Person person) throws Exception {
        PersonDa personDa=new PersonDa ();
        personDa.update (person);

    }
}
