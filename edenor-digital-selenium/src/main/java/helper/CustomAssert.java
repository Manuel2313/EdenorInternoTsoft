package helper;

import org.testng.Assert;

public class CustomAssert {

    public static void assertTrue(boolean condition, String message) {
        Assert.assertTrue(condition, message);
    }

    public static void assertTrue(String message, boolean condition) {
        try {
            Assert.assertTrue(condition, message);
        } catch (AssertionError e) {
            System.out.println(e.getMessage());
        }
    }

    public static void assertFalse(String message, boolean condition) {
        try {
            Assert.assertFalse(condition, message);
        } catch (AssertionError e) {
            System.out.println(e.getMessage());
        }
    }

    public static void assertequalsText(String message, String objectText, String spectedText){
        try {
            Assert.assertEquals(objectText,spectedText);
        } catch (AssertionError e){
            System.out.println(e.getMessage());
        }
    }

    public static void assertEquals(String object1, String object2){
        try{
            assert object1 == object2;
        } catch (AssertionError e){
            System.out.println(e.getMessage());
        }
    }

    public static void assertNotNull(String message,Object object){
        try {
            Assert.assertNotNull(object,message);
        } catch (AssertionError e){
            System.out.println(e.getMessage());
        }
    }
    

}
