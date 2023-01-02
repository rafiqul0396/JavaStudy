package com.company.junitstudy;

import org.junit.Test;

import static org.junit.Assert.*;

public class TestAssertions {


      //test data
      String str1 = new String("abc");
      String str2 = new String("abc");
      String str3 = null;
      String str4 = "abc";
      String str5 = "abc";

      int val1 = 5;
      int val2 = 6;

      String[] expectedArray = {"one", "two", "three"};
      String[] resultArray = {"one", "two", "three"};

   @Test
   public  void test2() {
      //Check that two objects are equal
      assertEquals("str1 and str2 is equal or not ", str1, str2);
   }
   @Test
   public void  test3() {
      //Check that a condition is true
      assertTrue("if the condition is truee then the test will be pass", val1 < val2);

      //Check that a condition is false
      assertFalse("Check that a condition is false", val1 > val2);

      //Check that an object isn't null
      assertNotNull("Check that an object isn't null", str1);
   }
   @Test
   public  void test4() {

      //Check that an object is null
      assertNull("Check that an object is null", str3);

      //Check if two object references point to the same object
      assertSame(str4, str5);

      //Check if two object references not point to the same object
      assertNotSame(str1, str3);

      //Check whether two arrays are equal to each other.
      assertArrayEquals(expectedArray, resultArray);
   }

}




