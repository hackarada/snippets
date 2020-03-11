import java.io.FileOutputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.*;
public class Serialization {
    public static void main(String[] args) throws Exception {
        Person p = new Person();
        p.name = "Ermi";
        p.birthDate = new Date(0x1337);
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(
            "person.bin"));
        oos.writeObject(p);
        oos.flush();
    }
}
class Person implements Serializable {
    public static final long serialVersionUID = 0x12345678L;
    public String name;
    public Date birthDate;
}