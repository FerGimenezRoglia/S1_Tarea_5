package nivel_1.ejercicio5.module;

import java.io.*;

public class SerializableMethod {


    public static void applySerializableMethod() {

        Person person = new Person("Rolo", 40);

        String filePath = "resources" + File.separator + "person.ser";

        serializePerson(person, filePath);

        deserializePerson(filePath);

    }

    public static void serializePerson(Person person, String filePath) {

        try {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(filePath));
            objectOutputStream.writeObject(person);

            System.out.println("Serialized object: " + person);

            objectOutputStream.close();

        } catch (IOException e) {
            System.out.println("Error during serialization: " + e.getMessage());
        }
    }

    public static void deserializePerson(String filePath) {

        try {
            ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(filePath));
            Person person = (Person) objectInputStream.readObject();

            System.out.println("Deserialized object: " + person);

        } catch (IOException | ClassNotFoundException e) {

            System.out.println("Error deserializing Person object: " + e.getMessage());
        }
    }
}
