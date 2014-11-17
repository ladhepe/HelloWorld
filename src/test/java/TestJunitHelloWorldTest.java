/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import junit.framework.TestCase;

/**
 *
 * @author Lionel
 */
public class TestJunitHelloWorldTest extends TestCase {
    
    public TestJunitHelloWorldTest(String testName) {
        super(testName);
    }
    
    @Override
    protected void setUp() throws Exception {
        super.setUp();
    }
    
    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }

    /**
     * Test of sayHello method, of class TestJunitHelloWorld.
     */
    public void testSayHello() {
        System.out.println("sayHello");
        TestJunitHelloWorld instance = new TestJunitHelloWorld();
        String expResult = "Hello";
        String result = instance.sayHello();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    
}
