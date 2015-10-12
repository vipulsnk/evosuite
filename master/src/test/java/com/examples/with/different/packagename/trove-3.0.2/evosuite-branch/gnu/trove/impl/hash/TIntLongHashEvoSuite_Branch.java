/*
 * This file was automatically generated by EvoSuite
 */

package gnu.trove.impl.hash;

import org.junit.Test;
import static org.junit.Assert.*;
import gnu.trove.map.hash.TIntLongHashMap;
import gnu.trove.procedure.TIntProcedure;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;

public class TIntLongHashEvoSuite_Branch {

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
   * 1 gnu.trove.impl.hash.TIntLongHash.getNoEntryKey()I: root-Branch
   * 2 gnu.trove.impl.hash.TIntLongHash.setUp(I)I: root-Branch
   * 3 gnu.trove.impl.hash.TIntLongHash.<init>()V: root-Branch
   */

  @Test
  public void test0()  throws Throwable  {
      TIntLongHashMap tIntLongHashMap0 = new TIntLongHashMap();
      int int0 = tIntLongHashMap0.getNoEntryKey();
      assertEquals(23, tIntLongHashMap0.capacity());
      assertEquals(0L, tIntLongHashMap0.getNoEntryValue());
      assertEquals(0, int0);
  }

  //Test case number: 1
  /*
   * 2 covered goals:
   * 1 gnu.trove.impl.hash.TIntLongHash.writeExternal(Ljava/io/ObjectOutput;)V: root-Branch
   * 2 gnu.trove.impl.hash.TIntLongHash.<init>(IFIJ)V: root-Branch
   */

  @Test
  public void test1()  throws Throwable  {
      TIntLongHashMap tIntLongHashMap0 = new TIntLongHashMap(0, 0, 0, 0);
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      ObjectOutputStream objectOutputStream0 = new ObjectOutputStream((OutputStream) byteArrayOutputStream0);
      tIntLongHashMap0.writeExternal((ObjectOutput) objectOutputStream0);
      assertEquals(0, tIntLongHashMap0.getNoEntryKey());
      assertEquals(0L, tIntLongHashMap0.getNoEntryValue());
  }

  //Test case number: 2
  /*
   * 2 covered goals:
   * 1 gnu.trove.impl.hash.TIntLongHash.getNoEntryValue()J: root-Branch
   * 2 gnu.trove.impl.hash.TIntLongHash.<init>()V: root-Branch
   */

  @Test
  public void test2()  throws Throwable  {
      TIntLongHashMap tIntLongHashMap0 = new TIntLongHashMap();
      long long0 = tIntLongHashMap0.getNoEntryValue();
      assertEquals(23, tIntLongHashMap0.capacity());
      assertEquals(0, tIntLongHashMap0.getNoEntryKey());
      assertEquals(0L, long0);
  }

  //Test case number: 3
  /*
   * 8 covered goals:
   * 1 gnu.trove.impl.hash.TIntLongHash.contains(I)Z: I5 Branch 1 IFLT L178 - true
   * 2 gnu.trove.impl.hash.TIntLongHash.index(I)I: I37 Branch 5 IFNE L228 - false
   * 3 gnu.trove.impl.hash.TIntLongHash.insertKey(I)I: I30 Branch 13 IFNE L279 - true
   * 4 gnu.trove.impl.hash.TIntLongHash.insertKey(I)I: I50 Branch 14 IF_ICMPNE L286 - false
   * 5 gnu.trove.impl.hash.TIntLongHash.insertKey(I)I: I56 Branch 15 IF_ICMPNE L286 - false
   * 6 gnu.trove.impl.hash.TIntLongHash.insertKeyAt(II)V: root-Branch
   * 7 gnu.trove.impl.hash.TIntLongHash.<init>(I)V: root-Branch
   * 8 gnu.trove.impl.hash.TIntLongHash.insertKey(I)I: I30 Branch 13 IFNE L279 - false
   */

  @Test
  public void test3()  throws Throwable  {
      int[] intArray0 = new int[4];
      long[] longArray0 = new long[11];
      TIntLongHashMap tIntLongHashMap0 = new TIntLongHashMap(intArray0, longArray0);
      boolean boolean0 = tIntLongHashMap0.contains((-488));
      assertEquals(0L, tIntLongHashMap0.getNoEntryValue());
      assertEquals(0, tIntLongHashMap0.getNoEntryKey());
      assertEquals(1, tIntLongHashMap0.size());
      assertEquals(false, boolean0);
  }

  //Test case number: 4
  /*
   * 5 covered goals:
   * 1 gnu.trove.impl.hash.TIntLongHash.contains(I)Z: I5 Branch 1 IFLT L178 - false
   * 2 gnu.trove.impl.hash.TIntLongHash.insertKey(I)I: I56 Branch 15 IF_ICMPNE L286 - false
   * 3 gnu.trove.impl.hash.TIntLongHash.index(I)I: I37 Branch 5 IFNE L228 - true
   * 4 gnu.trove.impl.hash.TIntLongHash.index(I)I: I46 Branch 6 IF_ICMPNE L231 - false
   * 5 gnu.trove.impl.hash.TIntLongHash.index(I)I: I51 Branch 7 IF_ICMPNE L231 - false
   */

  @Test
  public void test4()  throws Throwable  {
      int[] intArray0 = new int[4];
      long[] longArray0 = new long[3];
      TIntLongHashMap tIntLongHashMap0 = new TIntLongHashMap(intArray0, longArray0);
      boolean boolean0 = tIntLongHashMap0.containsKey(0);
      assertEquals(11, tIntLongHashMap0.capacity());
      assertEquals(0L, tIntLongHashMap0.getNoEntryValue());
      assertEquals(1, tIntLongHashMap0.size());
      assertEquals(true, boolean0);
      assertEquals(0, tIntLongHashMap0.getNoEntryKey());
  }

  //Test case number: 5
  /*
   * 3 covered goals:
   * 1 gnu.trove.impl.hash.TIntLongHash.forEach(Lgnu/trove/procedure/TIntProcedure;)Z: I18 Branch 2 IFLE L192 - true
   * 2 gnu.trove.impl.hash.TIntLongHash.forEach(Lgnu/trove/procedure/TIntProcedure;)Z: I18 Branch 2 IFLE L192 - false
   * 3 gnu.trove.impl.hash.TIntLongHash.forEach(Lgnu/trove/procedure/TIntProcedure;)Z: I25 Branch 3 IF_ICMPNE L193 - true
   */

  @Test
  public void test5()  throws Throwable  {
      TIntLongHashMap tIntLongHashMap0 = new TIntLongHashMap(951);
      boolean boolean0 = tIntLongHashMap0.forEach((TIntProcedure) null);
      assertEquals(1907, tIntLongHashMap0.capacity());
      assertEquals(true, boolean0);
      assertEquals(0L, tIntLongHashMap0.getNoEntryValue());
      assertEquals(0, tIntLongHashMap0.getNoEntryKey());
  }

  //Test case number: 6
  /*
   * 3 covered goals:
   * 1 gnu.trove.impl.hash.TIntLongHash.forEach(Lgnu/trove/procedure/TIntProcedure;)Z: I25 Branch 3 IF_ICMPNE L193 - false
   * 2 gnu.trove.impl.hash.TIntLongHash.forEach(Lgnu/trove/procedure/TIntProcedure;)Z: I18 Branch 2 IFLE L192 - false
   * 3 gnu.trove.impl.hash.TIntLongHash.forEach(Lgnu/trove/procedure/TIntProcedure;)Z: I25 Branch 3 IF_ICMPNE L193 - true
   */

  @Test
  public void test6()  throws Throwable  {
      int[] intArray0 = new int[1];
      long[] longArray0 = new long[2];
      TIntLongHashMap tIntLongHashMap0 = new TIntLongHashMap(intArray0, longArray0);
      // Undeclared exception!
      try {
        tIntLongHashMap0.forEach((TIntProcedure) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  //Test case number: 7
  /*
   * 14 covered goals:
   * 1 gnu.trove.impl.hash.TIntLongHash.index(I)I: I51 Branch 7 IF_ICMPNE L231 - true
   * 2 gnu.trove.impl.hash.TIntLongHash.indexRehashed(IIIB)I: I29 Branch 8 IFGE L245 - false
   * 3 gnu.trove.impl.hash.TIntLongHash.indexRehashed(IIIB)I: I46 Branch 9 IFNE L250 - true
   * 4 gnu.trove.impl.hash.TIntLongHash.indexRehashed(IIIB)I: I58 Branch 10 IF_ICMPNE L254 - false
   * 5 gnu.trove.impl.hash.TIntLongHash.indexRehashed(IIIB)I: I61 Branch 11 IF_ICMPEQ L254 - false
   * 6 gnu.trove.impl.hash.TIntLongHash.insertKey(I)I: I56 Branch 15 IF_ICMPNE L286 - true
   * 7 gnu.trove.impl.hash.TIntLongHash.insertKeyRehash(IIIB)I: I28 Branch 16 IF_ICMPNE L306 - true
   * 8 gnu.trove.impl.hash.TIntLongHash.insertKeyRehash(IIIB)I: I45 Branch 18 IFGE L310 - false
   * 9 gnu.trove.impl.hash.TIntLongHash.insertKeyRehash(IIIB)I: I62 Branch 19 IFNE L316 - true
   * 10 gnu.trove.impl.hash.TIntLongHash.insertKeyRehash(IIIB)I: I62 Branch 19 IFNE L316 - false
   * 11 gnu.trove.impl.hash.TIntLongHash.insertKeyRehash(IIIB)I: I67 Branch 20 IF_ICMPEQ L317 - true
   * 12 gnu.trove.impl.hash.TIntLongHash.insertKeyRehash(IIIB)I: I97 Branch 21 IF_ICMPNE L327 - false
   * 13 gnu.trove.impl.hash.TIntLongHash.insertKeyRehash(IIIB)I: I103 Branch 22 IF_ICMPNE L327 - false
   * 14 gnu.trove.impl.hash.TIntLongHash.contains(I)Z: I5 Branch 1 IFLT L178 - false
   */

  @Test
  public void test7()  throws Throwable  {
      int[] intArray0 = new int[4];
      intArray0[0] = 1793;
      long[] longArray0 = new long[3];
      TIntLongHashMap tIntLongHashMap0 = new TIntLongHashMap(intArray0, longArray0);
      boolean boolean0 = tIntLongHashMap0.containsKey(0);
      assertEquals("{0=0, 1793=0}", tIntLongHashMap0.toString());
      assertEquals(true, boolean0);
      assertEquals(0, tIntLongHashMap0.getNoEntryKey());
      assertEquals(2, tIntLongHashMap0.size());
  }

  //Test case number: 8
  /*
   * 6 covered goals:
   * 1 gnu.trove.impl.hash.TIntLongHash.indexRehashed(IIIB)I: I58 Branch 10 IF_ICMPNE L254 - true
   * 2 gnu.trove.impl.hash.TIntLongHash.indexRehashed(IIIB)I: I70 Branch 12 IF_ICMPNE L256 - true
   * 3 gnu.trove.impl.hash.TIntLongHash.indexRehashed(IIIB)I: I46 Branch 9 IFNE L250 - false
   * 4 gnu.trove.impl.hash.TIntLongHash.<init>(IF)V: root-Branch
   * 5 gnu.trove.impl.hash.TIntLongHash.indexRehashed(IIIB)I: I29 Branch 8 IFGE L245 - true
   * 6 gnu.trove.impl.hash.TIntLongHash.index(I)I: I46 Branch 6 IF_ICMPNE L231 - true
   */

  @Test
  public void test8()  throws Throwable  {
      TIntLongHashMap tIntLongHashMap0 = new TIntLongHashMap(199, 199);
      byte[] byteArray0 = new byte[3];
      byteArray0[0] = (byte) (-1);
      byteArray0[1] = (byte) (-1);
      tIntLongHashMap0._states = byteArray0;
      boolean boolean0 = tIntLongHashMap0.increment((int) (byte) (-1));
      assertEquals(0L, tIntLongHashMap0.getNoEntryValue());
      assertEquals(false, boolean0);
      assertEquals(0, tIntLongHashMap0.getNoEntryKey());
  }

  //Test case number: 9
  /*
   * 8 covered goals:
   * 1 gnu.trove.impl.hash.TIntLongHash.indexRehashed(IIIB)I: I70 Branch 12 IF_ICMPNE L256 - false
   * 2 gnu.trove.impl.hash.TIntLongHash.<init>(IF)V: root-Branch
   * 3 gnu.trove.impl.hash.TIntLongHash.indexRehashed(IIIB)I: I29 Branch 8 IFGE L245 - true
   * 4 gnu.trove.impl.hash.TIntLongHash.indexRehashed(IIIB)I: I29 Branch 8 IFGE L245 - false
   * 5 gnu.trove.impl.hash.TIntLongHash.indexRehashed(IIIB)I: I46 Branch 9 IFNE L250 - true
   * 6 gnu.trove.impl.hash.TIntLongHash.indexRehashed(IIIB)I: I58 Branch 10 IF_ICMPNE L254 - true
   * 7 gnu.trove.impl.hash.TIntLongHash.indexRehashed(IIIB)I: I70 Branch 12 IF_ICMPNE L256 - true
   * 8 gnu.trove.impl.hash.TIntLongHash.index(I)I: I46 Branch 6 IF_ICMPNE L231 - true
   */

  @Test
  public void test9()  throws Throwable  {
      TIntLongHashMap tIntLongHashMap0 = new TIntLongHashMap(199, 199);
      byte[] byteArray0 = new byte[3];
      byteArray0[0] = (byte) (-1);
      byteArray0[1] = (byte) (-1);
      byteArray0[2] = (byte) (-1);
      tIntLongHashMap0._states = byteArray0;
      boolean boolean0 = tIntLongHashMap0.increment((int) (byte) (-1));
      assertEquals(false, boolean0);
      assertEquals(0L, tIntLongHashMap0.getNoEntryValue());
  }

  //Test case number: 10
  /*
   * 8 covered goals:
   * 1 gnu.trove.impl.hash.TIntLongHash.insertKey(I)I: I50 Branch 14 IF_ICMPNE L286 - true
   * 2 gnu.trove.impl.hash.TIntLongHash.insertKeyRehash(IIIB)I: I28 Branch 16 IF_ICMPNE L306 - false
   * 3 gnu.trove.impl.hash.TIntLongHash.insertKeyRehash(IIIB)I: I31 Branch 17 IF_ICMPNE L306 - false
   * 4 gnu.trove.impl.hash.TIntLongHash.insertKeyRehash(IIIB)I: I67 Branch 20 IF_ICMPEQ L317 - false
   * 5 gnu.trove.impl.hash.TIntLongHash.removeAt(I)V: root-Branch
   * 6 gnu.trove.impl.hash.TIntLongHash.index(I)I: I37 Branch 5 IFNE L228 - true
   * 7 gnu.trove.impl.hash.TIntLongHash.index(I)I: I46 Branch 6 IF_ICMPNE L231 - false
   * 8 gnu.trove.impl.hash.TIntLongHash.index(I)I: I51 Branch 7 IF_ICMPNE L231 - false
   */

  @Test
  public void test10()  throws Throwable  {
      int[] intArray0 = new int[1];
      intArray0[0] = 302;
      long[] longArray0 = new long[2];
      TIntLongHashMap tIntLongHashMap0 = new TIntLongHashMap(intArray0, longArray0);
      tIntLongHashMap0.remove(302);
      assertEquals(0, tIntLongHashMap0.size());
      
      long long0 = tIntLongHashMap0.putIfAbsent(302, 302);
      assertEquals(0L, long0);
  }

  //Test case number: 11
  /*
   * 5 covered goals:
   * 1 gnu.trove.impl.hash.TIntLongHash.insertKeyRehash(IIIB)I: I31 Branch 17 IF_ICMPNE L306 - true
   * 2 gnu.trove.impl.hash.TIntLongHash.insertKeyRehash(IIIB)I: I45 Branch 18 IFGE L310 - true
   * 3 gnu.trove.impl.hash.TIntLongHash.insertKeyRehash(IIIB)I: I97 Branch 21 IF_ICMPNE L327 - true
   * 4 gnu.trove.impl.hash.TIntLongHash.insertKeyRehash(IIIB)I: I115 Branch 23 IF_ICMPNE L332 - true
   * 5 gnu.trove.impl.hash.TIntLongHash.insertKeyRehash(IIIB)I: I67 Branch 20 IF_ICMPEQ L317 - false
   */

  @Test
  public void test11()  throws Throwable  {
      int[] intArray0 = new int[1];
      long[] longArray0 = new long[2];
      TIntLongHashMap tIntLongHashMap0 = new TIntLongHashMap(intArray0, longArray0);
      byte[] byteArray0 = new byte[5];
      byteArray0[1] = (byte) (-40);
      byteArray0[3] = (byte)2;
      tIntLongHashMap0._states = byteArray0;
      byteArray0[2] = (byte)2;
      byteArray0[4] = (byte) (-40);
      long long0 = tIntLongHashMap0.putIfAbsent((int) (byte) (-40), (long) (byte) (-40));
      assertEquals("{-40=-40}", tIntLongHashMap0.toString());
      assertEquals(0L, long0);
  }

  //Test case number: 12
  /*
   * 8 covered goals:
   * 1 gnu.trove.impl.hash.TIntLongHash.insertKeyRehash(IIIB)I: I103 Branch 22 IF_ICMPNE L327 - true
   * 2 gnu.trove.impl.hash.TIntLongHash.insertKeyRehash(IIIB)I: I115 Branch 23 IF_ICMPNE L332 - false
   * 3 gnu.trove.impl.hash.TIntLongHash.insertKeyRehash(IIIB)I: I120 Branch 24 IF_ICMPEQ L336 - true
   * 4 gnu.trove.impl.hash.TIntLongHash.insertKeyRehash(IIIB)I: I62 Branch 19 IFNE L316 - false
   * 5 gnu.trove.impl.hash.TIntLongHash.insertKeyRehash(IIIB)I: I67 Branch 20 IF_ICMPEQ L317 - true
   * 6 gnu.trove.impl.hash.TIntLongHash.insertKeyRehash(IIIB)I: I97 Branch 21 IF_ICMPNE L327 - false
   * 7 gnu.trove.impl.hash.TIntLongHash.insertKey(I)I: I50 Branch 14 IF_ICMPNE L286 - false
   * 8 gnu.trove.impl.hash.TIntLongHash.insertKey(I)I: I56 Branch 15 IF_ICMPNE L286 - true
   */

  @Test
  public void test12()  throws Throwable  {
      int[] intArray0 = new int[1];
      long[] longArray0 = new long[2];
      TIntLongHashMap tIntLongHashMap0 = new TIntLongHashMap(intArray0, longArray0);
      byte[] byteArray0 = new byte[6];
      byteArray0[0] = (byte) (-40);
      byteArray0[1] = (byte) (-40);
      byteArray0[2] = (byte) (-40);
      byteArray0[3] = (byte)16;
      tIntLongHashMap0._states = byteArray0;
      tIntLongHashMap0.putIfAbsent(302, 302);
      // Undeclared exception!
      try {
        tIntLongHashMap0.putIfAbsent((int) (byte) (-40), (long) (byte) (-40));
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // No free or removed slots available. Key set full?!!
         //
      }
  }

  //Test case number: 13
  /*
   * 17 covered goals:
   * 1 gnu.trove.impl.hash.TIntLongHash.insertKeyRehash(IIIB)I: I120 Branch 24 IF_ICMPEQ L336 - false
   * 2 gnu.trove.impl.hash.TIntLongHash.setUp(I)I: root-Branch
   * 3 gnu.trove.impl.hash.TIntLongHash.insertKeyAt(II)V: root-Branch
   * 4 gnu.trove.impl.hash.TIntLongHash.<init>(I)V: root-Branch
   * 5 gnu.trove.impl.hash.TIntLongHash.insertKeyRehash(IIIB)I: I28 Branch 16 IF_ICMPNE L306 - true
   * 6 gnu.trove.impl.hash.TIntLongHash.insertKeyRehash(IIIB)I: I28 Branch 16 IF_ICMPNE L306 - false
   * 7 gnu.trove.impl.hash.TIntLongHash.insertKeyRehash(IIIB)I: I31 Branch 17 IF_ICMPNE L306 - true
   * 8 gnu.trove.impl.hash.TIntLongHash.insertKeyRehash(IIIB)I: I31 Branch 17 IF_ICMPNE L306 - false
   * 9 gnu.trove.impl.hash.TIntLongHash.insertKeyRehash(IIIB)I: I45 Branch 18 IFGE L310 - true
   * 10 gnu.trove.impl.hash.TIntLongHash.insertKeyRehash(IIIB)I: I45 Branch 18 IFGE L310 - false
   * 11 gnu.trove.impl.hash.TIntLongHash.insertKeyRehash(IIIB)I: I62 Branch 19 IFNE L316 - true
   * 12 gnu.trove.impl.hash.TIntLongHash.insertKeyRehash(IIIB)I: I97 Branch 21 IF_ICMPNE L327 - true
   * 13 gnu.trove.impl.hash.TIntLongHash.insertKeyRehash(IIIB)I: I115 Branch 23 IF_ICMPNE L332 - true
   * 14 gnu.trove.impl.hash.TIntLongHash.insertKeyRehash(IIIB)I: I115 Branch 23 IF_ICMPNE L332 - false
   * 15 gnu.trove.impl.hash.TIntLongHash.insertKey(I)I: I30 Branch 13 IFNE L279 - true
   * 16 gnu.trove.impl.hash.TIntLongHash.insertKey(I)I: I30 Branch 13 IFNE L279 - false
   * 17 gnu.trove.impl.hash.TIntLongHash.insertKey(I)I: I50 Branch 14 IF_ICMPNE L286 - true
   */

  @Test
  public void test13()  throws Throwable  {
      int[] intArray0 = new int[1];
      long[] longArray0 = new long[2];
      TIntLongHashMap tIntLongHashMap0 = new TIntLongHashMap(intArray0, longArray0);
      byte[] byteArray0 = new byte[5];
      byteArray0[0] = (byte) (-40);
      byteArray0[1] = (byte) (-40);
      byteArray0[3] = (byte)2;
      tIntLongHashMap0._states = byteArray0;
      byteArray0[2] = (byte)2;
      byteArray0[4] = (byte) (-40);
      tIntLongHashMap0.putIfAbsent((int) (byte) (-40), (long) (byte) (-40));
      assertEquals(2, tIntLongHashMap0.size());
      assertEquals("{-40=-40}", tIntLongHashMap0.toString());
  }
}
