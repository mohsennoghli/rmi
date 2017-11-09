package Model.Service;

import Model.Entity.Person;

import java.io.Serializable;
import java.rmi.Remote;

/**
 * Created by user on 11/9/2017.
 */
public interface Update extends Remote,Serializable {
    public void Update(Person person)throws Exception;

}
