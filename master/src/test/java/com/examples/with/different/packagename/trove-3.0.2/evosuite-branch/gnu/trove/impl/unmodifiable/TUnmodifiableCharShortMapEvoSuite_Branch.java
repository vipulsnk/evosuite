/*
 * This file was automatically generated by EvoSuite
 */

package gnu.trove.impl.unmodifiable;

import org.junit.Test;
import static org.junit.Assert.*;
import gnu.trove.function.TShortFunction;
import gnu.trove.impl.unmodifiable.TUnmodifiableCharSet;
import gnu.trove.impl.unmodifiable.TUnmodifiableCharShortMap;
import gnu.trove.impl.unmodifiable.TUnmodifiableShortCollection;
import gnu.trove.map.TCharShortMap;
import gnu.trove.map.hash.TCharShortHashMap;
import gnu.trove.procedure.TCharProcedure;
import gnu.trove.procedure.TCharShortProcedure;
import gnu.trove.procedure.TShortProcedure;
import java.util.HashMap;
import java.util.Map;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;

public class TUnmodifiableCharShortMapEvoSuite_Branch {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.utils.LoggingUtils.loadLogbackForEvoSuite(); 
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


  //Test case number: 0
  /*
   * 8 covered goals:
   * 1 gnu.trove.impl.unmodifiable.TUnmodifiableCharShortMap$1.advance()V: root-Branch
   * 2 gnu.trove.impl.unmodifiable.TUnmodifiableCharShortMap$1.key()C: root-Branch
   * 3 gnu.trove.impl.unmodifiable.TUnmodifiableCharShortMap$1.<init>(Lgnu/trove/impl/unmodifiable/TUnmodifiableCharShortMap;)V: root-Branch
   * 4 gnu.trove.impl.unmodifiable.TUnmodifiableCharShortMap$1.hasNext()Z: root-Branch
   * 5 gnu.trove.impl.unmodifiable.TUnmodifiableCharShortMap$1.value()S: root-Branch
   * 6 gnu.trove.impl.unmodifiable.TUnmodifiableCharShortMap.iterator()Lgnu/trove/iterator/TCharShortIterator;: root-Branch
   * 7 gnu.trove.impl.unmodifiable.TUnmodifiableCharShortMap.size()I: root-Branch
   * 8 gnu.trove.impl.unmodifiable.TUnmodifiableCharShortMap.<init>(Lgnu/trove/map/TCharShortMap;)V: I17 Branch 1 IFNONNULL L58 - true
   */

  @Test
  public void test0()  throws Throwable  {
      char[] charArray0 = new char[8];
      short[] shortArray0 = new short[2];
      TCharShortHashMap tCharShortHashMap0 = new TCharShortHashMap(charArray0, shortArray0);
      TUnmodifiableCharShortMap tUnmodifiableCharShortMap0 = new TUnmodifiableCharShortMap((TCharShortMap) tCharShortHashMap0);
      TCharShortHashMap tCharShortHashMap1 = new TCharShortHashMap((TCharShortMap) tUnmodifiableCharShortMap0);
      assertEquals(1, tUnmodifiableCharShortMap0.size());
  }

  //Test case number: 1
  /*
   * 1 covered goal:
   * 1 gnu.trove.impl.unmodifiable.TUnmodifiableCharShortMap.adjustValue(CS)Z: root-Branch
   */

  @Test
  public void test1()  throws Throwable  {
      TCharShortHashMap tCharShortHashMap0 = new TCharShortHashMap(0);
      TUnmodifiableCharShortMap tUnmodifiableCharShortMap0 = new TUnmodifiableCharShortMap((TCharShortMap) tCharShortHashMap0);
      // Undeclared exception!
      try {
        tUnmodifiableCharShortMap0.adjustValue('-', (short)185);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  //Test case number: 2
  /*
   * 1 covered goal:
   * 1 gnu.trove.impl.unmodifiable.TUnmodifiableCharShortMap.put(CS)S: root-Branch
   */

  @Test
  public void test2()  throws Throwable  {
      TCharShortHashMap tCharShortHashMap0 = new TCharShortHashMap((-1379));
      TUnmodifiableCharShortMap tUnmodifiableCharShortMap0 = new TUnmodifiableCharShortMap((TCharShortMap) tCharShortHashMap0);
      // Undeclared exception!
      try {
        tUnmodifiableCharShortMap0.put('|', (short)29707);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  //Test case number: 3
  /*
   * 1 covered goal:
   * 1 gnu.trove.impl.unmodifiable.TUnmodifiableCharShortMap.remove(C)S: root-Branch
   */

  @Test
  public void test3()  throws Throwable  {
      TCharShortHashMap tCharShortHashMap0 = new TCharShortHashMap(3, (float) 3, 'S', (short) (-1515));
      TUnmodifiableCharShortMap tUnmodifiableCharShortMap0 = new TUnmodifiableCharShortMap((TCharShortMap) tCharShortHashMap0);
      // Undeclared exception!
      try {
        tUnmodifiableCharShortMap0.remove('S');
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  //Test case number: 4
  /*
   * 1 covered goal:
   * 1 gnu.trove.impl.unmodifiable.TUnmodifiableCharShortMap.keys([C)[C: root-Branch
   */

  @Test
  public void test4()  throws Throwable  {
      TCharShortHashMap tCharShortHashMap0 = new TCharShortHashMap((-1379));
      TUnmodifiableCharShortMap tUnmodifiableCharShortMap0 = new TUnmodifiableCharShortMap((TCharShortMap) tCharShortHashMap0);
      char[] charArray0 = tUnmodifiableCharShortMap0.keys(tCharShortHashMap0._set);
      assertNotNull(charArray0);
  }

  //Test case number: 5
  /*
   * 1 covered goal:
   * 1 gnu.trove.impl.unmodifiable.TUnmodifiableCharShortMap.retainEntries(Lgnu/trove/procedure/TCharShortProcedure;)Z: root-Branch
   */

  @Test
  public void test5()  throws Throwable  {
      TCharShortHashMap tCharShortHashMap0 = new TCharShortHashMap(97);
      TUnmodifiableCharShortMap tUnmodifiableCharShortMap0 = new TUnmodifiableCharShortMap((TCharShortMap) tCharShortHashMap0);
      // Undeclared exception!
      try {
        tUnmodifiableCharShortMap0.retainEntries((TCharShortProcedure) null);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  //Test case number: 6
  /*
   * 1 covered goal:
   * 1 gnu.trove.impl.unmodifiable.TUnmodifiableCharShortMap.containsKey(C)Z: root-Branch
   */

  @Test
  public void test6()  throws Throwable  {
      TCharShortHashMap tCharShortHashMap0 = new TCharShortHashMap((-1379));
      TUnmodifiableCharShortMap tUnmodifiableCharShortMap0 = new TUnmodifiableCharShortMap((TCharShortMap) tCharShortHashMap0);
      boolean boolean0 = tUnmodifiableCharShortMap0.containsKey('|');
      assertEquals(false, boolean0);
  }

  //Test case number: 7
  /*
   * 1 covered goal:
   * 1 gnu.trove.impl.unmodifiable.TUnmodifiableCharShortMap.get(C)S: root-Branch
   */

  @Test
  public void test7()  throws Throwable  {
      TCharShortHashMap tCharShortHashMap0 = new TCharShortHashMap((-1379));
      TUnmodifiableCharShortMap tUnmodifiableCharShortMap0 = new TUnmodifiableCharShortMap((TCharShortMap) tCharShortHashMap0);
      short short0 = tUnmodifiableCharShortMap0.get('|');
      assertEquals((short)0, short0);
  }

  //Test case number: 8
  /*
   * 1 covered goal:
   * 1 gnu.trove.impl.unmodifiable.TUnmodifiableCharShortMap.increment(C)Z: root-Branch
   */

  @Test
  public void test8()  throws Throwable  {
      TCharShortHashMap tCharShortHashMap0 = new TCharShortHashMap();
      TUnmodifiableCharShortMap tUnmodifiableCharShortMap0 = new TUnmodifiableCharShortMap((TCharShortMap) tCharShortHashMap0);
      // Undeclared exception!
      try {
        tUnmodifiableCharShortMap0.increment(' ');
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  //Test case number: 9
  /*
   * 1 covered goal:
   * 1 gnu.trove.impl.unmodifiable.TUnmodifiableCharShortMap.containsValue(S)Z: root-Branch
   */

  @Test
  public void test9()  throws Throwable  {
      TCharShortHashMap tCharShortHashMap0 = new TCharShortHashMap();
      TUnmodifiableCharShortMap tUnmodifiableCharShortMap0 = new TUnmodifiableCharShortMap((TCharShortMap) tCharShortHashMap0);
      boolean boolean0 = tUnmodifiableCharShortMap0.containsValue((short) (-240));
      assertEquals(false, boolean0);
  }

  //Test case number: 10
  /*
   * 1 covered goal:
   * 1 gnu.trove.impl.unmodifiable.TUnmodifiableCharShortMap.forEachKey(Lgnu/trove/procedure/TCharProcedure;)Z: root-Branch
   */

  @Test
  public void test10()  throws Throwable  {
      TCharShortHashMap tCharShortHashMap0 = new TCharShortHashMap();
      TUnmodifiableCharShortMap tUnmodifiableCharShortMap0 = new TUnmodifiableCharShortMap((TCharShortMap) tCharShortHashMap0);
      boolean boolean0 = tUnmodifiableCharShortMap0.forEachKey((TCharProcedure) null);
      assertEquals(true, boolean0);
  }

  //Test case number: 11
  /*
   * 1 covered goal:
   * 1 gnu.trove.impl.unmodifiable.TUnmodifiableCharShortMap.transformValues(Lgnu/trove/function/TShortFunction;)V: root-Branch
   */

  @Test
  public void test11()  throws Throwable  {
      char[] charArray0 = new char[8];
      short[] shortArray0 = new short[2];
      TCharShortHashMap tCharShortHashMap0 = new TCharShortHashMap(charArray0, shortArray0);
      TUnmodifiableCharShortMap tUnmodifiableCharShortMap0 = new TUnmodifiableCharShortMap((TCharShortMap) tCharShortHashMap0);
      // Undeclared exception!
      try {
        tUnmodifiableCharShortMap0.transformValues((TShortFunction) null);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  //Test case number: 12
  /*
   * 1 covered goal:
   * 1 gnu.trove.impl.unmodifiable.TUnmodifiableCharShortMap.hashCode()I: root-Branch
   */

  @Test
  public void test12()  throws Throwable  {
      TCharShortHashMap tCharShortHashMap0 = new TCharShortHashMap();
      TUnmodifiableCharShortMap tUnmodifiableCharShortMap0 = new TUnmodifiableCharShortMap((TCharShortMap) tCharShortHashMap0);
      int int0 = tUnmodifiableCharShortMap0.hashCode();
      assertEquals(0, int0);
  }

  //Test case number: 13
  /*
   * 1 covered goal:
   * 1 gnu.trove.impl.unmodifiable.TUnmodifiableCharShortMap.forEachValue(Lgnu/trove/procedure/TShortProcedure;)Z: root-Branch
   */

  @Test
  public void test13()  throws Throwable  {
      TCharShortHashMap tCharShortHashMap0 = new TCharShortHashMap();
      TUnmodifiableCharShortMap tUnmodifiableCharShortMap0 = new TUnmodifiableCharShortMap((TCharShortMap) tCharShortHashMap0);
      boolean boolean0 = tUnmodifiableCharShortMap0.forEachValue((TShortProcedure) null);
      assertEquals(true, boolean0);
  }

  //Test case number: 14
  /*
   * 2 covered goals:
   * 1 gnu.trove.impl.unmodifiable.TUnmodifiableCharShortMap.values([S)[S: root-Branch
   * 2 gnu.trove.impl.unmodifiable.TUnmodifiableCharShortMap.values()[S: root-Branch
   */

  @Test
  public void test14()  throws Throwable  {
      TCharShortHashMap tCharShortHashMap0 = new TCharShortHashMap((-1379));
      TUnmodifiableCharShortMap tUnmodifiableCharShortMap0 = new TUnmodifiableCharShortMap((TCharShortMap) tCharShortHashMap0);
      short[] shortArray0 = tUnmodifiableCharShortMap0.values();
      short[] shortArray1 = tUnmodifiableCharShortMap0.values(shortArray0);
      assertSame(shortArray0, shortArray1);
  }

  //Test case number: 15
  /*
   * 1 covered goal:
   * 1 gnu.trove.impl.unmodifiable.TUnmodifiableCharShortMap.keys()[C: root-Branch
   */

  @Test
  public void test15()  throws Throwable  {
      TCharShortHashMap tCharShortHashMap0 = new TCharShortHashMap(3, (float) 3, 'S', (short) (-1515));
      TUnmodifiableCharShortMap tUnmodifiableCharShortMap0 = new TUnmodifiableCharShortMap((TCharShortMap) tCharShortHashMap0);
      char[] charArray0 = tUnmodifiableCharShortMap0.keys();
      assertNotNull(charArray0);
  }

  //Test case number: 16
  /*
   * 1 covered goal:
   * 1 gnu.trove.impl.unmodifiable.TUnmodifiableCharShortMap.getNoEntryKey()C: root-Branch
   */

  @Test
  public void test16()  throws Throwable  {
      char[] charArray0 = new char[8];
      short[] shortArray0 = new short[2];
      TCharShortHashMap tCharShortHashMap0 = new TCharShortHashMap(charArray0, shortArray0);
      TUnmodifiableCharShortMap tUnmodifiableCharShortMap0 = new TUnmodifiableCharShortMap((TCharShortMap) tCharShortHashMap0);
      char char0 = tUnmodifiableCharShortMap0.getNoEntryKey();
      assertEquals('\u0000', char0);
  }

  //Test case number: 17
  /*
   * 1 covered goal:
   * 1 gnu.trove.impl.unmodifiable.TUnmodifiableCharShortMap.toString()Ljava/lang/String;: root-Branch
   */

  @Test
  public void test17()  throws Throwable  {
      TCharShortHashMap tCharShortHashMap0 = new TCharShortHashMap();
      TUnmodifiableCharShortMap tUnmodifiableCharShortMap0 = new TUnmodifiableCharShortMap((TCharShortMap) tCharShortHashMap0);
      String string0 = tUnmodifiableCharShortMap0.toString();
      assertEquals("{}", string0);
  }

  //Test case number: 18
  /*
   * 1 covered goal:
   * 1 gnu.trove.impl.unmodifiable.TUnmodifiableCharShortMap.adjustOrPutValue(CSS)S: root-Branch
   */

  @Test
  public void test18()  throws Throwable  {
      TCharShortHashMap tCharShortHashMap0 = new TCharShortHashMap();
      TUnmodifiableCharShortMap tUnmodifiableCharShortMap0 = new TUnmodifiableCharShortMap((TCharShortMap) tCharShortHashMap0);
      // Undeclared exception!
      try {
        tUnmodifiableCharShortMap0.adjustOrPutValue('>', (short)1, (short)1);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  //Test case number: 19
  /*
   * 1 covered goal:
   * 1 gnu.trove.impl.unmodifiable.TUnmodifiableCharShortMap.putIfAbsent(CS)S: root-Branch
   */

  @Test
  public void test19()  throws Throwable  {
      TCharShortHashMap tCharShortHashMap0 = new TCharShortHashMap(835, 835);
      TUnmodifiableCharShortMap tUnmodifiableCharShortMap0 = new TUnmodifiableCharShortMap((TCharShortMap) tCharShortHashMap0);
      // Undeclared exception!
      try {
        tUnmodifiableCharShortMap0.putIfAbsent('h', (short)11);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  //Test case number: 20
  /*
   * 1 covered goal:
   * 1 gnu.trove.impl.unmodifiable.TUnmodifiableCharShortMap.clear()V: root-Branch
   */

  @Test
  public void test20()  throws Throwable  {
      TCharShortHashMap tCharShortHashMap0 = new TCharShortHashMap();
      TUnmodifiableCharShortMap tUnmodifiableCharShortMap0 = new TUnmodifiableCharShortMap((TCharShortMap) tCharShortHashMap0);
      // Undeclared exception!
      try {
        tUnmodifiableCharShortMap0.clear();
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  //Test case number: 21
  /*
   * 1 covered goal:
   * 1 gnu.trove.impl.unmodifiable.TUnmodifiableCharShortMap.isEmpty()Z: root-Branch
   */

  @Test
  public void test21()  throws Throwable  {
      TCharShortHashMap tCharShortHashMap0 = new TCharShortHashMap();
      TUnmodifiableCharShortMap tUnmodifiableCharShortMap0 = new TUnmodifiableCharShortMap((TCharShortMap) tCharShortHashMap0);
      boolean boolean0 = tUnmodifiableCharShortMap0.isEmpty();
      assertEquals(true, boolean0);
  }

  //Test case number: 22
  /*
   * 1 covered goal:
   * 1 gnu.trove.impl.unmodifiable.TUnmodifiableCharShortMap.putAll(Lgnu/trove/map/TCharShortMap;)V: root-Branch
   */

  @Test
  public void test22()  throws Throwable  {
      TCharShortHashMap tCharShortHashMap0 = new TCharShortHashMap();
      TUnmodifiableCharShortMap tUnmodifiableCharShortMap0 = new TUnmodifiableCharShortMap((TCharShortMap) tCharShortHashMap0);
      // Undeclared exception!
      try {
        tUnmodifiableCharShortMap0.putAll((TCharShortMap) tUnmodifiableCharShortMap0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  //Test case number: 23
  /*
   * 1 covered goal:
   * 1 gnu.trove.impl.unmodifiable.TUnmodifiableCharShortMap.putAll(Ljava/util/Map;)V: root-Branch
   */

  @Test
  public void test23()  throws Throwable  {
      HashMap<Character, Short> hashMap0 = new HashMap<Character, Short>();
      TCharShortHashMap tCharShortHashMap0 = new TCharShortHashMap();
      TUnmodifiableCharShortMap tUnmodifiableCharShortMap0 = new TUnmodifiableCharShortMap((TCharShortMap) tCharShortHashMap0);
      // Undeclared exception!
      try {
        tUnmodifiableCharShortMap0.putAll((Map<? extends Character, ? extends Short>) hashMap0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  //Test case number: 24
  /*
   * 1 covered goal:
   * 1 gnu.trove.impl.unmodifiable.TUnmodifiableCharShortMap.getNoEntryValue()S: root-Branch
   */

  @Test
  public void test24()  throws Throwable  {
      TCharShortHashMap tCharShortHashMap0 = new TCharShortHashMap();
      TUnmodifiableCharShortMap tUnmodifiableCharShortMap0 = new TUnmodifiableCharShortMap((TCharShortMap) tCharShortHashMap0);
      short short0 = tUnmodifiableCharShortMap0.getNoEntryValue();
      assertEquals((short)0, short0);
  }

  //Test case number: 25
  /*
   * 1 covered goal:
   * 1 gnu.trove.impl.unmodifiable.TUnmodifiableCharShortMap.forEachEntry(Lgnu/trove/procedure/TCharShortProcedure;)Z: root-Branch
   */

  @Test
  public void test25()  throws Throwable  {
      TCharShortHashMap tCharShortHashMap0 = new TCharShortHashMap(1956, (float) 1956, '4', (short)142);
      TUnmodifiableCharShortMap tUnmodifiableCharShortMap0 = new TUnmodifiableCharShortMap((TCharShortMap) tCharShortHashMap0);
      boolean boolean0 = tUnmodifiableCharShortMap0.forEachEntry((TCharShortProcedure) null);
      assertEquals(true, boolean0);
  }

  //Test case number: 26
  /*
   * 1 covered goal:
   * 1 gnu.trove.impl.unmodifiable.TUnmodifiableCharShortMap.<init>(Lgnu/trove/map/TCharShortMap;)V: I17 Branch 1 IFNONNULL L58 - false
   */

  @Test
  public void test26()  throws Throwable  {
      TUnmodifiableCharShortMap tUnmodifiableCharShortMap0 = null;
      try {
        tUnmodifiableCharShortMap0 = new TUnmodifiableCharShortMap((TCharShortMap) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  //Test case number: 27
  /*
   * 2 covered goals:
   * 1 gnu.trove.impl.unmodifiable.TUnmodifiableCharShortMap.keySet()Lgnu/trove/set/TCharSet;: I4 Branch 2 IFNONNULL L79 - true
   * 2 gnu.trove.impl.unmodifiable.TUnmodifiableCharShortMap.keySet()Lgnu/trove/set/TCharSet;: I4 Branch 2 IFNONNULL L79 - false
   */

  @Test
  public void test27()  throws Throwable  {
      TCharShortHashMap tCharShortHashMap0 = new TCharShortHashMap((-1379));
      TUnmodifiableCharShortMap tUnmodifiableCharShortMap0 = new TUnmodifiableCharShortMap((TCharShortMap) tCharShortHashMap0);
      TUnmodifiableCharSet tUnmodifiableCharSet0 = (TUnmodifiableCharSet)tUnmodifiableCharShortMap0.keySet();
      assertNotNull(tUnmodifiableCharSet0);
      
      TUnmodifiableCharSet tUnmodifiableCharSet1 = (TUnmodifiableCharSet)tUnmodifiableCharShortMap0.keySet();
      assertSame(tUnmodifiableCharSet1, tUnmodifiableCharSet0);
  }

  //Test case number: 28
  /*
   * 2 covered goals:
   * 1 gnu.trove.impl.unmodifiable.TUnmodifiableCharShortMap.valueCollection()Lgnu/trove/TShortCollection;: I4 Branch 3 IFNONNULL L87 - true
   * 2 gnu.trove.impl.unmodifiable.TUnmodifiableCharShortMap.valueCollection()Lgnu/trove/TShortCollection;: I4 Branch 3 IFNONNULL L87 - false
   */

  @Test
  public void test28()  throws Throwable  {
      TCharShortHashMap tCharShortHashMap0 = new TCharShortHashMap();
      TUnmodifiableCharShortMap tUnmodifiableCharShortMap0 = new TUnmodifiableCharShortMap((TCharShortMap) tCharShortHashMap0);
      TUnmodifiableShortCollection tUnmodifiableShortCollection0 = (TUnmodifiableShortCollection)tUnmodifiableCharShortMap0.valueCollection();
      assertNotNull(tUnmodifiableShortCollection0);
      
      TUnmodifiableShortCollection tUnmodifiableShortCollection1 = (TUnmodifiableShortCollection)tUnmodifiableCharShortMap0.valueCollection();
      assertSame(tUnmodifiableShortCollection1, tUnmodifiableShortCollection0);
  }

  //Test case number: 29
  /*
   * 3 covered goals:
   * 1 gnu.trove.impl.unmodifiable.TUnmodifiableCharShortMap.equals(Ljava/lang/Object;)Z: I4 Branch 4 IF_ACMPEQ L94 - false
   * 2 gnu.trove.impl.unmodifiable.TUnmodifiableCharShortMap.equals(Ljava/lang/Object;)Z: I9 Branch 5 IFEQ L94 - true
   * 3 gnu.trove.impl.unmodifiable.TUnmodifiableCharShortMap.<init>(Lgnu/trove/map/TCharShortMap;)V: I17 Branch 1 IFNONNULL L58 - true
   */

  @Test
  public void test29()  throws Throwable  {
      TCharShortHashMap tCharShortHashMap0 = new TCharShortHashMap(1490, 1490);
      TUnmodifiableCharShortMap tUnmodifiableCharShortMap0 = new TUnmodifiableCharShortMap((TCharShortMap) tCharShortHashMap0);
      boolean boolean0 = tUnmodifiableCharShortMap0.equals((Object) "");
      assertEquals(false, boolean0);
  }
}
