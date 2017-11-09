package Model.da;
import Model.Entity.Person;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
public class PersonDa{
    private Connection connection;
    private PreparedStatement preparedStatement;
    public PersonDa() throws Exception {
        Class.forName("oracle.jdbc.driver.OracleDriver");
        connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "amirsam", "myjava123");
    }
    //CREATE SEQUENCE PS START WITH 1 INCREMENT BY 1;
    public void insert(Person person)  throws Exception {
        preparedStatement = connection.prepareStatement("SELECT PS.NEXTVAL X FROM DUAL");
        ResultSet resultSet = preparedStatement.executeQuery();
        resultSet.next();
        person.setId((int) resultSet.getLong("X"));
        preparedStatement = connection.prepareStatement("insert into person (id,name,family,kodemeli) values (?,?,?,?)");
        preparedStatement.setLong(1, person.getId());
         preparedStatement.setString(2, person.getName());
        preparedStatement.setString(3, person.getFamily());
        preparedStatement.setLong (4, person.getKodemeli ());
         preparedStatement.executeUpdate();
    }
    public Person selectById(long id)throws Exception
    {
        preparedStatement = connection.prepareStatement("select * from person where id=?");
        preparedStatement.setLong(1,id);
        ResultSet resultSet = preparedStatement.executeQuery();
        if (resultSet.next()) {
            Person person = new Person ();
            //       person.setId(resultSet.getLong("id"));
            //      person.setName(resultSet.getString("name"));
            //      person.setFamily(resultSet.getString("family"));
            return person;
        }
        return null;
    }
     public List<Person> select() throws Exception {
        preparedStatement = connection.prepareStatement ("select *  from person");
        ResultSet resultSet = preparedStatement.executeQuery ();
        List<Person> personList = new ArrayList<> ();
        while (resultSet.next ()) {
            Person person = new Person ();
            person.setId ((int) resultSet.getLong ("id"));
            person.setName (resultSet.getString ("name"));
            person.setFamily (resultSet.getString ("family"));
            person.setKodemeli ((int) resultSet.getLong ("kodemeli"));
            personList.add (person);
        }
        return personList;
    }
    public void update(Person person)throws  Exception
    {
        preparedStatement = connection.prepareStatement("update person set name=? , family=? , kodemeli=? where id=?");
        preparedStatement.setLong(1,person.getId());
        preparedStatement.setString(2,person.getName());
        preparedStatement.setString(3,person.getFamily());
        preparedStatement.setLong(4,person.getKodemeli ());
        preparedStatement.executeUpdate();
    }
    public void delete(long id)throws Exception
    {
        preparedStatement = connection.prepareStatement("delete from person where id=?");
        preparedStatement.setLong(1,id);
        preparedStatement.executeUpdate();
    }
    public void close() throws Exception {
        preparedStatement.close();
        connection.close();
    }

}
