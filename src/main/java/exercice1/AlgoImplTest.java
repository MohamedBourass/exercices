package exercice1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

//Import junit in the classpath
public class AlgoImplTest {

    private AlgoImpl ai = new AlgoImpl();

    @Test
    public void compute() {
        assertEquals("1", ai.compute("1"));
        assertEquals("2", ai.compute("2"));
        assertEquals("FooFoo", ai.compute("3"));
        assertEquals("4", ai.compute("4"));
        assertEquals("BarBar", ai.compute("5"));
        assertEquals("Foo", ai.compute("6"));
        assertEquals("QixQix", ai.compute("7"));
        assertEquals("8", ai.compute("8"));
        assertEquals("FooFoo", ai.compute("123"));
    }

    @Test
    public void compute2() {
        assertEquals(0, ai.compute2(0));
        assertEquals(1, ai.compute2(1));
        assertEquals(2, ai.compute2(2));
        assertEquals(3, ai.compute2(3));
        assertEquals(1, ai.compute2(10));
        assertEquals(1, ai.compute2(100));
        assertEquals(2, ai.compute2(101));
        assertEquals(3, ai.compute2(102));
        assertEquals(1, ai.compute2(10000));
    }
}
