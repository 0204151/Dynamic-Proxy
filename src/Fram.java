import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.Field;
import java.nio.charset.StandardCharsets;

public class Fram {
    public static void save(Object obj) throws Exception {
        OutputStream inputStream = new FileOutputStream("test.txt",true);

        Class c = obj.getClass();//提取类对象
        Field[] fields = c.getDeclaredFields();//获取类的所有字段
        for (Field field : fields) {
            String name = field.getName();//获取成员变量名
            field.setAccessible(true);//允许访问私有字段值
            String value = field.get(obj) + "";
            inputStream.write(name.getBytes(StandardCharsets.UTF_8));
            inputStream.write(value.getBytes(StandardCharsets.UTF_8));
            System.out.println(name + "=");
            System.out.print(value);
        } System.out.println("aa");


    }
}