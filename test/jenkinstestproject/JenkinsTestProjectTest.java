/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jenkinstestproject;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Justin
 */
public class JenkinsTestProjectTest {
    
    public JenkinsTestProjectTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of main method, of class JenkinsTestProject.
     * @throws java.lang.Exception
     */
    @Test
    public void testMain() throws Exception {
        int i = JenkinsTestProject.x;
        assertEquals(i, 1);
    }
    
}
