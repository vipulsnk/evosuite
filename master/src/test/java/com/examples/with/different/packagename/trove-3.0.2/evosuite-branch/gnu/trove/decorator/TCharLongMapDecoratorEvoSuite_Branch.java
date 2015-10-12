/*
 * This file was automatically generated by EvoSuite
 */

package gnu.trove.decorator;

import org.junit.Test;
import static org.junit.Assert.*;
import gnu.trove.decorator.TCharLongMapDecorator;
import gnu.trove.map.TCharLongMap;
import gnu.trove.map.hash.TCharLongHashMap;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.AbstractMap;
import java.util.Map;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;

public class TCharLongMapDecoratorEvoSuite_Branch {

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
   * 17 covered goals:
   * 1 gnu.trove.decorator.TCharLongMapDecorator$1$1$1.getValue()Ljava/lang/Long;: root-Branch
   * 2 gnu.trove.decorator.TCharLongMapDecorator$1$1$1.getKey()Ljava/lang/Character;: root-Branch
   * 3 gnu.trove.decorator.TCharLongMapDecorator$1$1$1.<init>(Lgnu/trove/decorator/TCharLongMapDecorator$1$1;Ljava/lang/Long;Ljava/lang/Character;)V: root-Branch
   * 4 gnu.trove.decorator.TCharLongMapDecorator.wrapKey(C)Ljava/lang/Character;: root-Branch
   * 5 gnu.trove.decorator.TCharLongMapDecorator.unwrapValue(Ljava/lang/Object;)J: root-Branch
   * 6 gnu.trove.decorator.TCharLongMapDecorator.unwrapKey(Ljava/lang/Object;)C: root-Branch
   * 7 gnu.trove.decorator.TCharLongMapDecorator.put(Ljava/lang/Character;Ljava/lang/Long;)Ljava/lang/Long;: I3 Branch 5 IFNONNULL L97 - true
   * 8 gnu.trove.decorator.TCharLongMapDecorator.put(Ljava/lang/Character;Ljava/lang/Long;)Ljava/lang/Long;: I21 Branch 6 IFNONNULL L102 - true
   * 9 gnu.trove.decorator.TCharLongMapDecorator.put(Ljava/lang/Character;Ljava/lang/Long;)Ljava/lang/Long;: I51 Branch 7 IFNE L108 - false
   * 10 gnu.trove.decorator.TCharLongMapDecorator$1$1.next()Ljava/util/Map$Entry;: I19 Branch 21 IF_ICMPNE L214 - true
   * 11 gnu.trove.decorator.TCharLongMapDecorator$1$1.next()Ljava/util/Map$Entry;: I45 Branch 22 IFNE L216 - false
   * 12 gnu.trove.decorator.TCharLongMapDecorator$1$1.hasNext()Z: root-Branch
   * 13 gnu.trove.decorator.TCharLongMapDecorator$1$1.<init>(Lgnu/trove/decorator/TCharLongMapDecorator$1;)V: root-Branch
   * 14 gnu.trove.decorator.TCharLongMapDecorator.<init>(Lgnu/trove/map/TCharLongMap;)V: root-Branch
   * 15 gnu.trove.decorator.TCharLongMapDecorator.entrySet()Ljava/util/Set;: root-Branch
   * 16 gnu.trove.decorator.TCharLongMapDecorator$1.iterator()Ljava/util/Iterator;: root-Branch
   * 17 gnu.trove.decorator.TCharLongMapDecorator$1.<init>(Lgnu/trove/decorator/TCharLongMapDecorator;)V: root-Branch
   */

  @Test
  public void test0()  throws Throwable  {
      TCharLongHashMap tCharLongHashMap0 = new TCharLongHashMap();
      TCharLongMapDecorator tCharLongMapDecorator0 = new TCharLongMapDecorator((TCharLongMap) tCharLongHashMap0);
      Character character0 = Character.valueOf('\u001C');
      Long long0 = new Long(0L);
      tCharLongMapDecorator0.put(character0, long0);
      String string0 = tCharLongMapDecorator0.toString();
      assertEquals(1, tCharLongMapDecorator0.size());
      assertEquals("{\u001C=null}", string0);
  }

  //Test case number: 1
  /*
   * 1 covered goal:
   * 1 gnu.trove.decorator.TCharLongMapDecorator.getMap()Lgnu/trove/map/TCharLongMap;: root-Branch
   */

//   @Test
//   public void test1()  throws Throwable  {
//       TCharLongHashMap tCharLongHashMap0 = new TCharLongHashMap(545, (float) 545, 'v', (long) 545);
//       TCharLongMapDecorator tCharLongMapDecorator0 = new TCharLongMapDecorator((TCharLongMap) tCharLongHashMap0);
//       TCharLongHashMap tCharLongHashMap1 = (TCharLongHashMap)tCharLongMapDecorator0.getMap();
//       assertEquals(0.5F, tCharLongHashMap1.getAutoCompactionFactor(), 0.01F);
//   }

  //Test case number: 2
  /*
   * 2 covered goals:
   * 1 gnu.trove.decorator.TCharLongMapDecorator.writeExternal(Ljava/io/ObjectOutput;)V: root-Branch
   * 2 gnu.trove.decorator.TCharLongMapDecorator.<init>()V: root-Branch
   */

  @Test
  public void test2()  throws Throwable  {
      TCharLongMapDecorator tCharLongMapDecorator0 = new TCharLongMapDecorator();
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      ObjectOutputStream objectOutputStream0 = new ObjectOutputStream((OutputStream) byteArrayOutputStream0);
      tCharLongMapDecorator0.writeExternal((ObjectOutput) objectOutputStream0);
      assertEquals("\uFFFD\uFFFD\u0000\u0005w\u0001\u0000p", byteArrayOutputStream0.toString());
      assertEquals(8, byteArrayOutputStream0.size());
  }

  //Test case number: 3
  /*
   * 1 covered goal:
   * 1 gnu.trove.decorator.TCharLongMapDecorator.clear()V: root-Branch
   */

  @Test
  public void test3()  throws Throwable  {
      TCharLongHashMap tCharLongHashMap0 = new TCharLongHashMap(545, (float) 545, '\u0082', (long) 545);
      TCharLongMapDecorator tCharLongMapDecorator0 = new TCharLongMapDecorator((TCharLongMap) tCharLongHashMap0);
      tCharLongMapDecorator0.clear();
      assertEquals(0, tCharLongMapDecorator0.size());
  }

  //Test case number: 4
  /*
   * 4 covered goals:
   * 1 gnu.trove.decorator.TCharLongMapDecorator.wrapValue(J)Ljava/lang/Long;: root-Branch
   * 2 gnu.trove.decorator.TCharLongMapDecorator.put(Ljava/lang/Character;Ljava/lang/Long;)Ljava/lang/Long;: I3 Branch 5 IFNONNULL L97 - false
   * 3 gnu.trove.decorator.TCharLongMapDecorator.remove(Ljava/lang/Object;)Ljava/lang/Long;: I3 Branch 11 IFNULL L160 - true
   * 4 gnu.trove.decorator.TCharLongMapDecorator.remove(Ljava/lang/Object;)Ljava/lang/Long;: I41 Branch 13 IFNE L173 - true
   */

  @Test
  public void test4()  throws Throwable  {
      TCharLongHashMap tCharLongHashMap0 = new TCharLongHashMap((-17));
      TCharLongMapDecorator tCharLongMapDecorator0 = new TCharLongMapDecorator((TCharLongMap) tCharLongHashMap0);
      Long long0 = new Long((long) (-17));
      tCharLongMapDecorator0.put((Character) null, long0);
      assertEquals(false, tCharLongHashMap0.isEmpty());
      
      Long long1 = tCharLongMapDecorator0.remove((Object) null);
      assertEquals((-17L), (long)long1);
  }

  //Test case number: 5
  /*
   * 2 covered goals:
   * 1 gnu.trove.decorator.TCharLongMapDecorator.size()I: root-Branch
   * 2 gnu.trove.decorator.TCharLongMapDecorator.isEmpty()Z: I4 Branch 19 IFNE L320 - false
   */

  @Test
  public void test5()  throws Throwable  {
      TCharLongHashMap tCharLongHashMap0 = new TCharLongHashMap();
      TCharLongMapDecorator tCharLongMapDecorator0 = new TCharLongMapDecorator((TCharLongMap) tCharLongHashMap0);
      boolean boolean0 = tCharLongMapDecorator0.isEmpty();
      assertEquals(true, boolean0);
  }

  //Test case number: 6
  /*
   * 1 covered goal:
   * 1 gnu.trove.decorator.TCharLongMapDecorator.readExternal(Ljava/io/ObjectInput;)V: root-Branch
   */

  @Test
  public void test6()  throws Throwable  {
      TCharLongHashMap tCharLongHashMap0 = new TCharLongHashMap((-368));
      TCharLongMapDecorator tCharLongMapDecorator0 = new TCharLongMapDecorator((TCharLongMap) tCharLongHashMap0);
      // Undeclared exception!
      try {
        tCharLongMapDecorator0.readExternal((ObjectInput) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  //Test case number: 7
  /*
   * 1 covered goal:
   * 1 gnu.trove.decorator.TCharLongMapDecorator.put(Ljava/lang/Character;Ljava/lang/Long;)Ljava/lang/Long;: I21 Branch 6 IFNONNULL L102 - false
   */

  @Test
  public void test7()  throws Throwable  {
      TCharLongHashMap tCharLongHashMap0 = new TCharLongHashMap(545, (float) 545, 'v', (long) 545);
      TCharLongMapDecorator tCharLongMapDecorator0 = new TCharLongMapDecorator((TCharLongMap) tCharLongHashMap0);
      tCharLongMapDecorator0.put((Character) 'v', (Long) null);
      assertEquals(false, tCharLongMapDecorator0.isEmpty());
      assertEquals("{v=545}", tCharLongHashMap0.toString());
  }

  //Test case number: 8
  /*
   * 13 covered goals:
   * 1 gnu.trove.decorator.TCharLongMapDecorator.put(Ljava/lang/Character;Ljava/lang/Long;)Ljava/lang/Long;: I51 Branch 7 IFNE L108 - true
   * 2 gnu.trove.decorator.TCharLongMapDecorator$1$1.next()Ljava/util/Map$Entry;: I19 Branch 21 IF_ICMPNE L214 - false
   * 3 gnu.trove.decorator.TCharLongMapDecorator$1$1.next()Ljava/util/Map$Entry;: I45 Branch 22 IFNE L216 - true
   * 4 gnu.trove.decorator.TCharLongMapDecorator.putAll(Ljava/util/Map;)V: I14 Branch 20 IFLE L334 - true
   * 5 gnu.trove.decorator.TCharLongMapDecorator.putAll(Ljava/util/Map;)V: I14 Branch 20 IFLE L334 - false
   * 6 gnu.trove.decorator.TCharLongMapDecorator$1$1.<init>(Lgnu/trove/decorator/TCharLongMapDecorator$1;)V: root-Branch
   * 7 gnu.trove.decorator.TCharLongMapDecorator$1$1$1.getValue()Ljava/lang/Long;: root-Branch
   * 8 gnu.trove.decorator.TCharLongMapDecorator$1$1$1.getKey()Ljava/lang/Character;: root-Branch
   * 9 gnu.trove.decorator.TCharLongMapDecorator$1$1$1.<init>(Lgnu/trove/decorator/TCharLongMapDecorator$1$1;Ljava/lang/Long;Ljava/lang/Character;)V: root-Branch
   * 10 gnu.trove.decorator.TCharLongMapDecorator.entrySet()Ljava/util/Set;: root-Branch
   * 11 gnu.trove.decorator.TCharLongMapDecorator.put(Ljava/lang/Character;Ljava/lang/Long;)Ljava/lang/Long;: I3 Branch 5 IFNONNULL L97 - false
   * 12 gnu.trove.decorator.TCharLongMapDecorator$1.iterator()Ljava/util/Iterator;: root-Branch
   * 13 gnu.trove.decorator.TCharLongMapDecorator$1.<init>(Lgnu/trove/decorator/TCharLongMapDecorator;)V: root-Branch
   */

  @Test
  public void test8()  throws Throwable  {
      TCharLongHashMap tCharLongHashMap0 = new TCharLongHashMap(545, (float) 545, '\u0082', (long) 545);
      tCharLongHashMap0.put('\u0082', '\u0082');
      TCharLongMapDecorator tCharLongMapDecorator0 = new TCharLongMapDecorator((TCharLongMap) tCharLongHashMap0);
      tCharLongMapDecorator0.putAll((Map<? extends Character, ? extends Long>) tCharLongMapDecorator0);
      assertEquals(1, tCharLongHashMap0.size());
      assertEquals("{\u0082=130}", tCharLongHashMap0.toString());
  }

  //Test case number: 9
  /*
   * 2 covered goals:
   * 1 gnu.trove.decorator.TCharLongMapDecorator.get(Ljava/lang/Object;)Ljava/lang/Long;: I3 Branch 8 IFNULL L123 - true
   * 2 gnu.trove.decorator.TCharLongMapDecorator.get(Ljava/lang/Object;)Ljava/lang/Long;: I41 Branch 10 IFNE L136 - false
   */

  @Test
  public void test9()  throws Throwable  {
      TCharLongHashMap tCharLongHashMap0 = new TCharLongHashMap();
      TCharLongMapDecorator tCharLongMapDecorator0 = new TCharLongMapDecorator((TCharLongMap) tCharLongHashMap0);
      tCharLongMapDecorator0.get((Object) null);
  }

  //Test case number: 10
  /*
   * 2 covered goals:
   * 1 gnu.trove.decorator.TCharLongMapDecorator.get(Ljava/lang/Object;)Ljava/lang/Long;: I3 Branch 8 IFNULL L123 - false
   * 2 gnu.trove.decorator.TCharLongMapDecorator.get(Ljava/lang/Object;)Ljava/lang/Long;: I8 Branch 9 IFEQ L124 - true
   */

  @Test
  public void test10()  throws Throwable  {
      TCharLongHashMap tCharLongHashMap0 = new TCharLongHashMap(545, (float) 545, 'v', (long) 545);
      TCharLongMapDecorator tCharLongMapDecorator0 = new TCharLongMapDecorator((TCharLongMap) tCharLongHashMap0);
      AbstractMap.SimpleImmutableEntry<TCharLongHashMap, TCharLongHashMap> abstractMap_SimpleImmutableEntry0 = new AbstractMap.SimpleImmutableEntry<TCharLongHashMap, TCharLongHashMap>(tCharLongHashMap0, tCharLongHashMap0);
      tCharLongMapDecorator0.get((Object) abstractMap_SimpleImmutableEntry0);
  }

  //Test case number: 11
  /*
   * 2 covered goals:
   * 1 gnu.trove.decorator.TCharLongMapDecorator.get(Ljava/lang/Object;)Ljava/lang/Long;: I8 Branch 9 IFEQ L124 - false
   * 2 gnu.trove.decorator.TCharLongMapDecorator.get(Ljava/lang/Object;)Ljava/lang/Long;: I41 Branch 10 IFNE L136 - false
   */

  @Test
  public void test11()  throws Throwable  {
      char[] charArray0 = new char[22];
      long[] longArray0 = new long[21];
      TCharLongHashMap tCharLongHashMap0 = new TCharLongHashMap(charArray0, longArray0);
      TCharLongMapDecorator tCharLongMapDecorator0 = new TCharLongMapDecorator((TCharLongMap) tCharLongHashMap0);
      tCharLongMapDecorator0.get((Object) ' ');
  }

  //Test case number: 12
  /*
   * 4 covered goals:
   * 1 gnu.trove.decorator.TCharLongMapDecorator.get(Ljava/lang/Object;)Ljava/lang/Long;: I41 Branch 10 IFNE L136 - true
   * 2 gnu.trove.decorator.TCharLongMapDecorator.wrapValue(J)Ljava/lang/Long;: root-Branch
   * 3 gnu.trove.decorator.TCharLongMapDecorator.get(Ljava/lang/Object;)Ljava/lang/Long;: I3 Branch 8 IFNULL L123 - false
   * 4 gnu.trove.decorator.TCharLongMapDecorator.get(Ljava/lang/Object;)Ljava/lang/Long;: I8 Branch 9 IFEQ L124 - false
   */

  @Test
  public void test12()  throws Throwable  {
      char[] charArray0 = new char[22];
      charArray0[0] = ' ';
      long[] longArray0 = new long[21];
      longArray0[0] = (long) ' ';
      TCharLongHashMap tCharLongHashMap0 = new TCharLongHashMap(charArray0, longArray0);
      TCharLongMapDecorator tCharLongMapDecorator0 = new TCharLongMapDecorator((TCharLongMap) tCharLongHashMap0);
      Long long0 = tCharLongMapDecorator0.get((Object) ' ');
      assertEquals("{ =32, null=null}", tCharLongMapDecorator0.toString());
      assertEquals(32L, (long)long0);
  }

  //Test case number: 13
  /*
   * 2 covered goals:
   * 1 gnu.trove.decorator.TCharLongMapDecorator.remove(Ljava/lang/Object;)Ljava/lang/Long;: I3 Branch 11 IFNULL L160 - false
   * 2 gnu.trove.decorator.TCharLongMapDecorator.remove(Ljava/lang/Object;)Ljava/lang/Long;: I8 Branch 12 IFEQ L161 - true
   */

  @Test
  public void test13()  throws Throwable  {
      TCharLongMapDecorator tCharLongMapDecorator0 = new TCharLongMapDecorator();
      TCharLongHashMap tCharLongHashMap0 = new TCharLongHashMap((-1950), (-1950));
      tCharLongMapDecorator0.remove((Object) tCharLongHashMap0);
  }

  //Test case number: 14
  /*
   * 3 covered goals:
   * 1 gnu.trove.decorator.TCharLongMapDecorator.remove(Ljava/lang/Object;)Ljava/lang/Long;: I8 Branch 12 IFEQ L161 - false
   * 2 gnu.trove.decorator.TCharLongMapDecorator.<init>()V: root-Branch
   * 3 gnu.trove.decorator.TCharLongMapDecorator.remove(Ljava/lang/Object;)Ljava/lang/Long;: I3 Branch 11 IFNULL L160 - false
   */

  @Test
  public void test14()  throws Throwable  {
      TCharLongMapDecorator tCharLongMapDecorator0 = new TCharLongMapDecorator();
      // Undeclared exception!
      try {
        tCharLongMapDecorator0.remove((Object) 'c');
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  //Test case number: 15
  /*
   * 2 covered goals:
   * 1 gnu.trove.decorator.TCharLongMapDecorator.remove(Ljava/lang/Object;)Ljava/lang/Long;: I41 Branch 13 IFNE L173 - false
   * 2 gnu.trove.decorator.TCharLongMapDecorator.remove(Ljava/lang/Object;)Ljava/lang/Long;: I3 Branch 11 IFNULL L160 - true
   */

  @Test
  public void test15()  throws Throwable  {
      TCharLongHashMap tCharLongHashMap0 = new TCharLongHashMap();
      TCharLongMapDecorator tCharLongMapDecorator0 = new TCharLongMapDecorator((TCharLongMap) tCharLongHashMap0);
      tCharLongMapDecorator0.remove((Object) null);
  }

  //Test case number: 16
  /*
   * 1 covered goal:
   * 1 gnu.trove.decorator.TCharLongMapDecorator.containsValue(Ljava/lang/Object;)Z: I4 Branch 14 IFEQ L288 - true
   */

  @Test
  public void test16()  throws Throwable  {
      TCharLongHashMap tCharLongHashMap0 = new TCharLongHashMap();
      TCharLongMapDecorator tCharLongMapDecorator0 = new TCharLongMapDecorator((TCharLongMap) tCharLongHashMap0);
      boolean boolean0 = tCharLongMapDecorator0.containsValue((Object) null);
      assertEquals(false, boolean0);
  }

  //Test case number: 17
  /*
   * 2 covered goals:
   * 1 gnu.trove.decorator.TCharLongMapDecorator.containsValue(Ljava/lang/Object;)Z: I4 Branch 14 IFEQ L288 - false
   * 2 gnu.trove.decorator.TCharLongMapDecorator.containsValue(Ljava/lang/Object;)Z: I11 Branch 15 IFEQ L288 - true
   */

  @Test
  public void test17()  throws Throwable  {
      TCharLongHashMap tCharLongHashMap0 = new TCharLongHashMap(545, (float) 545, '\u0082', (long) 545);
      long long0 = tCharLongHashMap0.put('\u0082', '\u0082');
      TCharLongMapDecorator tCharLongMapDecorator0 = new TCharLongMapDecorator((TCharLongMap) tCharLongHashMap0);
      boolean boolean0 = tCharLongMapDecorator0.containsValue((Object) long0);
      assertEquals(false, boolean0);
  }

  //Test case number: 18
  /*
   * 2 covered goals:
   * 1 gnu.trove.decorator.TCharLongMapDecorator.containsValue(Ljava/lang/Object;)Z: I11 Branch 15 IFEQ L288 - false
   * 2 gnu.trove.decorator.TCharLongMapDecorator.containsValue(Ljava/lang/Object;)Z: I4 Branch 14 IFEQ L288 - false
   */

  @Test
  public void test18()  throws Throwable  {
      TCharLongHashMap tCharLongHashMap0 = new TCharLongHashMap(545, (float) 545, '\u0082', (long) 545);
      tCharLongHashMap0.put('\u0082', '\u0082');
      TCharLongMapDecorator tCharLongMapDecorator0 = new TCharLongMapDecorator((TCharLongMap) tCharLongHashMap0);
      Long long0 = new Long((long) '\u0082');
      boolean boolean0 = tCharLongMapDecorator0.containsValue((Object) long0);
      assertEquals(true, boolean0);
  }

  //Test case number: 19
  /*
   * 3 covered goals:
   * 1 gnu.trove.decorator.TCharLongMapDecorator.containsKey(Ljava/lang/Object;)Z: I3 Branch 16 IFNONNULL L299 - true
   * 2 gnu.trove.decorator.TCharLongMapDecorator.containsKey(Ljava/lang/Object;)Z: I15 Branch 17 IFEQ L300 - false
   * 3 gnu.trove.decorator.TCharLongMapDecorator.containsKey(Ljava/lang/Object;)Z: I22 Branch 18 IFEQ L300 - true
   */

  @Test
  public void test19()  throws Throwable  {
      TCharLongHashMap tCharLongHashMap0 = new TCharLongHashMap();
      TCharLongMapDecorator tCharLongMapDecorator0 = new TCharLongMapDecorator((TCharLongMap) tCharLongHashMap0);
      Character character0 = Character.valueOf('\u001C');
      boolean boolean0 = tCharLongMapDecorator0.containsKey((Object) character0);
      assertEquals(false, boolean0);
  }

  //Test case number: 20
  /*
   * 1 covered goal:
   * 1 gnu.trove.decorator.TCharLongMapDecorator.containsKey(Ljava/lang/Object;)Z: I3 Branch 16 IFNONNULL L299 - false
   */

  @Test
  public void test20()  throws Throwable  {
      TCharLongHashMap tCharLongHashMap0 = new TCharLongHashMap((-17));
      TCharLongMapDecorator tCharLongMapDecorator0 = new TCharLongMapDecorator((TCharLongMap) tCharLongHashMap0);
      boolean boolean0 = tCharLongMapDecorator0.containsKey((Object) null);
      assertEquals(false, boolean0);
  }

  //Test case number: 21
  /*
   * 1 covered goal:
   * 1 gnu.trove.decorator.TCharLongMapDecorator.containsKey(Ljava/lang/Object;)Z: I15 Branch 17 IFEQ L300 - true
   */

  @Test
  public void test21()  throws Throwable  {
      char[] charArray0 = new char[22];
      long[] longArray0 = new long[21];
      TCharLongHashMap tCharLongHashMap0 = new TCharLongHashMap(charArray0, longArray0);
      TCharLongMapDecorator tCharLongMapDecorator0 = new TCharLongMapDecorator((TCharLongMap) tCharLongHashMap0);
      boolean boolean0 = tCharLongMapDecorator0.containsKey((Object) "{ =32, \u0000=0}");
      assertEquals(false, boolean0);
  }

  //Test case number: 22
  /*
   * 3 covered goals:
   * 1 gnu.trove.decorator.TCharLongMapDecorator.containsKey(Ljava/lang/Object;)Z: I22 Branch 18 IFEQ L300 - false
   * 2 gnu.trove.decorator.TCharLongMapDecorator.containsKey(Ljava/lang/Object;)Z: I3 Branch 16 IFNONNULL L299 - true
   * 3 gnu.trove.decorator.TCharLongMapDecorator.containsKey(Ljava/lang/Object;)Z: I15 Branch 17 IFEQ L300 - false
   */

  @Test
  public void test22()  throws Throwable  {
      TCharLongHashMap tCharLongHashMap0 = new TCharLongHashMap();
      TCharLongMapDecorator tCharLongMapDecorator0 = new TCharLongMapDecorator((TCharLongMap) tCharLongHashMap0);
      Character character0 = Character.valueOf('\u001C');
      Long long0 = new Long(0L);
      tCharLongMapDecorator0.put(character0, long0);
      boolean boolean0 = tCharLongMapDecorator0.containsKey((Object) character0);
      assertEquals(1, tCharLongMapDecorator0.size());
      assertEquals(true, boolean0);
  }

  //Test case number: 23
  /*
   * 8 covered goals:
   * 1 gnu.trove.decorator.TCharLongMapDecorator.isEmpty()Z: I4 Branch 19 IFNE L320 - true
   * 2 gnu.trove.decorator.TCharLongMapDecorator.<init>(Lgnu/trove/map/TCharLongMap;)V: root-Branch
   * 3 gnu.trove.decorator.TCharLongMapDecorator.size()I: root-Branch
   * 4 gnu.trove.decorator.TCharLongMapDecorator.unwrapValue(Ljava/lang/Object;)J: root-Branch
   * 5 gnu.trove.decorator.TCharLongMapDecorator.unwrapKey(Ljava/lang/Object;)C: root-Branch
   * 6 gnu.trove.decorator.TCharLongMapDecorator.put(Ljava/lang/Character;Ljava/lang/Long;)Ljava/lang/Long;: I3 Branch 5 IFNONNULL L97 - true
   * 7 gnu.trove.decorator.TCharLongMapDecorator.put(Ljava/lang/Character;Ljava/lang/Long;)Ljava/lang/Long;: I21 Branch 6 IFNONNULL L102 - true
   * 8 gnu.trove.decorator.TCharLongMapDecorator.put(Ljava/lang/Character;Ljava/lang/Long;)Ljava/lang/Long;: I51 Branch 7 IFNE L108 - false
   */

  @Test
  public void test23()  throws Throwable  {
      TCharLongHashMap tCharLongHashMap0 = new TCharLongHashMap(545, (float) 545, 'v', (long) 545);
      TCharLongMapDecorator tCharLongMapDecorator0 = new TCharLongMapDecorator((TCharLongMap) tCharLongHashMap0);
      Long long0 = new Long((long) 545);
      tCharLongMapDecorator0.put((Character) 'v', long0);
      boolean boolean0 = tCharLongMapDecorator0.isEmpty();
      assertEquals(1, tCharLongHashMap0.size());
      assertEquals(false, boolean0);
  }
}
