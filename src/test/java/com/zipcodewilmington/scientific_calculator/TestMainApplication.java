package com.zipcodewilmington.scientific_calculator;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import com.zipcodewilmington.scientificcalculator.MainApplication;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
/**
 * Created by leon on 2/9/18.
 */
public class TestMainApplication {

    @Test
    public void displayTest() {
        MainApplication displaytester = new MainApplication();

        assertEquals("octal", displaytester.switchDisplayMode());
        assertEquals("decimal", displaytester.switchDisplayMode());
        assertEquals("hexadecimal", displaytester.switchDisplayMode());
    }

    @Test
    public void modeChange() {
        MainApplication modeChanger = new MainApplication();

        assertEquals("binary", modeChanger.switchDisplayMode("binary"));
        assertEquals("hexadecimal", modeChanger.switchDisplayMode("hexadecimal"));
        assertEquals("Err", modeChanger.switchDisplayMode("hello!"));
    }

    @Test
    public void unitChangeButton() {
        MainApplication unitChanger = new MainApplication();

        assertEquals("radians", unitChanger.switchUnitsMode());
        assertEquals("degrees", unitChanger.switchUnitsMode());
        assertEquals("radians", unitChanger.switchUnitsMode());
    }

    @Test
    public void unitChange() {
        MainApplication unitChanger1 = new MainApplication();

        assertEquals("radians", unitChanger1.switchUnitsMode("radians"));
        assertEquals("Err", unitChanger1.switchUnitsMode("Break me"));
        assertEquals("degrees", unitChanger1.switchUnitsMode("degrees"));
    }

    @Test
    public void findFactorial() {
        MainApplication findFactorialTest = new MainApplication();

        assertEquals(120.0, findFactorialTest.findFactorial(5.0), 1e-15);
        assertEquals(362880, findFactorialTest.findFactorial(9), 1e-15);
        assertEquals(6.0, findFactorialTest.findFactorial(3.0), 1e-15);
    }

    @Test
    public void setCurrentValue() {
        MainApplication setCurrentValueTest = new MainApplication();

        assertEquals(10, setCurrentValueTest.setCurrentValue(10), 1e-15);
        assertEquals(21.1, setCurrentValueTest.setCurrentValue(21.1), 1e-15);
        assertNotEquals(5.0, setCurrentValueTest.setCurrentValue(5.1), 1e-15);
    }

    @Test
    public void clearMemory() {
        MainApplication clearMemoryTest = new MainApplication();

        assertEquals(0, clearMemoryTest.clearMemory(), 1e-15);
        assertEquals(0, clearMemoryTest.clearMemory(), 1e-15);
        assertNotEquals(5.0, clearMemoryTest.clearMemory(), 1e-15);
    }



}
