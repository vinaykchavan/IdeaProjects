package Tests;

/**
 * Created by Amay on 2/2/2018.
 */

import BusinessLogic.*;
import org.junit.Before;
import org.junit.Test;

import  static org.junit.Assert.*;

public class CalTest {
    private calLogic cal;
    @Before
    public  void setUp(){
        cal = new calLogic();
    }

    @Test
    public void test1(){
        int actual = cal.cal("1 + 3");
        int expedted = 4;
        assertEquals(expedted, actual);
    }
}
