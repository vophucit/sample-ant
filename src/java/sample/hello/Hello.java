package sample.hello;

// standard packages/modules

// third-party packages/modules
import org.apache.log4j.Logger;

// application packages/modules

/**
 * Hello module
 *
 * @author Tri H. Nguyen
 * @version $Revision: $ $Date: $
 */
public class Hello
{
   private static Logger m_sLog = Logger.getLogger(Hello.class.getName());

   private String m_strName;

   /**
    * Constructor
    *
    */
   public Hello()
   {
      this.m_strName = null;
   }

   /**
    * Constructor
    *
    * @param strName Name
    */
   public Hello(String strName)
   {
      this.m_strName = strName;
   }

   /**
    * Set name
    *
    * @param strName Name to be set
    */
   public void setName(String strName)
   {
      this.m_strName = strName;
   }

   /**
    * Get name
    *
    * @return Return name
    */
   public String getName()
   {
      m_sLog.info("getName");
      return this.m_strName;
   }

   /**
    * Get message
    *
    * @return Return message
    */
   public String getMessage()
   {
      m_sLog.info("getMessage");
      return getMessage(getName());
   }

   /**
    * Get message
    *
    * @param strName Name to be part of the message
    * @return Return message
    */
   public static String getMessage(String strName)
   {
      return "Hello " + strName + "!!!";
   }

   public static void main(String[] args)
   {
        Hello oHello = new Hello();
        oHello.setName("TRI");
        System.out.println(oHello.getMessage());
   }
}
