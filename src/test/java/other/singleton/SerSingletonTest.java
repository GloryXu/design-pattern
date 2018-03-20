package other.singleton;

import org.junit.Assert;
import org.junit.Test;

import java.io.*;

public class SerSingletonTest {

    @Test
    public void test() throws Exception {
        SerSingleton s1 = null;
        SerSingleton s = SerSingleton.getInstance();
        // 先将实例串行化到文件
        FileOutputStream fos = new FileOutputStream(".//src//test//java//other//singleton//SerSingleton.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(s);
        oos.flush();
        oos.close();

        // 从文件读取原由的单例类
        FileInputStream fis = new FileInputStream(".//src//test//java//other//singleton//SerSingleton.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);
        s1 = (SerSingleton) ois.readObject();

        Assert.assertEquals(s, s1);
    }

    @Test
    public void testFile() throws Exception {
        FileInputStream fis = new FileInputStream(".//src//main//java//other//singleton//SerSingleton.java");
        System.out.println(new File(".").getAbsolutePath());
    }
}
