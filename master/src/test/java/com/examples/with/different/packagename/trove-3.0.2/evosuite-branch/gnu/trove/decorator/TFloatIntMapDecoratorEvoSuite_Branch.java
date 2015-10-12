/*
 * This file was automatically generated by EvoSuite
 */

package gnu.trove.decorator;

import org.junit.Test;
import static org.junit.Assert.*;
import gnu.trove.decorator.TFloatIntMapDecorator;
import gnu.trove.map.TFloatIntMap;
import gnu.trove.map.hash.TFloatIntHashMap;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.Map;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;

public class TFloatIntMapDecoratorEvoSuite_Branch {

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
   * 10 covered goals:
   * 1 gnu.trove.decorator.TFloatIntMapDecorator.wrapValue(I)Ljava/lang/Integer;: root-Branch
   * 2 gnu.trove.decorator.TFloatIntMapDecorator.unwrapKey(Ljava/lang/Object;)F: root-Branch
   * 3 gnu.trove.decorator.TFloatIntMapDecorator.unwrapValue(Ljava/lang/Object;)I: root-Branch
   * 4 gnu.trove.decorator.TFloatIntMapDecorator.put(Ljava/lang/Float;Ljava/lang/Integer;)Ljava/lang/Integer;: I3 Branch 5 IFNONNULL L97 - true
   * 5 gnu.trove.decorator.TFloatIntMapDecorator.put(Ljava/lang/Float;Ljava/lang/Integer;)Ljava/lang/Integer;: I21 Branch 6 IFNONNULL L102 - true
   * 6 gnu.trove.decorator.TFloatIntMapDecorator.put(Ljava/lang/Float;Ljava/lang/Integer;)Ljava/lang/Integer;: I50 Branch 7 IF_ICMPNE L108 - false
   * 7 gnu.trove.decorator.TFloatIntMapDecorator.remove(Ljava/lang/Object;)Ljava/lang/Integer;: I3 Branch 11 IFNULL L160 - false
   * 8 gnu.trove.decorator.TFloatIntMapDecorator.remove(Ljava/lang/Object;)Ljava/lang/Integer;: I8 Branch 12 IFEQ L161 - false
   * 9 gnu.trove.decorator.TFloatIntMapDecorator.remove(Ljava/lang/Object;)Ljava/lang/Integer;: I40 Branch 13 IF_ICMPNE L173 - true
   * 10 gnu.trove.decorator.TFloatIntMapDecorator.<init>(Lgnu/trove/map/TFloatIntMap;)V: root-Branch
   */

  @Test
  public void test0()  throws Throwable  {
      TFloatIntHashMap tFloatIntHashMap0 = new TFloatIntHashMap(1940);
      TFloatIntMapDecorator tFloatIntMapDecorator0 = new TFloatIntMapDecorator((TFloatIntMap) tFloatIntHashMap0);
      Float float0 = new Float((float) 1940);
      tFloatIntMapDecorator0.put(float0, (Integer) 1940);
      assertEquals(false, tFloatIntHashMap0.isEmpty());
      
      Integer integer0 = tFloatIntMapDecorator0.remove((Object) float0);
      assertEquals(1940, (int)integer0);
  }

  //Test case number: 1
  /*
   * 2 covered goals:
   * 1 gnu.trove.decorator.TFloatIntMapDecorator.readExternal(Ljava/io/ObjectInput;)V: root-Branch
   * 2 gnu.trove.decorator.TFloatIntMapDecorator.<init>()V: root-Branch
   */

  @Test
  public void test1()  throws Throwable  {
      TFloatIntMapDecorator tFloatIntMapDecorator0 = new TFloatIntMapDecorator();
      // Undeclared exception!
      try {
        tFloatIntMapDecorator0.readExternal((ObjectInput) null);
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
   * 1 gnu.trove.decorator.TFloatIntMapDecorator.clear()V: root-Branch
   */

  @Test
  public void test2()  throws Throwable  {
      TFloatIntHashMap tFloatIntHashMap0 = new TFloatIntHashMap((-1), (-1));
      TFloatIntMapDecorator tFloatIntMapDecorator0 = new TFloatIntMapDecorator((TFloatIntMap) tFloatIntHashMap0);
      tFloatIntMapDecorator0.clear();
      assertEquals(0, tFloatIntMapDecorator0.size());
  }

  //Test case number: 3
  /*
   * 1 covered goal:
   * 1 gnu.trove.decorator.TFloatIntMapDecorator.writeExternal(Ljava/io/ObjectOutput;)V: root-Branch
   */

  @Test
  public void test3()  throws Throwable  {
      TFloatIntMapDecorator tFloatIntMapDecorator0 = new TFloatIntMapDecorator();
      // Undeclared exception!
      try {
        tFloatIntMapDecorator0.writeExternal((ObjectOutput) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  //Test case number: 4
  /*
   * 2 covered goals:
   * 1 gnu.trove.decorator.TFloatIntMapDecorator.size()I: root-Branch
   * 2 gnu.trove.decorator.TFloatIntMapDecorator.isEmpty()Z: I4 Branch 19 IFNE L320 - false
   */

  @Test
  public void test4()  throws Throwable  {
      TFloatIntHashMap tFloatIntHashMap0 = new TFloatIntHashMap(17, 17);
      TFloatIntMapDecorator tFloatIntMapDecorator0 = new TFloatIntMapDecorator((TFloatIntMap) tFloatIntHashMap0);
      boolean boolean0 = tFloatIntMapDecorator0.isEmpty();
      assertEquals(true, boolean0);
  }

  //Test case number: 5
  /*
   * 1 covered goal:
   * 1 gnu.trove.decorator.TFloatIntMapDecorator.getMap()Lgnu/trove/map/TFloatIntMap;: root-Branch
   */

//   @Test
//   public void test5()  throws Throwable  {
//       TFloatIntHashMap tFloatIntHashMap0 = new TFloatIntHashMap((-1), (-1));
//       TFloatIntMapDecorator tFloatIntMapDecorator0 = new TFloatIntMapDecorator((TFloatIntMap) tFloatIntHashMap0);
//       TFloatIntHashMap tFloatIntHashMap1 = (TFloatIntHashMap)tFloatIntMapDecorator0.getMap();
//       assertEquals(0.5F, tFloatIntHashMap1.getAutoCompactionFactor(), 0.01F);
//   }

  //Test case number: 6
  /*
   * 2 covered goals:
   * 1 gnu.trove.decorator.TFloatIntMapDecorator.put(Ljava/lang/Float;Ljava/lang/Integer;)Ljava/lang/Integer;: I3 Branch 5 IFNONNULL L97 - false
   * 2 gnu.trove.decorator.TFloatIntMapDecorator.<init>()V: root-Branch
   */

  @Test
  public void test6()  throws Throwable  {
      TFloatIntMapDecorator tFloatIntMapDecorator0 = new TFloatIntMapDecorator();
      // Undeclared exception!
      try {
        tFloatIntMapDecorator0.put((Float) null, (Integer) null);
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
   * 1 gnu.trove.decorator.TFloatIntMapDecorator.put(Ljava/lang/Float;Ljava/lang/Integer;)Ljava/lang/Integer;: I50 Branch 7 IF_ICMPNE L108 - true
   * 2 gnu.trove.decorator.TFloatIntMapDecorator.putAll(Ljava/util/Map;)V: I14 Branch 20 IFLE L334 - true
   * 3 gnu.trove.decorator.TFloatIntMapDecorator.putAll(Ljava/util/Map;)V: I14 Branch 20 IFLE L334 - false
   * 4 gnu.trove.decorator.TFloatIntMapDecorator.put(Ljava/lang/Float;Ljava/lang/Integer;)Ljava/lang/Integer;: I21 Branch 6 IFNONNULL L102 - false
   * 5 gnu.trove.decorator.TFloatIntMapDecorator$1.<init>(Lgnu/trove/decorator/TFloatIntMapDecorator;)V: root-Branch
   * 6 gnu.trove.decorator.TFloatIntMapDecorator$1.iterator()Ljava/util/Iterator;: root-Branch
   * 7 gnu.trove.decorator.TFloatIntMapDecorator$1$1.<init>(Lgnu/trove/decorator/TFloatIntMapDecorator$1;)V: root-Branch
   * 8 gnu.trove.decorator.TFloatIntMapDecorator$1$1.next()Ljava/util/Map$Entry;: I20 Branch 21 IFNE L214 - true
   * 9 gnu.trove.decorator.TFloatIntMapDecorator$1$1.next()Ljava/util/Map$Entry;: I45 Branch 22 IF_ICMPNE L216 - false
   * 10 gnu.trove.decorator.TFloatIntMapDecorator.entrySet()Ljava/util/Set;: root-Branch
   * 11 gnu.trove.decorator.TFloatIntMapDecorator.wrapKey(F)Ljava/lang/Float;: root-Branch
   * 12 gnu.trove.decorator.TFloatIntMapDecorator$1$1$1.getValue()Ljava/lang/Integer;: root-Branch
   * 13 gnu.trove.decorator.TFloatIntMapDecorator$1$1$1.<init>(Lgnu/trove/decorator/TFloatIntMapDecorator$1$1;Ljava/lang/Integer;Ljava/lang/Float;)V: root-Branch
   * 14 gnu.trove.decorator.TFloatIntMapDecorator$1$1$1.getKey()Ljava/lang/Float;: root-Branch
   */

  @Test
  public void test7()  throws Throwable  {
      float[] floatArray0 = new float[8];
      TFloatIntHashMap tFloatIntHashMap0 = new TFloatIntHashMap(1, (-1814.4557F));
      TFloatIntMapDecorator tFloatIntMapDecorator0 = new TFloatIntMapDecorator((TFloatIntMap) tFloatIntHashMap0);
      floatArray0[2] = (-1814.4557F);
      tFloatIntMapDecorator0.put((Float) (-1814.4557F), (Integer) 0);
      int[] intArray0 = new int[9];
      intArray0[2] = 1;
      TFloatIntHashMap tFloatIntHashMap1 = new TFloatIntHashMap(floatArray0, intArray0);
      TFloatIntMapDecorator tFloatIntMapDecorator1 = new TFloatIntMapDecorator((TFloatIntMap) tFloatIntHashMap1);
      tFloatIntMapDecorator1.putAll((Map<? extends Float, ? extends Integer>) tFloatIntMapDecorator0);
      assertEquals(7, tFloatIntHashMap0.capacity());
      assertEquals("{-1814.4557=0, 0.0=0}", tFloatIntHashMap1.toString());
  }

  //Test case number: 8
  /*
   * 2 covered goals:
   * 1 gnu.trove.decorator.TFloatIntMapDecorator.get(Ljava/lang/Object;)Ljava/lang/Integer;: I3 Branch 8 IFNULL L123 - false
   * 2 gnu.trove.decorator.TFloatIntMapDecorator.get(Ljava/lang/Object;)Ljava/lang/Integer;: I8 Branch 9 IFEQ L124 - true
   */

  @Test
  public void test8()  throws Throwable  {
      TFloatIntHashMap tFloatIntHashMap0 = new TFloatIntHashMap((-1), (-1));
      TFloatIntMapDecorator tFloatIntMapDecorator0 = new TFloatIntMapDecorator((TFloatIntMap) tFloatIntHashMap0);
      tFloatIntMapDecorator0.get((Object) tFloatIntHashMap0);
  }

  //Test case number: 9
  /*
   * 3 covered goals:
   * 1 gnu.trove.decorator.TFloatIntMapDecorator.get(Ljava/lang/Object;)Ljava/lang/Integer;: I8 Branch 9 IFEQ L124 - false
   * 2 gnu.trove.decorator.TFloatIntMapDecorator.get(Ljava/lang/Object;)Ljava/lang/Integer;: I3 Branch 8 IFNULL L123 - false
   * 3 gnu.trove.decorator.TFloatIntMapDecorator.get(Ljava/lang/Object;)Ljava/lang/Integer;: I40 Branch 10 IF_ICMPNE L136 - false
   */

  @Test
  public void test9()  throws Throwable  {
      TFloatIntHashMap tFloatIntHashMap0 = new TFloatIntHashMap(17, 17);
      TFloatIntMapDecorator tFloatIntMapDecorator0 = new TFloatIntMapDecorator((TFloatIntMap) tFloatIntHashMap0);
      Float float0 = new Float((float) 17);
      tFloatIntMapDecorator0.get((Object) float0);
  }

  //Test case number: 10
  /*
   * 2 covered goals:
   * 1 gnu.trove.decorator.TFloatIntMapDecorator.get(Ljava/lang/Object;)Ljava/lang/Integer;: I40 Branch 10 IF_ICMPNE L136 - true
   * 2 gnu.trove.decorator.TFloatIntMapDecorator.get(Ljava/lang/Object;)Ljava/lang/Integer;: I3 Branch 8 IFNULL L123 - true
   */

  @Test
  public void test10()  throws Throwable  {
      float[] floatArray0 = new float[3];
      int[] intArray0 = new int[2];
      intArray0[1] = 17;
      TFloatIntHashMap tFloatIntHashMap0 = new TFloatIntHashMap(floatArray0, intArray0);
      TFloatIntMapDecorator tFloatIntMapDecorator0 = new TFloatIntMapDecorator((TFloatIntMap) tFloatIntHashMap0);
      Integer integer0 = tFloatIntMapDecorator0.get((Object) null);
      assertEquals(17, (int)integer0);
      assertEquals("{null=17}", tFloatIntMapDecorator0.toString());
  }

  //Test case number: 11
  /*
   * 2 covered goals:
   * 1 gnu.trove.decorator.TFloatIntMapDecorator.remove(Ljava/lang/Object;)Ljava/lang/Integer;: I3 Branch 11 IFNULL L160 - true
   * 2 gnu.trove.decorator.TFloatIntMapDecorator.remove(Ljava/lang/Object;)Ljava/lang/Integer;: I40 Branch 13 IF_ICMPNE L173 - false
   */

  @Test
  public void test11()  throws Throwable  {
      TFloatIntHashMap tFloatIntHashMap0 = new TFloatIntHashMap(1940);
      TFloatIntMapDecorator tFloatIntMapDecorator0 = new TFloatIntMapDecorator((TFloatIntMap) tFloatIntHashMap0);
      tFloatIntMapDecorator0.remove((Object) null);
  }

  //Test case number: 12
  /*
   * 2 covered goals:
   * 1 gnu.trove.decorator.TFloatIntMapDecorator.remove(Ljava/lang/Object;)Ljava/lang/Integer;: I8 Branch 12 IFEQ L161 - true
   * 2 gnu.trove.decorator.TFloatIntMapDecorator.remove(Ljava/lang/Object;)Ljava/lang/Integer;: I3 Branch 11 IFNULL L160 - false
   */

  @Test
  public void test12()  throws Throwable  {
      TFloatIntHashMap tFloatIntHashMap0 = new TFloatIntHashMap(1940);
      TFloatIntMapDecorator tFloatIntMapDecorator0 = new TFloatIntMapDecorator((TFloatIntMap) tFloatIntHashMap0);
      tFloatIntMapDecorator0.remove((Object) tFloatIntMapDecorator0);
  }

  //Test case number: 13
  /*
   * 14 covered goals:
   * 1 gnu.trove.decorator.TFloatIntMapDecorator$1$1.next()Ljava/util/Map$Entry;: I45 Branch 22 IF_ICMPNE L216 - true
   * 2 gnu.trove.decorator.TFloatIntMapDecorator$1.<init>(Lgnu/trove/decorator/TFloatIntMapDecorator;)V: root-Branch
   * 3 gnu.trove.decorator.TFloatIntMapDecorator$1.iterator()Ljava/util/Iterator;: root-Branch
   * 4 gnu.trove.decorator.TFloatIntMapDecorator$1$1.hasNext()Z: root-Branch
   * 5 gnu.trove.decorator.TFloatIntMapDecorator$1$1.<init>(Lgnu/trove/decorator/TFloatIntMapDecorator$1;)V: root-Branch
   * 6 gnu.trove.decorator.TFloatIntMapDecorator$1$1.next()Ljava/util/Map$Entry;: I20 Branch 21 IFNE L214 - true
   * 7 gnu.trove.decorator.TFloatIntMapDecorator$1$1.next()Ljava/util/Map$Entry;: I20 Branch 21 IFNE L214 - false
   * 8 gnu.trove.decorator.TFloatIntMapDecorator$1$1.next()Ljava/util/Map$Entry;: I45 Branch 22 IF_ICMPNE L216 - false
   * 9 gnu.trove.decorator.TFloatIntMapDecorator.wrapValue(I)Ljava/lang/Integer;: root-Branch
   * 10 gnu.trove.decorator.TFloatIntMapDecorator.entrySet()Ljava/util/Set;: root-Branch
   * 11 gnu.trove.decorator.TFloatIntMapDecorator.wrapKey(F)Ljava/lang/Float;: root-Branch
   * 12 gnu.trove.decorator.TFloatIntMapDecorator$1$1$1.getValue()Ljava/lang/Integer;: root-Branch
   * 13 gnu.trove.decorator.TFloatIntMapDecorator$1$1$1.<init>(Lgnu/trove/decorator/TFloatIntMapDecorator$1$1;Ljava/lang/Integer;Ljava/lang/Float;)V: root-Branch
   * 14 gnu.trove.decorator.TFloatIntMapDecorator$1$1$1.getKey()Ljava/lang/Float;: root-Branch
   */

  @Test
  public void test13()  throws Throwable  {
      float[] floatArray0 = new float[8];
      floatArray0[2] = (-1814.4557F);
      int[] intArray0 = new int[9];
      intArray0[2] = 1;
      TFloatIntHashMap tFloatIntHashMap0 = new TFloatIntHashMap(floatArray0, intArray0);
      TFloatIntMapDecorator tFloatIntMapDecorator0 = new TFloatIntMapDecorator((TFloatIntMap) tFloatIntHashMap0);
      String string0 = tFloatIntMapDecorator0.toString();
      assertEquals("{-1814.4557=1, null=null}", string0);
  }

  //Test case number: 14
  /*
   * 1 covered goal:
   * 1 gnu.trove.decorator.TFloatIntMapDecorator.containsValue(Ljava/lang/Object;)Z: I4 Branch 14 IFEQ L288 - true
   */

  @Test
  public void test14()  throws Throwable  {
      TFloatIntHashMap tFloatIntHashMap0 = new TFloatIntHashMap((-1), (-1));
      TFloatIntMapDecorator tFloatIntMapDecorator0 = new TFloatIntMapDecorator((TFloatIntMap) tFloatIntHashMap0);
      boolean boolean0 = tFloatIntMapDecorator0.containsValue((Object) null);
      assertEquals(false, boolean0);
  }

  //Test case number: 15
  /*
   * 2 covered goals:
   * 1 gnu.trove.decorator.TFloatIntMapDecorator.containsValue(Ljava/lang/Object;)Z: I4 Branch 14 IFEQ L288 - false
   * 2 gnu.trove.decorator.TFloatIntMapDecorator.containsValue(Ljava/lang/Object;)Z: I11 Branch 15 IFEQ L288 - true
   */

  @Test
  public void test15()  throws Throwable  {
      TFloatIntHashMap tFloatIntHashMap0 = new TFloatIntHashMap();
      TFloatIntMapDecorator tFloatIntMapDecorator0 = new TFloatIntMapDecorator((TFloatIntMap) tFloatIntHashMap0);
      boolean boolean0 = tFloatIntMapDecorator0.containsValue((Object) 1939);
      assertEquals(false, boolean0);
  }

  //Test case number: 16
  /*
   * 2 covered goals:
   * 1 gnu.trove.decorator.TFloatIntMapDecorator.containsValue(Ljava/lang/Object;)Z: I11 Branch 15 IFEQ L288 - false
   * 2 gnu.trove.decorator.TFloatIntMapDecorator.containsValue(Ljava/lang/Object;)Z: I4 Branch 14 IFEQ L288 - false
   */

  @Test
  public void test16()  throws Throwable  {
      TFloatIntHashMap tFloatIntHashMap0 = new TFloatIntHashMap(1940);
      TFloatIntMapDecorator tFloatIntMapDecorator0 = new TFloatIntMapDecorator((TFloatIntMap) tFloatIntHashMap0);
      Float float0 = new Float((double) 1940);
      tFloatIntMapDecorator0.put(float0, (Integer) 1940);
      boolean boolean0 = tFloatIntMapDecorator0.containsValue((Object) 1940);
      assertEquals(false, tFloatIntMapDecorator0.isEmpty());
      assertEquals(true, boolean0);
  }

  //Test case number: 17
  /*
   * 3 covered goals:
   * 1 gnu.trove.decorator.TFloatIntMapDecorator.containsKey(Ljava/lang/Object;)Z: I3 Branch 16 IFNONNULL L299 - true
   * 2 gnu.trove.decorator.TFloatIntMapDecorator.containsKey(Ljava/lang/Object;)Z: I15 Branch 17 IFEQ L300 - false
   * 3 gnu.trove.decorator.TFloatIntMapDecorator.containsKey(Ljava/lang/Object;)Z: I22 Branch 18 IFEQ L300 - true
   */

  @Test
  public void test17()  throws Throwable  {
      TFloatIntHashMap tFloatIntHashMap0 = new TFloatIntHashMap();
      TFloatIntMapDecorator tFloatIntMapDecorator0 = new TFloatIntMapDecorator((TFloatIntMap) tFloatIntHashMap0);
      Float float0 = new Float(0.0);
      boolean boolean0 = tFloatIntMapDecorator0.containsKey((Object) float0);
      assertEquals(false, boolean0);
  }

  //Test case number: 18
  /*
   * 1 covered goal:
   * 1 gnu.trove.decorator.TFloatIntMapDecorator.containsKey(Ljava/lang/Object;)Z: I3 Branch 16 IFNONNULL L299 - false
   */

  @Test
  public void test18()  throws Throwable  {
      TFloatIntHashMap tFloatIntHashMap0 = new TFloatIntHashMap(1940);
      TFloatIntMapDecorator tFloatIntMapDecorator0 = new TFloatIntMapDecorator((TFloatIntMap) tFloatIntHashMap0);
      boolean boolean0 = tFloatIntMapDecorator0.containsKey((Object) null);
      assertEquals(false, boolean0);
  }

  //Test case number: 19
  /*
   * 1 covered goal:
   * 1 gnu.trove.decorator.TFloatIntMapDecorator.containsKey(Ljava/lang/Object;)Z: I15 Branch 17 IFEQ L300 - true
   */

  @Test
  public void test19()  throws Throwable  {
      TFloatIntHashMap tFloatIntHashMap0 = new TFloatIntHashMap();
      TFloatIntMapDecorator tFloatIntMapDecorator0 = new TFloatIntMapDecorator((TFloatIntMap) tFloatIntHashMap0);
      boolean boolean0 = tFloatIntMapDecorator0.containsKey((Object) tFloatIntHashMap0);
      assertEquals(false, boolean0);
  }

  //Test case number: 20
  /*
   * 3 covered goals:
   * 1 gnu.trove.decorator.TFloatIntMapDecorator.containsKey(Ljava/lang/Object;)Z: I22 Branch 18 IFEQ L300 - false
   * 2 gnu.trove.decorator.TFloatIntMapDecorator.containsKey(Ljava/lang/Object;)Z: I3 Branch 16 IFNONNULL L299 - true
   * 3 gnu.trove.decorator.TFloatIntMapDecorator.containsKey(Ljava/lang/Object;)Z: I15 Branch 17 IFEQ L300 - false
   */

  @Test
  public void test20()  throws Throwable  {
      TFloatIntHashMap tFloatIntHashMap0 = new TFloatIntHashMap();
      TFloatIntMapDecorator tFloatIntMapDecorator0 = new TFloatIntMapDecorator((TFloatIntMap) tFloatIntHashMap0);
      Float float0 = new Float(0.0);
      Integer integer0 = new Integer((-1));
      tFloatIntMapDecorator0.put(float0, integer0);
      boolean boolean0 = tFloatIntMapDecorator0.containsKey((Object) float0);
      assertEquals(1, tFloatIntMapDecorator0.size());
      assertEquals(true, boolean0);
  }

  //Test case number: 21
  /*
   * 8 covered goals:
   * 1 gnu.trove.decorator.TFloatIntMapDecorator.isEmpty()Z: I4 Branch 19 IFNE L320 - true
   * 2 gnu.trove.decorator.TFloatIntMapDecorator.<init>(Lgnu/trove/map/TFloatIntMap;)V: root-Branch
   * 3 gnu.trove.decorator.TFloatIntMapDecorator.unwrapKey(Ljava/lang/Object;)F: root-Branch
   * 4 gnu.trove.decorator.TFloatIntMapDecorator.size()I: root-Branch
   * 5 gnu.trove.decorator.TFloatIntMapDecorator.unwrapValue(Ljava/lang/Object;)I: root-Branch
   * 6 gnu.trove.decorator.TFloatIntMapDecorator.put(Ljava/lang/Float;Ljava/lang/Integer;)Ljava/lang/Integer;: I3 Branch 5 IFNONNULL L97 - true
   * 7 gnu.trove.decorator.TFloatIntMapDecorator.put(Ljava/lang/Float;Ljava/lang/Integer;)Ljava/lang/Integer;: I21 Branch 6 IFNONNULL L102 - true
   * 8 gnu.trove.decorator.TFloatIntMapDecorator.put(Ljava/lang/Float;Ljava/lang/Integer;)Ljava/lang/Integer;: I50 Branch 7 IF_ICMPNE L108 - false
   */

  @Test
  public void test21()  throws Throwable  {
      TFloatIntHashMap tFloatIntHashMap0 = new TFloatIntHashMap(17, 17);
      TFloatIntMapDecorator tFloatIntMapDecorator0 = new TFloatIntMapDecorator((TFloatIntMap) tFloatIntHashMap0);
      Float float0 = new Float((float) 17);
      tFloatIntMapDecorator0.put(float0, (Integer) 17);
      boolean boolean0 = tFloatIntMapDecorator0.isEmpty();
      assertEquals("{17.0=17}", tFloatIntMapDecorator0.toString());
      assertEquals(false, boolean0);
  }
}
