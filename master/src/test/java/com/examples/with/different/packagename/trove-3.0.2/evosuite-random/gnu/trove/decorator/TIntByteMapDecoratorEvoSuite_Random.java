/*
 * This file was automatically generated by EvoSuite
 */

package gnu.trove.decorator;

import org.junit.Test;
import static org.junit.Assert.*;
import gnu.trove.decorator.TIntByteMapDecorator;
import gnu.trove.map.TIntByteMap;
import gnu.trove.map.hash.TIntByteHashMap;
import java.io.PipedInputStream;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;

public class TIntByteMapDecoratorEvoSuite_Random {

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
      TIntByteMapDecorator tIntByteMapDecorator0 = new TIntByteMapDecorator();
      Object object0 = null;
      // Undeclared exception!
      try {
        tIntByteMapDecorator0.remove(object0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test
  public void test1()  throws Throwable  {
      int int0 = (-1916);
      float float0 = (-357.75162F);
      TIntByteMapDecorator tIntByteMapDecorator0 = new TIntByteMapDecorator();
      String string0 = "Ot3Mb.RPdGtS//IW5Q";
      String string1 = ";q";
      URI uRI0 = null;
      try {
        uRI0 = new URI(string0, string0, string0, int0, string0, string0, string1);
        fail("Expecting exception: URISyntaxException");
      
      } catch(URISyntaxException e) {
         //
         // Relative path in absolute URI: Ot3Mb.RPdGtS//IW5Q://Ot3Mb.RPdGtS%2F%2FIW5Q@Ot3Mb.RPdGtS//IW5Q:-1916Ot3Mb.RPdGtS//IW5Q?Ot3Mb.RPdGtS//IW5Q#;q
         //
      }
  }

  @Test
  public void test2()  throws Throwable  {
      TIntByteMapDecorator tIntByteMapDecorator0 = new TIntByteMapDecorator();
      String string0 = "cU*j/t]L";
      int int0 = 0;
      URI uRI0 = null;
      try {
        uRI0 = new URI(string0, string0, string0, int0, string0, string0, string0);
        fail("Expecting exception: URISyntaxException");
      
      } catch(URISyntaxException e) {
         //
         // Relative path in absolute URI: cU*j/t]L://cU*j%2Ft%5DL@cU*j/t]L:0cU*j/t%5DL?cU*j/t]L#cU*j/t]L
         //
      }
  }

  @Test
  public void test3()  throws Throwable  {
      int int0 = (-1383);
      TIntByteMap tIntByteMap0 = null;
      TIntByteHashMap tIntByteHashMap0 = null;
      try {
        tIntByteHashMap0 = new TIntByteHashMap(tIntByteMap0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test
  public void test4()  throws Throwable  {
      TIntByteMapDecorator tIntByteMapDecorator0 = new TIntByteMapDecorator();
      int int0 = (-57);
      AbstractMap.SimpleEntry<Integer, Integer> abstractMap_SimpleEntry0 = new AbstractMap.SimpleEntry<Integer, Integer>((Integer) int0, (Integer) int0);
      tIntByteMapDecorator0.containsValue((Object) abstractMap_SimpleEntry0);
      int int1 = 0;
      String string0 = Integer.toOctalString(int1);
      abstractMap_SimpleEntry0.equals((Object) string0);
      TIntByteMapDecorator tIntByteMapDecorator1 = new TIntByteMapDecorator();
      Byte byte0 = null;
      // Undeclared exception!
      try {
        tIntByteMapDecorator1.put((Integer) int0, byte0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test
  public void test5()  throws Throwable  {
      TIntByteMapDecorator tIntByteMapDecorator0 = new TIntByteMapDecorator();
      tIntByteMapDecorator0.entrySet();
      Locale locale0 = Locale.ITALIAN;
      Locale locale1 = Locale.TRADITIONAL_CHINESE;
      locale0.getDisplayScript(locale1);
      String string0 = locale0.getVariant();
      tIntByteMapDecorator0.get((Object) string0);
      tIntByteMapDecorator0.keySet();
      int int0 = 1504;
      int int1 = 0;
      PipedInputStream pipedInputStream0 = null;
      try {
        pipedInputStream0 = new PipedInputStream(int1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Pipe Size <= 0
         //
      }
  }

  @Test
  public void test6()  throws Throwable  {
      TIntByteMapDecorator tIntByteMapDecorator0 = new TIntByteMapDecorator();
      int int0 = 1230;
      Integer integer0 = new Integer(int0);
      int int1 = Integer.MAX_VALUE;
      byte byte0 = (byte)21;
      Byte byte1 = new Byte(byte0);
      // Undeclared exception!
      try {
        tIntByteMapDecorator0.put((Integer) int1, byte1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test
  public void test7()  throws Throwable  {
      int[] intArray0 = new int[8];
      int int0 = (-760);
      intArray0[0] = int0;
      int int1 = 0;
      intArray0[1] = int1;
      int int2 = 0;
      intArray0[2] = int2;
      int int3 = 784;
      intArray0[3] = int3;
      int int4 = (-1441);
      intArray0[4] = int4;
      int int5 = 852;
      intArray0[5] = int5;
      int int6 = Integer.MIN_VALUE;
      intArray0[6] = int6;
      int int7 = 1466;
      intArray0[7] = int7;
      byte[] byteArray0 = new byte[6];
      byte byte0 = (byte)0;
      byteArray0[0] = byte0;
      byte byte1 = (byte)1;
      byteArray0[1] = byte1;
      byte byte2 = (byte)42;
      byteArray0[2] = byte2;
      byte byte3 = (byte)89;
      byteArray0[3] = byte3;
      byte byte4 = (byte) (-124);
      byteArray0[4] = byte4;
      byte byte5 = (byte)0;
      byteArray0[5] = byte5;
      TIntByteHashMap tIntByteHashMap0 = new TIntByteHashMap(intArray0, byteArray0);
      TIntByteMapDecorator tIntByteMapDecorator0 = new TIntByteMapDecorator((TIntByteMap) tIntByteHashMap0);
      tIntByteMapDecorator0.put((Integer) int6, (Byte) byteArray0[0]);
      assertEquals(6, tIntByteMapDecorator0.size());
      assertEquals("{-2147483648=0, -760=0, -1441=-124, 852=0, 784=89, 0=42}", tIntByteHashMap0.toString());
  }

  @Test
  public void test8()  throws Throwable  {
      int int0 = 36733847;
      TIntByteMapDecorator tIntByteMapDecorator0 = new TIntByteMapDecorator();
      Locale locale0 = Locale.KOREA;
      String string0 = locale0.getDisplayVariant();
      tIntByteMapDecorator0.get((Object) string0);
      // Undeclared exception!
      try {
        tIntByteMapDecorator0.toString();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test
  public void test9()  throws Throwable  {
      int int0 = 0;
      int int1 = 0;
      byte byte0 = (byte) (-12);
      TIntByteHashMap tIntByteHashMap0 = new TIntByteHashMap();
      TIntByteMapDecorator tIntByteMapDecorator0 = new TIntByteMapDecorator((TIntByteMap) tIntByteHashMap0);
      TIntByteHashMap tIntByteHashMap1 = new TIntByteHashMap(int0, (float) int0, int1, byte0);
      TIntByteMapDecorator tIntByteMapDecorator1 = new TIntByteMapDecorator((TIntByteMap) tIntByteHashMap1);
      tIntByteMapDecorator1.size();
      Integer integer0 = null;
      String string0 = "";
      AbstractMap.SimpleEntry<TIntByteHashMap, String> abstractMap_SimpleEntry0 = new AbstractMap.SimpleEntry<TIntByteHashMap, String>(tIntByteHashMap1, string0);
      AbstractMap.SimpleEntry<Object, Object> abstractMap_SimpleEntry1 = new AbstractMap.SimpleEntry<Object, Object>((Map.Entry<?, ?>) abstractMap_SimpleEntry0);
      URI uRI0 = null;
      try {
        uRI0 = new URI(string0, string0, string0);
        fail("Expecting exception: URISyntaxException");
      
      } catch(URISyntaxException e) {
         //
         // Expected scheme name at index 0: :#
         //
      }
  }

  @Test
  public void test10()  throws Throwable  {
      int int0 = 0;
      TIntByteHashMap tIntByteHashMap0 = new TIntByteHashMap(int0);
      TIntByteMapDecorator tIntByteMapDecorator0 = new TIntByteMapDecorator((TIntByteMap) tIntByteHashMap0);
      Object object0 = null;
      byte[] byteArray0 = new byte[6];
      byte byte0 = (byte)91;
      byteArray0[0] = byte0;
      byte byte1 = (byte) (-1);
      byteArray0[1] = byte1;
      byte byte2 = (byte)91;
      byteArray0[2] = byte2;
      byte byte3 = (byte) (-95);
      byteArray0[3] = byte3;
      byte byte4 = (byte)19;
      byteArray0[4] = byte4;
      byte byte5 = (byte)68;
      byteArray0[5] = byte5;
      tIntByteHashMap0._states = byteArray0;
      AbstractMap.SimpleEntry<Object, TIntByteHashMap> abstractMap_SimpleEntry0 = new AbstractMap.SimpleEntry<Object, TIntByteHashMap>(object0, tIntByteHashMap0);
      abstractMap_SimpleEntry0.hashCode();
      Locale locale0 = Locale.JAPAN;
      String string0 = locale0.getLanguage();
      tIntByteMapDecorator0.toString();
      Locale locale1 = Locale.GERMAN;
      locale0.getDisplayCountry(locale1);
      boolean boolean0 = tIntByteMapDecorator0.containsKey((Object) string0);
      assertEquals(false, boolean0);
  }

  @Test
  public void test11()  throws Throwable  {
      byte byte0 = (byte) (-13);
      Byte byte1 = new Byte(byte0);
      Integer integer0 = new Integer((int) byte0);
      AbstractMap.SimpleImmutableEntry<Byte, Integer> abstractMap_SimpleImmutableEntry0 = new AbstractMap.SimpleImmutableEntry<Byte, Integer>(byte1, integer0);
      // Undeclared exception!
      try {
        abstractMap_SimpleImmutableEntry0.setValue(integer0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test
  public void test12()  throws Throwable  {
      TIntByteMapDecorator tIntByteMapDecorator0 = new TIntByteMapDecorator();
      HashMap<Object, String> hashMap0 = new HashMap<Object, String>();
      int int0 = 31;
      Byte byte0 = null;
      // Undeclared exception!
      try {
        tIntByteMapDecorator0.put((Integer) int0, byte0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

//   @Test
//   public void test13()  throws Throwable  {
//       Byte byte0 = null;
//       String string0 = "a";
//       AbstractMap.SimpleImmutableEntry<Byte, String> abstractMap_SimpleImmutableEntry0 = new AbstractMap.SimpleImmutableEntry<Byte, String>(byte0, string0);
//       abstractMap_SimpleImmutableEntry0.getValue();
//       int int0 = 121;
//       float float0 = (-1145.074F);
//       TIntByteHashMap tIntByteHashMap0 = new TIntByteHashMap(int0, float0);
//       tIntByteHashMap0.toString();
//       AbstractMap.SimpleEntry<TIntByteHashMap, TIntByteHashMap> abstractMap_SimpleEntry0 = new AbstractMap.SimpleEntry<TIntByteHashMap, TIntByteHashMap>(tIntByteHashMap0, tIntByteHashMap0);
//       abstractMap_SimpleEntry0.getKey();
//       tIntByteHashMap0.keys();
//       TIntByteHashMap tIntByteHashMap1 = abstractMap_SimpleEntry0.getKey();
//       assertEquals(0.5F, tIntByteHashMap1.getAutoCompactionFactor(), 0.01F);
//   }

  @Test
  public void test14()  throws Throwable  {
      TIntByteHashMap tIntByteHashMap0 = new TIntByteHashMap();
      Integer integer0 = null;
      TIntByteMapDecorator tIntByteMapDecorator0 = new TIntByteMapDecorator();
      // Undeclared exception!
      try {
        tIntByteMapDecorator0.clear();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test
  public void test15()  throws Throwable  {
      TIntByteMapDecorator tIntByteMapDecorator0 = new TIntByteMapDecorator();
      TIntByteMap tIntByteMap0 = tIntByteMapDecorator0.getMap();
      TIntByteMapDecorator tIntByteMapDecorator1 = new TIntByteMapDecorator(tIntByteMap0);
      // Undeclared exception!
      try {
        tIntByteMapDecorator1.size();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test
  public void test16()  throws Throwable  {
      TIntByteMapDecorator tIntByteMapDecorator0 = new TIntByteMapDecorator();
      int int0 = 1322;
      Integer integer0 = new Integer(int0);
      Byte byte0 = null;
      // Undeclared exception!
      try {
        tIntByteMapDecorator0.put(integer0, byte0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }
}
