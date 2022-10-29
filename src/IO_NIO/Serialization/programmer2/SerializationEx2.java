package IO_NIO.Serialization.programmer2;

import IO_NIO.Serialization.programmer1.Employee;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class SerializationEx2 {
    public static void main(String[] args) {
        Employee bestEmployee;

        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("employees2.bin"))) {

            bestEmployee = (Employee) inputStream.readObject();

            System.out.println(bestEmployee);

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
