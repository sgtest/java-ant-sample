package sourcegraph;


import org.junit.Assert;
import org.junit.Test;

public class FooTest {

    @Test
    public void testSessionExpiration() throws Exception {
        Foo foo = new Foo();
        Assert.assertNotNull(foo.foo());
    }

}
