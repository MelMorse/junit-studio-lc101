package test;

import main.BalancedBrackets;
import org.junit.Test;

import static org.junit.Assert.*;

public class BalancedBracketsTest {

    //TODO: add tests here
//    @Test
//    public void emptyTest() {
//        assertEquals(true, true);
//    }
    @Test
    public void onlyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }
    @Test
    public void bracketsWithWordInsideReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[word]"));
    }
    @Test
    public void wordOutsideBracketsWithWordInsideBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("test[tomato]"));
    }
    @Test
    public void bracketsThenWordReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]popsicle"));
    }
    @Test
    public void emptyQuotesReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets(""));
    }
    @Test
    public void singleBracketReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("["));
    }
    @Test
    public void singleBracketWithWordReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[cake"));
    }
    @Test
    public void wordCloseBracketWordOpenBracketReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("cat]dog["));
    }
    @Test
    public void closeBracketOpenBracketReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]["));
    }
    @Test
    public void leftLeftRightBracketsReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[[]"));
    }
    @Test
    public void multipleOpeningBracketsMultipleClosingBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[[]]"));
    }
//    @Test
//    public void onlyBracketsReturnsTrue() {
//        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
//    }

}
