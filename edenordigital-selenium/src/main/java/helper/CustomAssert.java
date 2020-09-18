package helper;

import org.testng.Assert;

public class CustomAssert {
    /*
    public static void assertTrue(boolean condition, String message) {
        Assert.assertTrue(condition, message);
    }
     */

    public static void assertTrue(String message, boolean condition) {
            Assert.assertTrue(condition, message);
    }

    public static void assertFalse(String message, boolean condition) {
            Assert.assertFalse(condition, message);
    }

    public static void assertequalsText(String message, String objectText, String spectedText){
        Assert.assertEquals(objectText,spectedText,message);
    }

    public static void assertEquals(String object1, String object2){
       Assert.assertEquals(object1,object2);
    }

    public static void assertNotNull(String message,Object object){
            Assert.assertNotNull(object,message);
    }
    

}
