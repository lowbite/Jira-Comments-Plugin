package ut.com.koronatech.plugins;

import org.junit.Test;
import com.koronatech.plugins.api.MyPluginComponent;
import com.koronatech.plugins.impl.MyPluginComponentImpl;

import static org.junit.Assert.assertEquals;

public class MyComponentUnitTest
{
    @Test
    public void testMyName()
    {
        MyPluginComponent component = new MyPluginComponentImpl(null);
        assertEquals("names do not match!", "myComponent",component.getName());
    }
}