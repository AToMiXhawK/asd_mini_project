package cop;

/*
 @author hawk
 */
import cop.frames.Login;


public class COP 
{
      public static String app_name="Social COP";
      public static void main(String args [])
      {
          System.out.println("Hello World");
          new Login("").setVisible(true);
      }
}
