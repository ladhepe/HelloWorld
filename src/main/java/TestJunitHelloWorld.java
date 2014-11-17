/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import static junit.framework.Assert.assertEquals;

/**
 *
 * @author Lionel
 */
public class TestJunitHelloWorld {
    public static void main(String[] args) {
        try {
            TestJunitHelloWorld test = new TestJunitHelloWorld();
            assertEquals("Hello", test.sayHello());
        } catch (Exception ex) {
            System.err.println("Error the value is not as expected");
        }
    }
    public String sayHello() {
        return "Hello";
    }
    
    public String sayGoodBye(){
        return "GoodBye";
    }
}
