import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
public class ArraysList {
       public static void main(String[] args) throws IOException {
//           ArrayList<Integer> list = new ArrayList<>();
//           list.add(98);
//           list.add(77);
//           list.add(66);
//           list.add(89);
//           list.add(79);
//           list.add(50);
//           list.add(100);
//           System.out.println(list);
//           System.out.println(list.size());
//           System.out.println(list.get(0));
           InputStream picture = new FileInputStream("C:\\Users\\苍穹\\Desktop\\Java.jpg");//读取图片
           OutputStream pic = new FileOutputStream("C:\\Users\\苍穹\\Desktop\\Java1.jpg");//复制图片
           pic.write(picture.read());
           picture.close();
           pic.close();
//           InputStream fileInputStream = new FileInputStream("src\\test.txt");
//           InputStream file = new FileInputStream("test.txt");
//           OutputStream outputStream = new FileOutputStream("test.txt");//创建后会清空文件
//           int file_length = (int) new File("test.txt").length();//test.txt文件大小
//           byte[] buffer = new byte[3];
//           byte[] buffer1 = new byte[file_length];
//           int b = file.read(buffer1);
//           System.out.println("文件大小：" + file_length);
//           System.out.println("字节数:" + b + " 内容:" + new String(buffer1));
//           int a = 0;
//           while ((a = fileInputStream.read()) != -1){
//               if(a == 13) a = '!';//回车
//               if(a == 10) a = 10;//换行
//               System.out.print((char)a);
//               System.out.print(a);
//           }
//           outputStream.write("我是中国人".getBytes(StandardCharsets.UTF_8));
//           outputStream.flush();
//           outputStream.write('a');
//           outputStream.close();
           //写完数据要刷新

    }
}
