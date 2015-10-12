/*
 * This file was automatically generated by EvoSuite
 */

package gnu.trove.impl.hash;

import org.junit.Test;
import static org.junit.Assert.*;
import gnu.trove.map.TIntByteMap;
import gnu.trove.map.hash.TIntByteHashMap;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import org.evosuite.Properties.SandboxMode;
import org.evosuite.sandbox.Sandbox;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;

public class TIntByteHashEvoSuite_Random {

  private static ExecutorService executor; 

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.utils.LoggingUtils.setLoggingForJUnit(); 
    org.evosuite.Properties.REPLACE_CALLS = true; 
    org.evosuite.agent.InstrumentingAgent.initialize(); 
    org.evosuite.Properties.SANDBOX_MODE = SandboxMode.RECOMMENDED; 
    Sandbox.initializeSecurityManagerForSUT(); 
    executor = Executors.newCachedThreadPool(); 
  } 

  @AfterClass 
  public static void clearEvoSuiteFramework(){ 
    executor.shutdownNow(); 
    Sandbox.resetDefaultSecurityManager(); 
  } 

  @Before 
  public void initTestCase(){ 
    Sandbox.goingToExecuteSUTCode(); 
    org.evosuite.agent.InstrumentingAgent.activate(); 
  } 

  @After 
  public void doneWithTestCase(){ 
    Sandbox.doneWithExecutingSUTCode(); 
    org.evosuite.agent.InstrumentingAgent.deactivate(); 
  } 


  @Test
  public void test0()  throws Throwable  {
    Future<?> future = executor.submit(new Runnable(){ 
            public void run() { 
        try {
          int int0 = 1;
          int[] intArray0 = new int[6];
          int int1 = 1;
          intArray0[0] = int1;
          intArray0[1] = int0;
          int int2 = 0;
          intArray0[2] = int2;
          intArray0[3] = int0;
          intArray0[4] = int0;
          intArray0[5] = int0;
          byte[] byteArray0 = new byte[4];
          byte byte0 = (byte) (-3);
          byteArray0[0] = byte0;
          byte byte1 = (byte)0;
          byteArray0[1] = byte1;
          byte byte2 = (byte) (-59);
          byteArray0[2] = byte2;
          byte byte3 = (byte)0;
          byteArray0[3] = byte3;
          TIntByteHashMap tIntByteHashMap0 = new TIntByteHashMap(intArray0, byteArray0);
          TIntByteHashMap tIntByteHashMap1 = new TIntByteHashMap((TIntByteMap) tIntByteHashMap0);
          tIntByteHashMap1.clear();
          TIntByteHashMap tIntByteHashMap2 = new TIntByteHashMap(int0, int0);
          TIntByteHashMap tIntByteHashMap3 = new TIntByteHashMap((TIntByteMap) tIntByteHashMap2);
          tIntByteHashMap2.increment(int0);
          int int3 = 1300;
          byte byte4 = (byte)0;
          tIntByteHashMap3.adjustValue(int3, byte4);
          tIntByteHashMap3.trimToSize();
          String string0 = "end index > size: ";
          FileOutputStream fileOutputStream0 = null;
          try {
            fileOutputStream0 = new FileOutputStream(string0);
            fail("Expecting exception: SecurityException");
          
          } catch(SecurityException e) {
             //
             // Security manager blocks (\"java.io.FilePermission\" \"end index > size: \" \"write\")
             // java.lang.Thread.getStackTrace(Thread.java:1567)
             // org.evosuite.sandbox.MSecurityManager.checkPermission(MSecurityManager.java:303)
             // java.lang.SecurityManager.checkWrite(SecurityManager.java:979)
             // java.io.FileOutputStream.<init>(FileOutputStream.java:203)
             // java.io.FileOutputStream.<init>(FileOutputStream.java:104)
             // sun.reflect.GeneratedConstructorAccessor12.newInstance(Unknown Source)
             // sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)
             // java.lang.reflect.Constructor.newInstance(Constructor.java:525)
             // org.evosuite.testcase.ConstructorStatement$1.execute(ConstructorStatement.java:226)
             // org.evosuite.testcase.AbstractStatement.exceptionHandler(AbstractStatement.java:144)
             // org.evosuite.testcase.ConstructorStatement.execute(ConstructorStatement.java:188)
             // org.evosuite.testcase.TestRunnable.call(TestRunnable.java:291)
             // org.evosuite.testcase.TestRunnable.call(TestRunnable.java:1)
             // java.util.concurrent.FutureTask$Sync.innerRun(FutureTask.java:334)
             // java.util.concurrent.FutureTask.run(FutureTask.java:166)
             // java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1110)
             // java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:603)
             // java.lang.Thread.run(Thread.java:722)
             //
          }
        } catch(Throwable t) {
            // Need to catch declared exceptions
        }
      } 
    }); 
    future.get(6000, TimeUnit.MILLISECONDS); 
  }

//   @Test
//   public void test1()  throws Throwable  {
//       int int0 = (-331);
//       TIntByteHashMap tIntByteHashMap0 = new TIntByteHashMap(int0);
//       tIntByteHashMap0.trimToSize();
//       assertEquals(0, tIntByteHashMap0.getNoEntryValue());
//       assertEquals(0, tIntByteHashMap0.getNoEntryKey());
//       
//       float float0 = 0.0F;
//       int int1 = Integer.MAX_VALUE;
//       byte byte0 = (byte) (-1);
//       TIntByteHashMap tIntByteHashMap1 = new TIntByteHashMap(int0, float0, int1, byte0);
//       TIntByteHashMap tIntByteHashMap2 = null;
//       try {
//         tIntByteHashMap2 = new TIntByteHashMap((TIntByteMap) tIntByteHashMap1);
//         fail("Expecting exception: OutOfMemoryError");
//       
//       } catch(OutOfMemoryError e) {
//          //
//          // Java heap space
//          //
//       }
//   }

  @Test
  public void test2()  throws Throwable  {
      int int0 = 0;
      TIntByteHashMap tIntByteHashMap0 = new TIntByteHashMap(int0);
      tIntByteHashMap0.getNoEntryKey();
      int int1 = (-3);
      int int2 = (-1773);
      int[] intArray0 = new int[6];
      intArray0[0] = int2;
      intArray0[1] = int1;
      intArray0[2] = int2;
      intArray0[3] = int2;
      int int3 = 0;
      intArray0[4] = int3;
      intArray0[5] = int1;
      byte[] byteArray0 = new byte[5];
      byte byte0 = (byte)0;
      byteArray0[0] = byte0;
      byte byte1 = (byte) (-1);
      byteArray0[1] = byte1;
      byte byte2 = (byte) (-1);
      byteArray0[2] = byte2;
      byte byte3 = (byte)10;
      byteArray0[3] = byte3;
      byte byte4 = (byte)8;
      byteArray0[4] = byte4;
      TIntByteHashMap tIntByteHashMap1 = new TIntByteHashMap(intArray0, byteArray0);
      int int4 = tIntByteHashMap1.getNoEntryKey();
      assertEquals(3, tIntByteHashMap1.size());
      assertEquals("{-3=-1, -1773=10, 0=8}", tIntByteHashMap1.toString());
      assertEquals(0, int4);
      
      TIntByteHashMap tIntByteHashMap2 = new TIntByteHashMap(int2);
      byte byte5 = (byte) (-22);
      boolean boolean0 = tIntByteHashMap2.adjustValue(int1, byte5);
      assertEquals(false, boolean0);
      
      TIntByteHashMap tIntByteHashMap3 = new TIntByteHashMap(int1);
      // Undeclared exception!
      try {
        tIntByteHashMap3.setAutoCompactionFactor((float) int1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Factor must be >= 0: -3.0
         //
      }
  }

  @Test
  public void test3()  throws Throwable  {
    Future<?> future = executor.submit(new Runnable(){ 
            public void run() { 
        try {
          int int0 = 387;
          int[] intArray0 = new int[8];
          intArray0[0] = int0;
          intArray0[1] = int0;
          intArray0[2] = int0;
          intArray0[3] = int0;
          intArray0[4] = int0;
          intArray0[5] = int0;
          intArray0[6] = int0;
          intArray0[7] = int0;
          byte[] byteArray0 = new byte[1];
          byte byte0 = (byte) (-75);
          byteArray0[0] = byte0;
          TIntByteHashMap tIntByteHashMap0 = new TIntByteHashMap(intArray0, byteArray0);
          TIntByteHashMap tIntByteHashMap1 = new TIntByteHashMap((TIntByteMap) tIntByteHashMap0);
          tIntByteHashMap1.size();
          TIntByteHashMap tIntByteHashMap2 = new TIntByteHashMap(int0, int0);
          int int1 = 0;
          float float0 = 0.0F;
          int int2 = 68;
          TIntByteHashMap tIntByteHashMap3 = new TIntByteHashMap();
          String string0 = "OCY`CO{T.7<Gm\"fQ={";
          File file0 = new File(string0);
          // Undeclared exception!
          try {
            File.createTempFile(string0, string0, file0);
            fail("Expecting exception: SecurityException");
          
          } catch(SecurityException e) {
             //
             // Security manager blocks (\"java.io.FilePermission\" \"OCY`CO{T.7<Gm\"fQ={/OCY`CO{T.7<Gm\"fQ={7141138922588358105OCY`CO{T.7<Gm\"fQ={\" \"write\")
             // java.lang.Thread.getStackTrace(Thread.java:1567)
             // org.evosuite.sandbox.MSecurityManager.checkPermission(MSecurityManager.java:303)
             // java.lang.SecurityManager.checkWrite(SecurityManager.java:979)
             // java.io.File.createTempFile(File.java:1871)
             // sun.reflect.GeneratedMethodAccessor42.invoke(Unknown Source)
             // sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
             // java.lang.reflect.Method.invoke(Method.java:601)
             // org.evosuite.testcase.MethodStatement$1.execute(MethodStatement.java:264)
             // org.evosuite.testcase.AbstractStatement.exceptionHandler(AbstractStatement.java:144)
             // org.evosuite.testcase.MethodStatement.execute(MethodStatement.java:217)
             // org.evosuite.testcase.TestRunnable.call(TestRunnable.java:291)
             // org.evosuite.testcase.TestRunnable.call(TestRunnable.java:1)
             // java.util.concurrent.FutureTask$Sync.innerRun(FutureTask.java:334)
             // java.util.concurrent.FutureTask.run(FutureTask.java:166)
             // java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1110)
             // java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:603)
             // java.lang.Thread.run(Thread.java:722)
             //
          }
        } catch(Throwable t) {
            // Need to catch declared exceptions
        }
      } 
    }); 
    future.get(6000, TimeUnit.MILLISECONDS); 
  }

//   @Test
//   public void test4()  throws Throwable  {
//       int int0 = 1713;
//       int int1 = 0;
//       float float0 = (-981.6706F);
//       TIntByteHashMap tIntByteHashMap0 = new TIntByteHashMap();
//       TIntByteHashMap tIntByteHashMap1 = new TIntByteHashMap((TIntByteMap) tIntByteHashMap0);
//       assertEquals(0, tIntByteHashMap1.getNoEntryValue());
//       assertEquals(0, tIntByteHashMap1.getNoEntryKey());
//       
//       TIntByteHashMap tIntByteHashMap2 = new TIntByteHashMap(int0);
//       TIntByteHashMap tIntByteHashMap3 = new TIntByteHashMap((TIntByteMap) tIntByteHashMap2);
//       TIntByteHashMap tIntByteHashMap4 = new TIntByteHashMap(int1, float0);
//       byte byte0 = (byte)1;
//       boolean boolean0 = tIntByteHashMap4.contains(int0);
//       assertEquals(false, boolean0);
//       
//       TIntByteHashMap tIntByteHashMap5 = new TIntByteHashMap(int0, (float) int0, int0, byte0);
//       tIntByteHashMap5.setAutoCompactionFactor((float) int0);
//       assertEquals(1713, tIntByteHashMap5.getNoEntryKey());
//       assertEquals(1, tIntByteHashMap5.getNoEntryValue());
//       
//       TIntByteHashMap tIntByteHashMap6 = new TIntByteHashMap(int0);
//       tIntByteHashMap4.capacity();
//       assertEquals(0, tIntByteHashMap4.getNoEntryKey());
//       assertEquals(0, tIntByteHashMap4.getNoEntryValue());
//       
//       tIntByteHashMap6.size();
//       assertEquals(0, tIntByteHashMap6.getNoEntryKey());
//       assertEquals(3527, tIntByteHashMap6.capacity());
//       assertEquals(0, tIntByteHashMap6.getNoEntryValue());
//   }

//   @Test
//   public void test5()  throws Throwable  {
//       int int0 = 0;
//       TIntByteHashMap tIntByteHashMap0 = new TIntByteHashMap(int0);
//       byte[] byteArray0 = new byte[4];
//       byte byte0 = (byte)0;
//       byteArray0[0] = byte0;
//       byte byte1 = (byte)0;
//       byteArray0[1] = byte1;
//       byte byte2 = (byte)87;
//       byteArray0[2] = byte2;
//       byte byte3 = (byte)29;
//       byteArray0[3] = byte3;
//       tIntByteHashMap0._states = byteArray0;
//       assertEquals(0, tIntByteHashMap0.getNoEntryValue());
//       assertEquals(0, tIntByteHashMap0.getNoEntryKey());
//   }

  @Test
  public void test6()  throws Throwable  {
      int[] intArray0 = new int[6];
      int int0 = 0;
      intArray0[0] = int0;
      int int1 = (-1781);
      intArray0[1] = int1;
      int int2 = 36;
      intArray0[2] = int2;
      int int3 = (-1942);
      intArray0[3] = int3;
      int int4 = (-1438);
      intArray0[4] = int4;
      int int5 = (-215);
      intArray0[5] = int5;
      byte[] byteArray0 = new byte[10];
      byte byte0 = (byte) (-38);
      byteArray0[0] = byte0;
      byte byte1 = (byte)0;
      byteArray0[1] = byte1;
      byte byte2 = (byte) (-102);
      byteArray0[2] = byte2;
      byte byte3 = (byte) (-46);
      byteArray0[3] = byte3;
      byte byte4 = (byte) (-56);
      byteArray0[4] = byte4;
      byte byte5 = (byte)0;
      byteArray0[5] = byte5;
      byte byte6 = (byte)117;
      byteArray0[6] = byte6;
      byte byte7 = (byte) (-115);
      byteArray0[7] = byte7;
      byte byte8 = (byte)120;
      byteArray0[8] = byte8;
      byte byte9 = (byte)0;
      byteArray0[9] = byte9;
      TIntByteHashMap tIntByteHashMap0 = new TIntByteHashMap(intArray0, byteArray0);
      boolean boolean0 = true;
      tIntByteHashMap0.reenableAutoCompaction(boolean0);
      assertEquals("{-215=0, -1781=0, -1438=-56, 36=-102, -1942=-46, 0=-38}", tIntByteHashMap0.toString());
  }

  @Test
  public void test7()  throws Throwable  {
      int int0 = 1473;
      float float0 = (-1813.99F);
      byte byte0 = (byte) (-85);
      float float1 = (-1401.6832F);
      TIntByteHashMap tIntByteHashMap0 = new TIntByteHashMap((int) byte0, float1, int0, byte0);
      float float2 = 1363.7183F;
      tIntByteHashMap0.valueCollection();
      tIntByteHashMap0.setAutoCompactionFactor(float2);
      tIntByteHashMap0.hashCode();
      tIntByteHashMap0.compact();
      tIntByteHashMap0.iterator();
      TIntByteHashMap tIntByteHashMap1 = new TIntByteHashMap(int0, float0, int0, byte0);
      TIntByteHashMap tIntByteHashMap2 = new TIntByteHashMap((int) byte0);
      boolean boolean0 = false;
      tIntByteHashMap1.reenableAutoCompaction(boolean0);
      byte byte1 = tIntByteHashMap1.remove(int0);
      assertEquals((byte) (-85), byte1);
      
      TIntByteHashMap tIntByteHashMap3 = new TIntByteHashMap(tIntByteHashMap0._set, tIntByteHashMap0._states);
      int int1 = (-399);
      byte byte2 = tIntByteHashMap3.remove(int1);
      assertEquals(7, tIntByteHashMap3.capacity());
      assertEquals((byte)0, byte2);
      assertEquals("{0=0}", tIntByteHashMap3.toString());
      assertEquals(1, tIntByteHashMap3.size());
      
      TIntByteHashMap tIntByteHashMap4 = new TIntByteHashMap((TIntByteMap) tIntByteHashMap0);
      assertEquals(1473, tIntByteHashMap0.getNoEntryKey());
      
      tIntByteHashMap1.putAll((TIntByteMap) tIntByteHashMap2);
      assertEquals(1473, tIntByteHashMap1.getNoEntryKey());
  }

//   @Test
//   public void test8()  throws Throwable  {
//       TIntByteHashMap tIntByteHashMap0 = new TIntByteHashMap();
//       String string0 = tIntByteHashMap0.toString();
//       assertNotNull(string0);
//       
//       TIntByteHashMap tIntByteHashMap1 = new TIntByteHashMap((TIntByteMap) tIntByteHashMap0);
//       int int0 = 0;
//       byte byte0 = (byte)0;
//       tIntByteHashMap1.adjustOrPutValue(int0, byte0, byte0);
//       assertEquals(false, tIntByteHashMap1.isEmpty());
//       assertEquals(0, tIntByteHashMap1.getNoEntryValue());
//   }

  @Test
  public void test9()  throws Throwable  {
    Future<?> future = executor.submit(new Runnable(){ 
            public void run() { 
        try {
          int[] intArray0 = new int[2];
          int int0 = (-1);
          intArray0[0] = int0;
          int int1 = 61;
          intArray0[1] = int1;
          byte[] byteArray0 = new byte[2];
          byte byte0 = (byte)33;
          byteArray0[0] = byte0;
          byte byte1 = (byte)26;
          byteArray0[1] = byte1;
          TIntByteHashMap tIntByteHashMap0 = new TIntByteHashMap(intArray0, byteArray0);
          String string0 = "DO>vRrLq~1YE";
          File file0 = new File(string0, string0);
          File file1 = file0.getCanonicalFile();
          PrintStream printStream0 = null;
          try {
            printStream0 = new PrintStream(file1);
            fail("Expecting exception: SecurityException");
          
          } catch(SecurityException e) {
             //
             // Security manager blocks (\"java.io.FilePermission\" \"/mnt/fastdata/ac1gf/Experiments_Major/apps/trove-3.0.2/DO>vRrLq~1YE/DO>vRrLq~1YE\" \"write\")
             // java.lang.Thread.getStackTrace(Thread.java:1567)
             // org.evosuite.sandbox.MSecurityManager.checkPermission(MSecurityManager.java:303)
             // java.lang.SecurityManager.checkWrite(SecurityManager.java:979)
             // java.io.FileOutputStream.<init>(FileOutputStream.java:203)
             // java.io.FileOutputStream.<init>(FileOutputStream.java:165)
             // java.io.PrintStream.<init>(PrintStream.java:279)
             // sun.reflect.GeneratedConstructorAccessor18.newInstance(Unknown Source)
             // sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)
             // java.lang.reflect.Constructor.newInstance(Constructor.java:525)
             // org.evosuite.testcase.ConstructorStatement$1.execute(ConstructorStatement.java:226)
             // org.evosuite.testcase.AbstractStatement.exceptionHandler(AbstractStatement.java:144)
             // org.evosuite.testcase.ConstructorStatement.execute(ConstructorStatement.java:188)
             // org.evosuite.testcase.TestRunnable.call(TestRunnable.java:291)
             // org.evosuite.testcase.TestRunnable.call(TestRunnable.java:1)
             // java.util.concurrent.FutureTask$Sync.innerRun(FutureTask.java:334)
             // java.util.concurrent.FutureTask.run(FutureTask.java:166)
             // java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1110)
             // java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:603)
             // java.lang.Thread.run(Thread.java:722)
             //
          }
        } catch(Throwable t) {
            // Need to catch declared exceptions
        }
      } 
    }); 
    future.get(6000, TimeUnit.MILLISECONDS); 
  }

  @Test
  public void test10()  throws Throwable  {
      int[] intArray0 = new int[10];
      int int0 = 0;
      intArray0[0] = int0;
      int int1 = Integer.MAX_VALUE;
      intArray0[1] = int1;
      int int2 = 0;
      intArray0[2] = int2;
      int int3 = Integer.MAX_VALUE;
      intArray0[3] = int3;
      int int4 = 452759;
      intArray0[4] = int4;
      int int5 = (-932);
      intArray0[5] = int5;
      int int6 = (-324);
      intArray0[6] = int6;
      int int7 = 222;
      intArray0[7] = int7;
      int int8 = 259;
      intArray0[8] = int8;
      int int9 = 0;
      intArray0[9] = int9;
      byte[] byteArray0 = new byte[2];
      byte byte0 = (byte)0;
      byteArray0[0] = byte0;
      byte byte1 = (byte)0;
      byteArray0[1] = byte1;
      TIntByteHashMap tIntByteHashMap0 = new TIntByteHashMap(intArray0, byteArray0);
      tIntByteHashMap0.compact();
      assertEquals(5, tIntByteHashMap0.capacity());
      
      TIntByteHashMap tIntByteHashMap1 = new TIntByteHashMap();
      tIntByteHashMap1.keys();
      assertEquals(0, tIntByteHashMap1.getNoEntryKey());
  }

//   @Test
//   public void test11()  throws Throwable  {
//       int int0 = 0;
//       int int1 = (-377);
//       byte byte0 = (byte)74;
//       int[] intArray0 = new int[4];
//       intArray0[0] = int0;
//       intArray0[1] = int0;
//       intArray0[2] = (int) byte0;
//       intArray0[3] = int0;
//       byte[] byteArray0 = new byte[1];
//       byteArray0[0] = byte0;
//       int int2 = (-489);
//       byte byte1 = (byte) (-48);
//       TIntByteHashMap tIntByteHashMap0 = new TIntByteHashMap(int1, (float) intArray0[3], int2, byte1);
//       intArray0[0] = int2;
//       byteArray0[0] = byte1;
//       intArray0[1] = int0;
//       intArray0[2] = int2;
//       intArray0[3] = int2;
//       tIntByteHashMap0.compact();
//       intArray0[0] = (int) byte0;
//       int int3 = 1368;
//       intArray0[1] = int3;
//       intArray0[2] = int0;
//       intArray0[3] = int3;
//       tIntByteHashMap0.trimToSize();
//       TIntByteHashMap tIntByteHashMap1 = new TIntByteHashMap((int) byte0, (float) intArray0[1], int1, byteArray0[0]);
//       TIntByteHashMap tIntByteHashMap2 = new TIntByteHashMap(intArray0, byteArray0);
//       byte[] byteArray1 = tIntByteHashMap2._states;
//       assertEquals("{74=-48}", tIntByteHashMap2.toString());
//       
//       TIntByteHashMap tIntByteHashMap3 = new TIntByteHashMap(int0);
//       TIntByteHashMap tIntByteHashMap4 = new TIntByteHashMap((TIntByteMap) tIntByteHashMap3);
//       boolean boolean0 = tIntByteHashMap4.containsKey(int1);
//       assertEquals(23, tIntByteHashMap4.capacity());
//       assertEquals(0, tIntByteHashMap4.getNoEntryValue());
//       assertEquals(0, tIntByteHashMap4.getNoEntryKey());
//       assertEquals(false, boolean0);
//       
//       TIntByteHashMap tIntByteHashMap5 = new TIntByteHashMap(int0, (float) int0, int1, byte0);
//       tIntByteHashMap0.keySet();
//       tIntByteHashMap5.capacity();
//       assertEquals(-377, tIntByteHashMap5.getNoEntryKey());
//       assertEquals(74, tIntByteHashMap5.getNoEntryValue());
//   }

  @Test
  public void test12()  throws Throwable  {
      int int0 = (-1883);
      TIntByteHashMap tIntByteHashMap0 = new TIntByteHashMap(int0);
      tIntByteHashMap0.toString();
      tIntByteHashMap0.valueCollection();
      tIntByteHashMap0.size();
      int int1 = (-9);
      int int2 = Integer.MAX_VALUE;
      tIntByteHashMap0.trimToSize();
      float float0 = 10.0F;
      TIntByteHashMap tIntByteHashMap1 = new TIntByteHashMap(int0, int0);
      TIntByteHashMap tIntByteHashMap2 = new TIntByteHashMap((TIntByteMap) tIntByteHashMap1);
      OutputStream outputStream0 = null;
      ObjectOutputStream objectOutputStream0 = null;
      try {
        objectOutputStream0 = new ObjectOutputStream(outputStream0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

//   @Test
//   public void test13()  throws Throwable  {
//       int int0 = (-162);
//       float float0 = 6.6360896E8F;
//       byte byte0 = (byte) (-99);
//       TIntByteHashMap tIntByteHashMap0 = new TIntByteHashMap(int0, float0, int0, byte0);
//       TIntByteHashMap tIntByteHashMap1 = new TIntByteHashMap(int0);
//       tIntByteHashMap0.putAll((TIntByteMap) tIntByteHashMap1);
//       assertEquals(0, tIntByteHashMap1.getNoEntryKey());
//       assertEquals(-162, tIntByteHashMap0.getNoEntryKey());
//       assertEquals(-99, tIntByteHashMap0.getNoEntryValue());
//       assertEquals(0, tIntByteHashMap1.getNoEntryValue());
//   }

  @Test
  public void test14()  throws Throwable  {
      int[] intArray0 = new int[6];
      int int0 = 1201;
      intArray0[0] = int0;
      int int1 = 0;
      intArray0[1] = int1;
      int int2 = (-928);
      intArray0[2] = int2;
      int int3 = 286973;
      intArray0[3] = int3;
      int int4 = 781;
      intArray0[4] = int4;
      int int5 = (-1);
      intArray0[5] = int5;
      byte[] byteArray0 = new byte[6];
      byte byte0 = (byte) (-68);
      byteArray0[0] = byte0;
      byte byte1 = (byte) (-23);
      byteArray0[1] = byte1;
      byte byte2 = (byte)7;
      byteArray0[2] = byte2;
      byte byte3 = (byte) (-106);
      byteArray0[3] = byte3;
      byte byte4 = (byte)19;
      byteArray0[4] = byte4;
      byte byte5 = (byte)0;
      byteArray0[5] = byte5;
      TIntByteHashMap tIntByteHashMap0 = new TIntByteHashMap(intArray0, byteArray0);
      tIntByteHashMap0.trimToSize();
      assertEquals("{-928=7, 781=19, 286973=-106, 1201=-68, -1=0, 0=-23}", tIntByteHashMap0.toString());
  }

//   @Test
//   public void test15()  throws Throwable  {
//       int int0 = 0;
//       TIntByteHashMap tIntByteHashMap0 = new TIntByteHashMap();
//       float float0 = 0.0F;
//       tIntByteHashMap0.setAutoCompactionFactor(float0);
//       assertEquals(23, tIntByteHashMap0.capacity());
//       assertEquals(0, tIntByteHashMap0.getNoEntryKey());
//       assertEquals(0, tIntByteHashMap0.getNoEntryValue());
//       
//       TIntByteHashMap tIntByteHashMap1 = new TIntByteHashMap(int0);
//       tIntByteHashMap1.getAutoCompactionFactor();
//       tIntByteHashMap1.iterator();
//       assertEquals(0, tIntByteHashMap1.getNoEntryKey());
//       assertEquals(0, tIntByteHashMap1.getNoEntryValue());
//   }

//   @Test
//   public void test16()  throws Throwable  {
//       int int0 = 437;
//       int int1 = 1009;
//       byte byte0 = (byte) (-37);
//       int[] intArray0 = new int[2];
//       intArray0[0] = (int) byte0;
//       intArray0[1] = int0;
//       TIntByteHashMap tIntByteHashMap0 = new TIntByteHashMap(intArray0[0]);
//       tIntByteHashMap0.capacity();
//       byte[] byteArray0 = new byte[10];
//       byteArray0[0] = byte0;
//       byteArray0[1] = byte0;
//       byteArray0[2] = byte0;
//       byteArray0[3] = byte0;
//       byte byte1 = (byte)39;
//       byteArray0[4] = byte1;
//       byteArray0[5] = byte0;
//       byteArray0[6] = byte0;
//       byteArray0[7] = byte0;
//       byteArray0[8] = byte0;
//       byteArray0[9] = byte0;
//       TIntByteHashMap tIntByteHashMap1 = new TIntByteHashMap(intArray0, byteArray0);
//       TIntByteHashMap tIntByteHashMap2 = new TIntByteHashMap(int0, (float) int0, int1, byte0);
//       assertEquals(1009, tIntByteHashMap2.getNoEntryKey());
//       assertEquals(-37, tIntByteHashMap2.getNoEntryValue());
//       
//       int int2 = tIntByteHashMap1.getNoEntryKey();
//       assertEquals(0, int2);
//       assertEquals("{-37=-37, 437=-37}", tIntByteHashMap1.toString());
//       assertEquals(0, tIntByteHashMap1.getNoEntryValue());
//   }

  @Test
  public void test17()  throws Throwable  {
      int[] intArray0 = new int[7];
      int int0 = 1744;
      intArray0[0] = int0;
      int int1 = 781301;
      intArray0[1] = int1;
      int int2 = 1597;
      intArray0[2] = int2;
      int int3 = (-1941);
      intArray0[3] = int3;
      int int4 = 0;
      intArray0[4] = int4;
      int int5 = 0;
      intArray0[5] = int5;
      int int6 = 0;
      intArray0[6] = int6;
      byte[] byteArray0 = new byte[8];
      byte byte0 = (byte) (-28);
      byteArray0[0] = byte0;
      byte byte1 = (byte)7;
      byteArray0[1] = byte1;
      byte byte2 = (byte) (-1);
      byteArray0[2] = byte2;
      byte byte3 = (byte) (-40);
      byteArray0[3] = byte3;
      byte byte4 = (byte)72;
      byteArray0[4] = byte4;
      byte byte5 = (byte) (-1);
      byteArray0[5] = byte5;
      byte byte6 = (byte)125;
      byteArray0[6] = byte6;
      byte byte7 = (byte) (-39);
      byteArray0[7] = byte7;
      TIntByteHashMap tIntByteHashMap0 = new TIntByteHashMap(intArray0, byteArray0);
      int[] intArray1 = tIntByteHashMap0.keys();
      assertEquals("{1597=-1, 781301=7, 1744=-28, -1941=-40, 0=125}", tIntByteHashMap0.toString());
      assertEquals(5, tIntByteHashMap0.size());
      assertNotNull(intArray1);
      assertEquals(0, tIntByteHashMap0.getNoEntryKey());
  }

  @Test
  public void test18()  throws Throwable  {
      int int0 = 1638;
      TIntByteHashMap tIntByteHashMap0 = new TIntByteHashMap(int0);
      tIntByteHashMap0.setAutoCompactionFactor((float) int0);
      TIntByteHashMap tIntByteHashMap1 = new TIntByteHashMap();
      tIntByteHashMap1.capacity();
      byte[] byteArray0 = tIntByteHashMap1._states;
      assertEquals(23, tIntByteHashMap1.capacity());
      
      int[] intArray0 = new int[5];
      tIntByteHashMap1.ensureCapacity(int0);
      intArray0[0] = int0;
      intArray0[1] = int0;
      tIntByteHashMap1.iterator();
      int int1 = Integer.MAX_VALUE;
      intArray0[2] = int1;
      intArray0[3] = int0;
      intArray0[4] = int0;
      byte[] byteArray1 = new byte[5];
      byte byte0 = (byte)0;
      byteArray1[0] = byte0;
      byte byte1 = (byte)59;
      byteArray1[1] = byte1;
      byte byte2 = (byte) (-86);
      tIntByteHashMap1.capacity();
      byteArray1[2] = byte2;
      byte byte3 = (byte)0;
      float float0 = 6.6360896E8F;
      tIntByteHashMap1.setAutoCompactionFactor(float0);
      byteArray1[3] = byte3;
      byte byte4 = (byte)0;
      byteArray1[4] = byte4;
      TIntByteHashMap tIntByteHashMap2 = new TIntByteHashMap(intArray0, byteArray1);
      float float1 = 1250.5239F;
      TIntByteHashMap tIntByteHashMap3 = new TIntByteHashMap(int0, float1);
      tIntByteHashMap3.compact();
      tIntByteHashMap1.getNoEntryKey();
      int int2 = tIntByteHashMap2.hashCode();
      assertEquals((-2147481925), int2);
  }
}
