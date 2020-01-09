package testUnit;

import org.junit.Assert;
import org.junit.Test;

public class TestConcatenater {
    @Test

    public void testTheTwoLowerStringsRobin(){
        // we called the static method without creating object but when we call the static method we use the
        // class name as an object.

        //ConcatenaterRobin.concatenateStrings("Mr.Robin has attended ","the mentoring or not");
        String actualOutcome = ConcatenaterRobin.concatenateStrings("Mr.Robin has attended ","the mentoring or not");
        String expectOutcome = "Mr.Robin has attended the mentoring or not";
        Assert.assertEquals(actualOutcome,expectOutcome);



    }




}
