/*
 * This file was automatically generated by EvoSuite
 */

package gnu.trove.map.custom_hash;

import org.junit.Test;
import static org.junit.Assert.*;
import gnu.trove.map.TObjectFloatMap;
import gnu.trove.map.custom_hash.TObjectFloatCustomHashMap;
import gnu.trove.map.hash.TObjectFloatHashMap;
import gnu.trove.strategy.HashingStrategy;
import gnu.trove.strategy.IdentityHashingStrategy;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.StreamCorruptedException;
import java.lang.reflect.Array;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;

public class TObjectFloatCustomHashMapEvoSuite_Random {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.utils.LoggingUtils.setLoggingForJUnit(); 
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


  @Test
  public void test0()  throws Throwable  {
      TObjectFloatCustomHashMap<TObjectFloatHashMap<String>> tObjectFloatCustomHashMap0 = new TObjectFloatCustomHashMap<TObjectFloatHashMap<String>>();
      int int0 = (-1308);
      float float0 = (-1.0F);
      float float1 = 250.56139F;
      TObjectFloatHashMap<String> tObjectFloatHashMap0 = new TObjectFloatHashMap<String>(int0, float0, float1);
      float float2 = 0.5F;
      // Undeclared exception!
      try {
        tObjectFloatCustomHashMap0.adjustOrPutValue(tObjectFloatHashMap0, float1, float2);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

//   @Test
//   public void test1()  throws Throwable  {
//       IdentityHashingStrategy<Object> identityHashingStrategy0 = new IdentityHashingStrategy<Object>();
//       int int0 = 0;
//       float float0 = 1215.1359F;
//       TObjectFloatCustomHashMap<TObjectFloatCustomHashMap<String>> tObjectFloatCustomHashMap0 = new TObjectFloatCustomHashMap<TObjectFloatCustomHashMap<String>>((HashingStrategy<? super TObjectFloatCustomHashMap<String>>) identityHashingStrategy0, int0, float0);
//       Object[] objectArray0 = tObjectFloatCustomHashMap0.keys();
//       assertNotNull(objectArray0);
//       assertEquals(0.0F, tObjectFloatCustomHashMap0.getNoEntryValue(), 0.01F);
//   }

  @Test
  public void test2()  throws Throwable  {
      IdentityHashingStrategy<IdentityHashingStrategy<Integer>> identityHashingStrategy0 = new IdentityHashingStrategy<IdentityHashingStrategy<Integer>>();
      IdentityHashingStrategy<Object> identityHashingStrategy1 = new IdentityHashingStrategy<Object>();
      int int0 = 12203;
      float float0 = (-502.27423F);
      float float1 = (-1.0F);
      TObjectFloatCustomHashMap<IdentityHashingStrategy<Float>> tObjectFloatCustomHashMap0 = new TObjectFloatCustomHashMap<IdentityHashingStrategy<Float>>((HashingStrategy<? super IdentityHashingStrategy<Float>>) identityHashingStrategy1, int0, float0, float1);
      File file0 = null;
      boolean boolean0 = false;
      FileOutputStream fileOutputStream0 = null;
      try {
        fileOutputStream0 = new FileOutputStream(file0, boolean0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // name can't be null
         //
      }
  }

//  @Test
//  public void test3()  throws Throwable  {
//      TObjectFloatCustomHashMap<Object> tObjectFloatCustomHashMap0 = new TObjectFloatCustomHashMap<Object>();
//      TObjectFloatCustomHashMap<Integer>[] tObjectFloatCustomHashMapArray0 = (TObjectFloatCustomHashMap<Integer>[]) Array.newInstance(TObjectFloatCustomHashMap.class, 10);
//      IdentityHashingStrategy<Integer> identityHashingStrategy0 = new IdentityHashingStrategy<Integer>();
//      TObjectFloatCustomHashMap<Integer> tObjectFloatCustomHashMap1 = null;
//      try {
//        tObjectFloatCustomHashMap1 = new TObjectFloatCustomHashMap<Integer>((HashingStrategy<? super Integer>) identityHashingStrategy0, (TObjectFloatMap<? extends Integer>) tObjectFloatCustomHashMapArray0);
//        fail("Expecting exception: IllegalArgumentException");
//      
//      } catch(IllegalArgumentException e) {
//         //
//         // argument type mismatch
//         //
//      }
//  }

//   @Test
//   public void test4()  throws Throwable  {
//       IdentityHashingStrategy<Object> identityHashingStrategy0 = new IdentityHashingStrategy<Object>();
//       int int0 = 0;
//       TObjectFloatCustomHashMap<Float> tObjectFloatCustomHashMap0 = new TObjectFloatCustomHashMap<Float>((HashingStrategy<? super Float>) identityHashingStrategy0, int0);
//       assertEquals(0.0F, tObjectFloatCustomHashMap0.getNoEntryValue(), 0.01F);
//   }

  @Test
  public void test5()  throws Throwable  {
      IdentityHashingStrategy<Object> identityHashingStrategy0 = new IdentityHashingStrategy<Object>();
      TObjectFloatCustomHashMap<String> tObjectFloatCustomHashMap0 = new TObjectFloatCustomHashMap<String>((HashingStrategy<? super String>) identityHashingStrategy0);
      boolean boolean0 = false;
      tObjectFloatCustomHashMap0.reenableAutoCompaction(boolean0);
      assertEquals(23, tObjectFloatCustomHashMap0.capacity());
  }

  @Test
  public void test6()  throws Throwable  {
      TObjectFloatCustomHashMap<TObjectFloatHashMap<Float>> tObjectFloatCustomHashMap0 = new TObjectFloatCustomHashMap<TObjectFloatHashMap<Float>>();
      byte[] byteArray0 = new byte[5];
      byte byte0 = (byte) (-87);
      byteArray0[0] = byte0;
      byte byte1 = (byte)66;
      byteArray0[1] = byte1;
      byte byte2 = (byte)101;
      byteArray0[2] = byte2;
      byte byte3 = (byte)28;
      byteArray0[3] = byte3;
      byte byte4 = (byte)0;
      byteArray0[4] = byte4;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      ObjectInputStream objectInputStream0 = null;
      try {
        objectInputStream0 = new ObjectInputStream((InputStream) byteArrayInputStream0);
        fail("Expecting exception: StreamCorruptedException");
      
      } catch(StreamCorruptedException e) {
         //
         // invalid stream header: A942651C
         //
      }
  }
}
