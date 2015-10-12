/*
 * This file was automatically generated by EvoSuite
 */

package gnu.trove.impl.unmodifiable;

import org.junit.Test;
import static org.junit.Assert.*;
import gnu.trove.impl.unmodifiable.TUnmodifiableByteCollection;
import gnu.trove.impl.unmodifiable.TUnmodifiableCharByteMap;
import gnu.trove.impl.unmodifiable.TUnmodifiableCharSet;
import gnu.trove.map.TCharByteMap;
import gnu.trove.map.hash.TCharByteHashMap;
import gnu.trove.procedure.TByteProcedure;
import gnu.trove.procedure.TCharByteProcedure;
import gnu.trove.procedure.TCharProcedure;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;

public class TUnmodifiableCharByteMapEvoSuite_WeakMutation {

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
   * 29 covered goals:
   * 1 Weak Mutation 9: gnu.trove.impl.unmodifiable.TUnmodifiableCharByteMap.size()I:63 - DeleteField: mLgnu/trove/map/TCharByteMap;
   * 2 Weak Mutation 10: gnu.trove.impl.unmodifiable.TUnmodifiableCharByteMap.size()I:63 - DeleteStatement: size()I
   * 3 Weak Mutation 0: gnu.trove.impl.unmodifiable.TUnmodifiableCharByteMap$1.key()C:114 - DeleteField: iterLgnu/trove/iterator/TCharByteIterator;
   * 4 Weak Mutation 1: gnu.trove.impl.unmodifiable.TUnmodifiableCharByteMap$1.key()C:114 - DeleteStatement: key()C
   * 5 Weak Mutation 2: gnu.trove.impl.unmodifiable.TUnmodifiableCharByteMap$1.value()B:115 - DeleteField: iterLgnu/trove/iterator/TCharByteIterator;
   * 6 Weak Mutation 3: gnu.trove.impl.unmodifiable.TUnmodifiableCharByteMap$1.value()B:115 - DeleteStatement: value()B
   * 7 Weak Mutation 4: gnu.trove.impl.unmodifiable.TUnmodifiableCharByteMap$1.advance()V:116 - DeleteField: iterLgnu/trove/iterator/TCharByteIterator;
   * 8 Weak Mutation 5: gnu.trove.impl.unmodifiable.TUnmodifiableCharByteMap$1.advance()V:116 - DeleteStatement: advance()V
   * 9 Weak Mutation 6: gnu.trove.impl.unmodifiable.TUnmodifiableCharByteMap$1.hasNext()Z:117 - DeleteField: iterLgnu/trove/iterator/TCharByteIterator;
   * 10 Weak Mutation 7: gnu.trove.impl.unmodifiable.TUnmodifiableCharByteMap$1.hasNext()Z:117 - DeleteStatement: hasNext()Z
   * 11 gnu.trove.impl.unmodifiable.TUnmodifiableCharByteMap.iterator()Lgnu/trove/iterator/TCharByteIterator;: root-Branch
   * 12 gnu.trove.impl.unmodifiable.TUnmodifiableCharByteMap.size()I: root-Branch
   * 13 gnu.trove.impl.unmodifiable.TUnmodifiableCharByteMap$1.key()C: root-Branch
   * 14 gnu.trove.impl.unmodifiable.TUnmodifiableCharByteMap$1.hasNext()Z: root-Branch
   * 15 gnu.trove.impl.unmodifiable.TUnmodifiableCharByteMap$1.<init>(Lgnu/trove/impl/unmodifiable/TUnmodifiableCharByteMap;)V: root-Branch
   * 16 gnu.trove.impl.unmodifiable.TUnmodifiableCharByteMap$1.value()B: root-Branch
   * 17 gnu.trove.impl.unmodifiable.TUnmodifiableCharByteMap$1.advance()V: root-Branch
   * 18 Weak Mutation 0: gnu.trove.impl.unmodifiable.TUnmodifiableCharByteMap$1.key()C:114 - DeleteField: iterLgnu/trove/iterator/TCharByteIterator;
   * 19 Weak Mutation 1: gnu.trove.impl.unmodifiable.TUnmodifiableCharByteMap$1.key()C:114 - DeleteStatement: key()C
   * 20 Weak Mutation 2: gnu.trove.impl.unmodifiable.TUnmodifiableCharByteMap$1.value()B:115 - DeleteField: iterLgnu/trove/iterator/TCharByteIterator;
   * 21 Weak Mutation 3: gnu.trove.impl.unmodifiable.TUnmodifiableCharByteMap$1.value()B:115 - DeleteStatement: value()B
   * 22 Weak Mutation 4: gnu.trove.impl.unmodifiable.TUnmodifiableCharByteMap$1.advance()V:116 - DeleteField: iterLgnu/trove/iterator/TCharByteIterator;
   * 23 Weak Mutation 5: gnu.trove.impl.unmodifiable.TUnmodifiableCharByteMap$1.advance()V:116 - DeleteStatement: advance()V
   * 24 Weak Mutation 6: gnu.trove.impl.unmodifiable.TUnmodifiableCharByteMap$1.hasNext()Z:117 - DeleteField: iterLgnu/trove/iterator/TCharByteIterator;
   * 25 Weak Mutation 7: gnu.trove.impl.unmodifiable.TUnmodifiableCharByteMap$1.hasNext()Z:117 - DeleteStatement: hasNext()Z
   * 26 Weak Mutation 8: gnu.trove.impl.unmodifiable.TUnmodifiableCharByteMap.<init>(Lgnu/trove/map/TCharByteMap;)V:58 - ReplaceComparisonOperator != null -> = null
   * 27 Weak Mutation 9: gnu.trove.impl.unmodifiable.TUnmodifiableCharByteMap.size()I:63 - DeleteField: mLgnu/trove/map/TCharByteMap;
   * 28 Weak Mutation 10: gnu.trove.impl.unmodifiable.TUnmodifiableCharByteMap.size()I:63 - DeleteStatement: size()I
   * 29 gnu.trove.impl.unmodifiable.TUnmodifiableCharByteMap.<init>(Lgnu/trove/map/TCharByteMap;)V: I17 Branch 1 IFNONNULL L58 - true
   */

  @Test
  public void test0()  throws Throwable  {
      char[] charArray0 = new char[6];
      byte[] byteArray0 = new byte[4];
      TCharByteHashMap tCharByteHashMap0 = new TCharByteHashMap(charArray0, byteArray0);
      TUnmodifiableCharByteMap tUnmodifiableCharByteMap0 = new TUnmodifiableCharByteMap((TCharByteMap) tCharByteHashMap0);
      TCharByteHashMap tCharByteHashMap1 = new TCharByteHashMap((TCharByteMap) tUnmodifiableCharByteMap0);
      assertEquals(1, tUnmodifiableCharByteMap0.size());
      assertEquals("{\u0000=0}", tCharByteHashMap1.toString());
  }

  //Test case number: 1
  /*
   * 5 covered goals:
   * 1 Weak Mutation 11: gnu.trove.impl.unmodifiable.TUnmodifiableCharByteMap.isEmpty()Z:64 - DeleteField: mLgnu/trove/map/TCharByteMap;
   * 2 Weak Mutation 12: gnu.trove.impl.unmodifiable.TUnmodifiableCharByteMap.isEmpty()Z:64 - DeleteStatement: isEmpty()Z
   * 3 gnu.trove.impl.unmodifiable.TUnmodifiableCharByteMap.isEmpty()Z: root-Branch
   * 4 Weak Mutation 11: gnu.trove.impl.unmodifiable.TUnmodifiableCharByteMap.isEmpty()Z:64 - DeleteField: mLgnu/trove/map/TCharByteMap;
   * 5 Weak Mutation 12: gnu.trove.impl.unmodifiable.TUnmodifiableCharByteMap.isEmpty()Z:64 - DeleteStatement: isEmpty()Z
   */

  @Test
  public void test1()  throws Throwable  {
      TCharByteHashMap tCharByteHashMap0 = new TCharByteHashMap((-51));
      TUnmodifiableCharByteMap tUnmodifiableCharByteMap0 = new TUnmodifiableCharByteMap((TCharByteMap) tCharByteHashMap0);
      boolean boolean0 = tUnmodifiableCharByteMap0.isEmpty();
      assertEquals(true, boolean0);
  }

  //Test case number: 2
  /*
   * 11 covered goals:
   * 1 Weak Mutation 13: gnu.trove.impl.unmodifiable.TUnmodifiableCharByteMap.containsKey(C)Z:65 - DeleteField: mLgnu/trove/map/TCharByteMap;
   * 2 Weak Mutation 14: gnu.trove.impl.unmodifiable.TUnmodifiableCharByteMap.containsKey(C)Z:65 - InsertUnaryOp Negation of key
   * 3 Weak Mutation 15: gnu.trove.impl.unmodifiable.TUnmodifiableCharByteMap.containsKey(C)Z:65 - InsertUnaryOp IINC 1 key
   * 4 Weak Mutation 17: gnu.trove.impl.unmodifiable.TUnmodifiableCharByteMap.containsKey(C)Z:65 - DeleteStatement: containsKey(C)Z
   * 5 Weak Mutation 16: gnu.trove.impl.unmodifiable.TUnmodifiableCharByteMap.containsKey(C)Z:65 - InsertUnaryOp IINC -1 key
   * 6 gnu.trove.impl.unmodifiable.TUnmodifiableCharByteMap.containsKey(C)Z: root-Branch
   * 7 Weak Mutation 13: gnu.trove.impl.unmodifiable.TUnmodifiableCharByteMap.containsKey(C)Z:65 - DeleteField: mLgnu/trove/map/TCharByteMap;
   * 8 Weak Mutation 14: gnu.trove.impl.unmodifiable.TUnmodifiableCharByteMap.containsKey(C)Z:65 - InsertUnaryOp Negation of key
   * 9 Weak Mutation 15: gnu.trove.impl.unmodifiable.TUnmodifiableCharByteMap.containsKey(C)Z:65 - InsertUnaryOp IINC 1 key
   * 10 Weak Mutation 17: gnu.trove.impl.unmodifiable.TUnmodifiableCharByteMap.containsKey(C)Z:65 - DeleteStatement: containsKey(C)Z
   * 11 Weak Mutation 16: gnu.trove.impl.unmodifiable.TUnmodifiableCharByteMap.containsKey(C)Z:65 - InsertUnaryOp IINC -1 key
   */

  @Test
  public void test2()  throws Throwable  {
      TCharByteHashMap tCharByteHashMap0 = new TCharByteHashMap();
      TUnmodifiableCharByteMap tUnmodifiableCharByteMap0 = new TUnmodifiableCharByteMap((TCharByteMap) tCharByteHashMap0);
      boolean boolean0 = tUnmodifiableCharByteMap0.containsKey('V');
      assertEquals(false, boolean0);
  }

  //Test case number: 3
  /*
   * 11 covered goals:
   * 1 Weak Mutation 19: gnu.trove.impl.unmodifiable.TUnmodifiableCharByteMap.containsValue(B)Z:66 - InsertUnaryOp Negation of val
   * 2 Weak Mutation 18: gnu.trove.impl.unmodifiable.TUnmodifiableCharByteMap.containsValue(B)Z:66 - DeleteField: mLgnu/trove/map/TCharByteMap;
   * 3 Weak Mutation 21: gnu.trove.impl.unmodifiable.TUnmodifiableCharByteMap.containsValue(B)Z:66 - InsertUnaryOp IINC -1 val
   * 4 Weak Mutation 20: gnu.trove.impl.unmodifiable.TUnmodifiableCharByteMap.containsValue(B)Z:66 - InsertUnaryOp IINC 1 val
   * 5 Weak Mutation 22: gnu.trove.impl.unmodifiable.TUnmodifiableCharByteMap.containsValue(B)Z:66 - DeleteStatement: containsValue(B)Z
   * 6 gnu.trove.impl.unmodifiable.TUnmodifiableCharByteMap.containsValue(B)Z: root-Branch
   * 7 Weak Mutation 19: gnu.trove.impl.unmodifiable.TUnmodifiableCharByteMap.containsValue(B)Z:66 - InsertUnaryOp Negation of val
   * 8 Weak Mutation 18: gnu.trove.impl.unmodifiable.TUnmodifiableCharByteMap.containsValue(B)Z:66 - DeleteField: mLgnu/trove/map/TCharByteMap;
   * 9 Weak Mutation 21: gnu.trove.impl.unmodifiable.TUnmodifiableCharByteMap.containsValue(B)Z:66 - InsertUnaryOp IINC -1 val
   * 10 Weak Mutation 20: gnu.trove.impl.unmodifiable.TUnmodifiableCharByteMap.containsValue(B)Z:66 - InsertUnaryOp IINC 1 val
   * 11 Weak Mutation 22: gnu.trove.impl.unmodifiable.TUnmodifiableCharByteMap.containsValue(B)Z:66 - DeleteStatement: containsValue(B)Z
   */

  @Test
  public void test3()  throws Throwable  {
      TCharByteHashMap tCharByteHashMap0 = new TCharByteHashMap();
      TUnmodifiableCharByteMap tUnmodifiableCharByteMap0 = new TUnmodifiableCharByteMap((TCharByteMap) tCharByteHashMap0);
      boolean boolean0 = tUnmodifiableCharByteMap0.containsValue((byte) (-21));
      assertEquals(false, boolean0);
  }

  //Test case number: 4
  /*
   * 11 covered goals:
   * 1 Weak Mutation 23: gnu.trove.impl.unmodifiable.TUnmodifiableCharByteMap.get(C)B:67 - DeleteField: mLgnu/trove/map/TCharByteMap;
   * 2 Weak Mutation 25: gnu.trove.impl.unmodifiable.TUnmodifiableCharByteMap.get(C)B:67 - InsertUnaryOp IINC 1 key
   * 3 Weak Mutation 24: gnu.trove.impl.unmodifiable.TUnmodifiableCharByteMap.get(C)B:67 - InsertUnaryOp Negation of key
   * 4 Weak Mutation 27: gnu.trove.impl.unmodifiable.TUnmodifiableCharByteMap.get(C)B:67 - DeleteStatement: get(C)B
   * 5 Weak Mutation 26: gnu.trove.impl.unmodifiable.TUnmodifiableCharByteMap.get(C)B:67 - InsertUnaryOp IINC -1 key
   * 6 gnu.trove.impl.unmodifiable.TUnmodifiableCharByteMap.get(C)B: root-Branch
   * 7 Weak Mutation 23: gnu.trove.impl.unmodifiable.TUnmodifiableCharByteMap.get(C)B:67 - DeleteField: mLgnu/trove/map/TCharByteMap;
   * 8 Weak Mutation 25: gnu.trove.impl.unmodifiable.TUnmodifiableCharByteMap.get(C)B:67 - InsertUnaryOp IINC 1 key
   * 9 Weak Mutation 24: gnu.trove.impl.unmodifiable.TUnmodifiableCharByteMap.get(C)B:67 - InsertUnaryOp Negation of key
   * 10 Weak Mutation 27: gnu.trove.impl.unmodifiable.TUnmodifiableCharByteMap.get(C)B:67 - DeleteStatement: get(C)B
   * 11 Weak Mutation 26: gnu.trove.impl.unmodifiable.TUnmodifiableCharByteMap.get(C)B:67 - InsertUnaryOp IINC -1 key
   */

  @Test
  public void test4()  throws Throwable  {
      TCharByteHashMap tCharByteHashMap0 = new TCharByteHashMap((-12), (float) (-12), '%', (byte)0);
      TUnmodifiableCharByteMap tUnmodifiableCharByteMap0 = new TUnmodifiableCharByteMap((TCharByteMap) tCharByteHashMap0);
      byte byte0 = tUnmodifiableCharByteMap0.get('%');
      assertEquals((byte)0, byte0);
  }

  //Test case number: 5
  /*
   * 14 covered goals:
   * 1 Weak Mutation 28: gnu.trove.impl.unmodifiable.TUnmodifiableCharByteMap.keySet()Lgnu/trove/set/TCharSet;:79 - DeleteField: keySetLgnu/trove/set/TCharSet;
   * 2 gnu.trove.impl.unmodifiable.TUnmodifiableCharByteMap.keySet()Lgnu/trove/set/TCharSet;: I4 Branch 2 IFNONNULL L79 - true
   * 3 Weak Mutation 29: gnu.trove.impl.unmodifiable.TUnmodifiableCharByteMap.keySet()Lgnu/trove/set/TCharSet;:79 - ReplaceComparisonOperator != null -> = null
   * 4 Weak Mutation 31: gnu.trove.impl.unmodifiable.TUnmodifiableCharByteMap.keySet()Lgnu/trove/set/TCharSet;:80 - DeleteStatement: keySet()Lgnu/trove/set/TCharSet;
   * 5 Weak Mutation 30: gnu.trove.impl.unmodifiable.TUnmodifiableCharByteMap.keySet()Lgnu/trove/set/TCharSet;:80 - DeleteField: mLgnu/trove/map/TCharByteMap;
   * 6 Weak Mutation 32: gnu.trove.impl.unmodifiable.TUnmodifiableCharByteMap.keySet()Lgnu/trove/set/TCharSet;:80 - DeleteStatement: unmodifiableSet(Lgnu/trove/set/TCharSet;)Lgnu/trove/set/TCharSet;
   * 7 Weak Mutation 33: gnu.trove.impl.unmodifiable.TUnmodifiableCharByteMap.keySet()Lgnu/trove/set/TCharSet;:81 - DeleteField: keySetLgnu/trove/set/TCharSet;
   * 8 Weak Mutation 29: gnu.trove.impl.unmodifiable.TUnmodifiableCharByteMap.keySet()Lgnu/trove/set/TCharSet;:79 - ReplaceComparisonOperator != null -> = null
   * 9 Weak Mutation 28: gnu.trove.impl.unmodifiable.TUnmodifiableCharByteMap.keySet()Lgnu/trove/set/TCharSet;:79 - DeleteField: keySetLgnu/trove/set/TCharSet;
   * 10 Weak Mutation 31: gnu.trove.impl.unmodifiable.TUnmodifiableCharByteMap.keySet()Lgnu/trove/set/TCharSet;:80 - DeleteStatement: keySet()Lgnu/trove/set/TCharSet;
   * 11 Weak Mutation 30: gnu.trove.impl.unmodifiable.TUnmodifiableCharByteMap.keySet()Lgnu/trove/set/TCharSet;:80 - DeleteField: mLgnu/trove/map/TCharByteMap;
   * 12 Weak Mutation 32: gnu.trove.impl.unmodifiable.TUnmodifiableCharByteMap.keySet()Lgnu/trove/set/TCharSet;:80 - DeleteStatement: unmodifiableSet(Lgnu/trove/set/TCharSet;)Lgnu/trove/set/TCharSet;
   * 13 Weak Mutation 33: gnu.trove.impl.unmodifiable.TUnmodifiableCharByteMap.keySet()Lgnu/trove/set/TCharSet;:81 - DeleteField: keySetLgnu/trove/set/TCharSet;
   * 14 gnu.trove.impl.unmodifiable.TUnmodifiableCharByteMap.keySet()Lgnu/trove/set/TCharSet;: I4 Branch 2 IFNONNULL L79 - false
   */

  @Test
  public void test5()  throws Throwable  {
      TCharByteHashMap tCharByteHashMap0 = new TCharByteHashMap();
      TUnmodifiableCharByteMap tUnmodifiableCharByteMap0 = new TUnmodifiableCharByteMap((TCharByteMap) tCharByteHashMap0);
      TUnmodifiableCharSet tUnmodifiableCharSet0 = (TUnmodifiableCharSet)tUnmodifiableCharByteMap0.keySet();
      assertNotNull(tUnmodifiableCharSet0);
      
      TUnmodifiableCharSet tUnmodifiableCharSet1 = (TUnmodifiableCharSet)tUnmodifiableCharByteMap0.keySet();
      assertSame(tUnmodifiableCharSet1, tUnmodifiableCharSet0);
  }

  //Test case number: 6
  /*
   * 5 covered goals:
   * 1 Weak Mutation 34: gnu.trove.impl.unmodifiable.TUnmodifiableCharByteMap.keys()[C:83 - DeleteField: mLgnu/trove/map/TCharByteMap;
   * 2 Weak Mutation 35: gnu.trove.impl.unmodifiable.TUnmodifiableCharByteMap.keys()[C:83 - DeleteStatement: keys()[C
   * 3 gnu.trove.impl.unmodifiable.TUnmodifiableCharByteMap.keys()[C: root-Branch
   * 4 Weak Mutation 34: gnu.trove.impl.unmodifiable.TUnmodifiableCharByteMap.keys()[C:83 - DeleteField: mLgnu/trove/map/TCharByteMap;
   * 5 Weak Mutation 35: gnu.trove.impl.unmodifiable.TUnmodifiableCharByteMap.keys()[C:83 - DeleteStatement: keys()[C
   */

  @Test
  public void test6()  throws Throwable  {
      TCharByteHashMap tCharByteHashMap0 = new TCharByteHashMap(12, 12);
      TUnmodifiableCharByteMap tUnmodifiableCharByteMap0 = new TUnmodifiableCharByteMap((TCharByteMap) tCharByteHashMap0);
      char[] charArray0 = tUnmodifiableCharByteMap0.keys();
      assertNotNull(charArray0);
  }

  //Test case number: 7
  /*
   * 5 covered goals:
   * 1 Weak Mutation 36: gnu.trove.impl.unmodifiable.TUnmodifiableCharByteMap.keys([C)[C:84 - DeleteField: mLgnu/trove/map/TCharByteMap;
   * 2 Weak Mutation 37: gnu.trove.impl.unmodifiable.TUnmodifiableCharByteMap.keys([C)[C:84 - DeleteStatement: keys([C)[C
   * 3 gnu.trove.impl.unmodifiable.TUnmodifiableCharByteMap.keys([C)[C: root-Branch
   * 4 Weak Mutation 36: gnu.trove.impl.unmodifiable.TUnmodifiableCharByteMap.keys([C)[C:84 - DeleteField: mLgnu/trove/map/TCharByteMap;
   * 5 Weak Mutation 37: gnu.trove.impl.unmodifiable.TUnmodifiableCharByteMap.keys([C)[C:84 - DeleteStatement: keys([C)[C
   */

  @Test
  public void test7()  throws Throwable  {
      TCharByteHashMap tCharByteHashMap0 = new TCharByteHashMap((-10), (-10));
      TUnmodifiableCharByteMap tUnmodifiableCharByteMap0 = new TUnmodifiableCharByteMap((TCharByteMap) tCharByteHashMap0);
      char[] charArray0 = tUnmodifiableCharByteMap0.keys(tCharByteHashMap0._set);
      assertNotNull(charArray0);
  }

  //Test case number: 8
  /*
   * 14 covered goals:
   * 1 Weak Mutation 38: gnu.trove.impl.unmodifiable.TUnmodifiableCharByteMap.valueCollection()Lgnu/trove/TByteCollection;:87 - DeleteField: valuesLgnu/trove/TByteCollection;
   * 2 Weak Mutation 39: gnu.trove.impl.unmodifiable.TUnmodifiableCharByteMap.valueCollection()Lgnu/trove/TByteCollection;:87 - ReplaceComparisonOperator != null -> = null
   * 3 Weak Mutation 42: gnu.trove.impl.unmodifiable.TUnmodifiableCharByteMap.valueCollection()Lgnu/trove/TByteCollection;:88 - DeleteStatement: unmodifiableCollection(Lgnu/trove/TByteCollection;)Lgnu/trove/TByteCollection;
   * 4 Weak Mutation 40: gnu.trove.impl.unmodifiable.TUnmodifiableCharByteMap.valueCollection()Lgnu/trove/TByteCollection;:88 - DeleteField: mLgnu/trove/map/TCharByteMap;
   * 5 Weak Mutation 41: gnu.trove.impl.unmodifiable.TUnmodifiableCharByteMap.valueCollection()Lgnu/trove/TByteCollection;:88 - DeleteStatement: valueCollection()Lgnu/trove/TByteCollection;
   * 6 Weak Mutation 43: gnu.trove.impl.unmodifiable.TUnmodifiableCharByteMap.valueCollection()Lgnu/trove/TByteCollection;:89 - DeleteField: valuesLgnu/trove/TByteCollection;
   * 7 gnu.trove.impl.unmodifiable.TUnmodifiableCharByteMap.valueCollection()Lgnu/trove/TByteCollection;: I4 Branch 3 IFNONNULL L87 - true
   * 8 gnu.trove.impl.unmodifiable.TUnmodifiableCharByteMap.valueCollection()Lgnu/trove/TByteCollection;: I4 Branch 3 IFNONNULL L87 - false
   * 9 Weak Mutation 38: gnu.trove.impl.unmodifiable.TUnmodifiableCharByteMap.valueCollection()Lgnu/trove/TByteCollection;:87 - DeleteField: valuesLgnu/trove/TByteCollection;
   * 10 Weak Mutation 39: gnu.trove.impl.unmodifiable.TUnmodifiableCharByteMap.valueCollection()Lgnu/trove/TByteCollection;:87 - ReplaceComparisonOperator != null -> = null
   * 11 Weak Mutation 42: gnu.trove.impl.unmodifiable.TUnmodifiableCharByteMap.valueCollection()Lgnu/trove/TByteCollection;:88 - DeleteStatement: unmodifiableCollection(Lgnu/trove/TByteCollection;)Lgnu/trove/TByteCollection;
   * 12 Weak Mutation 43: gnu.trove.impl.unmodifiable.TUnmodifiableCharByteMap.valueCollection()Lgnu/trove/TByteCollection;:89 - DeleteField: valuesLgnu/trove/TByteCollection;
   * 13 Weak Mutation 40: gnu.trove.impl.unmodifiable.TUnmodifiableCharByteMap.valueCollection()Lgnu/trove/TByteCollection;:88 - DeleteField: mLgnu/trove/map/TCharByteMap;
   * 14 Weak Mutation 41: gnu.trove.impl.unmodifiable.TUnmodifiableCharByteMap.valueCollection()Lgnu/trove/TByteCollection;:88 - DeleteStatement: valueCollection()Lgnu/trove/TByteCollection;
   */

  @Test
  public void test8()  throws Throwable  {
      TCharByteHashMap tCharByteHashMap0 = new TCharByteHashMap();
      TUnmodifiableCharByteMap tUnmodifiableCharByteMap0 = new TUnmodifiableCharByteMap((TCharByteMap) tCharByteHashMap0);
      TUnmodifiableByteCollection tUnmodifiableByteCollection0 = (TUnmodifiableByteCollection)tUnmodifiableCharByteMap0.valueCollection();
      assertNotNull(tUnmodifiableByteCollection0);
      
      TUnmodifiableByteCollection tUnmodifiableByteCollection1 = (TUnmodifiableByteCollection)tUnmodifiableCharByteMap0.valueCollection();
      assertSame(tUnmodifiableByteCollection1, tUnmodifiableByteCollection0);
  }

  //Test case number: 9
  /*
   * 5 covered goals:
   * 1 Weak Mutation 44: gnu.trove.impl.unmodifiable.TUnmodifiableCharByteMap.values()[B:91 - DeleteField: mLgnu/trove/map/TCharByteMap;
   * 2 Weak Mutation 45: gnu.trove.impl.unmodifiable.TUnmodifiableCharByteMap.values()[B:91 - DeleteStatement: values()[B
   * 3 gnu.trove.impl.unmodifiable.TUnmodifiableCharByteMap.values()[B: root-Branch
   * 4 Weak Mutation 44: gnu.trove.impl.unmodifiable.TUnmodifiableCharByteMap.values()[B:91 - DeleteField: mLgnu/trove/map/TCharByteMap;
   * 5 Weak Mutation 45: gnu.trove.impl.unmodifiable.TUnmodifiableCharByteMap.values()[B:91 - DeleteStatement: values()[B
   */

  @Test
  public void test9()  throws Throwable  {
      TCharByteHashMap tCharByteHashMap0 = new TCharByteHashMap((-10), (-10));
      TUnmodifiableCharByteMap tUnmodifiableCharByteMap0 = new TUnmodifiableCharByteMap((TCharByteMap) tCharByteHashMap0);
      byte[] byteArray0 = tUnmodifiableCharByteMap0.values();
      assertNotNull(byteArray0);
  }

  //Test case number: 10
  /*
   * 5 covered goals:
   * 1 Weak Mutation 46: gnu.trove.impl.unmodifiable.TUnmodifiableCharByteMap.values([B)[B:92 - DeleteField: mLgnu/trove/map/TCharByteMap;
   * 2 Weak Mutation 47: gnu.trove.impl.unmodifiable.TUnmodifiableCharByteMap.values([B)[B:92 - DeleteStatement: values([B)[B
   * 3 gnu.trove.impl.unmodifiable.TUnmodifiableCharByteMap.values([B)[B: root-Branch
   * 4 Weak Mutation 46: gnu.trove.impl.unmodifiable.TUnmodifiableCharByteMap.values([B)[B:92 - DeleteField: mLgnu/trove/map/TCharByteMap;
   * 5 Weak Mutation 47: gnu.trove.impl.unmodifiable.TUnmodifiableCharByteMap.values([B)[B:92 - DeleteStatement: values([B)[B
   */

  @Test
  public void test10()  throws Throwable  {
      TCharByteHashMap tCharByteHashMap0 = new TCharByteHashMap();
      TUnmodifiableCharByteMap tUnmodifiableCharByteMap0 = new TUnmodifiableCharByteMap((TCharByteMap) tCharByteHashMap0);
      byte[] byteArray0 = tUnmodifiableCharByteMap0.values(tCharByteHashMap0._states);
      assertNotNull(byteArray0);
  }

  //Test case number: 11
  /*
   * 12 covered goals:
   * 1 Weak Mutation 51: gnu.trove.impl.unmodifiable.TUnmodifiableCharByteMap.equals(Ljava/lang/Object;)Z:94 - ReplaceComparisonOperator == -> !=
   * 2 Weak Mutation 50: gnu.trove.impl.unmodifiable.TUnmodifiableCharByteMap.equals(Ljava/lang/Object;)Z:94 - DeleteStatement: equals(Ljava/lang/Object;)Z
   * 3 Weak Mutation 49: gnu.trove.impl.unmodifiable.TUnmodifiableCharByteMap.equals(Ljava/lang/Object;)Z:94 - DeleteField: mLgnu/trove/map/TCharByteMap;
   * 4 Weak Mutation 48: gnu.trove.impl.unmodifiable.TUnmodifiableCharByteMap.equals(Ljava/lang/Object;)Z:94 - ReplaceComparisonOperator == -> !=
   * 5 Weak Mutation 53: gnu.trove.impl.unmodifiable.TUnmodifiableCharByteMap.equals(Ljava/lang/Object;)Z:94 - ReplaceConstant - 0 -> 1
   * 6 gnu.trove.impl.unmodifiable.TUnmodifiableCharByteMap.equals(Ljava/lang/Object;)Z: I4 Branch 4 IF_ACMPEQ L94 - false
   * 7 gnu.trove.impl.unmodifiable.TUnmodifiableCharByteMap.equals(Ljava/lang/Object;)Z: I9 Branch 5 IFEQ L94 - true
   * 8 Weak Mutation 51: gnu.trove.impl.unmodifiable.TUnmodifiableCharByteMap.equals(Ljava/lang/Object;)Z:94 - ReplaceComparisonOperator == -> !=
   * 9 Weak Mutation 50: gnu.trove.impl.unmodifiable.TUnmodifiableCharByteMap.equals(Ljava/lang/Object;)Z:94 - DeleteStatement: equals(Ljava/lang/Object;)Z
   * 10 Weak Mutation 49: gnu.trove.impl.unmodifiable.TUnmodifiableCharByteMap.equals(Ljava/lang/Object;)Z:94 - DeleteField: mLgnu/trove/map/TCharByteMap;
   * 11 Weak Mutation 48: gnu.trove.impl.unmodifiable.TUnmodifiableCharByteMap.equals(Ljava/lang/Object;)Z:94 - ReplaceComparisonOperator == -> !=
   * 12 Weak Mutation 53: gnu.trove.impl.unmodifiable.TUnmodifiableCharByteMap.equals(Ljava/lang/Object;)Z:94 - ReplaceConstant - 0 -> 1
   */

  @Test
  public void test11()  throws Throwable  {
      TCharByteHashMap tCharByteHashMap0 = new TCharByteHashMap(12, 12);
      TUnmodifiableCharByteMap tUnmodifiableCharByteMap0 = new TUnmodifiableCharByteMap((TCharByteMap) tCharByteHashMap0);
      boolean boolean0 = tUnmodifiableCharByteMap0.equals((Object) "{}");
      assertEquals(false, boolean0);
  }

  //Test case number: 12
  /*
   * 5 covered goals:
   * 1 Weak Mutation 55: gnu.trove.impl.unmodifiable.TUnmodifiableCharByteMap.hashCode()I:95 - DeleteStatement: hashCode()I
   * 2 Weak Mutation 54: gnu.trove.impl.unmodifiable.TUnmodifiableCharByteMap.hashCode()I:95 - DeleteField: mLgnu/trove/map/TCharByteMap;
   * 3 gnu.trove.impl.unmodifiable.TUnmodifiableCharByteMap.hashCode()I: root-Branch
   * 4 Weak Mutation 55: gnu.trove.impl.unmodifiable.TUnmodifiableCharByteMap.hashCode()I:95 - DeleteStatement: hashCode()I
   * 5 Weak Mutation 54: gnu.trove.impl.unmodifiable.TUnmodifiableCharByteMap.hashCode()I:95 - DeleteField: mLgnu/trove/map/TCharByteMap;
   */

  @Test
  public void test12()  throws Throwable  {
      TCharByteHashMap tCharByteHashMap0 = new TCharByteHashMap(2033);
      TUnmodifiableCharByteMap tUnmodifiableCharByteMap0 = new TUnmodifiableCharByteMap((TCharByteMap) tCharByteHashMap0);
      int int0 = tUnmodifiableCharByteMap0.hashCode();
      assertEquals(0, int0);
  }

  //Test case number: 13
  /*
   * 5 covered goals:
   * 1 Weak Mutation 57: gnu.trove.impl.unmodifiable.TUnmodifiableCharByteMap.toString()Ljava/lang/String;:96 - DeleteStatement: toString()Ljava/lang/String;
   * 2 Weak Mutation 56: gnu.trove.impl.unmodifiable.TUnmodifiableCharByteMap.toString()Ljava/lang/String;:96 - DeleteField: mLgnu/trove/map/TCharByteMap;
   * 3 gnu.trove.impl.unmodifiable.TUnmodifiableCharByteMap.toString()Ljava/lang/String;: root-Branch
   * 4 Weak Mutation 57: gnu.trove.impl.unmodifiable.TUnmodifiableCharByteMap.toString()Ljava/lang/String;:96 - DeleteStatement: toString()Ljava/lang/String;
   * 5 Weak Mutation 56: gnu.trove.impl.unmodifiable.TUnmodifiableCharByteMap.toString()Ljava/lang/String;:96 - DeleteField: mLgnu/trove/map/TCharByteMap;
   */

  @Test
  public void test13()  throws Throwable  {
      TCharByteHashMap tCharByteHashMap0 = new TCharByteHashMap(12, 12);
      TUnmodifiableCharByteMap tUnmodifiableCharByteMap0 = new TUnmodifiableCharByteMap((TCharByteMap) tCharByteHashMap0);
      String string0 = tUnmodifiableCharByteMap0.toString();
      assertEquals("{}", string0);
  }

  //Test case number: 14
  /*
   * 5 covered goals:
   * 1 Weak Mutation 59: gnu.trove.impl.unmodifiable.TUnmodifiableCharByteMap.getNoEntryKey()C:97 - DeleteStatement: getNoEntryKey()C
   * 2 Weak Mutation 58: gnu.trove.impl.unmodifiable.TUnmodifiableCharByteMap.getNoEntryKey()C:97 - DeleteField: mLgnu/trove/map/TCharByteMap;
   * 3 gnu.trove.impl.unmodifiable.TUnmodifiableCharByteMap.getNoEntryKey()C: root-Branch
   * 4 Weak Mutation 59: gnu.trove.impl.unmodifiable.TUnmodifiableCharByteMap.getNoEntryKey()C:97 - DeleteStatement: getNoEntryKey()C
   * 5 Weak Mutation 58: gnu.trove.impl.unmodifiable.TUnmodifiableCharByteMap.getNoEntryKey()C:97 - DeleteField: mLgnu/trove/map/TCharByteMap;
   */

  @Test
  public void test14()  throws Throwable  {
      TCharByteHashMap tCharByteHashMap0 = new TCharByteHashMap();
      TUnmodifiableCharByteMap tUnmodifiableCharByteMap0 = new TUnmodifiableCharByteMap((TCharByteMap) tCharByteHashMap0);
      char char0 = tUnmodifiableCharByteMap0.getNoEntryKey();
      assertEquals('\u0000', char0);
  }

  //Test case number: 15
  /*
   * 5 covered goals:
   * 1 Weak Mutation 61: gnu.trove.impl.unmodifiable.TUnmodifiableCharByteMap.getNoEntryValue()B:98 - DeleteStatement: getNoEntryValue()B
   * 2 Weak Mutation 60: gnu.trove.impl.unmodifiable.TUnmodifiableCharByteMap.getNoEntryValue()B:98 - DeleteField: mLgnu/trove/map/TCharByteMap;
   * 3 gnu.trove.impl.unmodifiable.TUnmodifiableCharByteMap.getNoEntryValue()B: root-Branch
   * 4 Weak Mutation 61: gnu.trove.impl.unmodifiable.TUnmodifiableCharByteMap.getNoEntryValue()B:98 - DeleteStatement: getNoEntryValue()B
   * 5 Weak Mutation 60: gnu.trove.impl.unmodifiable.TUnmodifiableCharByteMap.getNoEntryValue()B:98 - DeleteField: mLgnu/trove/map/TCharByteMap;
   */

  @Test
  public void test15()  throws Throwable  {
      TCharByteHashMap tCharByteHashMap0 = new TCharByteHashMap(2033);
      TUnmodifiableCharByteMap tUnmodifiableCharByteMap0 = new TUnmodifiableCharByteMap((TCharByteMap) tCharByteHashMap0);
      byte byte0 = tUnmodifiableCharByteMap0.getNoEntryValue();
      assertEquals((byte)0, byte0);
  }

  //Test case number: 16
  /*
   * 5 covered goals:
   * 1 Weak Mutation 63: gnu.trove.impl.unmodifiable.TUnmodifiableCharByteMap.forEachKey(Lgnu/trove/procedure/TCharProcedure;)Z:101 - DeleteStatement: forEachKey(Lgnu/trove/procedure/TCharProcedure;)Z
   * 2 Weak Mutation 62: gnu.trove.impl.unmodifiable.TUnmodifiableCharByteMap.forEachKey(Lgnu/trove/procedure/TCharProcedure;)Z:101 - DeleteField: mLgnu/trove/map/TCharByteMap;
   * 3 gnu.trove.impl.unmodifiable.TUnmodifiableCharByteMap.forEachKey(Lgnu/trove/procedure/TCharProcedure;)Z: root-Branch
   * 4 Weak Mutation 63: gnu.trove.impl.unmodifiable.TUnmodifiableCharByteMap.forEachKey(Lgnu/trove/procedure/TCharProcedure;)Z:101 - DeleteStatement: forEachKey(Lgnu/trove/procedure/TCharProcedure;)Z
   * 5 Weak Mutation 62: gnu.trove.impl.unmodifiable.TUnmodifiableCharByteMap.forEachKey(Lgnu/trove/procedure/TCharProcedure;)Z:101 - DeleteField: mLgnu/trove/map/TCharByteMap;
   */

  @Test
  public void test16()  throws Throwable  {
      TCharByteHashMap tCharByteHashMap0 = new TCharByteHashMap();
      TUnmodifiableCharByteMap tUnmodifiableCharByteMap0 = new TUnmodifiableCharByteMap((TCharByteMap) tCharByteHashMap0);
      boolean boolean0 = tUnmodifiableCharByteMap0.forEachKey((TCharProcedure) null);
      assertEquals(true, boolean0);
  }

  //Test case number: 17
  /*
   * 5 covered goals:
   * 1 Weak Mutation 64: gnu.trove.impl.unmodifiable.TUnmodifiableCharByteMap.forEachValue(Lgnu/trove/procedure/TByteProcedure;)Z:104 - DeleteField: mLgnu/trove/map/TCharByteMap;
   * 2 Weak Mutation 65: gnu.trove.impl.unmodifiable.TUnmodifiableCharByteMap.forEachValue(Lgnu/trove/procedure/TByteProcedure;)Z:104 - DeleteStatement: forEachValue(Lgnu/trove/procedure/TByteProcedure;)Z
   * 3 gnu.trove.impl.unmodifiable.TUnmodifiableCharByteMap.forEachValue(Lgnu/trove/procedure/TByteProcedure;)Z: root-Branch
   * 4 Weak Mutation 64: gnu.trove.impl.unmodifiable.TUnmodifiableCharByteMap.forEachValue(Lgnu/trove/procedure/TByteProcedure;)Z:104 - DeleteField: mLgnu/trove/map/TCharByteMap;
   * 5 Weak Mutation 65: gnu.trove.impl.unmodifiable.TUnmodifiableCharByteMap.forEachValue(Lgnu/trove/procedure/TByteProcedure;)Z:104 - DeleteStatement: forEachValue(Lgnu/trove/procedure/TByteProcedure;)Z
   */

  @Test
  public void test17()  throws Throwable  {
      TCharByteHashMap tCharByteHashMap0 = new TCharByteHashMap(2033);
      TUnmodifiableCharByteMap tUnmodifiableCharByteMap0 = new TUnmodifiableCharByteMap((TCharByteMap) tCharByteHashMap0);
      boolean boolean0 = tUnmodifiableCharByteMap0.forEachValue((TByteProcedure) null);
      assertEquals(true, boolean0);
  }

  //Test case number: 18
  /*
   * 5 covered goals:
   * 1 Weak Mutation 66: gnu.trove.impl.unmodifiable.TUnmodifiableCharByteMap.forEachEntry(Lgnu/trove/procedure/TCharByteProcedure;)Z:107 - DeleteField: mLgnu/trove/map/TCharByteMap;
   * 2 Weak Mutation 67: gnu.trove.impl.unmodifiable.TUnmodifiableCharByteMap.forEachEntry(Lgnu/trove/procedure/TCharByteProcedure;)Z:107 - DeleteStatement: forEachEntry(Lgnu/trove/procedure/TCharByteProcedure;)Z
   * 3 gnu.trove.impl.unmodifiable.TUnmodifiableCharByteMap.forEachEntry(Lgnu/trove/procedure/TCharByteProcedure;)Z: root-Branch
   * 4 Weak Mutation 66: gnu.trove.impl.unmodifiable.TUnmodifiableCharByteMap.forEachEntry(Lgnu/trove/procedure/TCharByteProcedure;)Z:107 - DeleteField: mLgnu/trove/map/TCharByteMap;
   * 5 Weak Mutation 67: gnu.trove.impl.unmodifiable.TUnmodifiableCharByteMap.forEachEntry(Lgnu/trove/procedure/TCharByteProcedure;)Z:107 - DeleteStatement: forEachEntry(Lgnu/trove/procedure/TCharByteProcedure;)Z
   */

  @Test
  public void test18()  throws Throwable  {
      TCharByteHashMap tCharByteHashMap0 = new TCharByteHashMap((-51));
      TUnmodifiableCharByteMap tUnmodifiableCharByteMap0 = new TUnmodifiableCharByteMap((TCharByteMap) tCharByteHashMap0);
      boolean boolean0 = tUnmodifiableCharByteMap0.forEachEntry((TCharByteProcedure) null);
      assertEquals(true, boolean0);
  }

  //Test case number: 19
  /*
   * 2 covered goals:
   * 1 gnu.trove.impl.unmodifiable.TUnmodifiableCharByteMap.<init>(Lgnu/trove/map/TCharByteMap;)V: I17 Branch 1 IFNONNULL L58 - false
   * 2 Weak Mutation 8: gnu.trove.impl.unmodifiable.TUnmodifiableCharByteMap.<init>(Lgnu/trove/map/TCharByteMap;)V:58 - ReplaceComparisonOperator != null -> = null
   */

  @Test
  public void test19()  throws Throwable  {
      TUnmodifiableCharByteMap tUnmodifiableCharByteMap0 = null;
      try {
        tUnmodifiableCharByteMap0 = new TUnmodifiableCharByteMap((TCharByteMap) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }
}
