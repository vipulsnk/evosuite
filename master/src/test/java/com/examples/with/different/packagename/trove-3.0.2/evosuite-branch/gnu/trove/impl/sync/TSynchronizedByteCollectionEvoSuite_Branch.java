/*
 * This file was automatically generated by EvoSuite
 */

package gnu.trove.impl.sync;

import org.junit.Test;
import static org.junit.Assert.*;
import gnu.trove.TByteCollection;
import gnu.trove.impl.sync.TSynchronizedByteCollection;
import gnu.trove.impl.sync.TSynchronizedByteSet;
import gnu.trove.impl.sync.TSynchronizedRandomAccessByteList;
import gnu.trove.list.TByteList;
import gnu.trove.list.array.TByteArrayList;
import gnu.trove.list.linked.TByteLinkedList;
import gnu.trove.procedure.TByteProcedure;
import gnu.trove.set.TByteSet;
import gnu.trove.set.hash.TByteHashSet;
import java.util.Collection;
import java.util.LinkedList;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;

public class TSynchronizedByteCollectionEvoSuite_Branch {

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
   * 1 gnu.trove.impl.sync.TSynchronizedByteCollection.contains(B)Z: root-Branch
   * 2 gnu.trove.impl.sync.TSynchronizedByteCollection.<init>(Lgnu/trove/TByteCollection;)V: I7 Branch 1 IFNONNULL L59 - true
   */

  @Test
  public void test0()  throws Throwable  {
      byte[] byteArray0 = new byte[10];
      TByteArrayList tByteArrayList0 = new TByteArrayList(byteArray0);
      TSynchronizedRandomAccessByteList tSynchronizedRandomAccessByteList0 = new TSynchronizedRandomAccessByteList((TByteList) tByteArrayList0);
      boolean boolean0 = tSynchronizedRandomAccessByteList0.contains((byte)44);
      assertEquals(false, boolean0);
  }

  //Test case number: 1
  /*
   * 2 covered goals:
   * 1 gnu.trove.impl.sync.TSynchronizedByteCollection.containsAll(Ljava/util/Collection;)Z: root-Branch
   * 2 gnu.trove.impl.sync.TSynchronizedByteCollection.<init>(Lgnu/trove/TByteCollection;Ljava/lang/Object;)V: root-Branch
   */

  @Test
  public void test1()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      TByteArrayList tByteArrayList0 = TByteArrayList.wrap(byteArray0);
      TByteHashSet tByteHashSet0 = new TByteHashSet((TByteCollection) tByteArrayList0);
      LinkedList<String> linkedList0 = new LinkedList<String>();
      TSynchronizedByteSet tSynchronizedByteSet0 = new TSynchronizedByteSet((TByteSet) tByteHashSet0, (Object) "[]");
      boolean boolean0 = tSynchronizedByteSet0.containsAll((Collection<?>) linkedList0);
      assertEquals(true, boolean0);
  }

  //Test case number: 2
  /*
   * 1 covered goal:
   * 1 gnu.trove.impl.sync.TSynchronizedByteCollection.retainAll([B)Z: root-Branch
   */

  @Test
  public void test2()  throws Throwable  {
      TByteArrayList tByteArrayList0 = new TByteArrayList();
      TSynchronizedRandomAccessByteList tSynchronizedRandomAccessByteList0 = new TSynchronizedRandomAccessByteList((TByteList) tByteArrayList0);
      byte[] byteArray0 = new byte[10];
      boolean boolean0 = tSynchronizedRandomAccessByteList0.retainAll(byteArray0);
      assertEquals(false, boolean0);
  }

  //Test case number: 3
  /*
   * 1 covered goal:
   * 1 gnu.trove.impl.sync.TSynchronizedByteCollection.removeAll([B)Z: root-Branch
   */

  @Test
  public void test3()  throws Throwable  {
      TByteArrayList tByteArrayList0 = new TByteArrayList();
      TSynchronizedRandomAccessByteList tSynchronizedRandomAccessByteList0 = new TSynchronizedRandomAccessByteList((TByteList) tByteArrayList0);
      byte[] byteArray0 = new byte[10];
      boolean boolean0 = tSynchronizedRandomAccessByteList0.removeAll(byteArray0);
      assertEquals(false, boolean0);
  }

  //Test case number: 4
  /*
   * 1 covered goal:
   * 1 gnu.trove.impl.sync.TSynchronizedByteCollection.toString()Ljava/lang/String;: root-Branch
   */

  @Test
  public void test4()  throws Throwable  {
      TByteArrayList tByteArrayList0 = new TByteArrayList();
      TSynchronizedRandomAccessByteList tSynchronizedRandomAccessByteList0 = new TSynchronizedRandomAccessByteList((TByteList) tByteArrayList0);
      String string0 = tSynchronizedRandomAccessByteList0.toString();
      assertEquals("{}", string0);
  }

  //Test case number: 5
  /*
   * 1 covered goal:
   * 1 gnu.trove.impl.sync.TSynchronizedByteCollection.containsAll(Lgnu/trove/TByteCollection;)Z: root-Branch
   */

  @Test
  public void test5()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      TByteArrayList tByteArrayList0 = TByteArrayList.wrap(byteArray0);
      TByteHashSet tByteHashSet0 = new TByteHashSet((TByteCollection) tByteArrayList0);
      TSynchronizedByteSet tSynchronizedByteSet0 = new TSynchronizedByteSet((TByteSet) tByteHashSet0);
      boolean boolean0 = tSynchronizedByteSet0.containsAll((TByteCollection) tByteHashSet0);
      assertEquals(true, boolean0);
  }

  //Test case number: 6
  /*
   * 1 covered goal:
   * 1 gnu.trove.impl.sync.TSynchronizedByteCollection.addAll(Ljava/util/Collection;)Z: root-Branch
   */

  @Test
  public void test6()  throws Throwable  {
      TByteHashSet tByteHashSet0 = new TByteHashSet((-3));
      TSynchronizedByteCollection tSynchronizedByteCollection0 = new TSynchronizedByteCollection((TByteCollection) tByteHashSet0);
      LinkedList<Byte> linkedList0 = new LinkedList<Byte>();
      boolean boolean0 = tSynchronizedByteCollection0.addAll((Collection<? extends Byte>) linkedList0);
      assertEquals(false, boolean0);
  }

  //Test case number: 7
  /*
   * 1 covered goal:
   * 1 gnu.trove.impl.sync.TSynchronizedByteCollection.remove(B)Z: root-Branch
   */

  @Test
  public void test7()  throws Throwable  {
      TByteHashSet tByteHashSet0 = new TByteHashSet(1);
      TSynchronizedByteSet tSynchronizedByteSet0 = new TSynchronizedByteSet((TByteSet) tByteHashSet0);
      boolean boolean0 = tSynchronizedByteSet0.remove((byte)0);
      assertEquals(false, boolean0);
  }

  //Test case number: 8
  /*
   * 1 covered goal:
   * 1 gnu.trove.impl.sync.TSynchronizedByteCollection.getNoEntryValue()B: root-Branch
   */

  @Test
  public void test8()  throws Throwable  {
      TByteArrayList tByteArrayList0 = new TByteArrayList();
      TSynchronizedRandomAccessByteList tSynchronizedRandomAccessByteList0 = new TSynchronizedRandomAccessByteList((TByteList) tByteArrayList0);
      byte byte0 = tSynchronizedRandomAccessByteList0.getNoEntryValue();
      assertEquals((byte)0, byte0);
  }

  //Test case number: 9
  /*
   * 1 covered goal:
   * 1 gnu.trove.impl.sync.TSynchronizedByteCollection.isEmpty()Z: root-Branch
   */

  @Test
  public void test9()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      TByteArrayList tByteArrayList0 = TByteArrayList.wrap(byteArray0);
      TByteHashSet tByteHashSet0 = new TByteHashSet((TByteCollection) tByteArrayList0);
      TSynchronizedByteSet tSynchronizedByteSet0 = new TSynchronizedByteSet((TByteSet) tByteHashSet0);
      boolean boolean0 = tSynchronizedByteSet0.isEmpty();
      assertEquals(false, boolean0);
  }

  //Test case number: 10
  /*
   * 2 covered goals:
   * 1 gnu.trove.impl.sync.TSynchronizedByteCollection.iterator()Lgnu/trove/iterator/TByteIterator;: root-Branch
   * 2 gnu.trove.impl.sync.TSynchronizedByteCollection.removeAll(Lgnu/trove/TByteCollection;)Z: root-Branch
   */

  @Test
  public void test10()  throws Throwable  {
      TByteArrayList tByteArrayList0 = new TByteArrayList();
      TSynchronizedRandomAccessByteList tSynchronizedRandomAccessByteList0 = new TSynchronizedRandomAccessByteList((TByteList) tByteArrayList0);
      boolean boolean0 = tSynchronizedRandomAccessByteList0.removeAll((TByteCollection) tSynchronizedRandomAccessByteList0);
      assertEquals(false, boolean0);
  }

  //Test case number: 11
  /*
   * 1 covered goal:
   * 1 gnu.trove.impl.sync.TSynchronizedByteCollection.addAll(Lgnu/trove/TByteCollection;)Z: root-Branch
   */

  @Test
  public void test11()  throws Throwable  {
      TByteLinkedList tByteLinkedList0 = new TByteLinkedList();
      TSynchronizedRandomAccessByteList tSynchronizedRandomAccessByteList0 = new TSynchronizedRandomAccessByteList((TByteList) tByteLinkedList0);
      boolean boolean0 = tSynchronizedRandomAccessByteList0.addAll((TByteCollection) tByteLinkedList0);
      assertEquals(false, boolean0);
  }

  //Test case number: 12
  /*
   * 1 covered goal:
   * 1 gnu.trove.impl.sync.TSynchronizedByteCollection.clear()V: root-Branch
   */

  @Test
  public void test12()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      TByteArrayList tByteArrayList0 = TByteArrayList.wrap(byteArray0);
      TByteHashSet tByteHashSet0 = new TByteHashSet((TByteCollection) tByteArrayList0);
      TSynchronizedByteSet tSynchronizedByteSet0 = new TSynchronizedByteSet((TByteSet) tByteHashSet0);
      tSynchronizedByteSet0.clear();
      assertEquals(0, tByteHashSet0.size());
      assertEquals(true, tSynchronizedByteSet0.isEmpty());
  }

  //Test case number: 13
  /*
   * 1 covered goal:
   * 1 gnu.trove.impl.sync.TSynchronizedByteCollection.retainAll(Lgnu/trove/TByteCollection;)Z: root-Branch
   */

  @Test
  public void test13()  throws Throwable  {
      TByteArrayList tByteArrayList0 = new TByteArrayList();
      TSynchronizedRandomAccessByteList tSynchronizedRandomAccessByteList0 = new TSynchronizedRandomAccessByteList((TByteList) tByteArrayList0);
      boolean boolean0 = tSynchronizedRandomAccessByteList0.retainAll((TByteCollection) tByteArrayList0);
      assertEquals(false, boolean0);
  }

  //Test case number: 14
  /*
   * 1 covered goal:
   * 1 gnu.trove.impl.sync.TSynchronizedByteCollection.add(B)Z: root-Branch
   */

  @Test
  public void test14()  throws Throwable  {
      TByteArrayList tByteArrayList0 = new TByteArrayList();
      TSynchronizedRandomAccessByteList tSynchronizedRandomAccessByteList0 = new TSynchronizedRandomAccessByteList((TByteList) tByteArrayList0);
      boolean boolean0 = tSynchronizedRandomAccessByteList0.add((byte)0);
      assertEquals(false, tByteArrayList0.isEmpty());
      assertEquals(true, boolean0);
  }

  //Test case number: 15
  /*
   * 1 covered goal:
   * 1 gnu.trove.impl.sync.TSynchronizedByteCollection.retainAll(Ljava/util/Collection;)Z: root-Branch
   */

  @Test
  public void test15()  throws Throwable  {
      TByteArrayList tByteArrayList0 = new TByteArrayList();
      TSynchronizedRandomAccessByteList tSynchronizedRandomAccessByteList0 = new TSynchronizedRandomAccessByteList((TByteList) tByteArrayList0);
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      boolean boolean0 = tSynchronizedRandomAccessByteList0.retainAll((Collection<?>) linkedList0);
      assertEquals(false, boolean0);
  }

  //Test case number: 16
  /*
   * 1 covered goal:
   * 1 gnu.trove.impl.sync.TSynchronizedByteCollection.removeAll(Ljava/util/Collection;)Z: root-Branch
   */

  @Test
  public void test16()  throws Throwable  {
      TByteHashSet tByteHashSet0 = new TByteHashSet(1);
      TSynchronizedByteSet tSynchronizedByteSet0 = new TSynchronizedByteSet((TByteSet) tByteHashSet0);
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      boolean boolean0 = tSynchronizedByteSet0.removeAll((Collection<?>) linkedList0);
      assertEquals(false, boolean0);
  }

  //Test case number: 17
  /*
   * 1 covered goal:
   * 1 gnu.trove.impl.sync.TSynchronizedByteCollection.containsAll([B)Z: root-Branch
   */

  @Test
  public void test17()  throws Throwable  {
      TByteLinkedList tByteLinkedList0 = new TByteLinkedList();
      TSynchronizedRandomAccessByteList tSynchronizedRandomAccessByteList0 = new TSynchronizedRandomAccessByteList((TByteList) tByteLinkedList0);
      byte[] byteArray0 = new byte[19];
      boolean boolean0 = tSynchronizedRandomAccessByteList0.containsAll(byteArray0);
      assertEquals(false, boolean0);
  }

  //Test case number: 18
  /*
   * 1 covered goal:
   * 1 gnu.trove.impl.sync.TSynchronizedByteCollection.toArray([B)[B: root-Branch
   */

  @Test
  public void test18()  throws Throwable  {
      byte[] byteArray0 = new byte[10];
      TByteArrayList tByteArrayList0 = new TByteArrayList(byteArray0);
      TSynchronizedRandomAccessByteList tSynchronizedRandomAccessByteList0 = new TSynchronizedRandomAccessByteList((TByteList) tByteArrayList0);
      byte[] byteArray1 = tSynchronizedRandomAccessByteList0.toArray(byteArray0);
      assertSame(byteArray1, byteArray0);
  }

  //Test case number: 19
  /*
   * 1 covered goal:
   * 1 gnu.trove.impl.sync.TSynchronizedByteCollection.addAll([B)Z: root-Branch
   */

  @Test
  public void test19()  throws Throwable  {
      TByteHashSet tByteHashSet0 = new TByteHashSet(1);
      TSynchronizedByteSet tSynchronizedByteSet0 = new TSynchronizedByteSet((TByteSet) tByteHashSet0);
      boolean boolean0 = tSynchronizedByteSet0.addAll(tByteHashSet0._set);
      assertEquals(false, tByteHashSet0.isEmpty());
      assertEquals(true, boolean0);
  }

  //Test case number: 20
  /*
   * 1 covered goal:
   * 1 gnu.trove.impl.sync.TSynchronizedByteCollection.forEach(Lgnu/trove/procedure/TByteProcedure;)Z: root-Branch
   */

  @Test
  public void test20()  throws Throwable  {
      TByteLinkedList tByteLinkedList0 = new TByteLinkedList();
      TSynchronizedRandomAccessByteList tSynchronizedRandomAccessByteList0 = new TSynchronizedRandomAccessByteList((TByteList) tByteLinkedList0);
      boolean boolean0 = tSynchronizedRandomAccessByteList0.forEach((TByteProcedure) null);
      assertEquals(true, boolean0);
  }

  //Test case number: 21
  /*
   * 1 covered goal:
   * 1 gnu.trove.impl.sync.TSynchronizedByteCollection.toArray()[B: root-Branch
   */

  @Test
  public void test21()  throws Throwable  {
      TByteLinkedList tByteLinkedList0 = new TByteLinkedList();
      TSynchronizedRandomAccessByteList tSynchronizedRandomAccessByteList0 = new TSynchronizedRandomAccessByteList((TByteList) tByteLinkedList0);
      byte[] byteArray0 = tSynchronizedRandomAccessByteList0.toArray();
      assertNotNull(byteArray0);
  }

  //Test case number: 22
  /*
   * 2 covered goals:
   * 1 gnu.trove.impl.sync.TSynchronizedByteCollection.size()I: root-Branch
   * 2 gnu.trove.impl.sync.TSynchronizedByteCollection.<init>(Lgnu/trove/TByteCollection;)V: I7 Branch 1 IFNONNULL L59 - true
   */

  @Test
  public void test22()  throws Throwable  {
      TByteArrayList tByteArrayList0 = new TByteArrayList();
      TSynchronizedRandomAccessByteList tSynchronizedRandomAccessByteList0 = new TSynchronizedRandomAccessByteList((TByteList) tByteArrayList0);
      int int0 = tSynchronizedRandomAccessByteList0.size();
      assertEquals(0, int0);
  }

  //Test case number: 23
  /*
   * 1 covered goal:
   * 1 gnu.trove.impl.sync.TSynchronizedByteCollection.<init>(Lgnu/trove/TByteCollection;)V: I7 Branch 1 IFNONNULL L59 - false
   */

  @Test
  public void test23()  throws Throwable  {
      TSynchronizedRandomAccessByteList tSynchronizedRandomAccessByteList0 = null;
      try {
        tSynchronizedRandomAccessByteList0 = new TSynchronizedRandomAccessByteList((TByteList) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }
}
