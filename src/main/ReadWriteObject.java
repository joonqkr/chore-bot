package main;

import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;

/** Read and write methods.
 *  @author Joon Park
 */
public class ReadWriteObject {

    /** Return an object of type T read from FILE, casting it to C. */
    public static <T extends Serializable> T readObjectFromFile(File file, Class<T> c) throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
        T obj = c.cast(ois.readObject());
        ois.close();
        return obj;
    }

    /** Write OBJ to FILE. */
    public static void writeObjectToFile(File file, Serializable obj) throws IOException {
        ByteArrayOutputStream byteStream = new ByteArrayOutputStream();
        ObjectOutputStream objStream = new ObjectOutputStream(byteStream);
        objStream.writeObject(obj);
        objStream.close();
        byte[] bytes = byteStream.toByteArray();
        BufferedOutputStream buffStream = new BufferedOutputStream(Files.newOutputStream(file.toPath()));
        for (byte o : bytes) {
            buffStream.write(o);
        }
        buffStream.close();
    }

}
