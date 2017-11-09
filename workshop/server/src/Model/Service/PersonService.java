package Model.Service;

import Model.da.*;
import Model.Entity.Person;

import java.io.Serializable;
import java.sql.PreparedStatement;
import java.util.List;

/**
 * Created by user on 11/9/2017.
 */
public class  PersonService implements Serializable {
        public void registerPerson(Person person)throws Exception
        {
            PersonDa personDA = new PersonDa();
            personDA.insert(person);
            personDA.close();}
        ////////////////////////////////////
        public List<Person> getPersons()throws Exception
        {
        PersonDa personDA = new PersonDa ();
        List<Person> personList = personDA.select();
        personDA.close();
        return personList;}
        ////////////////////////////////////////////
        public void del(int id)throws Exception{
            PersonDa personDA = new PersonDa();
            personDA.delete(id);
        }
}
