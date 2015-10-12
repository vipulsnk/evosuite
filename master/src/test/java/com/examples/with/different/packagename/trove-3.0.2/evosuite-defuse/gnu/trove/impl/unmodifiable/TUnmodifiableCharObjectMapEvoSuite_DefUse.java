/*
 * This file was automatically generated by EvoSuite
 */

package gnu.trove.impl.unmodifiable;

import org.junit.Test;
import static org.junit.Assert.*;
import gnu.trove.impl.unmodifiable.TUnmodifiableCharObjectMap;
import gnu.trove.impl.unmodifiable.TUnmodifiableCharSet;
import gnu.trove.map.TCharObjectMap;
import gnu.trove.map.hash.TCharObjectHashMap;
import gnu.trove.procedure.TCharProcedure;
import gnu.trove.procedure.TObjectProcedure;
import java.util.Collection;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;

public class TUnmodifiableCharObjectMapEvoSuite_DefUse {

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
   * 6 covered goals:
   * 1 INTRA_CLASS-Definition-Use-Pair
	Definition 4 for Field-Variable "gnu/trove/impl/unmodifiable/TUnmodifiableCharObjectMap.m" in <init>(Lgnu/trove/map/TCharObjectMap;)V.28 Branch 1t Line 55
	Use 41 for Field-Variable "gnu/trove/impl/unmodifiable/TUnmodifiableCharObjectMap.m" in isEmpty()Z.4 root-Branch Line 59
   * 2 INTRA_CLASS-Definition-Use-Pair
	Definition 4 for Field-Variable "gnu/trove/impl/unmodifiable/TUnmodifiableCharObjectMap.m" in <init>(Lgnu/trove/map/TCharObjectMap;)V.28 Branch 1t Line 55
	Use 9 for Field-Variable "gnu/trove/impl/unmodifiable/TUnmodifiableCharObjectMap.m" in isEmpty()Z.3 root-Branch Line 59
   * 3 gnu.trove.impl.unmodifiable.TUnmodifiableCharObjectMap.isEmpty()Z: root-Branch
   * 4 PARAMETER-Definition-Use-Pair
	Parameter-Definition 1 for method <init>(Lgnu/trove/map/TCharObjectMap;)V
	Use 7 for Parameter-Variable "<init>(Lgnu/trove/map/TCharObjectMap;)V_LV_1" in <init>(Lgnu/trove/map/TCharObjectMap;)V.27 Branch 1t Line 55
   * 5 PARAMETER-Definition-Use-Pair
	Parameter-Definition 1 for method <init>(Lgnu/trove/map/TCharObjectMap;)V
	Use 6 for Parameter-Variable "<init>(Lgnu/trove/map/TCharObjectMap;)V_LV_1" in <init>(Lgnu/trove/map/TCharObjectMap;)V.16 root-Branch Line 53
   * 6 gnu.trove.impl.unmodifiable.TUnmodifiableCharObjectMap.<init>(Lgnu/trove/map/TCharObjectMap;)V: I17 Branch 1 IFNONNULL L53 - true
   */

  @Test
  public void test0()  throws Throwable  {
      TCharObjectHashMap<Integer> tCharObjectHashMap0 = new TCharObjectHashMap<Integer>((-472), (-472));
      TUnmodifiableCharObjectMap<Integer> tUnmodifiableCharObjectMap0 = new TUnmodifiableCharObjectMap<Integer>((TCharObjectMap<Integer>) tCharObjectHashMap0);
      boolean boolean0 = tUnmodifiableCharObjectMap0.isEmpty();
      assertEquals(true, boolean0);
  }

  //Test case number: 1
  /*
   * 4 covered goals:
   * 1 INTRA_CLASS-Definition-Use-Pair
	Definition 4 for Field-Variable "gnu/trove/impl/unmodifiable/TUnmodifiableCharObjectMap.m" in <init>(Lgnu/trove/map/TCharObjectMap;)V.28 Branch 1t Line 55
	Use 10 for Field-Variable "gnu/trove/impl/unmodifiable/TUnmodifiableCharObjectMap.m" in containsKey(C)Z.3 root-Branch Line 60
   * 2 INTRA_CLASS-Definition-Use-Pair
	Definition 4 for Field-Variable "gnu/trove/impl/unmodifiable/TUnmodifiableCharObjectMap.m" in <init>(Lgnu/trove/map/TCharObjectMap;)V.28 Branch 1t Line 55
	Use 52 for Field-Variable "gnu/trove/impl/unmodifiable/TUnmodifiableCharObjectMap.m" in containsKey(C)Z.5 root-Branch Line 60
   * 3 PARAMETER-Definition-Use-Pair
	Parameter-Definition 1 for method containsKey(C)Z
	Use 11 for Parameter-Variable "containsKey(C)Z_LV_1" in containsKey(C)Z.4 root-Branch Line 60
   * 4 gnu.trove.impl.unmodifiable.TUnmodifiableCharObjectMap.containsKey(C)Z: root-Branch
   */

  @Test
  public void test1()  throws Throwable  {
      TCharObjectHashMap<Object> tCharObjectHashMap0 = new TCharObjectHashMap<Object>(710, (float) 710, 'S');
      TUnmodifiableCharObjectMap<Object> tUnmodifiableCharObjectMap0 = new TUnmodifiableCharObjectMap<Object>((TCharObjectMap<Object>) tCharObjectHashMap0);
      boolean boolean0 = tUnmodifiableCharObjectMap0.containsKey('S');
      assertEquals(false, boolean0);
  }

  //Test case number: 2
  /*
   * 4 covered goals:
   * 1 INTRA_CLASS-Definition-Use-Pair
	Definition 4 for Field-Variable "gnu/trove/impl/unmodifiable/TUnmodifiableCharObjectMap.m" in <init>(Lgnu/trove/map/TCharObjectMap;)V.28 Branch 1t Line 55
	Use 12 for Field-Variable "gnu/trove/impl/unmodifiable/TUnmodifiableCharObjectMap.m" in containsValue(Ljava/lang/Object;)Z.3 root-Branch Line 61
   * 2 INTRA_CLASS-Definition-Use-Pair
	Definition 4 for Field-Variable "gnu/trove/impl/unmodifiable/TUnmodifiableCharObjectMap.m" in <init>(Lgnu/trove/map/TCharObjectMap;)V.28 Branch 1t Line 55
	Use 47 for Field-Variable "gnu/trove/impl/unmodifiable/TUnmodifiableCharObjectMap.m" in containsValue(Ljava/lang/Object;)Z.5 root-Branch Line 61
   * 3 PARAMETER-Definition-Use-Pair
	Parameter-Definition 1 for method containsValue(Ljava/lang/Object;)Z
	Use 13 for Parameter-Variable "containsValue(Ljava/lang/Object;)Z_LV_1" in containsValue(Ljava/lang/Object;)Z.4 root-Branch Line 61
   * 4 gnu.trove.impl.unmodifiable.TUnmodifiableCharObjectMap.containsValue(Ljava/lang/Object;)Z: root-Branch
   */

  @Test
  public void test2()  throws Throwable  {
      TCharObjectHashMap<Object> tCharObjectHashMap0 = new TCharObjectHashMap<Object>();
      TUnmodifiableCharObjectMap<Object> tUnmodifiableCharObjectMap0 = new TUnmodifiableCharObjectMap<Object>((TCharObjectMap<Object>) tCharObjectHashMap0);
      boolean boolean0 = tUnmodifiableCharObjectMap0.containsValue((Object) null);
      assertEquals(false, boolean0);
  }

  //Test case number: 3
  /*
   * 4 covered goals:
   * 1 INTRA_CLASS-Definition-Use-Pair
	Definition 4 for Field-Variable "gnu/trove/impl/unmodifiable/TUnmodifiableCharObjectMap.m" in <init>(Lgnu/trove/map/TCharObjectMap;)V.28 Branch 1t Line 55
	Use 14 for Field-Variable "gnu/trove/impl/unmodifiable/TUnmodifiableCharObjectMap.m" in get(C)Ljava/lang/Object;.3 root-Branch Line 62
   * 2 INTRA_CLASS-Definition-Use-Pair
	Definition 4 for Field-Variable "gnu/trove/impl/unmodifiable/TUnmodifiableCharObjectMap.m" in <init>(Lgnu/trove/map/TCharObjectMap;)V.28 Branch 1t Line 55
	Use 40 for Field-Variable "gnu/trove/impl/unmodifiable/TUnmodifiableCharObjectMap.m" in get(C)Ljava/lang/Object;.5 root-Branch Line 62
   * 3 PARAMETER-Definition-Use-Pair
	Parameter-Definition 1 for method get(C)Ljava/lang/Object;
	Use 15 for Parameter-Variable "get(C)Ljava/lang/Object;_LV_1" in get(C)Ljava/lang/Object;.4 root-Branch Line 62
   * 4 gnu.trove.impl.unmodifiable.TUnmodifiableCharObjectMap.get(C)Ljava/lang/Object;: root-Branch
   */

  @Test
  public void test3()  throws Throwable  {
      TCharObjectHashMap<Object> tCharObjectHashMap0 = new TCharObjectHashMap<Object>(710, (float) 710, 'S');
      TUnmodifiableCharObjectMap<Object> tUnmodifiableCharObjectMap0 = new TUnmodifiableCharObjectMap<Object>((TCharObjectMap<Object>) tCharObjectHashMap0);
      Object object0 = tUnmodifiableCharObjectMap0.get('S');
      assertNull(object0);
  }

  //Test case number: 4
  /*
   * 3 covered goals:
   * 1 INTRA_CLASS-Definition-Use-Pair
	Definition 4 for Field-Variable "gnu/trove/impl/unmodifiable/TUnmodifiableCharObjectMap.m" in <init>(Lgnu/trove/map/TCharObjectMap;)V.28 Branch 1t Line 55
	Use 61 for Field-Variable "gnu/trove/impl/unmodifiable/TUnmodifiableCharObjectMap.m" in keys()[C.4 root-Branch Line 78
   * 2 INTRA_CLASS-Definition-Use-Pair
	Definition 4 for Field-Variable "gnu/trove/impl/unmodifiable/TUnmodifiableCharObjectMap.m" in <init>(Lgnu/trove/map/TCharObjectMap;)V.28 Branch 1t Line 55
	Use 19 for Field-Variable "gnu/trove/impl/unmodifiable/TUnmodifiableCharObjectMap.m" in keys()[C.3 root-Branch Line 78
   * 3 gnu.trove.impl.unmodifiable.TUnmodifiableCharObjectMap.keys()[C: root-Branch
   */

  @Test
  public void test4()  throws Throwable  {
      TCharObjectHashMap<String> tCharObjectHashMap0 = new TCharObjectHashMap<String>(710, (float) 'S');
      TUnmodifiableCharObjectMap<String> tUnmodifiableCharObjectMap0 = new TUnmodifiableCharObjectMap<String>((TCharObjectMap<String>) tCharObjectHashMap0);
      char[] charArray0 = tUnmodifiableCharObjectMap0.keys();
      assertNotNull(charArray0);
  }

  //Test case number: 5
  /*
   * 4 covered goals:
   * 1 INTRA_CLASS-Definition-Use-Pair
	Definition 4 for Field-Variable "gnu/trove/impl/unmodifiable/TUnmodifiableCharObjectMap.m" in <init>(Lgnu/trove/map/TCharObjectMap;)V.28 Branch 1t Line 55
	Use 20 for Field-Variable "gnu/trove/impl/unmodifiable/TUnmodifiableCharObjectMap.m" in keys([C)[C.3 root-Branch Line 79
   * 2 INTRA_CLASS-Definition-Use-Pair
	Definition 4 for Field-Variable "gnu/trove/impl/unmodifiable/TUnmodifiableCharObjectMap.m" in <init>(Lgnu/trove/map/TCharObjectMap;)V.28 Branch 1t Line 55
	Use 60 for Field-Variable "gnu/trove/impl/unmodifiable/TUnmodifiableCharObjectMap.m" in keys([C)[C.5 root-Branch Line 79
   * 3 PARAMETER-Definition-Use-Pair
	Parameter-Definition 1 for method keys([C)[C
	Use 21 for Parameter-Variable "keys([C)[C_LV_1" in keys([C)[C.4 root-Branch Line 79
   * 4 gnu.trove.impl.unmodifiable.TUnmodifiableCharObjectMap.keys([C)[C: root-Branch
   */

  @Test
  public void test5()  throws Throwable  {
      TCharObjectHashMap<Character> tCharObjectHashMap0 = new TCharObjectHashMap<Character>((int) 'S', (float) 'S', 'S');
      TUnmodifiableCharObjectMap<Character> tUnmodifiableCharObjectMap0 = new TUnmodifiableCharObjectMap<Character>((TCharObjectMap<Character>) tCharObjectHashMap0);
      TCharObjectHashMap<Object> tCharObjectHashMap1 = new TCharObjectHashMap<Object>(710, (float) 710, 'S');
      char[] charArray0 = tUnmodifiableCharObjectMap0.keys(tCharObjectHashMap1._set);
      assertNotNull(charArray0);
  }

  //Test case number: 6
  /*
   * 7 covered goals:
   * 1 INTRA_CLASS-Definition-Use-Pair
	Definition 4 for Field-Variable "gnu/trove/impl/unmodifiable/TUnmodifiableCharObjectMap.m" in <init>(Lgnu/trove/map/TCharObjectMap;)V.28 Branch 1t Line 55
	Use 26 for Field-Variable "gnu/trove/impl/unmodifiable/TUnmodifiableCharObjectMap.m" in values([Ljava/lang/Object;)[Ljava/lang/Object;.3 root-Branch Line 87
   * 2 INTRA_CLASS-Definition-Use-Pair
	Definition 4 for Field-Variable "gnu/trove/impl/unmodifiable/TUnmodifiableCharObjectMap.m" in <init>(Lgnu/trove/map/TCharObjectMap;)V.28 Branch 1t Line 55
	Use 58 for Field-Variable "gnu/trove/impl/unmodifiable/TUnmodifiableCharObjectMap.m" in values([Ljava/lang/Object;)[Ljava/lang/Object;.5 root-Branch Line 87
   * 3 PARAMETER-Definition-Use-Pair
	Parameter-Definition 1 for method values([Ljava/lang/Object;)[Ljava/lang/Object;
	Use 27 for Parameter-Variable "values([Ljava/lang/Object;)[Ljava/lang/Object;_LV_1" in values([Ljava/lang/Object;)[Ljava/lang/Object;.4 root-Branch Line 87
   * 4 gnu.trove.impl.unmodifiable.TUnmodifiableCharObjectMap.values([Ljava/lang/Object;)[Ljava/lang/Object;: root-Branch
   * 5 INTRA_CLASS-Definition-Use-Pair
	Definition 4 for Field-Variable "gnu/trove/impl/unmodifiable/TUnmodifiableCharObjectMap.m" in <init>(Lgnu/trove/map/TCharObjectMap;)V.28 Branch 1t Line 55
	Use 45 for Field-Variable "gnu/trove/impl/unmodifiable/TUnmodifiableCharObjectMap.m" in values()[Ljava/lang/Object;.4 root-Branch Line 86
   * 6 INTRA_CLASS-Definition-Use-Pair
	Definition 4 for Field-Variable "gnu/trove/impl/unmodifiable/TUnmodifiableCharObjectMap.m" in <init>(Lgnu/trove/map/TCharObjectMap;)V.28 Branch 1t Line 55
	Use 25 for Field-Variable "gnu/trove/impl/unmodifiable/TUnmodifiableCharObjectMap.m" in values()[Ljava/lang/Object;.3 root-Branch Line 86
   * 7 gnu.trove.impl.unmodifiable.TUnmodifiableCharObjectMap.values()[Ljava/lang/Object;: root-Branch
   */

//   @Test
//   public void test6()  throws Throwable  {
//       TCharObjectHashMap<Integer> tCharObjectHashMap0 = new TCharObjectHashMap<Integer>((-472), (-472));
//       TUnmodifiableCharObjectMap<Integer> tUnmodifiableCharObjectMap0 = new TUnmodifiableCharObjectMap<Integer>((TCharObjectMap<Integer>) tCharObjectHashMap0);
//       Integer[] integerArray0 = tUnmodifiableCharObjectMap0.values();
//       Integer[] integerArray1 = tUnmodifiableCharObjectMap0.values(integerArray0);
//       assertSame(integerArray1, integerArray0);
//   }

  //Test case number: 7
  /*
   * 6 covered goals:
   * 1 INTRA_CLASS-Definition-Use-Pair
	Definition 4 for Field-Variable "gnu/trove/impl/unmodifiable/TUnmodifiableCharObjectMap.m" in <init>(Lgnu/trove/map/TCharObjectMap;)V.28 Branch 1t Line 55
	Use 49 for Field-Variable "gnu/trove/impl/unmodifiable/TUnmodifiableCharObjectMap.m" in equals(Ljava/lang/Object;)Z.8 Branch 4f Line 89
   * 2 INTRA_CLASS-Definition-Use-Pair
	Definition 4 for Field-Variable "gnu/trove/impl/unmodifiable/TUnmodifiableCharObjectMap.m" in <init>(Lgnu/trove/map/TCharObjectMap;)V.28 Branch 1t Line 55
	Use 29 for Field-Variable "gnu/trove/impl/unmodifiable/TUnmodifiableCharObjectMap.m" in equals(Ljava/lang/Object;)Z.6 Branch 4f Line 89
   * 3 PARAMETER-Definition-Use-Pair
	Parameter-Definition 1 for method equals(Ljava/lang/Object;)Z
	Use 30 for Parameter-Variable "equals(Ljava/lang/Object;)Z_LV_1" in equals(Ljava/lang/Object;)Z.7 Branch 4f Line 89
   * 4 PARAMETER-Definition-Use-Pair
	Parameter-Definition 1 for method equals(Ljava/lang/Object;)Z
	Use 28 for Parameter-Variable "equals(Ljava/lang/Object;)Z_LV_1" in equals(Ljava/lang/Object;)Z.2 root-Branch Line 89
   * 5 gnu.trove.impl.unmodifiable.TUnmodifiableCharObjectMap.equals(Ljava/lang/Object;)Z: I4 Branch 4 IF_ACMPEQ L89 - false
   * 6 gnu.trove.impl.unmodifiable.TUnmodifiableCharObjectMap.equals(Ljava/lang/Object;)Z: I9 Branch 5 IFEQ L89 - true
   */

  @Test
  public void test7()  throws Throwable  {
      TCharObjectHashMap<Object> tCharObjectHashMap0 = new TCharObjectHashMap<Object>();
      TUnmodifiableCharObjectMap<Object> tUnmodifiableCharObjectMap0 = new TUnmodifiableCharObjectMap<Object>((TCharObjectMap<Object>) tCharObjectHashMap0);
      boolean boolean0 = tUnmodifiableCharObjectMap0.equals((Object) null);
      assertEquals(false, boolean0);
  }

  //Test case number: 8
  /*
   * 13 covered goals:
   * 1 INTRA_CLASS-Definition-Use-Pair
	Definition 4 for Field-Variable "gnu/trove/impl/unmodifiable/TUnmodifiableCharObjectMap.m" in <init>(Lgnu/trove/map/TCharObjectMap;)V.28 Branch 1t Line 55
	Use 31 for Field-Variable "gnu/trove/impl/unmodifiable/TUnmodifiableCharObjectMap.m" in hashCode()I.3 root-Branch Line 90
   * 2 INTRA_CLASS-Definition-Use-Pair
	Definition 4 for Field-Variable "gnu/trove/impl/unmodifiable/TUnmodifiableCharObjectMap.m" in <init>(Lgnu/trove/map/TCharObjectMap;)V.28 Branch 1t Line 55
	Use 55 for Field-Variable "gnu/trove/impl/unmodifiable/TUnmodifiableCharObjectMap.m" in hashCode()I.4 root-Branch Line 90
   * 3 gnu.trove.impl.unmodifiable.TUnmodifiableCharObjectMap.hashCode()I: root-Branch
   * 4 INTRA_CLASS-Definition-Use-Pair
	Definition 4 for Field-Variable "gnu/trove/impl/unmodifiable/TUnmodifiableCharObjectMap.m" in <init>(Lgnu/trove/map/TCharObjectMap;)V.28 Branch 1t Line 55
	Use 53 for Field-Variable "gnu/trove/impl/unmodifiable/TUnmodifiableCharObjectMap.m" in getNoEntryKey()C.4 root-Branch Line 92
   * 5 INTRA_CLASS-Definition-Use-Pair
	Definition 4 for Field-Variable "gnu/trove/impl/unmodifiable/TUnmodifiableCharObjectMap.m" in <init>(Lgnu/trove/map/TCharObjectMap;)V.28 Branch 1t Line 55
	Use 33 for Field-Variable "gnu/trove/impl/unmodifiable/TUnmodifiableCharObjectMap.m" in getNoEntryKey()C.3 root-Branch Line 92
   * 6 INTRA_CLASS-Definition-Use-Pair
	Definition 4 for Field-Variable "gnu/trove/impl/unmodifiable/TUnmodifiableCharObjectMap.m" in <init>(Lgnu/trove/map/TCharObjectMap;)V.28 Branch 1t Line 55
	Use 8 for Field-Variable "gnu/trove/impl/unmodifiable/TUnmodifiableCharObjectMap.m" in size()I.3 root-Branch Line 58
   * 7 INTRA_CLASS-Definition-Use-Pair
	Definition 4 for Field-Variable "gnu/trove/impl/unmodifiable/TUnmodifiableCharObjectMap.m" in <init>(Lgnu/trove/map/TCharObjectMap;)V.28 Branch 1t Line 55
	Use 57 for Field-Variable "gnu/trove/impl/unmodifiable/TUnmodifiableCharObjectMap.m" in forEachEntry(Lgnu/trove/procedure/TCharObjectProcedure;)Z.5 root-Branch Line 101
   * 8 INTRA_CLASS-Definition-Use-Pair
	Definition 4 for Field-Variable "gnu/trove/impl/unmodifiable/TUnmodifiableCharObjectMap.m" in <init>(Lgnu/trove/map/TCharObjectMap;)V.28 Branch 1t Line 55
	Use 38 for Field-Variable "gnu/trove/impl/unmodifiable/TUnmodifiableCharObjectMap.m" in forEachEntry(Lgnu/trove/procedure/TCharObjectProcedure;)Z.3 root-Branch Line 101
   * 9 INTRA_CLASS-Definition-Use-Pair
	Definition 4 for Field-Variable "gnu/trove/impl/unmodifiable/TUnmodifiableCharObjectMap.m" in <init>(Lgnu/trove/map/TCharObjectMap;)V.28 Branch 1t Line 55
	Use 42 for Field-Variable "gnu/trove/impl/unmodifiable/TUnmodifiableCharObjectMap.m" in size()I.4 root-Branch Line 58
   * 10 PARAMETER-Definition-Use-Pair
	Parameter-Definition 1 for method forEachEntry(Lgnu/trove/procedure/TCharObjectProcedure;)Z
	Use 39 for Parameter-Variable "forEachEntry(Lgnu/trove/procedure/TCharObjectProcedure;)Z_LV_1" in forEachEntry(Lgnu/trove/procedure/TCharObjectProcedure;)Z.4 root-Branch Line 101
   * 11 gnu.trove.impl.unmodifiable.TUnmodifiableCharObjectMap.getNoEntryKey()C: root-Branch
   * 12 gnu.trove.impl.unmodifiable.TUnmodifiableCharObjectMap.forEachEntry(Lgnu/trove/procedure/TCharObjectProcedure;)Z: root-Branch
   * 13 gnu.trove.impl.unmodifiable.TUnmodifiableCharObjectMap.size()I: root-Branch
   */

  @Test
  public void test8()  throws Throwable  {
      TCharObjectHashMap<Integer> tCharObjectHashMap0 = new TCharObjectHashMap<Integer>((-472), (-472));
      TUnmodifiableCharObjectMap<Integer> tUnmodifiableCharObjectMap0 = new TUnmodifiableCharObjectMap<Integer>((TCharObjectMap<Integer>) tCharObjectHashMap0);
      TCharObjectHashMap<Object> tCharObjectHashMap1 = new TCharObjectHashMap<Object>((TCharObjectMap<?>) tUnmodifiableCharObjectMap0);
      TUnmodifiableCharObjectMap<Object> tUnmodifiableCharObjectMap1 = new TUnmodifiableCharObjectMap<Object>((TCharObjectMap<Object>) tCharObjectHashMap1);
      int int0 = tUnmodifiableCharObjectMap1.hashCode();
      assertEquals(0, int0);
  }

  //Test case number: 9
  /*
   * 3 covered goals:
   * 1 INTRA_CLASS-Definition-Use-Pair
	Definition 4 for Field-Variable "gnu/trove/impl/unmodifiable/TUnmodifiableCharObjectMap.m" in <init>(Lgnu/trove/map/TCharObjectMap;)V.28 Branch 1t Line 55
	Use 32 for Field-Variable "gnu/trove/impl/unmodifiable/TUnmodifiableCharObjectMap.m" in toString()Ljava/lang/String;.3 root-Branch Line 91
   * 2 INTRA_CLASS-Definition-Use-Pair
	Definition 4 for Field-Variable "gnu/trove/impl/unmodifiable/TUnmodifiableCharObjectMap.m" in <init>(Lgnu/trove/map/TCharObjectMap;)V.28 Branch 1t Line 55
	Use 43 for Field-Variable "gnu/trove/impl/unmodifiable/TUnmodifiableCharObjectMap.m" in toString()Ljava/lang/String;.4 root-Branch Line 91
   * 3 gnu.trove.impl.unmodifiable.TUnmodifiableCharObjectMap.toString()Ljava/lang/String;: root-Branch
   */

  @Test
  public void test9()  throws Throwable  {
      TCharObjectHashMap<Object> tCharObjectHashMap0 = new TCharObjectHashMap<Object>();
      TUnmodifiableCharObjectMap<Object> tUnmodifiableCharObjectMap0 = new TUnmodifiableCharObjectMap<Object>((TCharObjectMap<Object>) tCharObjectHashMap0);
      String string0 = tUnmodifiableCharObjectMap0.toString();
      assertEquals("{}", string0);
  }

  //Test case number: 10
  /*
   * 4 covered goals:
   * 1 INTRA_CLASS-Definition-Use-Pair
	Definition 4 for Field-Variable "gnu/trove/impl/unmodifiable/TUnmodifiableCharObjectMap.m" in <init>(Lgnu/trove/map/TCharObjectMap;)V.28 Branch 1t Line 55
	Use 48 for Field-Variable "gnu/trove/impl/unmodifiable/TUnmodifiableCharObjectMap.m" in forEachKey(Lgnu/trove/procedure/TCharProcedure;)Z.5 root-Branch Line 95
   * 2 INTRA_CLASS-Definition-Use-Pair
	Definition 4 for Field-Variable "gnu/trove/impl/unmodifiable/TUnmodifiableCharObjectMap.m" in <init>(Lgnu/trove/map/TCharObjectMap;)V.28 Branch 1t Line 55
	Use 34 for Field-Variable "gnu/trove/impl/unmodifiable/TUnmodifiableCharObjectMap.m" in forEachKey(Lgnu/trove/procedure/TCharProcedure;)Z.3 root-Branch Line 95
   * 3 PARAMETER-Definition-Use-Pair
	Parameter-Definition 1 for method forEachKey(Lgnu/trove/procedure/TCharProcedure;)Z
	Use 35 for Parameter-Variable "forEachKey(Lgnu/trove/procedure/TCharProcedure;)Z_LV_1" in forEachKey(Lgnu/trove/procedure/TCharProcedure;)Z.4 root-Branch Line 95
   * 4 gnu.trove.impl.unmodifiable.TUnmodifiableCharObjectMap.forEachKey(Lgnu/trove/procedure/TCharProcedure;)Z: root-Branch
   */

  @Test
  public void test10()  throws Throwable  {
      TCharObjectHashMap<Integer> tCharObjectHashMap0 = new TCharObjectHashMap<Integer>((-472), (-472));
      TUnmodifiableCharObjectMap<Integer> tUnmodifiableCharObjectMap0 = new TUnmodifiableCharObjectMap<Integer>((TCharObjectMap<Integer>) tCharObjectHashMap0);
      boolean boolean0 = tUnmodifiableCharObjectMap0.forEachKey((TCharProcedure) null);
      assertEquals(true, boolean0);
  }

  //Test case number: 11
  /*
   * 4 covered goals:
   * 1 INTRA_CLASS-Definition-Use-Pair
	Definition 4 for Field-Variable "gnu/trove/impl/unmodifiable/TUnmodifiableCharObjectMap.m" in <init>(Lgnu/trove/map/TCharObjectMap;)V.28 Branch 1t Line 55
	Use 46 for Field-Variable "gnu/trove/impl/unmodifiable/TUnmodifiableCharObjectMap.m" in forEachValue(Lgnu/trove/procedure/TObjectProcedure;)Z.5 root-Branch Line 98
   * 2 INTRA_CLASS-Definition-Use-Pair
	Definition 4 for Field-Variable "gnu/trove/impl/unmodifiable/TUnmodifiableCharObjectMap.m" in <init>(Lgnu/trove/map/TCharObjectMap;)V.28 Branch 1t Line 55
	Use 36 for Field-Variable "gnu/trove/impl/unmodifiable/TUnmodifiableCharObjectMap.m" in forEachValue(Lgnu/trove/procedure/TObjectProcedure;)Z.3 root-Branch Line 98
   * 3 PARAMETER-Definition-Use-Pair
	Parameter-Definition 1 for method forEachValue(Lgnu/trove/procedure/TObjectProcedure;)Z
	Use 37 for Parameter-Variable "forEachValue(Lgnu/trove/procedure/TObjectProcedure;)Z_LV_1" in forEachValue(Lgnu/trove/procedure/TObjectProcedure;)Z.4 root-Branch Line 98
   * 4 gnu.trove.impl.unmodifiable.TUnmodifiableCharObjectMap.forEachValue(Lgnu/trove/procedure/TObjectProcedure;)Z: root-Branch
   */

  @Test
  public void test11()  throws Throwable  {
      TCharObjectHashMap<Object> tCharObjectHashMap0 = new TCharObjectHashMap<Object>(710, (float) 710, 'S');
      TUnmodifiableCharObjectMap<Object> tUnmodifiableCharObjectMap0 = new TUnmodifiableCharObjectMap<Object>((TCharObjectMap<Object>) tCharObjectHashMap0);
      boolean boolean0 = tUnmodifiableCharObjectMap0.forEachValue((TObjectProcedure<? super Object>) null);
      assertEquals(true, boolean0);
  }

  //Test case number: 12
  /*
   * 7 covered goals:
   * 1 INTRA_CLASS-Definition-Use-Pair
	Definition 5 for Field-Variable "gnu/trove/impl/unmodifiable/TUnmodifiableCharObjectMap.keySet" in keySet()Lgnu/trove/set/TCharSet;.12 Branch 2f Line 75
	Use 16 for Field-Variable "gnu/trove/impl/unmodifiable/TUnmodifiableCharObjectMap.keySet" in keySet()Lgnu/trove/set/TCharSet;.3 root-Branch Line 74
   * 2 gnu.trove.impl.unmodifiable.TUnmodifiableCharObjectMap.keySet()Lgnu/trove/set/TCharSet;: I4 Branch 2 IFNONNULL L74 - true
   * 3 INTRA_METHOD-Definition-Use-Pair
	Definition 5 for Field-Variable "gnu/trove/impl/unmodifiable/TUnmodifiableCharObjectMap.keySet" in keySet()Lgnu/trove/set/TCharSet;.12 Branch 2f Line 75
	Use 18 for Field-Variable "gnu/trove/impl/unmodifiable/TUnmodifiableCharObjectMap.keySet" in keySet()Lgnu/trove/set/TCharSet;.16 root-Branch Line 76
   * 4 INTRA_CLASS-Definition-Use-Pair
	Definition 4 for Field-Variable "gnu/trove/impl/unmodifiable/TUnmodifiableCharObjectMap.m" in <init>(Lgnu/trove/map/TCharObjectMap;)V.28 Branch 1t Line 55
	Use 17 for Field-Variable "gnu/trove/impl/unmodifiable/TUnmodifiableCharObjectMap.m" in keySet()Lgnu/trove/set/TCharSet;.9 Branch 2f Line 75
   * 5 INTRA_CLASS-Definition-Use-Pair
	Definition 2 for Field-Variable "gnu/trove/impl/unmodifiable/TUnmodifiableCharObjectMap.keySet" in <init>(Lgnu/trove/map/TCharObjectMap;)V.8 root-Branch Line 70
	Use 16 for Field-Variable "gnu/trove/impl/unmodifiable/TUnmodifiableCharObjectMap.keySet" in keySet()Lgnu/trove/set/TCharSet;.3 root-Branch Line 74
   * 6 INTRA_CLASS-Definition-Use-Pair
	Definition 4 for Field-Variable "gnu/trove/impl/unmodifiable/TUnmodifiableCharObjectMap.m" in <init>(Lgnu/trove/map/TCharObjectMap;)V.28 Branch 1t Line 55
	Use 59 for Field-Variable "gnu/trove/impl/unmodifiable/TUnmodifiableCharObjectMap.m" in keySet()Lgnu/trove/set/TCharSet;.10 Branch 2f Line 75
   * 7 gnu.trove.impl.unmodifiable.TUnmodifiableCharObjectMap.keySet()Lgnu/trove/set/TCharSet;: I4 Branch 2 IFNONNULL L74 - false
   */

  @Test
  public void test12()  throws Throwable  {
      TCharObjectHashMap<Character> tCharObjectHashMap0 = new TCharObjectHashMap<Character>((int) 'S', (float) 'S', 'S');
      TUnmodifiableCharObjectMap<Character> tUnmodifiableCharObjectMap0 = new TUnmodifiableCharObjectMap<Character>((TCharObjectMap<Character>) tCharObjectHashMap0);
      TUnmodifiableCharSet tUnmodifiableCharSet0 = (TUnmodifiableCharSet)tUnmodifiableCharObjectMap0.keySet();
      assertNotNull(tUnmodifiableCharSet0);
      
      TUnmodifiableCharSet tUnmodifiableCharSet1 = (TUnmodifiableCharSet)tUnmodifiableCharObjectMap0.keySet();
      assertSame(tUnmodifiableCharSet1, tUnmodifiableCharSet0);
  }

  //Test case number: 13
  /*
   * 9 covered goals:
   * 1 INTRA_CLASS-Definition-Use-Pair
	Definition 6 for Field-Variable "gnu/trove/impl/unmodifiable/TUnmodifiableCharObjectMap.values" in valueCollection()Ljava/util/Collection;.12 Branch 3f Line 83
	Use 22 for Field-Variable "gnu/trove/impl/unmodifiable/TUnmodifiableCharObjectMap.values" in valueCollection()Ljava/util/Collection;.3 root-Branch Line 82
   * 2 gnu.trove.impl.unmodifiable.TUnmodifiableCharObjectMap.valueCollection()Ljava/util/Collection;: I4 Branch 3 IFNONNULL L82 - true
   * 3 INTRA_CLASS-Definition-Use-Pair
	Definition 4 for Field-Variable "gnu/trove/impl/unmodifiable/TUnmodifiableCharObjectMap.m" in <init>(Lgnu/trove/map/TCharObjectMap;)V.28 Branch 1t Line 55
	Use 23 for Field-Variable "gnu/trove/impl/unmodifiable/TUnmodifiableCharObjectMap.m" in valueCollection()Ljava/util/Collection;.9 Branch 3f Line 83
   * 4 INTRA_CLASS-Definition-Use-Pair
	Definition 3 for Field-Variable "gnu/trove/impl/unmodifiable/TUnmodifiableCharObjectMap.values" in <init>(Lgnu/trove/map/TCharObjectMap;)V.13 root-Branch Line 71
	Use 22 for Field-Variable "gnu/trove/impl/unmodifiable/TUnmodifiableCharObjectMap.values" in valueCollection()Ljava/util/Collection;.3 root-Branch Line 82
   * 5 INTRA_METHOD-Definition-Use-Pair
	Definition 6 for Field-Variable "gnu/trove/impl/unmodifiable/TUnmodifiableCharObjectMap.values" in valueCollection()Ljava/util/Collection;.12 Branch 3f Line 83
	Use 24 for Field-Variable "gnu/trove/impl/unmodifiable/TUnmodifiableCharObjectMap.values" in valueCollection()Ljava/util/Collection;.16 root-Branch Line 84
   * 6 INTRA_CLASS-Definition-Use-Pair
	Definition 4 for Field-Variable "gnu/trove/impl/unmodifiable/TUnmodifiableCharObjectMap.m" in <init>(Lgnu/trove/map/TCharObjectMap;)V.28 Branch 1t Line 55
	Use 51 for Field-Variable "gnu/trove/impl/unmodifiable/TUnmodifiableCharObjectMap.m" in valueCollection()Ljava/util/Collection;.10 Branch 3f Line 83
   * 7 PARAMETER-Definition-Use-Pair
	Parameter-Definition 1 for method <init>(Lgnu/trove/map/TCharObjectMap;)V
	Use 7 for Parameter-Variable "<init>(Lgnu/trove/map/TCharObjectMap;)V_LV_1" in <init>(Lgnu/trove/map/TCharObjectMap;)V.27 Branch 1t Line 55
   * 8 PARAMETER-Definition-Use-Pair
	Parameter-Definition 1 for method <init>(Lgnu/trove/map/TCharObjectMap;)V
	Use 6 for Parameter-Variable "<init>(Lgnu/trove/map/TCharObjectMap;)V_LV_1" in <init>(Lgnu/trove/map/TCharObjectMap;)V.16 root-Branch Line 53
   * 9 gnu.trove.impl.unmodifiable.TUnmodifiableCharObjectMap.valueCollection()Ljava/util/Collection;: I4 Branch 3 IFNONNULL L82 - false
   */

  @Test
  public void test13()  throws Throwable  {
      TCharObjectHashMap<Integer> tCharObjectHashMap0 = new TCharObjectHashMap<Integer>((-472), (-472));
      TUnmodifiableCharObjectMap<Integer> tUnmodifiableCharObjectMap0 = new TUnmodifiableCharObjectMap<Integer>((TCharObjectMap<Integer>) tCharObjectHashMap0);
      Collection<Integer> collection0 = tUnmodifiableCharObjectMap0.valueCollection();
      assertNotNull(collection0);
      
      Collection<Integer> collection1 = tUnmodifiableCharObjectMap0.valueCollection();
      assertSame(collection1, collection0);
  }
}
