package co.interleap.courses.tdd;

import org.junit.Assert;
import org.junit.Test;

public class VowelCounterTest {

    @Test
    public void testNoOfVowelsInEmptyString(){
        VowelCounter vowelCounter = new VowelCounter();
        Assert.assertEquals(0, vowelCounter.countNumberOfVowels(""));
    }
    @Test
    public void testNoOfVowelsInSingleVowelString(){
        VowelCounter vowelCounter = new VowelCounter();
        Assert.assertEquals(1, vowelCounter.countNumberOfVowels("i"));
    }
    @Test
    public void testNoOfVowelsInAllVowelString(){
        VowelCounter vowelCounter = new VowelCounter();
        Assert.assertEquals(7, vowelCounter.countNumberOfVowels("aeiouae"));
    }
     @Test
        public void testNoOfVowelsInConsonantVowelMixedString(){
            VowelCounter vowelCounter = new VowelCounter();
            Assert.assertEquals(4, vowelCounter.countNumberOfVowels("AeBCioKL"));
        }
}