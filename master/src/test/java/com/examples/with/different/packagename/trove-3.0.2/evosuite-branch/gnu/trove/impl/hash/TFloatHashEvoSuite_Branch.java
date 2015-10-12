/*
 * This file was automatically generated by EvoSuite
 */

package gnu.trove.impl.hash;

import org.junit.Test;
import static org.junit.Assert.*;
import gnu.trove.TFloatCollection;
import gnu.trove.map.hash.TFloatObjectHashMap;
import gnu.trove.procedure.TFloatProcedure;
import gnu.trove.set.hash.TFloatHashSet;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;

public class TFloatHashEvoSuite_Branch {

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
   * 3 covered goals:
   * 1 gnu.trove.impl.hash.TFloatHash.getNoEntryValue()F: root-Branch
   * 2 gnu.trove.impl.hash.TFloatHash.setUp(I)I: root-Branch
   * 3 gnu.trove.impl.hash.TFloatHash.<init>(IF)V: I17 Branch 3 IFEQ L103 - true
   */

//   @Test
//   public void test0()  throws Throwable  {
//       TFloatObjectHashMap<Object> tFloatObjectHashMap0 = new TFloatObjectHashMap<Object>(1017, 1017);
//       float float0 = tFloatObjectHashMap0.getNoEntryValue();
//       assertEquals(0.0F, float0, 0.01F);
//   }

  //Test case number: 1
  /*
   * 1 covered goal:
   * 1 gnu.trove.impl.hash.TFloatHash.<init>(IFF)V: I16 Branch 4 IFEQ L122 - false
   */

//   @Test
//   public void test1()  throws Throwable  {
//       TFloatHashSet tFloatHashSet0 = new TFloatHashSet(97636, 97636, 97636);
//       assertEquals(97636.0F, tFloatHashSet0.getNoEntryValue(), 0.01F);
//   }

  //Test case number: 2
  /*
   * 3 covered goals:
   * 1 gnu.trove.impl.hash.TFloatHash.contains(F)Z: I5 Branch 5 IFLT L163 - true
   * 2 gnu.trove.impl.hash.TFloatHash.index(F)I: I37 Branch 9 IFNE L213 - false
   * 3 gnu.trove.impl.hash.TFloatHash.<init>(IFF)V: I16 Branch 4 IFEQ L122 - true
   */

//   @Test
//   public void test2()  throws Throwable  {
//       TFloatHashSet tFloatHashSet0 = new TFloatHashSet(1017, (float) 1017, 0.0F);
//       boolean boolean0 = tFloatHashSet0.contains((float) 1017);
//       assertEquals(0.0F, tFloatHashSet0.getNoEntryValue(), 0.01F);
//       assertEquals(false, boolean0);
//   }

  //Test case number: 3
  /*
   * 10 covered goals:
   * 1 gnu.trove.impl.hash.TFloatHash.contains(F)Z: I5 Branch 5 IFLT L163 - false
   * 2 gnu.trove.impl.hash.TFloatHash.insertKeyAt(IF)V: root-Branch
   * 3 gnu.trove.impl.hash.TFloatHash.<init>(I)V: I16 Branch 2 IFEQ L85 - true
   * 4 gnu.trove.impl.hash.TFloatHash.insertKey(F)I: I30 Branch 17 IFNE L263 - true
   * 5 gnu.trove.impl.hash.TFloatHash.insertKey(F)I: I30 Branch 17 IFNE L263 - false
   * 6 gnu.trove.impl.hash.TFloatHash.insertKey(F)I: I50 Branch 18 IF_ICMPNE L270 - false
   * 7 gnu.trove.impl.hash.TFloatHash.insertKey(F)I: I57 Branch 19 IFNE L270 - false
   * 8 gnu.trove.impl.hash.TFloatHash.index(F)I: I37 Branch 9 IFNE L213 - true
   * 9 gnu.trove.impl.hash.TFloatHash.index(F)I: I46 Branch 10 IF_ICMPNE L216 - false
   * 10 gnu.trove.impl.hash.TFloatHash.index(F)I: I52 Branch 11 IFNE L216 - false
   */

  @Test
  public void test3()  throws Throwable  {
      float[] floatArray0 = new float[9];
      TFloatHashSet tFloatHashSet0 = new TFloatHashSet(floatArray0);
      boolean boolean0 = tFloatHashSet0.contains(0.0F);
      assertEquals(23, tFloatHashSet0.capacity());
      assertEquals("{0.0}", tFloatHashSet0.toString());
      assertEquals(false, tFloatHashSet0.isEmpty());
      assertEquals(true, boolean0);
  }

  //Test case number: 4
  /*
   * 4 covered goals:
   * 1 gnu.trove.impl.hash.TFloatHash.forEach(Lgnu/trove/procedure/TFloatProcedure;)Z: I18 Branch 6 IFLE L177 - true
   * 2 gnu.trove.impl.hash.TFloatHash.forEach(Lgnu/trove/procedure/TFloatProcedure;)Z: I18 Branch 6 IFLE L177 - false
   * 3 gnu.trove.impl.hash.TFloatHash.forEach(Lgnu/trove/procedure/TFloatProcedure;)Z: I25 Branch 7 IF_ICMPNE L178 - true
   * 4 gnu.trove.impl.hash.TFloatHash.<init>(IF)V: I17 Branch 3 IFEQ L103 - true
   */

//   @Test
//   public void test4()  throws Throwable  {
//       TFloatObjectHashMap<Object> tFloatObjectHashMap0 = new TFloatObjectHashMap<Object>(1017, 1017);
//       boolean boolean0 = tFloatObjectHashMap0.forEachKey((TFloatProcedure) null);
//       assertEquals(0.0F, tFloatObjectHashMap0.getNoEntryValue(), 0.01F);
//       assertEquals(true, boolean0);
//   }

  //Test case number: 5
  /*
   * 3 covered goals:
   * 1 gnu.trove.impl.hash.TFloatHash.forEach(Lgnu/trove/procedure/TFloatProcedure;)Z: I25 Branch 7 IF_ICMPNE L178 - false
   * 2 gnu.trove.impl.hash.TFloatHash.forEach(Lgnu/trove/procedure/TFloatProcedure;)Z: I18 Branch 6 IFLE L177 - false
   * 3 gnu.trove.impl.hash.TFloatHash.forEach(Lgnu/trove/procedure/TFloatProcedure;)Z: I25 Branch 7 IF_ICMPNE L178 - true
   */

  @Test
  public void test5()  throws Throwable  {
      float[] floatArray0 = new float[1];
      TFloatHashSet tFloatHashSet0 = new TFloatHashSet(floatArray0);
      // Undeclared exception!
      try {
        tFloatHashSet0.forEach((TFloatProcedure) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  //Test case number: 6
  /*
   * 10 covered goals:
   * 1 gnu.trove.impl.hash.TFloatHash.indexRehashed(FIIB)I: I29 Branch 12 IFGE L230 - true
   * 2 gnu.trove.impl.hash.TFloatHash.indexRehashed(FIIB)I: I46 Branch 13 IFNE L235 - true
   * 3 gnu.trove.impl.hash.TFloatHash.indexRehashed(FIIB)I: I59 Branch 14 IFNE L239 - true
   * 4 gnu.trove.impl.hash.TFloatHash.indexRehashed(FIIB)I: I59 Branch 14 IFNE L239 - false
   * 5 gnu.trove.impl.hash.TFloatHash.indexRehashed(FIIB)I: I62 Branch 15 IF_ICMPEQ L239 - true
   * 6 gnu.trove.impl.hash.TFloatHash.indexRehashed(FIIB)I: I71 Branch 16 IF_ICMPNE L241 - true
   * 7 gnu.trove.impl.hash.TFloatHash.removeAt(I)V: root-Branch
   * 8 gnu.trove.impl.hash.TFloatHash.indexRehashed(FIIB)I: I29 Branch 12 IFGE L230 - false
   * 9 gnu.trove.impl.hash.TFloatHash.indexRehashed(FIIB)I: I46 Branch 13 IFNE L235 - false
   * 10 gnu.trove.impl.hash.TFloatHash.index(F)I: I46 Branch 10 IF_ICMPNE L216 - true
   */

  @Test
  public void test6()  throws Throwable  {
      float[] floatArray0 = new float[10];
      floatArray0[2] = 672.2496F;
      TFloatHashSet tFloatHashSet0 = new TFloatHashSet(floatArray0);
      boolean boolean0 = tFloatHashSet0.removeAll(floatArray0);
      assertEquals(true, tFloatHashSet0.isEmpty());
      assertEquals(true, boolean0);
  }

  //Test case number: 7
  /*
   * 9 covered goals:
   * 1 gnu.trove.impl.hash.TFloatHash.indexRehashed(FIIB)I: I62 Branch 15 IF_ICMPEQ L239 - false
   * 2 gnu.trove.impl.hash.TFloatHash.insertKey(F)I: I57 Branch 19 IFNE L270 - true
   * 3 gnu.trove.impl.hash.TFloatHash.insertKeyRehash(FIIB)I: I28 Branch 20 IF_ICMPNE L290 - true
   * 4 gnu.trove.impl.hash.TFloatHash.insertKeyRehash(FIIB)I: I45 Branch 22 IFGE L294 - true
   * 5 gnu.trove.impl.hash.TFloatHash.insertKeyRehash(FIIB)I: I62 Branch 23 IFNE L300 - false
   * 6 gnu.trove.impl.hash.TFloatHash.insertKeyRehash(FIIB)I: I67 Branch 24 IF_ICMPEQ L301 - true
   * 7 gnu.trove.impl.hash.TFloatHash.indexRehashed(FIIB)I: I29 Branch 12 IFGE L230 - true
   * 8 gnu.trove.impl.hash.TFloatHash.indexRehashed(FIIB)I: I62 Branch 15 IF_ICMPEQ L239 - true
   * 9 gnu.trove.impl.hash.TFloatHash.indexRehashed(FIIB)I: I71 Branch 16 IF_ICMPNE L241 - true
   */

  @Test
  public void test7()  throws Throwable  {
      float[] floatArray0 = new float[10];
      floatArray0[2] = 672.2496F;
      floatArray0[8] = (-152.07285F);
      TFloatHashSet tFloatHashSet0 = new TFloatHashSet(floatArray0);
      boolean boolean0 = tFloatHashSet0.removeAll(floatArray0);
      assertEquals(true, tFloatHashSet0.isEmpty());
      assertEquals(true, boolean0);
  }

  //Test case number: 8
  /*
   * 8 covered goals:
   * 1 gnu.trove.impl.hash.TFloatHash.insertKey(F)I: I50 Branch 18 IF_ICMPNE L270 - true
   * 2 gnu.trove.impl.hash.TFloatHash.insertKeyRehash(FIIB)I: I28 Branch 20 IF_ICMPNE L290 - false
   * 3 gnu.trove.impl.hash.TFloatHash.insertKeyRehash(FIIB)I: I31 Branch 21 IF_ICMPNE L290 - false
   * 4 gnu.trove.impl.hash.TFloatHash.insertKeyRehash(FIIB)I: I45 Branch 22 IFGE L294 - false
   * 5 gnu.trove.impl.hash.TFloatHash.insertKeyRehash(FIIB)I: I62 Branch 23 IFNE L300 - true
   * 6 gnu.trove.impl.hash.TFloatHash.insertKeyRehash(FIIB)I: I97 Branch 25 IF_ICMPNE L311 - false
   * 7 gnu.trove.impl.hash.TFloatHash.insertKeyRehash(FIIB)I: I104 Branch 26 IFNE L311 - false
   * 8 gnu.trove.impl.hash.TFloatHash.<init>()V: I15 Branch 1 IFEQ L68 - true
   */

  @Test
  public void test8()  throws Throwable  {
      float[] floatArray0 = new float[9];
      TFloatObjectHashMap<Integer> tFloatObjectHashMap0 = new TFloatObjectHashMap<Integer>();
      floatArray0[3] = 8.645772F;
      TFloatHashSet tFloatHashSet0 = new TFloatHashSet(floatArray0);
      boolean boolean0 = tFloatHashSet0.removeAll(tFloatObjectHashMap0._set);
      assertEquals(true, boolean0);
      
      boolean boolean1 = tFloatHashSet0.addAll((TFloatCollection) tFloatHashSet0);
      assertEquals("{8.645772}", tFloatHashSet0.toString());
      assertFalse(boolean1 == boolean0);
  }

  //Test case number: 9
  /*
   * 19 covered goals:
   * 1 gnu.trove.impl.hash.TFloatHash.insertKeyRehash(FIIB)I: I31 Branch 21 IF_ICMPNE L290 - true
   * 2 gnu.trove.impl.hash.TFloatHash.insertKeyRehash(FIIB)I: I67 Branch 24 IF_ICMPEQ L301 - false
   * 3 gnu.trove.impl.hash.TFloatHash.insertKeyRehash(FIIB)I: I97 Branch 25 IF_ICMPNE L311 - true
   * 4 gnu.trove.impl.hash.TFloatHash.insertKeyRehash(FIIB)I: I116 Branch 27 IF_ICMPNE L316 - true
   * 5 gnu.trove.impl.hash.TFloatHash.removeAt(I)V: root-Branch
   * 6 gnu.trove.impl.hash.TFloatHash.indexRehashed(FIIB)I: I29 Branch 12 IFGE L230 - false
   * 7 gnu.trove.impl.hash.TFloatHash.indexRehashed(FIIB)I: I46 Branch 13 IFNE L235 - true
   * 8 gnu.trove.impl.hash.TFloatHash.indexRehashed(FIIB)I: I46 Branch 13 IFNE L235 - false
   * 9 gnu.trove.impl.hash.TFloatHash.indexRehashed(FIIB)I: I59 Branch 14 IFNE L239 - false
   * 10 gnu.trove.impl.hash.TFloatHash.indexRehashed(FIIB)I: I62 Branch 15 IF_ICMPEQ L239 - false
   * 11 gnu.trove.impl.hash.TFloatHash.<init>()V: I15 Branch 1 IFEQ L68 - true
   * 12 gnu.trove.impl.hash.TFloatHash.insertKey(F)I: I50 Branch 18 IF_ICMPNE L270 - true
   * 13 gnu.trove.impl.hash.TFloatHash.index(F)I: I37 Branch 9 IFNE L213 - true
   * 14 gnu.trove.impl.hash.TFloatHash.index(F)I: I46 Branch 10 IF_ICMPNE L216 - true
   * 15 gnu.trove.impl.hash.TFloatHash.index(F)I: I46 Branch 10 IF_ICMPNE L216 - false
   * 16 gnu.trove.impl.hash.TFloatHash.index(F)I: I52 Branch 11 IFNE L216 - true
   * 17 gnu.trove.impl.hash.TFloatHash.index(F)I: I52 Branch 11 IFNE L216 - false
   * 18 gnu.trove.impl.hash.TFloatHash.insertKeyRehash(FIIB)I: I28 Branch 20 IF_ICMPNE L290 - false
   * 19 gnu.trove.impl.hash.TFloatHash.insertKeyRehash(FIIB)I: I31 Branch 21 IF_ICMPNE L290 - false
   */

  @Test
  public void test9()  throws Throwable  {
      float[] floatArray0 = new float[9];
      TFloatObjectHashMap<Integer> tFloatObjectHashMap0 = new TFloatObjectHashMap<Integer>();
      floatArray0[3] = 8.645772F;
      TFloatHashSet tFloatHashSet0 = new TFloatHashSet(floatArray0);
      tFloatHashSet0.remove(8.645772F);
      tFloatHashSet0.removeAll(tFloatObjectHashMap0._set);
      assertEquals(0, tFloatHashSet0.size());
      
      TFloatHashSet tFloatHashSet1 = new TFloatHashSet(floatArray0);
      boolean boolean0 = tFloatHashSet0.addAll((TFloatCollection) tFloatHashSet1);
      assertEquals(true, boolean0);
  }

  //Test case number: 10
  /*
   * 17 covered goals:
   * 1 gnu.trove.impl.hash.TFloatHash.insertKeyRehash(FIIB)I: I104 Branch 26 IFNE L311 - true
   * 2 gnu.trove.impl.hash.TFloatHash.insertKeyAt(IF)V: root-Branch
   * 3 gnu.trove.impl.hash.TFloatHash.setUp(I)I: root-Branch
   * 4 gnu.trove.impl.hash.TFloatHash.<init>(I)V: I16 Branch 2 IFEQ L85 - true
   * 5 gnu.trove.impl.hash.TFloatHash.insertKey(F)I: I30 Branch 17 IFNE L263 - true
   * 6 gnu.trove.impl.hash.TFloatHash.insertKey(F)I: I30 Branch 17 IFNE L263 - false
   * 7 gnu.trove.impl.hash.TFloatHash.insertKey(F)I: I50 Branch 18 IF_ICMPNE L270 - false
   * 8 gnu.trove.impl.hash.TFloatHash.insertKey(F)I: I57 Branch 19 IFNE L270 - true
   * 9 gnu.trove.impl.hash.TFloatHash.insertKey(F)I: I57 Branch 19 IFNE L270 - false
   * 10 gnu.trove.impl.hash.TFloatHash.insertKeyRehash(FIIB)I: I28 Branch 20 IF_ICMPNE L290 - true
   * 11 gnu.trove.impl.hash.TFloatHash.insertKeyRehash(FIIB)I: I45 Branch 22 IFGE L294 - true
   * 12 gnu.trove.impl.hash.TFloatHash.insertKeyRehash(FIIB)I: I45 Branch 22 IFGE L294 - false
   * 13 gnu.trove.impl.hash.TFloatHash.insertKeyRehash(FIIB)I: I62 Branch 23 IFNE L300 - true
   * 14 gnu.trove.impl.hash.TFloatHash.insertKeyRehash(FIIB)I: I62 Branch 23 IFNE L300 - false
   * 15 gnu.trove.impl.hash.TFloatHash.insertKeyRehash(FIIB)I: I67 Branch 24 IF_ICMPEQ L301 - true
   * 16 gnu.trove.impl.hash.TFloatHash.insertKeyRehash(FIIB)I: I97 Branch 25 IF_ICMPNE L311 - false
   * 17 gnu.trove.impl.hash.TFloatHash.insertKeyRehash(FIIB)I: I116 Branch 27 IF_ICMPNE L316 - true
   */

  @Test
  public void test10()  throws Throwable  {
      float[] floatArray0 = new float[10];
      floatArray0[0] = (-726.9551F);
      floatArray0[2] = 672.2496F;
      floatArray0[4] = 1985.7112F;
      floatArray0[8] = (-152.07285F);
      TFloatHashSet tFloatHashSet0 = new TFloatHashSet(floatArray0);
      assertEquals("{-152.07285,-726.9551,672.2496,1985.7112,0.0}", tFloatHashSet0.toString());
  }
}
