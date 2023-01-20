package edu.ucsd.cse110.lab2;
import static org.junit.Assert.*;

import org.junit.Assert;
import  org.junit.Test;
public class LAB2PART4 {
    @Test
    public void testTrim(){
        assertEquals("1.234",Utilities.trimDisplayStr("1.2340"));
        assertEquals("13",Utilities.trimDisplayStr("13.0"));
    }
}
