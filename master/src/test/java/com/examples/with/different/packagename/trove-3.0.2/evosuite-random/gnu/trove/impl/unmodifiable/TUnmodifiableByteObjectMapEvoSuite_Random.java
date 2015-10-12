/*
 * This file was automatically generated by EvoSuite
 */

package gnu.trove.impl.unmodifiable;

import org.junit.Test;
import static org.junit.Assert.*;
import gnu.trove.impl.unmodifiable.TUnmodifiableByteObjectMap;
import gnu.trove.map.TByteObjectMap;
import gnu.trove.map.hash.TByteObjectHashMap;
import java.util.Locale;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;

public class TUnmodifiableByteObjectMapEvoSuite_Random {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.utils.LoggingUtils.setLoggingForJUnit(); 
    org.evosuite.Properties.REPLACE_CALLS = true; 
    org.evosuite.agent.InstrumentingAgent.initialize(); 
  } 

  @Before 
  public void initTestCase(){ 
    org.evosuite.agent.InstrumentingAgent.activate(); 
  } 

  @After 
  public void doneWithTestCase(){ 
    org.evosuite.agent.InstrumentingAgent.deactivate(); 
  } 


  @Test
  public void test0()  throws Throwable  {
      int int0 = (-1);
      float float0 = 1.0F;
      TByteObjectHashMap<Byte> tByteObjectHashMap0 = new TByteObjectHashMap<Byte>();
      TUnmodifiableByteObjectMap<Byte> tUnmodifiableByteObjectMap0 = new TUnmodifiableByteObjectMap<Byte>((TByteObjectMap<Byte>) tByteObjectHashMap0);
      // Undeclared exception!
      try {
        tUnmodifiableByteObjectMap0.clear();
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test
  public void test1()  throws Throwable  {
      TByteObjectHashMap<Object> tByteObjectHashMap0 = new TByteObjectHashMap<Object>();
      TUnmodifiableByteObjectMap<Object> tUnmodifiableByteObjectMap0 = new TUnmodifiableByteObjectMap<Object>((TByteObjectMap<Object>) tByteObjectHashMap0);
      int int0 = tUnmodifiableByteObjectMap0.hashCode();
      assertEquals(0, int0);
  }

  @Test
  public void test2()  throws Throwable  {
      TByteObjectHashMap<String> tByteObjectHashMap0 = new TByteObjectHashMap<String>();
      byte[] byteArray0 = new byte[5];
      byte byte0 = (byte)0;
      byteArray0[0] = byte0;
      byte byte1 = (byte)75;
      byteArray0[1] = byte1;
      byte byte2 = (byte)0;
      byteArray0[2] = byte2;
      byte byte3 = (byte) (-23);
      byteArray0[3] = byte3;
      byte byte4 = (byte) (-78);
      byteArray0[4] = byte4;
      tByteObjectHashMap0._states = byteArray0;
      TUnmodifiableByteObjectMap<String> tUnmodifiableByteObjectMap0 = new TUnmodifiableByteObjectMap<String>((TByteObjectMap<String>) tByteObjectHashMap0);
      TByteObjectHashMap<Object> tByteObjectHashMap1 = null;
      try {
        tByteObjectHashMap1 = new TByteObjectHashMap<Object>((TByteObjectMap<?>) tByteObjectHashMap0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

//   @Test
//   public void test3()  throws Throwable  {
//       int int0 = 1227;
//       byte byte0 = (byte) (-20);
//       TByteObjectHashMap<String> tByteObjectHashMap0 = new TByteObjectHashMap<String>(int0, (float) int0, byte0);
//       TUnmodifiableByteObjectMap<String> tUnmodifiableByteObjectMap0 = new TUnmodifiableByteObjectMap<String>((TByteObjectMap<String>) tByteObjectHashMap0);
//       String[] stringArray0 = new String[9];
//       String string0 = "";
//       stringArray0[0] = string0;
//       String string1 = "=d";
//       stringArray0[1] = string1;
//       String string2 = "";
//       stringArray0[2] = string2;
//       String string3 = "";
//       stringArray0[3] = string3;
//       String string4 = "";
//       stringArray0[4] = string4;
//       String string5 = "0XNi^l-3Bl0c\\ip";
//       stringArray0[5] = string5;
//       String string6 = "Q7{K[cf1j*9:~";
//       stringArray0[6] = string6;
//       String string7 = "";
//       stringArray0[7] = string7;
//       String string8 = "`SJYlUA]\\j";
//       stringArray0[8] = string8;
//       tUnmodifiableByteObjectMap0.values(stringArray0);
//       TUnmodifiableByteObjectMap<String> tUnmodifiableByteObjectMap1 = new TUnmodifiableByteObjectMap<String>((TByteObjectMap<String>) tUnmodifiableByteObjectMap0);
//       assertEquals(-20, tUnmodifiableByteObjectMap1.getNoEntryKey());
//   }

  @Test
  public void test4()  throws Throwable  {
      TByteObjectMap<Integer> tByteObjectMap0 = null;
      TUnmodifiableByteObjectMap<Integer> tUnmodifiableByteObjectMap0 = null;
      try {
        tUnmodifiableByteObjectMap0 = new TUnmodifiableByteObjectMap<Integer>(tByteObjectMap0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test
  public void test5()  throws Throwable  {
      TByteObjectMap<Object> tByteObjectMap0 = null;
      TUnmodifiableByteObjectMap<Object> tUnmodifiableByteObjectMap0 = null;
      try {
        tUnmodifiableByteObjectMap0 = new TUnmodifiableByteObjectMap<Object>(tByteObjectMap0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test
  public void test6()  throws Throwable  {
      int int0 = 0;
      TByteObjectHashMap<String> tByteObjectHashMap0 = new TByteObjectHashMap<String>(int0);
      TUnmodifiableByteObjectMap<String> tUnmodifiableByteObjectMap0 = new TUnmodifiableByteObjectMap<String>((TByteObjectMap<String>) tByteObjectHashMap0);
      // Undeclared exception!
      try {
        tUnmodifiableByteObjectMap0.clear();
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test
  public void test7()  throws Throwable  {
      int int0 = 69;
      TByteObjectHashMap<Integer> tByteObjectHashMap0 = new TByteObjectHashMap<Integer>(int0);
      TUnmodifiableByteObjectMap<Integer> tUnmodifiableByteObjectMap0 = new TUnmodifiableByteObjectMap<Integer>((TByteObjectMap<Integer>) tByteObjectHashMap0);
      byte byte0 = (byte)0;
      // Undeclared exception!
      try {
        tUnmodifiableByteObjectMap0.put(byte0, (Integer) int0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test
  public void test8()  throws Throwable  {
      int int0 = 0;
      TByteObjectHashMap<String> tByteObjectHashMap0 = new TByteObjectHashMap<String>(int0, int0);
      TUnmodifiableByteObjectMap<String> tUnmodifiableByteObjectMap0 = new TUnmodifiableByteObjectMap<String>((TByteObjectMap<String>) tByteObjectHashMap0);
      byte byte0 = (byte)0;
      tUnmodifiableByteObjectMap0.get(byte0);
      TByteObjectHashMap<Object> tByteObjectHashMap1 = new TByteObjectHashMap<Object>(int0, int0);
      TUnmodifiableByteObjectMap<Object> tUnmodifiableByteObjectMap1 = new TUnmodifiableByteObjectMap<Object>((TByteObjectMap<Object>) tByteObjectHashMap1);
      byte byte1 = (byte)50;
      String string0 = "";
      Locale locale0 = new Locale(string0);
      String string1 = locale0.getScript();
      // Undeclared exception!
      try {
        tUnmodifiableByteObjectMap1.put(byte1, (Object) string1);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test
  public void test9()  throws Throwable  {
      TByteObjectMap<Integer> tByteObjectMap0 = null;
      TByteObjectHashMap<Object> tByteObjectHashMap0 = null;
      try {
        tByteObjectHashMap0 = new TByteObjectHashMap<Object>(tByteObjectMap0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test
  public void test10()  throws Throwable  {
      int int0 = 895;
      TByteObjectHashMap<String> tByteObjectHashMap0 = new TByteObjectHashMap<String>(int0);
      TUnmodifiableByteObjectMap<String> tUnmodifiableByteObjectMap0 = new TUnmodifiableByteObjectMap<String>((TByteObjectMap<String>) tByteObjectHashMap0);
      TUnmodifiableByteObjectMap<String> tUnmodifiableByteObjectMap1 = new TUnmodifiableByteObjectMap<String>((TByteObjectMap<String>) tUnmodifiableByteObjectMap0);
      byte byte0 = (byte)69;
      String string0 = "45]htv\"!^$0yHk#(ilA";
      tUnmodifiableByteObjectMap0.keySet();
      // Undeclared exception!
      try {
        tUnmodifiableByteObjectMap1.put(byte0, string0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test
  public void test11()  throws Throwable  {
      int int0 = 525;
      float float0 = 0.0F;
      byte byte0 = (byte)35;
      TByteObjectHashMap<Byte> tByteObjectHashMap0 = new TByteObjectHashMap<Byte>(int0, float0, byte0);
      TUnmodifiableByteObjectMap<Byte> tUnmodifiableByteObjectMap0 = new TUnmodifiableByteObjectMap<Byte>((TByteObjectMap<Byte>) tByteObjectHashMap0);
      // Undeclared exception!
      try {
        tUnmodifiableByteObjectMap0.clear();
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

//   @Test
//   public void test12()  throws Throwable  {
//       int int0 = 0;
//       TByteObjectHashMap<Object> tByteObjectHashMap0 = new TByteObjectHashMap<Object>(int0);
//       TUnmodifiableByteObjectMap<Object> tUnmodifiableByteObjectMap0 = new TUnmodifiableByteObjectMap<Object>((TByteObjectMap<Object>) tByteObjectHashMap0);
//       tUnmodifiableByteObjectMap0.toString();
//       int int1 = (-1196);
//       TByteObjectHashMap<Object> tByteObjectHashMap1 = new TByteObjectHashMap<Object>(int1);
//       TUnmodifiableByteObjectMap<Object> tUnmodifiableByteObjectMap1 = new TUnmodifiableByteObjectMap<Object>((TByteObjectMap<Object>) tByteObjectHashMap1);
//       byte byte0 = (byte) (-27);
//       tUnmodifiableByteObjectMap1.containsKey(byte0);
//       int int2 = 1431;
//       TByteObjectHashMap<Integer> tByteObjectHashMap2 = new TByteObjectHashMap<Integer>(int2, int2);
//       int int3 = (-1);
//       byte byte1 = (byte) (-68);
//       TByteObjectHashMap<Byte> tByteObjectHashMap3 = new TByteObjectHashMap<Byte>(int3, (float) int3, byte1);
//       byte byte2 = (byte)0;
//       tByteObjectHashMap2.remove(byte2);
//       Byte byte3 = tByteObjectHashMap3.put(byte2, (Byte) byte1);
//       float float0 = (-1859.1974F);
//       TByteObjectHashMap<String> tByteObjectHashMap4 = new TByteObjectHashMap<String>((int) byte1, float0);
//       TUnmodifiableByteObjectMap<String> tUnmodifiableByteObjectMap2 = new TUnmodifiableByteObjectMap<String>((TByteObjectMap<String>) tByteObjectHashMap4);
//       // Undeclared exception!
//       try {
//         tUnmodifiableByteObjectMap2.containsKey((byte) byte3);
//         fail("Expecting exception: IllegalArgumentException");
//       
//       } catch(IllegalArgumentException e) {
//          //
//          // no message in exception (getMessage() returned null)
//          //
//       }
//   }

  @Test
  public void test13()  throws Throwable  {
      int int0 = 85;
      float float0 = 0.0F;
      byte byte0 = (byte) (-28);
      TByteObjectHashMap<Object> tByteObjectHashMap0 = new TByteObjectHashMap<Object>(int0, float0, byte0);
      TUnmodifiableByteObjectMap<Object> tUnmodifiableByteObjectMap0 = new TUnmodifiableByteObjectMap<Object>((TByteObjectMap<Object>) tByteObjectHashMap0);
      TUnmodifiableByteObjectMap<Object> tUnmodifiableByteObjectMap1 = new TUnmodifiableByteObjectMap<Object>((TByteObjectMap<Object>) tUnmodifiableByteObjectMap0);
      Object object0 = null;
      // Undeclared exception!
      try {
        tUnmodifiableByteObjectMap1.putIfAbsent(byte0, object0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }
}
