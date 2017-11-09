package Model.Service;
import Model.Entity.Person;

import java.io.Serializable;
import java.rmi.Remote;
/**
 * Created by user on 11/9/2017.
 */
public interface Insert extends Remote,Serializable{
    public void insert(Person person)throws Exception;

}
