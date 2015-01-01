package sample.greetings;

// standard modules/packages

// library modules/packages
import org.junit.Test;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;

// project modules/packages

public class GreetingsTest
{
    public Greetings m_oGreetings;
    
    @Before
    public void initialize()
    {
        m_oGreetings = new Greetings();
    }

    @After
    public void tearDown()
    {
        m_oGreetings = null;
    }

    @Test
    public void testName()
    {
        m_oGreetings.setName("JUnit Testing");
        Assert.assertEquals("Name should be", "JUnit Testing", m_oGreetings.getName());
    }

    @Test
    public void testMessage()
    {
        m_oGreetings.setName("JUnit Testing");
        Assert.assertEquals("Greetings message", "!!! JUnit Testing's Greetings !!!",
                            m_oGreetings.getGreetings());
    }
}
