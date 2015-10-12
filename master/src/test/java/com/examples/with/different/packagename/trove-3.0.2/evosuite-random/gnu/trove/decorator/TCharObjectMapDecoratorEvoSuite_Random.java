/*
 * This file was automatically generated by EvoSuite
 */

package gnu.trove.decorator;

import org.junit.Test;
import static org.junit.Assert.*;
import gnu.trove.decorator.TCharObjectMapDecorator;
import gnu.trove.map.TCharObjectMap;
import gnu.trove.map.hash.TCharObjectHashMap;
import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.OutputStream;
import java.io.RandomAccessFile;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.AbstractMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;

public class TCharObjectMapDecoratorEvoSuite_Random {

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
      TCharObjectMapDecorator<Object> tCharObjectMapDecorator0 = new TCharObjectMapDecorator<Object>();
      Locale locale0 = Locale.getDefault();
      String string0 = locale0.getVariant();
      tCharObjectMapDecorator0.containsKey((Object) string0);
      TCharObjectMapDecorator<Object> tCharObjectMapDecorator1 = new TCharObjectMapDecorator<Object>();
  }

  @Test
  public void test1()  throws Throwable  {
      TCharObjectMapDecorator<Object> tCharObjectMapDecorator0 = new TCharObjectMapDecorator<Object>();
      tCharObjectMapDecorator0.values();
      String string0 = "";
      TCharObjectMapDecorator<String> tCharObjectMapDecorator1 = new TCharObjectMapDecorator<String>();
      // Undeclared exception!
      try {
        tCharObjectMapDecorator1.size();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test
  public void test2()  throws Throwable  {
      int int0 = (-147);
      TCharObjectHashMap<String> tCharObjectHashMap0 = new TCharObjectHashMap<String>(int0, int0);
      tCharObjectHashMap0.isEmpty();
      TCharObjectHashMap<String> tCharObjectHashMap1 = new TCharObjectHashMap<String>((TCharObjectMap<? extends String>) tCharObjectHashMap0);
      TCharObjectMapDecorator<String> tCharObjectMapDecorator0 = new TCharObjectMapDecorator<String>((TCharObjectMap<String>) tCharObjectHashMap1);
      TCharObjectMapDecorator<TCharObjectHashMap<Object>> tCharObjectMapDecorator1 = new TCharObjectMapDecorator<TCharObjectHashMap<Object>>();
      // Undeclared exception!
      try {
        tCharObjectMapDecorator1.hashCode();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test
  public void test3()  throws Throwable  {
      TCharObjectMapDecorator<TCharObjectHashMap<Integer>> tCharObjectMapDecorator0 = new TCharObjectMapDecorator<TCharObjectHashMap<Integer>>();
      TCharObjectHashMap<Integer> tCharObjectHashMap0 = new TCharObjectHashMap<Integer>();
      char char0 = '-';
      Character character0 = new Character(char0);
      // Undeclared exception!
      try {
        tCharObjectMapDecorator0.put(character0, tCharObjectHashMap0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test
  public void test4()  throws Throwable  {
      TCharObjectMapDecorator<String> tCharObjectMapDecorator0 = new TCharObjectMapDecorator<String>();
      char char0 = '>';
      Character character0 = Character.valueOf(char0);
      String string0 = "";
      // Undeclared exception!
      try {
        tCharObjectMapDecorator0.put(character0, string0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test
  public void test5()  throws Throwable  {
      int int0 = 1806;
      TCharObjectHashMap<Integer> tCharObjectHashMap0 = new TCharObjectHashMap<Integer>(int0);
      TCharObjectMapDecorator<Integer> tCharObjectMapDecorator0 = new TCharObjectMapDecorator<Integer>((TCharObjectMap<Integer>) tCharObjectHashMap0);
      tCharObjectMapDecorator0.clear();
      assertEquals(0, tCharObjectMapDecorator0.size());
  }

  @Test
  public void test6()  throws Throwable  {
      String string0 = "";
      Integer integer0 = null;
      AbstractMap.SimpleImmutableEntry<Integer, Integer> abstractMap_SimpleImmutableEntry0 = new AbstractMap.SimpleImmutableEntry<Integer, Integer>(integer0, integer0);
      AbstractMap.SimpleImmutableEntry<String, AbstractMap.SimpleImmutableEntry<Integer, Integer>> abstractMap_SimpleImmutableEntry1 = new AbstractMap.SimpleImmutableEntry<String, AbstractMap.SimpleImmutableEntry<Integer, Integer>>(string0, abstractMap_SimpleImmutableEntry0);
      URI uRI0 = URI.create(string0);
      TCharObjectHashMap<Character> tCharObjectHashMap0 = new TCharObjectHashMap<Character>();
      TCharObjectMapDecorator<Character> tCharObjectMapDecorator0 = new TCharObjectMapDecorator<Character>((TCharObjectMap<Character>) tCharObjectHashMap0);
      tCharObjectMapDecorator0.toString();
      uRI0.getRawPath();
      TCharObjectMapDecorator<String> tCharObjectMapDecorator1 = new TCharObjectMapDecorator<String>();
      // Undeclared exception!
      try {
        tCharObjectMapDecorator1.size();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test
  public void test7()  throws Throwable  {
      Integer integer0 = null;
      String string0 = "W\\%{nc8XDh";
      int int0 = 1776;
      TCharObjectHashMap<AbstractMap.SimpleEntry<Object, Integer>> tCharObjectHashMap0 = new TCharObjectHashMap<AbstractMap.SimpleEntry<Object, Integer>>(int0);
      TCharObjectMapDecorator<AbstractMap.SimpleEntry<Object, Integer>> tCharObjectMapDecorator0 = new TCharObjectMapDecorator<AbstractMap.SimpleEntry<Object, Integer>>((TCharObjectMap<AbstractMap.SimpleEntry<Object, Integer>>) tCharObjectHashMap0);
      TCharObjectMapDecorator<Character> tCharObjectMapDecorator1 = new TCharObjectMapDecorator<Character>();
      TCharObjectMap<Character> tCharObjectMap0 = tCharObjectMapDecorator1.getMap();
      TCharObjectMapDecorator<Character> tCharObjectMapDecorator2 = new TCharObjectMapDecorator<Character>(tCharObjectMap0);
      InputStream inputStream0 = null;
      ObjectInputStream objectInputStream0 = null;
      try {
        objectInputStream0 = new ObjectInputStream(inputStream0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test
  public void test8()  throws Throwable  {
      TCharObjectMapDecorator<String> tCharObjectMapDecorator0 = new TCharObjectMapDecorator<String>();
      Object object0 = null;
      // Undeclared exception!
      try {
        tCharObjectMapDecorator0.remove(object0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test
  public void test9()  throws Throwable  {
      AbstractMap.SimpleImmutableEntry<Object, Integer> abstractMap_SimpleImmutableEntry0 = null;
      String string0 = "-6S(uVX12fb";
      AbstractMap.SimpleImmutableEntry<AbstractMap.SimpleImmutableEntry<Object, Integer>, Object> abstractMap_SimpleImmutableEntry1 = new AbstractMap.SimpleImmutableEntry<AbstractMap.SimpleImmutableEntry<Object, Integer>, Object>(abstractMap_SimpleImmutableEntry0, (Object) string0);
      Locale locale0 = Locale.PRC;
      Locale locale1 = new Locale(string0);
      String string1 = locale0.getDisplayLanguage(locale1);
      boolean boolean0 = abstractMap_SimpleImmutableEntry1.equals((Object) string1);
      assertEquals(false, boolean0);
  }

  @Test
  public void test10()  throws Throwable  {
      TCharObjectMapDecorator<Character> tCharObjectMapDecorator0 = new TCharObjectMapDecorator<Character>();
      Locale locale0 = Locale.JAPANESE;
      String string0 = locale0.getCountry();
      tCharObjectMapDecorator0.containsKey((Object) string0);
      TCharObjectMapDecorator<Object> tCharObjectMapDecorator1 = new TCharObjectMapDecorator<Object>();
      // Undeclared exception!
      try {
        tCharObjectMapDecorator1.isEmpty();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test
  public void test11()  throws Throwable  {
      int int0 = 1405;
      char char0 = '(';
      TCharObjectMapDecorator<String> tCharObjectMapDecorator0 = new TCharObjectMapDecorator<String>();
      String string0 = "pO._+bJ*yo|etF$Q";
      Locale locale0 = Locale.forLanguageTag(string0);
      String string1 = locale0.getScript();
      tCharObjectMapDecorator0.remove((Object) string1);
      TCharObjectHashMap<Integer> tCharObjectHashMap0 = new TCharObjectHashMap<Integer>(int0, (float) int0, char0);
      TCharObjectMapDecorator<Integer> tCharObjectMapDecorator1 = new TCharObjectMapDecorator<Integer>((TCharObjectMap<Integer>) tCharObjectHashMap0);
      String string2 = "+).VXNblK`fB";
      URI uRI0 = null;
      try {
        uRI0 = new URI(string2, string2, string2, (int) char0, string2, string2, string2);
        fail("Expecting exception: URISyntaxException");
      
      } catch(URISyntaxException e) {
         //
         // Relative path in absolute URI: +).VXNblK`fB://+).VXNblK%60fB@+).VXNblK`fB:40+).VXNblK%60fB?+).VXNblK%60fB#+).VXNblK%60fB
         //
      }
  }

  @Test
  public void test12()  throws Throwable  {
      int int0 = (-308);
      TCharObjectMapDecorator<Integer> tCharObjectMapDecorator0 = new TCharObjectMapDecorator<Integer>();
      char char0 = 'U';
      Character character0 = new Character(char0);
      // Undeclared exception!
      try {
        tCharObjectMapDecorator0.put(character0, (Integer) int0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test
  public void test13()  throws Throwable  {
      int int0 = (-368);
      char char0 = ')';
      TCharObjectHashMap<AbstractMap.SimpleImmutableEntry<Object, Integer>> tCharObjectHashMap0 = new TCharObjectHashMap<AbstractMap.SimpleImmutableEntry<Object, Integer>>(int0, (float) int0, char0);
      AbstractMap.SimpleEntry<Integer, Integer> abstractMap_SimpleEntry0 = new AbstractMap.SimpleEntry<Integer, Integer>((Integer) int0, (Integer) int0);
      AbstractMap.SimpleEntry<Object, Object> abstractMap_SimpleEntry1 = new AbstractMap.SimpleEntry<Object, Object>((Map.Entry<?, ?>) abstractMap_SimpleEntry0);
      abstractMap_SimpleEntry1.getValue();
      AbstractMap.SimpleEntry<AbstractMap.SimpleEntry<Integer, Integer>, Integer> abstractMap_SimpleEntry2 = new AbstractMap.SimpleEntry<AbstractMap.SimpleEntry<Integer, Integer>, Integer>(abstractMap_SimpleEntry0, (Integer) int0);
      TCharObjectMapDecorator<String> tCharObjectMapDecorator0 = new TCharObjectMapDecorator<String>();
      int int1 = 18366923;
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream(int1);
      int int2 = (-1);
      tCharObjectHashMap0.size();
      AbstractMap.SimpleImmutableEntry<Object, Integer> abstractMap_SimpleImmutableEntry0 = null;
      tCharObjectHashMap0.putIfAbsent(char0, abstractMap_SimpleImmutableEntry0);
      TCharObjectMapDecorator<TCharObjectHashMap<Integer>> tCharObjectMapDecorator1 = new TCharObjectMapDecorator<TCharObjectHashMap<Integer>>();
      tCharObjectMapDecorator1.getMap();
      BufferedOutputStream bufferedOutputStream0 = null;
      try {
        bufferedOutputStream0 = new BufferedOutputStream((OutputStream) byteArrayOutputStream0, int2);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Buffer size <= 0
         //
      }
  }

  @Test
  public void test14()  throws Throwable  {
      int int0 = (-1964);
      TCharObjectHashMap<Object> tCharObjectHashMap0 = new TCharObjectHashMap<Object>(int0);
      char[] charArray0 = new char[9];
      char char0 = '=';
      charArray0[0] = char0;
      char char1 = '>';
      charArray0[1] = char1;
      char char2 = '~';
      charArray0[2] = char2;
      char char3 = 'q';
      charArray0[3] = char3;
      char char4 = '}';
      charArray0[4] = char4;
      char char5 = '9';
      charArray0[5] = char5;
      char char6 = '9';
      charArray0[6] = char6;
      char char7 = ';';
      charArray0[7] = char7;
      char char8 = 'm';
      charArray0[8] = char8;
      tCharObjectHashMap0.keys(charArray0);
      TCharObjectMapDecorator<Object> tCharObjectMapDecorator0 = new TCharObjectMapDecorator<Object>((TCharObjectMap<Object>) tCharObjectHashMap0);
      Set<Map.Entry<Character, Object>> set0 = (Set<Map.Entry<Character, Object>>)tCharObjectMapDecorator0.entrySet();
      assertEquals(true, set0.isEmpty());
  }

  @Test
  public void test15()  throws Throwable  {
      int int0 = 0;
      TCharObjectHashMap<Character> tCharObjectHashMap0 = new TCharObjectHashMap<Character>(int0);
      TCharObjectMap<Integer> tCharObjectMap0 = null;
      TCharObjectMap<AbstractMap.SimpleEntry<Object, String>> tCharObjectMap1 = null;
      TCharObjectMapDecorator<AbstractMap.SimpleEntry<Object, String>> tCharObjectMapDecorator0 = new TCharObjectMapDecorator<AbstractMap.SimpleEntry<Object, String>>(tCharObjectMap1);
      String string0 = "";
      RandomAccessFile randomAccessFile0 = null;
      try {
        randomAccessFile0 = new RandomAccessFile(string0, string0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal mode \"\" must be one of \"r\", \"rw\", \"rws\", or \"rwd\"
         //
      }
  }
}
