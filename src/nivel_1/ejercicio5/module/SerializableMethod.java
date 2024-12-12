package nivel_1.ejercicio5.module;

import java.io.*;

public class SerializableMethod {


    public static void applySerializableMethod() {

        Person person = new Person("Rolo", 40);

        serializePerson(person);

        deserializePerson();

    }

    public static void serializePerson(Person person) {

        try {
            String filePath = "person.ser";
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(filePath));
            objectOutputStream.writeObject(person);

            System.out.println("Serialized object: " + person);

            objectOutputStream.close();

        } catch (IOException e) {
            System.out.println("Error during serialization: " + e.getMessage());
        }
    }

    public static void deserializePerson() {

        try {
            ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("person.ser"));
            Person person = (Person) objectInputStream.readObject();

            System.out.println("Deserialized object: " + person);

        } catch (IOException | ClassNotFoundException e) {

            System.out.println("Error deserializing Person object: " + e.getMessage());
        }
    }
}
