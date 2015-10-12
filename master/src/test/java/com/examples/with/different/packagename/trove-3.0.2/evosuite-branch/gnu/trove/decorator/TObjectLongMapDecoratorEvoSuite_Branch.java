/*
 * This file was automatically generated by EvoSuite
 */

package gnu.trove.decorator;

import org.junit.Test;
import static org.junit.Assert.*;
import gnu.trove.decorator.TObjectLongMapDecorator;
import gnu.trove.map.TObjectLongMap;
import gnu.trove.map.custom_hash.TObjectLongCustomHashMap;
import gnu.trove.map.hash.TObjectLongHashMap;
import gnu.trove.strategy.HashingStrategy;
import gnu.trove.strategy.IdentityHashingStrategy;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;

public class TObjectLongMapDecoratorEvoSuite_Branch {

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
   * 1 gnu.trove.decorator.TObjectLongMapDecorator.getMap()Lgnu/trove/map/TObjectLongMap;: root-Branch
   * 2 gnu.trove.decorator.TObjectLongMapDecorator.<init>(Lgnu/trove/map/TObjectLongMap;)V: root-Branch
   */

  @Test
  public void test0()  throws Throwable  {
      TObjectLongHashMap<String> tObjectLongHashMap0 = new TObjectLongHashMap<String>();
      TObjectLongMapDecorator<String> tObjectLongMapDecorator0 = new TObjectLongMapDecorator<String>((TObjectLongMap<String>) tObjectLongHashMap0);
      TObjectLongMap<String> tObjectLongMap0 = tObjectLongMapDecorator0.getMap();
      assertEquals(true, tObjectLongMap0.isEmpty());
  }

  //Test case number: 1
  /*
   * 2 covered goals:
   * 1 gnu.trove.decorator.TObjectLongMapDecorator.readExternal(Ljava/io/ObjectInput;)V: root-Branch
   * 2 gnu.trove.decorator.TObjectLongMapDecorator.<init>()V: root-Branch
   */

  @Test
  public void test1()  throws Throwable  {
      TObjectLongMapDecorator<Object> tObjectLongMapDecorator0 = new TObjectLongMapDecorator<Object>();
      // Undeclared exception!
      try {
        tObjectLongMapDecorator0.readExternal((ObjectInput) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  //Test case number: 2
  /*
   * 1 covered goal:
   * 1 gnu.trove.decorator.TObjectLongMapDecorator.clear()V: root-Branch
   */

  @Test
  public void test2()  throws Throwable  {
      TObjectLongMapDecorator<Long> tObjectLongMapDecorator0 = new TObjectLongMapDecorator<Long>();
      // Undeclared exception!
      try {
        tObjectLongMapDecorator0.clear();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  //Test case number: 3
  /*
   * 1 covered goal:
   * 1 gnu.trove.decorator.TObjectLongMapDecorator.writeExternal(Ljava/io/ObjectOutput;)V: root-Branch
   */

  @Test
  public void test3()  throws Throwable  {
      TObjectLongMapDecorator<Integer> tObjectLongMapDecorator0 = new TObjectLongMapDecorator<Integer>();
      BufferedOutputStream bufferedOutputStream0 = new BufferedOutputStream((OutputStream) null);
      ObjectOutputStream objectOutputStream0 = new ObjectOutputStream((OutputStream) bufferedOutputStream0);
      tObjectLongMapDecorator0.writeExternal((ObjectOutput) objectOutputStream0);
  }

  //Test case number: 4
  /*
   * 1 covered goal:
   * 1 gnu.trove.decorator.TObjectLongMapDecorator.containsKey(Ljava/lang/Object;)Z: root-Branch
   */

  @Test
  public void test4()  throws Throwable  {
      IdentityHashingStrategy<String> identityHashingStrategy0 = new IdentityHashingStrategy<String>();
      TObjectLongCustomHashMap<String> tObjectLongCustomHashMap0 = new TObjectLongCustomHashMap<String>((HashingStrategy<? super String>) identityHashingStrategy0, 68, (float) 68, (long) 68);
      TObjectLongMapDecorator<String> tObjectLongMapDecorator0 = new TObjectLongMapDecorator<String>((TObjectLongMap<String>) tObjectLongCustomHashMap0);
      boolean boolean0 = tObjectLongMapDecorator0.containsKey((Object) "\u65E5\u672C");
      assertEquals(false, boolean0);
  }

  //Test case number: 5
  /*
   * 1 covered goal:
   * 1 gnu.trove.decorator.TObjectLongMapDecorator.put(Ljava/lang/Object;Ljava/lang/Long;)Ljava/lang/Long;: I3 Branch 5 IFNONNULL L97 - false
   */

  @Test
  public void test5()  throws Throwable  {
      TObjectLongMapDecorator<Object> tObjectLongMapDecorator0 = new TObjectLongMapDecorator<Object>();
      // Undeclared exception!
      try {
        tObjectLongMapDecorator0.put((Object) null, (Long) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  //Test case number: 6
  /*
   * 4 covered goals:
   * 1 gnu.trove.decorator.TObjectLongMapDecorator.get(Ljava/lang/Object;)Ljava/lang/Long;: I14 Branch 6 IFNE L113 - true
   * 2 gnu.trove.decorator.TObjectLongMapDecorator.wrapValue(J)Ljava/lang/Long;: root-Branch
   * 3 gnu.trove.decorator.TObjectLongMapDecorator.unwrapValue(Ljava/lang/Object;)J: root-Branch
   * 4 gnu.trove.decorator.TObjectLongMapDecorator.put(Ljava/lang/Object;Ljava/lang/Long;)Ljava/lang/Long;: I3 Branch 5 IFNONNULL L97 - true
   */

  @Test
  public void test6()  throws Throwable  {
      TObjectLongHashMap<String> tObjectLongHashMap0 = new TObjectLongHashMap<String>();
      TObjectLongMapDecorator<String> tObjectLongMapDecorator0 = new TObjectLongMapDecorator<String>((TObjectLongMap<String>) tObjectLongHashMap0);
      Long long0 = new Long((-858L));
      tObjectLongMapDecorator0.put("", long0);
      Long long1 = tObjectLongMapDecorator0.get((Object) "");
      assertEquals(false, tObjectLongMapDecorator0.isEmpty());
      assertEquals((-858L), (long)long1);
  }

  //Test case number: 7
  /*
   * 1 covered goal:
   * 1 gnu.trove.decorator.TObjectLongMapDecorator.get(Ljava/lang/Object;)Ljava/lang/Long;: I14 Branch 6 IFNE L113 - false
   */

  @Test
  public void test7()  throws Throwable  {
      Locale locale0 = Locale.GERMAN;
      TObjectLongHashMap<String> tObjectLongHashMap0 = new TObjectLongHashMap<String>();
      TObjectLongMapDecorator<String> tObjectLongMapDecorator0 = new TObjectLongMapDecorator<String>((TObjectLongMap<String>) tObjectLongHashMap0);
      tObjectLongMapDecorator0.get((Object) locale0);
  }

  //Test case number: 8
  /*
   * 1 covered goal:
   * 1 gnu.trove.decorator.TObjectLongMapDecorator.remove(Ljava/lang/Object;)Ljava/lang/Long;: I14 Branch 7 IFNE L140 - true
   */

  @Test
  public void test8()  throws Throwable  {
      TObjectLongHashMap<Object> tObjectLongHashMap0 = new TObjectLongHashMap<Object>((-21));
      TObjectLongMapDecorator<Object> tObjectLongMapDecorator0 = new TObjectLongMapDecorator<Object>((TObjectLongMap<Object>) tObjectLongHashMap0);
      Long long0 = new Long((long) (-21));
      tObjectLongMapDecorator0.put((Object) "", long0);
      assertEquals(false, tObjectLongMapDecorator0.isEmpty());
      
      Long long1 = tObjectLongMapDecorator0.remove((Object) "");
      assertEquals((-21L), (long)long1);
  }

  //Test case number: 9
  /*
   * 1 covered goal:
   * 1 gnu.trove.decorator.TObjectLongMapDecorator.remove(Ljava/lang/Object;)Ljava/lang/Long;: I14 Branch 7 IFNE L140 - false
   */

  @Test
  public void test9()  throws Throwable  {
      TObjectLongHashMap<Long> tObjectLongHashMap0 = new TObjectLongHashMap<Long>(18);
      TObjectLongMapDecorator<Long> tObjectLongMapDecorator0 = new TObjectLongMapDecorator<Long>((TObjectLongMap<Long>) tObjectLongHashMap0);
      tObjectLongMapDecorator0.remove((Object) null);
  }

  //Test case number: 10
  /*
   * 1 covered goal:
   * 1 gnu.trove.decorator.TObjectLongMapDecorator.containsValue(Ljava/lang/Object;)Z: I4 Branch 8 IFEQ L253 - true
   */

  @Test
  public void test10()  throws Throwable  {
      TObjectLongHashMap<String> tObjectLongHashMap0 = new TObjectLongHashMap<String>((-7));
      TObjectLongMapDecorator<String> tObjectLongMapDecorator0 = new TObjectLongMapDecorator<String>((TObjectLongMap<String>) tObjectLongHashMap0);
      boolean boolean0 = tObjectLongMapDecorator0.containsValue((Object) "");
      assertEquals(false, boolean0);
  }

  //Test case number: 11
  /*
   * 2 covered goals:
   * 1 gnu.trove.decorator.TObjectLongMapDecorator.containsValue(Ljava/lang/Object;)Z: I4 Branch 8 IFEQ L253 - false
   * 2 gnu.trove.decorator.TObjectLongMapDecorator.<init>()V: root-Branch
   */

  @Test
  public void test11()  throws Throwable  {
      TObjectLongMapDecorator<Long> tObjectLongMapDecorator0 = new TObjectLongMapDecorator<Long>();
      Long long0 = new Long(1737L);
      // Undeclared exception!
      try {
        tObjectLongMapDecorator0.containsValue((Object) long0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  //Test case number: 12
  /*
   * 2 covered goals:
   * 1 gnu.trove.decorator.TObjectLongMapDecorator.isEmpty()Z: I5 Branch 10 IFNE L284 - true
   * 2 gnu.trove.decorator.TObjectLongMapDecorator.wrapValue(J)Ljava/lang/Long;: root-Branch
   */

  @Test
  public void test12()  throws Throwable  {
      TObjectLongHashMap<String> tObjectLongHashMap0 = new TObjectLongHashMap<String>();
      TObjectLongMapDecorator<String> tObjectLongMapDecorator0 = new TObjectLongMapDecorator<String>((TObjectLongMap<String>) tObjectLongHashMap0);
      Long long0 = new Long((-858L));
      tObjectLongMapDecorator0.put("", long0);
      boolean boolean0 = tObjectLongMapDecorator0.isEmpty();
      assertEquals(1, tObjectLongMapDecorator0.size());
      assertEquals(false, boolean0);
  }

  //Test case number: 13
  /*
   * 1 covered goal:
   * 1 gnu.trove.decorator.TObjectLongMapDecorator.isEmpty()Z: I5 Branch 10 IFNE L284 - false
   */

  @Test
  public void test13()  throws Throwable  {
      IdentityHashingStrategy<String> identityHashingStrategy0 = new IdentityHashingStrategy<String>();
      TObjectLongCustomHashMap<String> tObjectLongCustomHashMap0 = new TObjectLongCustomHashMap<String>((HashingStrategy<? super String>) identityHashingStrategy0, 68, (float) 68, (long) 68);
      TObjectLongMapDecorator<String> tObjectLongMapDecorator0 = new TObjectLongMapDecorator<String>((TObjectLongMap<String>) tObjectLongCustomHashMap0);
      boolean boolean0 = tObjectLongMapDecorator0.isEmpty();
      assertEquals(true, boolean0);
  }

  //Test case number: 14
  /*
   * 6 covered goals:
   * 1 gnu.trove.decorator.TObjectLongMapDecorator.putAll(Ljava/util/Map;)V: I14 Branch 11 IFLE L297 - true
   * 2 gnu.trove.decorator.TObjectLongMapDecorator$1.iterator()Ljava/util/Iterator;: root-Branch
   * 3 gnu.trove.decorator.TObjectLongMapDecorator$1.<init>(Lgnu/trove/decorator/TObjectLongMapDecorator;)V: root-Branch
   * 4 gnu.trove.decorator.TObjectLongMapDecorator$1$1.<init>(Lgnu/trove/decorator/TObjectLongMapDecorator$1;)V: root-Branch
   * 5 gnu.trove.decorator.TObjectLongMapDecorator.entrySet()Ljava/util/Set;: root-Branch
   * 6 gnu.trove.decorator.TObjectLongMapDecorator.size()I: root-Branch
   */

  @Test
  public void test14()  throws Throwable  {
      TObjectLongHashMap<String> tObjectLongHashMap0 = new TObjectLongHashMap<String>((-7));
      TObjectLongMapDecorator<String> tObjectLongMapDecorator0 = new TObjectLongMapDecorator<String>((TObjectLongMap<String>) tObjectLongHashMap0);
      TObjectLongHashMap<Object> tObjectLongHashMap1 = new TObjectLongHashMap<Object>((TObjectLongMap<?>) tObjectLongHashMap0);
      TObjectLongMapDecorator<Object> tObjectLongMapDecorator1 = new TObjectLongMapDecorator<Object>((TObjectLongMap<Object>) tObjectLongHashMap1);
      tObjectLongMapDecorator1.putAll((Map<?, ? extends Long>) tObjectLongMapDecorator0);
      assertEquals(0, tObjectLongMapDecorator1.size());
  }

  //Test case number: 15
  /*
   * 10 covered goals:
   * 1 gnu.trove.decorator.TObjectLongMapDecorator.putAll(Ljava/util/Map;)V: I14 Branch 11 IFLE L297 - false
   * 2 gnu.trove.decorator.TObjectLongMapDecorator$1.iterator()Ljava/util/Iterator;: root-Branch
   * 3 gnu.trove.decorator.TObjectLongMapDecorator$1.<init>(Lgnu/trove/decorator/TObjectLongMapDecorator;)V: root-Branch
   * 4 gnu.trove.decorator.TObjectLongMapDecorator$1$1.hasNext()Z: root-Branch
   * 5 gnu.trove.decorator.TObjectLongMapDecorator$1$1.<init>(Lgnu/trove/decorator/TObjectLongMapDecorator$1;)V: root-Branch
   * 6 gnu.trove.decorator.TObjectLongMapDecorator.unwrapValue(Ljava/lang/Object;)J: root-Branch
   * 7 gnu.trove.decorator.TObjectLongMapDecorator.entrySet()Ljava/util/Set;: root-Branch
   * 8 gnu.trove.decorator.TObjectLongMapDecorator.<init>(Lgnu/trove/map/TObjectLongMap;)V: root-Branch
   * 9 gnu.trove.decorator.TObjectLongMapDecorator.size()I: root-Branch
   * 10 gnu.trove.decorator.TObjectLongMapDecorator.put(Ljava/lang/Object;Ljava/lang/Long;)Ljava/lang/Long;: I3 Branch 5 IFNONNULL L97 - true
   */

  @Test
  public void test15()  throws Throwable  {
      TObjectLongCustomHashMap<Object> tObjectLongCustomHashMap0 = new TObjectLongCustomHashMap<Object>();
      TObjectLongMapDecorator<Object> tObjectLongMapDecorator0 = new TObjectLongMapDecorator<Object>((TObjectLongMap<Object>) tObjectLongCustomHashMap0);
      HashMap<Object, Long> hashMap0 = new HashMap<Object, Long>((Map<?, ? extends Long>) tObjectLongMapDecorator0);
      Long long0 = new Long((long) 0);
      hashMap0.put((Object) "", long0);
      // Undeclared exception!
      try {
        tObjectLongMapDecorator0.putAll((Map<?, ? extends Long>) hashMap0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }
}
