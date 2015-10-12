/*
 * This file was automatically generated by EvoSuite
 */

package gnu.trove.impl.sync;

import org.junit.Test;
import static org.junit.Assert.*;
import gnu.trove.function.TObjectFunction;
import gnu.trove.impl.sync.TSynchronizedShortObjectMap;
import gnu.trove.impl.sync.TSynchronizedShortSet;
import gnu.trove.iterator.TShortObjectIterator;
import gnu.trove.map.TShortObjectMap;
import gnu.trove.map.hash.TShortObjectHashMap;
import gnu.trove.procedure.TObjectProcedure;
import gnu.trove.procedure.TShortObjectProcedure;
import gnu.trove.procedure.TShortProcedure;
import gnu.trove.procedure.array.ToObjectArrayProceedure;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;

public class TSynchronizedShortObjectMapEvoSuite_Branch {

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
   * 2 covered goals:
   * 1 gnu.trove.impl.sync.TSynchronizedShortObjectMap.keys()[S: root-Branch
   * 2 gnu.trove.impl.sync.TSynchronizedShortObjectMap.<init>(Lgnu/trove/map/TShortObjectMap;)V: I17 Branch 1 IFNONNULL L61 - true
   */

  @Test
  public void test0()  throws Throwable  {
      TShortObjectHashMap<Short> tShortObjectHashMap0 = new TShortObjectHashMap<Short>((-1), (float) (-1), (short)0);
      TSynchronizedShortObjectMap<Short> tSynchronizedShortObjectMap0 = new TSynchronizedShortObjectMap<Short>((TShortObjectMap<Short>) tShortObjectHashMap0);
      short[] shortArray0 = tSynchronizedShortObjectMap0.keys();
      assertNotNull(shortArray0);
  }

  //Test case number: 1
  /*
   * 1 covered goal:
   * 1 gnu.trove.impl.sync.TSynchronizedShortObjectMap.equals(Ljava/lang/Object;)Z: root-Branch
   */

  @Test
  public void test1()  throws Throwable  {
      TShortObjectHashMap<Short> tShortObjectHashMap0 = new TShortObjectHashMap<Short>((int) (short)18, (float) 13169984);
      TSynchronizedShortObjectMap<Short> tSynchronizedShortObjectMap0 = new TSynchronizedShortObjectMap<Short>((TShortObjectMap<Short>) tShortObjectHashMap0);
      boolean boolean0 = tSynchronizedShortObjectMap0.equals((Object) null);
      assertEquals(false, boolean0);
  }

  //Test case number: 2
  /*
   * 1 covered goal:
   * 1 gnu.trove.impl.sync.TSynchronizedShortObjectMap.get(S)Ljava/lang/Object;: root-Branch
   */

  @Test
  public void test2()  throws Throwable  {
      TShortObjectHashMap<Integer> tShortObjectHashMap0 = new TShortObjectHashMap<Integer>(18, (float) 18, (short) (-565));
      TSynchronizedShortObjectMap<Integer> tSynchronizedShortObjectMap0 = new TSynchronizedShortObjectMap<Integer>((TShortObjectMap<Integer>) tShortObjectHashMap0);
      tSynchronizedShortObjectMap0.get((short) (-565));
  }

  //Test case number: 3
  /*
   * 1 covered goal:
   * 1 gnu.trove.impl.sync.TSynchronizedShortObjectMap.transformValues(Lgnu/trove/function/TObjectFunction;)V: root-Branch
   */

  @Test
  public void test3()  throws Throwable  {
      TShortObjectHashMap<String> tShortObjectHashMap0 = new TShortObjectHashMap<String>(18, 18);
      TSynchronizedShortObjectMap<String> tSynchronizedShortObjectMap0 = new TSynchronizedShortObjectMap<String>((TShortObjectMap<String>) tShortObjectHashMap0);
      tSynchronizedShortObjectMap0.transformValues((TObjectFunction<String, String>) null);
      assertEquals(true, tSynchronizedShortObjectMap0.isEmpty());
  }

  //Test case number: 4
  /*
   * 1 covered goal:
   * 1 gnu.trove.impl.sync.TSynchronizedShortObjectMap.hashCode()I: root-Branch
   */

  @Test
  public void test4()  throws Throwable  {
      TShortObjectHashMap<Object> tShortObjectHashMap0 = new TShortObjectHashMap<Object>();
      TSynchronizedShortObjectMap<Object> tSynchronizedShortObjectMap0 = new TSynchronizedShortObjectMap<Object>((TShortObjectMap<Object>) tShortObjectHashMap0);
      int int0 = tSynchronizedShortObjectMap0.hashCode();
      assertEquals(0, int0);
  }

  //Test case number: 5
  /*
   * 1 covered goal:
   * 1 gnu.trove.impl.sync.TSynchronizedShortObjectMap.containsValue(Ljava/lang/Object;)Z: root-Branch
   */

  @Test
  public void test5()  throws Throwable  {
      TShortObjectHashMap<String> tShortObjectHashMap0 = new TShortObjectHashMap<String>(13169984, (float) 13169984, (short)18);
      TSynchronizedShortObjectMap<String> tSynchronizedShortObjectMap0 = new TSynchronizedShortObjectMap<String>((TShortObjectMap<String>) tShortObjectHashMap0);
      boolean boolean0 = tSynchronizedShortObjectMap0.containsValue((Object) null);
      assertEquals(false, boolean0);
  }

  //Test case number: 6
  /*
   * 1 covered goal:
   * 1 gnu.trove.impl.sync.TSynchronizedShortObjectMap.values([Ljava/lang/Object;)[Ljava/lang/Object;: root-Branch
   */

  @Test
  public void test6()  throws Throwable  {
      TShortObjectHashMap<Short> tShortObjectHashMap0 = new TShortObjectHashMap<Short>((-1), (float) (-1), (short)0);
      TSynchronizedShortObjectMap<Short> tSynchronizedShortObjectMap0 = new TSynchronizedShortObjectMap<Short>((TShortObjectMap<Short>) tShortObjectHashMap0);
      Short[] shortArray0 = new Short[3];
      Short[] shortArray1 = tSynchronizedShortObjectMap0.values(shortArray0);
      assertSame(shortArray1, shortArray0);
  }

  //Test case number: 7
  /*
   * 1 covered goal:
   * 1 gnu.trove.impl.sync.TSynchronizedShortObjectMap.isEmpty()Z: root-Branch
   */

  @Test
  public void test7()  throws Throwable  {
      TShortObjectHashMap<Integer> tShortObjectHashMap0 = new TShortObjectHashMap<Integer>((-1), (float) (short)0);
      TSynchronizedShortObjectMap<Integer> tSynchronizedShortObjectMap0 = new TSynchronizedShortObjectMap<Integer>((TShortObjectMap<Integer>) tShortObjectHashMap0);
      boolean boolean0 = tSynchronizedShortObjectMap0.isEmpty();
      assertEquals(true, boolean0);
  }

  //Test case number: 8
  /*
   * 2 covered goals:
   * 1 gnu.trove.impl.sync.TSynchronizedShortObjectMap.forEachKey(Lgnu/trove/procedure/TShortProcedure;)Z: root-Branch
   * 2 gnu.trove.impl.sync.TSynchronizedShortObjectMap.<init>(Lgnu/trove/map/TShortObjectMap;Ljava/lang/Object;)V: root-Branch
   */

  @Test
  public void test8()  throws Throwable  {
      TShortObjectHashMap<Object> tShortObjectHashMap0 = new TShortObjectHashMap<Object>((-1650), (float) (-1650), (short)4);
      TSynchronizedShortObjectMap<Object> tSynchronizedShortObjectMap0 = new TSynchronizedShortObjectMap<Object>((TShortObjectMap<Object>) tShortObjectHashMap0, (Object) "France");
      boolean boolean0 = tSynchronizedShortObjectMap0.forEachKey((TShortProcedure) null);
      assertEquals(true, boolean0);
  }

  //Test case number: 9
  /*
   * 1 covered goal:
   * 1 gnu.trove.impl.sync.TSynchronizedShortObjectMap.toString()Ljava/lang/String;: root-Branch
   */

  @Test
  public void test9()  throws Throwable  {
      TShortObjectHashMap<Integer> tShortObjectHashMap0 = new TShortObjectHashMap<Integer>(18, (float) 18, (short) (-565));
      TSynchronizedShortObjectMap<Integer> tSynchronizedShortObjectMap0 = new TSynchronizedShortObjectMap<Integer>((TShortObjectMap<Integer>) tShortObjectHashMap0);
      String string0 = tSynchronizedShortObjectMap0.toString();
      assertEquals("{}", string0);
  }

  //Test case number: 10
  /*
   * 1 covered goal:
   * 1 gnu.trove.impl.sync.TSynchronizedShortObjectMap.putIfAbsent(SLjava/lang/Object;)Ljava/lang/Object;: root-Branch
   */

  @Test
  public void test10()  throws Throwable  {
      TShortObjectHashMap<Object> tShortObjectHashMap0 = new TShortObjectHashMap<Object>((-711), (-711));
      TSynchronizedShortObjectMap<Object> tSynchronizedShortObjectMap0 = new TSynchronizedShortObjectMap<Object>((TShortObjectMap<Object>) tShortObjectHashMap0);
      tSynchronizedShortObjectMap0.putIfAbsent((short)1855, (Object) "LP'YU?`B/LP'YU?`B");
      assertEquals(1, tShortObjectHashMap0.size());
      assertEquals("{1855=LP'YU?`B/LP'YU?`B}", tSynchronizedShortObjectMap0.toString());
  }

  //Test case number: 11
  /*
   * 1 covered goal:
   * 1 gnu.trove.impl.sync.TSynchronizedShortObjectMap.clear()V: root-Branch
   */

  @Test
  public void test11()  throws Throwable  {
      TShortObjectHashMap<Object> tShortObjectHashMap0 = new TShortObjectHashMap<Object>();
      TSynchronizedShortObjectMap<Object> tSynchronizedShortObjectMap0 = new TSynchronizedShortObjectMap<Object>((TShortObjectMap<Object>) tShortObjectHashMap0);
      tSynchronizedShortObjectMap0.clear();
      assertEquals("{}", tSynchronizedShortObjectMap0.toString());
  }

  //Test case number: 12
  /*
   * 1 covered goal:
   * 1 gnu.trove.impl.sync.TSynchronizedShortObjectMap.forEachValue(Lgnu/trove/procedure/TObjectProcedure;)Z: root-Branch
   */

  @Test
  public void test12()  throws Throwable  {
      TShortObjectHashMap<Short> tShortObjectHashMap0 = new TShortObjectHashMap<Short>((-1), (float) (-1), (short)0);
      TSynchronizedShortObjectMap<Short> tSynchronizedShortObjectMap0 = new TSynchronizedShortObjectMap<Short>((TShortObjectMap<Short>) tShortObjectHashMap0);
      Short[] shortArray0 = new Short[3];
      ToObjectArrayProceedure<Short> toObjectArrayProceedure0 = new ToObjectArrayProceedure<Short>(shortArray0);
      boolean boolean0 = tSynchronizedShortObjectMap0.forEachValue((TObjectProcedure<? super Short>) toObjectArrayProceedure0);
      assertEquals(true, boolean0);
  }

  //Test case number: 13
  /*
   * 2 covered goals:
   * 1 gnu.trove.impl.sync.TSynchronizedShortObjectMap.put(SLjava/lang/Object;)Ljava/lang/Object;: root-Branch
   * 2 gnu.trove.impl.sync.TSynchronizedShortObjectMap.<init>(Lgnu/trove/map/TShortObjectMap;Ljava/lang/Object;)V: root-Branch
   */

  @Test
  public void test13()  throws Throwable  {
      TShortObjectHashMap<Integer> tShortObjectHashMap0 = new TShortObjectHashMap<Integer>();
      TSynchronizedShortObjectMap<Integer> tSynchronizedShortObjectMap0 = new TSynchronizedShortObjectMap<Integer>((TShortObjectMap<Integer>) tShortObjectHashMap0, (Object) "\u4E2D\u6587 (\u4E2D\u56FD)");
      tSynchronizedShortObjectMap0.put((short) (-3), (Integer) (-1755));
      assertEquals(false, tShortObjectHashMap0.isEmpty());
      assertEquals("{-3=-1755}", tShortObjectHashMap0.toString());
  }

  //Test case number: 14
  /*
   * 1 covered goal:
   * 1 gnu.trove.impl.sync.TSynchronizedShortObjectMap.values()[Ljava/lang/Object;: root-Branch
   */

//   @Test
//   public void test14()  throws Throwable  {
//       TShortObjectHashMap<String> tShortObjectHashMap0 = new TShortObjectHashMap<String>();
//       TSynchronizedShortObjectMap<String> tSynchronizedShortObjectMap0 = new TSynchronizedShortObjectMap<String>((TShortObjectMap<String>) tShortObjectHashMap0);
//       String[] stringArray0 = tSynchronizedShortObjectMap0.values();
//       assertNotNull(stringArray0);
//   }

  //Test case number: 15
  /*
   * 1 covered goal:
   * 1 gnu.trove.impl.sync.TSynchronizedShortObjectMap.retainEntries(Lgnu/trove/procedure/TShortObjectProcedure;)Z: root-Branch
   */

  @Test
  public void test15()  throws Throwable  {
      TShortObjectHashMap<Object> tShortObjectHashMap0 = new TShortObjectHashMap<Object>();
      TSynchronizedShortObjectMap<Object> tSynchronizedShortObjectMap0 = new TSynchronizedShortObjectMap<Object>((TShortObjectMap<Object>) tShortObjectHashMap0);
      boolean boolean0 = tSynchronizedShortObjectMap0.retainEntries((TShortObjectProcedure<? super Object>) null);
      assertEquals(false, boolean0);
  }

  //Test case number: 16
  /*
   * 4 covered goals:
   * 1 gnu.trove.impl.sync.TSynchronizedShortObjectMap.remove(S)Ljava/lang/Object;: root-Branch
   * 2 gnu.trove.impl.sync.TSynchronizedShortObjectMap.getNoEntryKey()S: root-Branch
   * 3 gnu.trove.impl.sync.TSynchronizedShortObjectMap.forEachEntry(Lgnu/trove/procedure/TShortObjectProcedure;)Z: root-Branch
   * 4 gnu.trove.impl.sync.TSynchronizedShortObjectMap.size()I: root-Branch
   */

//   @Test
//   public void test16()  throws Throwable  {
//       TShortObjectHashMap<String> tShortObjectHashMap0 = new TShortObjectHashMap<String>(13169984, (float) 13169984, (short)18);
//       TSynchronizedShortObjectMap<String> tSynchronizedShortObjectMap0 = new TSynchronizedShortObjectMap<String>((TShortObjectMap<String>) tShortObjectHashMap0);
//       TShortObjectHashMap<Object> tShortObjectHashMap1 = new TShortObjectHashMap<Object>((TShortObjectMap<?>) tSynchronizedShortObjectMap0);
//       TSynchronizedShortObjectMap<Object> tSynchronizedShortObjectMap1 = new TSynchronizedShortObjectMap<Object>((TShortObjectMap<Object>) tShortObjectHashMap1);
//       tSynchronizedShortObjectMap1.remove((short)18);
//       assertEquals(18, tSynchronizedShortObjectMap0.getNoEntryKey());
//       assertEquals(18, tShortObjectHashMap1.getNoEntryKey());
//   }

  //Test case number: 17
  /*
   * 1 covered goal:
   * 1 gnu.trove.impl.sync.TSynchronizedShortObjectMap.putAll(Lgnu/trove/map/TShortObjectMap;)V: root-Branch
   */

  @Test
  public void test17()  throws Throwable  {
      TShortObjectHashMap<Integer> tShortObjectHashMap0 = new TShortObjectHashMap<Integer>(18, (float) 18, (short) (-565));
      TSynchronizedShortObjectMap<Integer> tSynchronizedShortObjectMap0 = new TSynchronizedShortObjectMap<Integer>((TShortObjectMap<Integer>) tShortObjectHashMap0);
      tSynchronizedShortObjectMap0.putAll((TShortObjectMap<? extends Integer>) tShortObjectHashMap0);
      assertEquals("{}", tSynchronizedShortObjectMap0.toString());
  }

  //Test case number: 18
  /*
   * 1 covered goal:
   * 1 gnu.trove.impl.sync.TSynchronizedShortObjectMap.containsKey(S)Z: root-Branch
   */

  @Test
  public void test18()  throws Throwable  {
      TShortObjectHashMap<Object> tShortObjectHashMap0 = new TShortObjectHashMap<Object>();
      TSynchronizedShortObjectMap<Object> tSynchronizedShortObjectMap0 = new TSynchronizedShortObjectMap<Object>((TShortObjectMap<Object>) tShortObjectHashMap0);
      boolean boolean0 = tSynchronizedShortObjectMap0.containsKey((short)0);
      assertEquals(false, boolean0);
  }

  //Test case number: 19
  /*
   * 1 covered goal:
   * 1 gnu.trove.impl.sync.TSynchronizedShortObjectMap.iterator()Lgnu/trove/iterator/TShortObjectIterator;: root-Branch
   */

  @Test
  public void test19()  throws Throwable  {
      TShortObjectHashMap<Integer> tShortObjectHashMap0 = new TShortObjectHashMap<Integer>((-1), (float) (short)0);
      TSynchronizedShortObjectMap<Integer> tSynchronizedShortObjectMap0 = new TSynchronizedShortObjectMap<Integer>((TShortObjectMap<Integer>) tShortObjectHashMap0);
      TShortObjectIterator<Integer> tShortObjectIterator0 = tSynchronizedShortObjectMap0.iterator();
      assertEquals(false, tShortObjectIterator0.hasNext());
  }

  //Test case number: 20
  /*
   * 1 covered goal:
   * 1 gnu.trove.impl.sync.TSynchronizedShortObjectMap.keys([S)[S: root-Branch
   */

  @Test
  public void test20()  throws Throwable  {
      TShortObjectHashMap<Short> tShortObjectHashMap0 = new TShortObjectHashMap<Short>((-11), (-11));
      TSynchronizedShortObjectMap<Short> tSynchronizedShortObjectMap0 = new TSynchronizedShortObjectMap<Short>((TShortObjectMap<Short>) tShortObjectHashMap0);
      short[] shortArray0 = tSynchronizedShortObjectMap0.keys(tShortObjectHashMap0._set);
      assertNotNull(shortArray0);
  }

  //Test case number: 21
  /*
   * 1 covered goal:
   * 1 gnu.trove.impl.sync.TSynchronizedShortObjectMap.putAll(Ljava/util/Map;)V: root-Branch
   */

  @Test
  public void test21()  throws Throwable  {
      TShortObjectHashMap<Object> tShortObjectHashMap0 = new TShortObjectHashMap<Object>((-711), (-711));
      TSynchronizedShortObjectMap<Object> tSynchronizedShortObjectMap0 = new TSynchronizedShortObjectMap<Object>((TShortObjectMap<Object>) tShortObjectHashMap0);
      HashMap<Short, Integer> hashMap0 = new HashMap<Short, Integer>();
      tSynchronizedShortObjectMap0.putAll((Map<? extends Short, ?>) hashMap0);
      assertEquals(0, tSynchronizedShortObjectMap0.size());
  }

  //Test case number: 22
  /*
   * 1 covered goal:
   * 1 gnu.trove.impl.sync.TSynchronizedShortObjectMap.<init>(Lgnu/trove/map/TShortObjectMap;)V: I17 Branch 1 IFNONNULL L61 - false
   */

  @Test
  public void test22()  throws Throwable  {
      TSynchronizedShortObjectMap<Object> tSynchronizedShortObjectMap0 = null;
      try {
        tSynchronizedShortObjectMap0 = new TSynchronizedShortObjectMap<Object>((TShortObjectMap<Object>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  //Test case number: 23
  /*
   * 2 covered goals:
   * 1 gnu.trove.impl.sync.TSynchronizedShortObjectMap.keySet()Lgnu/trove/set/TShortSet;: I11 Branch 2 IFNONNULL L109 - true
   * 2 gnu.trove.impl.sync.TSynchronizedShortObjectMap.keySet()Lgnu/trove/set/TShortSet;: I11 Branch 2 IFNONNULL L109 - false
   */

  @Test
  public void test23()  throws Throwable  {
      TShortObjectHashMap<String> tShortObjectHashMap0 = new TShortObjectHashMap<String>(18, 18);
      TSynchronizedShortObjectMap<String> tSynchronizedShortObjectMap0 = new TSynchronizedShortObjectMap<String>((TShortObjectMap<String>) tShortObjectHashMap0);
      TSynchronizedShortSet tSynchronizedShortSet0 = (TSynchronizedShortSet)tSynchronizedShortObjectMap0.keySet();
      assertNotNull(tSynchronizedShortSet0);
      
      TSynchronizedShortSet tSynchronizedShortSet1 = (TSynchronizedShortSet)tSynchronizedShortObjectMap0.keySet();
      assertSame(tSynchronizedShortSet1, tSynchronizedShortSet0);
  }

  //Test case number: 24
  /*
   * 3 covered goals:
   * 1 gnu.trove.impl.sync.TSynchronizedShortObjectMap.valueCollection()Ljava/util/Collection;: I11 Branch 3 IFNONNULL L123 - true
   * 2 gnu.trove.impl.sync.TSynchronizedShortObjectMap.valueCollection()Ljava/util/Collection;: I11 Branch 3 IFNONNULL L123 - false
   * 3 gnu.trove.impl.sync.TSynchronizedShortObjectMap.<init>(Lgnu/trove/map/TShortObjectMap;)V: I17 Branch 1 IFNONNULL L61 - true
   */

  @Test
  public void test24()  throws Throwable  {
      TShortObjectHashMap<Object> tShortObjectHashMap0 = new TShortObjectHashMap<Object>();
      TSynchronizedShortObjectMap<Object> tSynchronizedShortObjectMap0 = new TSynchronizedShortObjectMap<Object>((TShortObjectMap<Object>) tShortObjectHashMap0);
      Collection<Object> collection0 = tSynchronizedShortObjectMap0.valueCollection();
      assertNotNull(collection0);
      
      Collection<Object> collection1 = tSynchronizedShortObjectMap0.valueCollection();
      assertSame(collection1, collection0);
  }
}
