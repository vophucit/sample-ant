package sample.hello;

// standard modules/packages

// library modules/packages
import org.junit.Test;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;

// project modules/packages

public class HelloTest
{
    public Hello m_oHello;
    
    @Before
    public void initialize()
    {
        m_oHello = new Hello();
    }

    @After
    public void tearDown()
    {
        m_oHello = null;
    }

    @Test
    public void testHello()
    {
        m_oHello.setName("TEST");
        Assert.assertEquals("Name should be", "TEST", m_oHello.getName());
    }

    @Test
    public void testMessage()
    {
        m_oHello.setName("TEST");
        Assert.assertEquals("Greetings message", "Hello TEST!!!",
                            m_oHello.getMessage());
    }
}
