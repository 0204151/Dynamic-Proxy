import java.net.StandardSocketOptions;

public class Test {
     public static void main(String[] args) {
         Testobject testobject = new Testobject("zh",23,'男');
         try {
             Fram.save(testobject);
         } catch (Exception e) {
             e.printStackTrace();
         }
     }
}
