package com.mycompany.app;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import java.util.ArrayList;
import java.util.Arrays;

import junit.framework.TestCase;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }
   

    
    public void testSumTrueMyMethod(){
    
     ArrayList<Integer> array=new ArrayList<>(Arrays.asList(1,2,3,4));
     ArrayList<Integer> array2=new ArrayList<>(Arrays.asList(1,2,3,4));
     assertTrue(new App().myMethod(array,10,array2,10));
    
    
    }
        public void testSumNotTrueMyMethod(){
    
     ArrayList<Integer> array=new ArrayList<>(Arrays.asList(1,2,3,4));
     ArrayList<Integer> array2=new ArrayList<>(Arrays.asList(1,2,3,4));
     assertFalse(new App().myMethod(array,15,array2,15));
    
    
    }
    
    public void testEmptyArrayMyMethod() {
    
     ArrayList<Integer> array = new ArrayList<>();
     ArrayList<Integer> array2 = new ArrayList<>();
     assertFalse(new App().myMethod(array, 10,array2,10));
    }  
    
        public void testNull() {
     assertFalse(new App().myMethod(null, 1,null,1));
    }


    public void testNonNegativeMyMethod(){
    
     ArrayList<Integer> array=new Arraylist<>(Arrays.asList(1,2,3,4));
     ArrayList<Integer> array2=new ArrayList<>(Arrays.asList(2,3,4,5));
     assertFalse(new App().myMethod(array,-1,array2,-2));
    
    
    }
}
