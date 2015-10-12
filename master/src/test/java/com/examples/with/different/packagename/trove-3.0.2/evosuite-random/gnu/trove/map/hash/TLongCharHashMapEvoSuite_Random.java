/*
 * This file was automatically generated by EvoSuite
 */

package gnu.trove.map.hash;

import org.junit.Test;
import static org.junit.Assert.*;
import gnu.trove.function.TCharFunction;
import gnu.trove.map.TLongCharMap;
import gnu.trove.map.hash.TLongCharHashMap;
import gnu.trove.procedure.TLongCharProcedure;
import gnu.trove.procedure.TLongProcedure;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.util.AbstractMap;
import java.util.Map;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;

public class TLongCharHashMapEvoSuite_Random {

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
      TLongCharHashMap tLongCharHashMap0 = null;
      long long0 = 2L;
      long[] longArray0 = new long[10];
      longArray0[0] = long0;
      longArray0[1] = long0;
      longArray0[2] = long0;
      longArray0[0] = long0;
      longArray0[1] = long0;
      longArray0[2] = long0;
      long long1 = (-23L);
      longArray0[3] = long1;
      longArray0[4] = long0;
      longArray0[5] = long0;
      longArray0[6] = long1;
      longArray0[7] = long1;
      longArray0[8] = long1;
      longArray0[9] = long1;
      longArray0[3] = long0;
      longArray0[4] = long0;
      longArray0[5] = long0;
      longArray0[6] = long0;
      longArray0[7] = long0;
      longArray0[8] = long0;
      longArray0[9] = long0;
      char[] charArray0 = new char[6];
      char char0 = 'z';
      charArray0[0] = char0;
      char char1 = '=';
      charArray0[1] = char1;
      char char2 = '1';
      charArray0[2] = char2;
      char char3 = '*';
      charArray0[3] = char3;
      char char4 = ']';
      TLongCharHashMap tLongCharHashMap1 = new TLongCharHashMap();
      charArray0[4] = char4;
      char char5 = ' ';
      charArray0[5] = char5;
      TLongCharHashMap tLongCharHashMap2 = new TLongCharHashMap(longArray0, charArray0);
      Long long2 = new Long(long0);
      AbstractMap.SimpleEntry<TLongCharHashMap, Long> abstractMap_SimpleEntry0 = new AbstractMap.SimpleEntry<TLongCharHashMap, Long>(tLongCharHashMap0, long2);
      TLongCharHashMap tLongCharHashMap3 = abstractMap_SimpleEntry0.getKey();
      assertNull(tLongCharHashMap3);
  }

  @Test
  public void test1()  throws Throwable  {
      String string0 = "";
      long[] longArray0 = new long[4];
      long long0 = (-1L);
      longArray0[0] = long0;
      int int0 = (-1149);
      float float0 = (-1790.1709F);
      long long1 = (-944L);
      char char0 = 'h';
      TLongCharHashMap tLongCharHashMap0 = new TLongCharHashMap(int0, float0, long1, char0);
      TLongCharHashMap tLongCharHashMap1 = new TLongCharHashMap((TLongCharMap) tLongCharHashMap0);
      tLongCharHashMap1.increment(longArray0[0]);
      long long2 = 0L;
      longArray0[1] = long2;
      long long3 = 1679L;
      longArray0[2] = long3;
      TLongCharHashMap tLongCharHashMap2 = new TLongCharHashMap();
      long long4 = (-528L);
      long long5 = 0L;
      tLongCharHashMap2.containsKey(long5);
      longArray0[3] = long4;
      char[] charArray0 = new char[1];
      char char1 = 'D';
      tLongCharHashMap0._states = tLongCharHashMap1._states;
      assertEquals((-944L), tLongCharHashMap1.getNoEntryKey());
      
      charArray0[0] = char1;
      char char2 = '^';
      tLongCharHashMap0.getNoEntryKey();
      assertEquals(3, tLongCharHashMap0.capacity());
      
      charArray0[0] = char2;
      TLongCharHashMap tLongCharHashMap3 = new TLongCharHashMap(longArray0, charArray0);
      AbstractMap.SimpleImmutableEntry<TLongCharHashMap, Long> abstractMap_SimpleImmutableEntry0 = new AbstractMap.SimpleImmutableEntry<TLongCharHashMap, Long>(tLongCharHashMap3, (Long) longArray0[2]);
      String string1 = abstractMap_SimpleImmutableEntry0.toString();
      assertNotNull(string1);
      
      AbstractMap.SimpleEntry<String, Object> abstractMap_SimpleEntry0 = new AbstractMap.SimpleEntry<String, Object>(string0, (Object) string1);
      AbstractMap.SimpleImmutableEntry<Object, Object> abstractMap_SimpleImmutableEntry1 = new AbstractMap.SimpleImmutableEntry<Object, Object>((Map.Entry<?, ?>) abstractMap_SimpleEntry0);
      long long6 = 0L;
      tLongCharHashMap2.increment(long6);
      int int1 = abstractMap_SimpleImmutableEntry1.hashCode();
      assertEquals((-506073465), int1);
      
      int int2 = tLongCharHashMap3.size();
      assertEquals(11, tLongCharHashMap3.capacity());
      assertEquals(1, int2);
  }

  @Test
  public void test2()  throws Throwable  {
      int int0 = 0;
      int int1 = (-328);
      int int2 = (-1180);
      long long0 = 0L;
      char char0 = '\\';
      TLongCharHashMap tLongCharHashMap0 = new TLongCharHashMap(int2, (float) int2, long0, char0);
      Object object0 = null;
      tLongCharHashMap0.equals(object0);
      float float0 = 0.0F;
      long long1 = (-1118L);
      char char1 = 'z';
      TLongCharHashMap tLongCharHashMap1 = new TLongCharHashMap(int1, float0, long1, char1);
      int int3 = 95;
      PipedInputStream pipedInputStream0 = new PipedInputStream(int3);
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream(pipedInputStream0);
      PipedInputStream pipedInputStream1 = null;
      try {
        pipedInputStream1 = new PipedInputStream(pipedOutputStream0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Already connected
         //
      }
  }

  @Test
  public void test3()  throws Throwable  {
      TLongCharMap tLongCharMap0 = null;
      long[] longArray0 = new long[8];
      long long0 = (-292L);
      longArray0[0] = long0;
      long long1 = 200L;
      longArray0[1] = long1;
      long long2 = 0L;
      longArray0[2] = long2;
      long long3 = 1L;
      longArray0[3] = long3;
      long long4 = (-1L);
      longArray0[4] = long4;
      long long5 = 0L;
      longArray0[5] = long5;
      long long6 = 1781L;
      longArray0[6] = long6;
      long long7 = (-693L);
      longArray0[7] = long7;
      char[] charArray0 = new char[5];
      char char0 = 'I';
      charArray0[0] = char0;
      char char1 = 'A';
      charArray0[1] = char1;
      char char2 = '[';
      charArray0[2] = char2;
      char char3 = 'z';
      charArray0[3] = char3;
      char char4 = '6';
      charArray0[4] = char4;
      TLongCharHashMap tLongCharHashMap0 = new TLongCharHashMap(longArray0, charArray0);
      tLongCharHashMap0.containsValue(char0);
      int int0 = 0;
      TLongCharHashMap tLongCharHashMap1 = new TLongCharHashMap(int0, int0);
      long long8 = 0L;
      char char5 = '}';
      char char6 = '(';
      tLongCharHashMap1.adjustOrPutValue(long8, char5, char6);
      tLongCharHashMap1.remove((long) int0);
      TLongCharHashMap tLongCharHashMap2 = null;
      try {
        tLongCharHashMap2 = new TLongCharHashMap(tLongCharMap0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test
  public void test4()  throws Throwable  {
      long[] longArray0 = new long[2];
      long long0 = 846L;
      longArray0[0] = long0;
      long long1 = 1770L;
      longArray0[1] = long1;
      char[] charArray0 = new char[5];
      char char0 = '6';
      charArray0[0] = char0;
      char char1 = '`';
      char[] charArray1 = new char[7];
      charArray1[0] = char0;
      char char2 = 'D';
      charArray1[1] = char2;
      charArray1[2] = char0;
      charArray1[3] = char0;
      charArray1[4] = char0;
      charArray1[5] = char1;
      TLongCharHashMap tLongCharHashMap0 = new TLongCharHashMap((int) charArray1[2]);
      charArray1[6] = char0;
      TLongCharHashMap tLongCharHashMap1 = new TLongCharHashMap(longArray0, charArray1);
      assertEquals("{846=6, 1770=D}", tLongCharHashMap1.toString());
      
      charArray0[1] = char1;
      char char3 = '3';
      charArray0[2] = char3;
      char char4 = 'L';
      charArray0[3] = char4;
      char char5 = '3';
      charArray0[4] = char5;
      TLongCharHashMap tLongCharHashMap2 = new TLongCharHashMap(longArray0, charArray0);
      TLongProcedure tLongProcedure0 = null;
      // Undeclared exception!
      try {
        tLongCharHashMap2.forEach(tLongProcedure0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test
  public void test5()  throws Throwable  {
      int int0 = 1764;
      TLongCharHashMap tLongCharHashMap0 = new TLongCharHashMap(int0);
      TLongCharHashMap tLongCharHashMap1 = new TLongCharHashMap((TLongCharMap) tLongCharHashMap0);
      TLongCharHashMap tLongCharHashMap2 = new TLongCharHashMap((TLongCharMap) tLongCharHashMap1);
      long long0 = tLongCharHashMap2.getNoEntryKey();
      assertEquals(3821, tLongCharHashMap0.capacity());
      assertEquals(23, tLongCharHashMap1.capacity());
      assertEquals(0L, long0);
  }

  @Test
  public void test6()  throws Throwable  {
      int int0 = 403;
      TLongCharHashMap tLongCharHashMap0 = new TLongCharHashMap();
      tLongCharHashMap0.capacity();
      tLongCharHashMap0.getAutoCompactionFactor();
      char char0 = 'X';
      TLongCharHashMap tLongCharHashMap1 = new TLongCharHashMap();
      tLongCharHashMap0.hashCode();
      TLongCharHashMap tLongCharHashMap2 = new TLongCharHashMap((TLongCharMap) tLongCharHashMap1);
      long long0 = (-1683L);
      char char1 = tLongCharHashMap0.putIfAbsent(long0, char0);
      assertEquals(false, tLongCharHashMap0.isEmpty());
      
      TLongCharHashMap tLongCharHashMap3 = new TLongCharHashMap((TLongCharMap) tLongCharHashMap2);
      tLongCharHashMap3.valueCollection();
      TLongCharHashMap tLongCharHashMap4 = new TLongCharHashMap(int0, (float) int0, (long) int0, char0);
      long long1 = (-684L);
      tLongCharHashMap4.contains(long1);
      tLongCharHashMap1.clear();
      tLongCharHashMap4.keys();
      assertFalse(char0 == char1);
  }

  @Test
  public void test7()  throws Throwable  {
      int int0 = 0;
      TLongCharHashMap tLongCharHashMap0 = new TLongCharHashMap(int0);
      float float0 = 0.0F;
      tLongCharHashMap0.setAutoCompactionFactor(float0);
      assertEquals(true, tLongCharHashMap0.isEmpty());
  }

  @Test
  public void test8()  throws Throwable  {
      long[] longArray0 = new long[1];
      long long0 = 680L;
      longArray0[0] = long0;
      char[] charArray0 = new char[3];
      char char0 = '|';
      int int0 = (-1);
      TLongCharHashMap tLongCharHashMap0 = new TLongCharHashMap(int0, (float) long0);
      int int1 = tLongCharHashMap0.hashCode();
      assertEquals(0, int1);
      
      charArray0[0] = char0;
      char char1 = '!';
      charArray0[1] = char1;
      boolean boolean0 = true;
      tLongCharHashMap0.reenableAutoCompaction(boolean0);
      char char2 = 'S';
      charArray0[2] = char2;
      TLongCharHashMap tLongCharHashMap1 = new TLongCharHashMap(longArray0, charArray0);
      TLongCharHashMap tLongCharHashMap2 = new TLongCharHashMap((TLongCharMap) tLongCharHashMap1);
      TLongCharHashMap tLongCharHashMap3 = new TLongCharHashMap((TLongCharMap) tLongCharHashMap2);
      long long1 = 1276L;
      boolean boolean1 = tLongCharHashMap3.adjustValue(long1, char2);
      assertEquals("{680=|}", tLongCharHashMap3.toString());
      
      boolean boolean2 = tLongCharHashMap1.containsValue(char0);
      assertFalse(boolean2 == boolean1);
      
      long long2 = tLongCharHashMap2.getNoEntryKey();
      assertEquals(7, tLongCharHashMap1.capacity());
      assertEquals(23, tLongCharHashMap2.capacity());
      assertEquals(1, tLongCharHashMap2.size());
      assertEquals(0L, long2);
      
      TLongCharHashMap tLongCharHashMap4 = new TLongCharHashMap();
      char[] charArray1 = tLongCharHashMap4.values();
      assertNotNull(charArray1);
      assertFalse(tLongCharHashMap4.equals(tLongCharHashMap3));
  }

  @Test
  public void test9()  throws Throwable  {
      int int0 = 1436;
      long[] longArray0 = new long[8];
      longArray0[0] = (long) int0;
      longArray0[1] = (long) int0;
      longArray0[2] = (long) int0;
      longArray0[3] = (long) int0;
      longArray0[4] = (long) int0;
      longArray0[5] = (long) int0;
      longArray0[6] = (long) int0;
      longArray0[7] = (long) int0;
      char[] charArray0 = new char[1];
      char char0 = '@';
      charArray0[0] = char0;
      TLongCharHashMap tLongCharHashMap0 = new TLongCharHashMap(longArray0, charArray0);
      long long0 = (-1L);
      tLongCharHashMap0.get(long0);
      assertEquals(17, tLongCharHashMap0.capacity());
      assertEquals("{1436=@}", tLongCharHashMap0.toString());
      
      float float0 = (-603.1408F);
      float float1 = 0.0F;
      TLongCharHashMap tLongCharHashMap1 = new TLongCharHashMap(int0, float1);
      tLongCharHashMap1.hashCode();
      char char1 = ';';
      long long1 = (-427L);
      tLongCharHashMap1.contains(long1);
      tLongCharHashMap1.get((long) int0);
      TLongCharHashMap tLongCharHashMap2 = new TLongCharHashMap(int0, float0, (long) int0, char1);
      String string0 = tLongCharHashMap2.toString();
      assertNotNull(string0);
      
      int int1 = tLongCharHashMap1.hashCode();
      assertEquals(0, int1);
      
      TLongCharHashMap tLongCharHashMap3 = new TLongCharHashMap((TLongCharMap) tLongCharHashMap2);
      tLongCharHashMap3.getAutoCompactionFactor();
      assertFalse(tLongCharHashMap3.equals(tLongCharHashMap0));
      assertEquals(3, tLongCharHashMap3.capacity());
      assertEquals(1436L, tLongCharHashMap3.getNoEntryKey());
  }

  @Test
  public void test10()  throws Throwable  {
      int int0 = 115;
      char char0 = 'X';
      TLongCharHashMap tLongCharHashMap0 = new TLongCharHashMap(int0, (float) int0, (long) int0, char0);
      tLongCharHashMap0.adjustOrPutValue((long) int0, char0, char0);
      tLongCharHashMap0.clear();
      File file0 = null;
      String string0 = "ng)pV\\K~H5K";
      tLongCharHashMap0.isEmpty();
      PrintStream printStream0 = null;
      try {
        printStream0 = new PrintStream(file0, string0);
        fail("Expecting exception: UnsupportedEncodingException");
      
      } catch(UnsupportedEncodingException e) {
         //
         // ng)pV\\K~H5K
         //
      }
  }

  @Test
  public void test11()  throws Throwable  {
      int int0 = (-1080);
      float float0 = (-1050.8867F);
      TLongCharHashMap tLongCharHashMap0 = new TLongCharHashMap(int0);
      tLongCharHashMap0.getAutoCompactionFactor();
      long long0 = (-1528L);
      tLongCharHashMap0.getNoEntryKey();
      char char0 = ',';
      tLongCharHashMap0.containsValue(char0);
      char char1 = '[';
      tLongCharHashMap0.valueCollection();
      TLongCharHashMap tLongCharHashMap1 = new TLongCharHashMap(int0, float0, long0, char1);
      assertEquals("{}", tLongCharHashMap1.toString());
  }

  @Test
  public void test12()  throws Throwable  {
      int int0 = 1;
      float float0 = 6.6360896E8F;
      TLongCharHashMap tLongCharHashMap0 = new TLongCharHashMap(int0, float0);
      TLongCharHashMap tLongCharHashMap1 = new TLongCharHashMap(int0, int0);
      long long0 = 1L;
      char char0 = 'n';
      boolean boolean0 = tLongCharHashMap0.adjustValue(long0, char0);
      tLongCharHashMap0.containsKey((long) int0);
      tLongCharHashMap1.capacity();
      TCharFunction tCharFunction0 = null;
      tLongCharHashMap1.transformValues(tCharFunction0);
      long[] longArray0 = tLongCharHashMap1._set;
      char char1 = '\\';
      tLongCharHashMap1.getAutoCompactionFactor();
      boolean boolean1 = tLongCharHashMap1.containsValue(char1);
      assertTrue(boolean1 == boolean0);
  }

  @Test
  public void test13()  throws Throwable  {
      int int0 = (-2002);
      long[] longArray0 = new long[4];
      longArray0[0] = (long) int0;
      longArray0[1] = (long) int0;
      longArray0[2] = (long) int0;
      longArray0[3] = (long) int0;
      char[] charArray0 = new char[9];
      char char0 = 'x';
      charArray0[0] = char0;
      char char1 = '^';
      charArray0[1] = char1;
      char char2 = '9';
      charArray0[2] = char2;
      char char3 = 'd';
      charArray0[3] = char3;
      char char4 = '7';
      charArray0[4] = char4;
      char char5 = '{';
      charArray0[5] = char5;
      char char6 = ')';
      charArray0[6] = char6;
      char char7 = 'o';
      charArray0[7] = char7;
      char char8 = '1';
      charArray0[8] = char8;
      TLongCharHashMap tLongCharHashMap0 = new TLongCharHashMap(longArray0, charArray0);
      tLongCharHashMap0.getAutoCompactionFactor();
      TLongCharHashMap tLongCharHashMap1 = new TLongCharHashMap(int0);
      TLongCharHashMap tLongCharHashMap2 = new TLongCharHashMap((TLongCharMap) tLongCharHashMap1);
      tLongCharHashMap2._set = tLongCharHashMap1._set;
      TLongCharHashMap tLongCharHashMap3 = new TLongCharHashMap();
      byte[] byteArray0 = new byte[2];
      byte byte0 = (byte)93;
      byteArray0[0] = byte0;
      byte byte1 = (byte)0;
      byteArray0[1] = byte1;
      tLongCharHashMap3.increment((long) byteArray0[0]);
      tLongCharHashMap3._states = byteArray0;
      assertSame(tLongCharHashMap3._states, byteArray0);
  }

  @Test
  public void test14()  throws Throwable  {
      int int0 = 1;
      TLongCharHashMap tLongCharHashMap0 = new TLongCharHashMap(int0, int0);
      assertEquals('\u0000', tLongCharHashMap0.getNoEntryValue());
  }

  @Test
  public void test15()  throws Throwable  {
      int int0 = 624;
      int int1 = 0;
      TLongCharHashMap tLongCharHashMap0 = new TLongCharHashMap(int1, int0);
      int int2 = (-1257);
      TLongCharHashMap tLongCharHashMap1 = new TLongCharHashMap(int2);
      tLongCharHashMap1.increment((long) int0);
      float float0 = (-791.8544F);
      int int3 = 1157;
      TLongCharHashMap tLongCharHashMap2 = new TLongCharHashMap(int3);
      int int4 = 0;
      tLongCharHashMap2.ensureCapacity(int4);
      char char0 = ';';
      TLongCharHashMap tLongCharHashMap3 = new TLongCharHashMap(int0, float0, (long) int0, char0);
      tLongCharHashMap3.capacity();
      TLongCharHashMap tLongCharHashMap4 = new TLongCharHashMap();
      long long0 = (-868L);
      char char1 = 'X';
      tLongCharHashMap4.adjustOrPutValue(long0, char0, char1);
      tLongCharHashMap4.compact();
      long long1 = (-583L);
      char char2 = '%';
      char char3 = tLongCharHashMap2.adjustOrPutValue(long1, char2, char0);
      assertEquals(false, tLongCharHashMap2.isEmpty());
      assertEquals(';', char3);
  }

  @Test
  public void test16()  throws Throwable  {
      long[] longArray0 = new long[6];
      long long0 = 0L;
      longArray0[0] = long0;
      long long1 = 0L;
      longArray0[1] = long1;
      long long2 = 1878L;
      longArray0[2] = long2;
      long long3 = 0L;
      longArray0[3] = long3;
      long long4 = 1146L;
      longArray0[4] = long4;
      long long5 = (-9223372036854775808L);
      longArray0[5] = long5;
      char[] charArray0 = new char[2];
      char char0 = '8';
      charArray0[0] = char0;
      char char1 = '{';
      charArray0[1] = char1;
      char char2 = '&';
      charArray0[0] = char2;
      char char3 = '+';
      char char4 = 'L';
      charArray0[0] = char4;
      charArray0[1] = char3;
      charArray0[1] = char3;
      TLongCharHashMap tLongCharHashMap0 = new TLongCharHashMap((int) char1);
      long long6 = 0L;
      tLongCharHashMap0.adjustOrPutValue(long6, char2, char3);
      assertEquals("{0=+}", tLongCharHashMap0.toString());
      
      TLongCharHashMap tLongCharHashMap1 = new TLongCharHashMap(longArray0, charArray0);
      tLongCharHashMap1.containsValue(charArray0[0]);
      int int0 = 0;
      TLongCharHashMap tLongCharHashMap2 = new TLongCharHashMap(int0);
      tLongCharHashMap2.trimToSize();
      assertFalse(tLongCharHashMap2.equals(tLongCharHashMap1));
  }

  @Test
  public void test17()  throws Throwable  {
      TLongCharHashMap tLongCharHashMap0 = new TLongCharHashMap();
      float float0 = 1128.3667F;
      tLongCharHashMap0.setAutoCompactionFactor(float0);
      long long0 = (-1250L);
      tLongCharHashMap0.increment(long0);
      tLongCharHashMap0.keys();
      int int0 = 124;
      tLongCharHashMap0.ensureCapacity(int0);
      TLongCharProcedure tLongCharProcedure0 = null;
      boolean boolean0 = tLongCharHashMap0.retainEntries(tLongCharProcedure0);
      assertEquals(277, tLongCharHashMap0.capacity());
      assertEquals(false, boolean0);
  }
}
