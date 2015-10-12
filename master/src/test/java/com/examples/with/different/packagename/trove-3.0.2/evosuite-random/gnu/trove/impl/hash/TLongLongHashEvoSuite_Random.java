/*
 * This file was automatically generated by EvoSuite
 */

package gnu.trove.impl.hash;

import org.junit.Test;
import static org.junit.Assert.*;
import gnu.trove.map.TLongLongMap;
import gnu.trove.map.hash.TLongLongHashMap;
import gnu.trove.procedure.TLongProcedure;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.util.Locale;
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

public class TLongLongHashEvoSuite_Random {

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
      int int0 = 0;
      int int1 = 1241;
      TLongLongHashMap tLongLongHashMap0 = new TLongLongHashMap(int1);
      boolean boolean0 = true;
      tLongLongHashMap0.reenableAutoCompaction(boolean0);
      long long0 = 1L;
      long[] longArray0 = new long[3];
      longArray0[0] = (long) int1;
      longArray0[1] = (long) int1;
      longArray0[2] = (long) int0;
      tLongLongHashMap0._set = longArray0;
      assertEquals(2557, tLongLongHashMap0.capacity());
      
      TLongLongHashMap tLongLongHashMap1 = new TLongLongHashMap(int0);
      tLongLongHashMap1.clear();
      assertEquals(0L, tLongLongHashMap1.getNoEntryValue());
      assertEquals(0L, tLongLongHashMap1.getNoEntryKey());
      
      TLongLongHashMap tLongLongHashMap2 = new TLongLongHashMap(int0, (float) int0, (long) int0, long0);
      int int2 = 1;
      tLongLongHashMap2.ensureCapacity(int2);
      assertEquals(1L, tLongLongHashMap2.getNoEntryValue());
      assertEquals(0L, tLongLongHashMap2.getNoEntryKey());
  }

  @Test
  public void test1()  throws Throwable  {
      int int0 = 1532;
      TLongLongHashMap tLongLongHashMap0 = new TLongLongHashMap(int0);
      float float0 = 1036.4767F;
      long long0 = 1883L;
      TLongLongHashMap tLongLongHashMap1 = new TLongLongHashMap(int0, float0, (long) int0, long0);
      tLongLongHashMap1.valueCollection();
      long[] longArray0 = new long[2];
      boolean boolean0 = tLongLongHashMap1.isEmpty();
      longArray0[0] = long0;
      tLongLongHashMap1.reenableAutoCompaction(boolean0);
      longArray0[1] = long0;
      tLongLongHashMap1.valueCollection();
      tLongLongHashMap1.values(longArray0);
      TLongLongMap tLongLongMap0 = null;
      TLongLongHashMap tLongLongHashMap2 = null;
      try {
        tLongLongHashMap2 = new TLongLongHashMap(tLongLongMap0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test
  public void test2()  throws Throwable  {
      int int0 = 754;
      TLongLongHashMap tLongLongHashMap0 = new TLongLongHashMap(int0);
      tLongLongHashMap0.clear();
      assertEquals(0L, tLongLongHashMap0.getNoEntryValue());
      assertEquals(1523, tLongLongHashMap0.capacity());
      assertEquals(0L, tLongLongHashMap0.getNoEntryKey());
  }

  @Test
  public void test3()  throws Throwable  {
      int int0 = 0;
      float float0 = (-994.10114F);
      TLongLongHashMap tLongLongHashMap0 = new TLongLongHashMap(int0, float0);
      TLongLongHashMap tLongLongHashMap1 = new TLongLongHashMap();
      InputStream inputStream0 = null;
      ObjectInputStream objectInputStream0 = null;
      try {
        objectInputStream0 = new ObjectInputStream(inputStream0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test
  public void test4()  throws Throwable  {
    Future<?> future = executor.submit(new Runnable(){ 
            public void run() { 
        try {
          long[] longArray0 = new long[3];
          int int0 = 141;
          TLongLongHashMap tLongLongHashMap0 = new TLongLongHashMap(int0, int0);
          long long0 = 1L;
          tLongLongHashMap0.put(long0, long0);
          long long1 = 1974L;
          longArray0[0] = long1;
          long long2 = 0L;
          longArray0[0] = long1;
          longArray0[1] = (long) int0;
          longArray0[2] = (long) int0;
          longArray0[1] = long2;
          longArray0[2] = long1;
          long long3 = (-2030L);
          longArray0[0] = long3;
          long long4 = 0L;
          longArray0[1] = long4;
          long long5 = (-1L);
          longArray0[2] = long5;
          TLongLongHashMap tLongLongHashMap1 = new TLongLongHashMap(longArray0, longArray0);
          tLongLongHashMap1.compact();
          String string0 = "No free or removed slots available. Key set full?!!";
          String string1 = "No free or removed slots available. Key set full?!!";
          // Undeclared exception!
          try {
            File.createTempFile(string0, string1);
            fail("Expecting exception: SecurityException");
          
          } catch(SecurityException e) {
             //
             // Unable to create temporary file
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
  public void test5()  throws Throwable  {
      TLongLongHashMap tLongLongHashMap0 = new TLongLongHashMap();
      long long0 = tLongLongHashMap0.getNoEntryKey();
      int int0 = 0;
      int int1 = 0;
      long long1 = (-515L);
      long long2 = 1148L;
      TLongLongHashMap tLongLongHashMap1 = new TLongLongHashMap(int1, (float) long0, long1, long2);
      tLongLongHashMap0.put((long) int0, (long) int0);
      TLongLongHashMap tLongLongHashMap2 = new TLongLongHashMap(int0, int0);
      tLongLongHashMap0.isEmpty();
      long long3 = tLongLongHashMap2.getNoEntryValue();
      tLongLongHashMap0.containsKey(long3);
      tLongLongHashMap0.putAll((TLongLongMap) tLongLongHashMap2);
      tLongLongHashMap2.valueCollection();
      TLongLongHashMap tLongLongHashMap3 = new TLongLongHashMap(tLongLongHashMap0._set, tLongLongHashMap2._set);
      float float0 = 1108.8796F;
      tLongLongHashMap2.setAutoCompactionFactor(float0);
      ObjectInput objectInput0 = null;
      // Undeclared exception!
      try {
        tLongLongHashMap0.readExternal(objectInput0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test
  public void test6()  throws Throwable  {
      int int0 = Integer.MAX_VALUE;
      TLongLongHashMap tLongLongHashMap0 = new TLongLongHashMap(int0);
      TLongLongHashMap tLongLongHashMap1 = new TLongLongHashMap((TLongLongMap) tLongLongHashMap0);
      long[] longArray0 = tLongLongHashMap1._set;
      tLongLongHashMap0.getAutoCompactionFactor();
      TLongLongHashMap tLongLongHashMap2 = new TLongLongHashMap();
      String string0 = "]cl@Eu+;~e{e6Y]pa";
      String string1 = ",Tdmq*|S2zb";
      PrintStream printStream0 = null;
      try {
        printStream0 = new PrintStream(string0, string1);
        fail("Expecting exception: UnsupportedEncodingException");
      
      } catch(UnsupportedEncodingException e) {
         //
         // ,Tdmq*|S2zb
         //
      }
  }

  @Test
  public void test7()  throws Throwable  {
      int int0 = (-1);
      float float0 = 0.0F;
      TLongLongHashMap tLongLongHashMap0 = new TLongLongHashMap(int0, float0);
      int int1 = tLongLongHashMap0.capacity();
      tLongLongHashMap0.getAutoCompactionFactor();
      tLongLongHashMap0.setAutoCompactionFactor((float) int1);
      TLongLongHashMap tLongLongHashMap1 = new TLongLongHashMap();
      tLongLongHashMap1.compact();
      tLongLongHashMap1.getAutoCompactionFactor();
      TLongProcedure tLongProcedure0 = null;
      tLongLongHashMap1.iterator();
      tLongLongHashMap1.getAutoCompactionFactor();
      tLongLongHashMap1.iterator();
      tLongLongHashMap1.forEach(tLongProcedure0);
      Locale locale0 = Locale.ROOT;
      Locale.Category locale_Category0 = Locale.Category.DISPLAY;
      long long0 = 0L;
      tLongLongHashMap1.put(long0, long0);
      Locale locale1 = Locale.getDefault(locale_Category0);
      locale1.getDisplayCountry(locale0);
      tLongLongHashMap0.size();
      String string0 = locale0.getDisplayName(locale1);
      tLongLongHashMap1.equals((Object) string0);
      long long1 = 625L;
      TLongLongHashMap tLongLongHashMap2 = new TLongLongHashMap(int1);
      tLongLongHashMap1.get(long1);
      tLongLongHashMap1.valueCollection();
      assertEquals(false, tLongLongHashMap1.isEmpty());
      assertEquals("{0=0}", tLongLongHashMap1.toString());
  }

  @Test
  public void test8()  throws Throwable  {
      int int0 = (-38);
      TLongLongHashMap tLongLongHashMap0 = new TLongLongHashMap(int0, int0);
      int int1 = 0;
      float float0 = 10.0F;
      tLongLongHashMap0.setAutoCompactionFactor(float0);
      float float1 = 0.0F;
      TLongLongHashMap tLongLongHashMap1 = new TLongLongHashMap(int1, float1);
      InputStream inputStream0 = null;
      ObjectInputStream objectInputStream0 = null;
      try {
        objectInputStream0 = new ObjectInputStream(inputStream0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test
  public void test9()  throws Throwable  {
      long[] longArray0 = new long[2];
      long long0 = (-1279L);
      longArray0[0] = long0;
      long long1 = 0L;
      longArray0[1] = long1;
      TLongLongHashMap tLongLongHashMap0 = new TLongLongHashMap(longArray0, longArray0);
      String string0 = tLongLongHashMap0.toString();
      assertNotNull(string0);
      assertEquals("{-1279=-1279, 0=0}", string0);
      
      int int0 = 1;
      float float0 = 0.0F;
      tLongLongHashMap0.trimToSize();
      TLongLongHashMap tLongLongHashMap1 = new TLongLongHashMap(int0, float0);
      tLongLongHashMap1.hashCode();
      assertEquals(0L, tLongLongHashMap1.getNoEntryValue());
      assertEquals(0L, tLongLongHashMap1.getNoEntryKey());
      
      int int1 = (-1763);
      TLongLongHashMap tLongLongHashMap2 = new TLongLongHashMap();
      long[] longArray1 = tLongLongHashMap0._set;
      assertEquals(0L, tLongLongHashMap0.getNoEntryKey());
      assertEquals(0L, tLongLongHashMap0.getNoEntryValue());
      
      ObjectInput objectInput0 = null;
      // Undeclared exception!
      try {
        tLongLongHashMap2.readExternal(objectInput0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test
  public void test10()  throws Throwable  {
    Future<?> future = executor.submit(new Runnable(){ 
            public void run() { 
        try {
          int int0 = 237;
          long long0 = 0L;
          TLongLongHashMap tLongLongHashMap0 = new TLongLongHashMap(int0, int0);
          TLongLongHashMap tLongLongHashMap1 = new TLongLongHashMap(int0, (float) int0, (long) int0, long0);
          String string0 = "";
          PrintStream printStream0 = null;
          try {
            printStream0 = new PrintStream(string0);
            fail("Expecting exception: SecurityException");
          
          } catch(SecurityException e) {
             //
             // Security manager blocks (\"java.io.FilePermission\" \"\" \"write\")
             // java.lang.Thread.getStackTrace(Thread.java:1567)
             // org.evosuite.sandbox.MSecurityManager.checkPermission(MSecurityManager.java:303)
             // java.lang.SecurityManager.checkWrite(SecurityManager.java:979)
             // java.io.FileOutputStream.<init>(FileOutputStream.java:203)
             // java.io.FileOutputStream.<init>(FileOutputStream.java:104)
             // java.io.PrintStream.<init>(PrintStream.java:208)
             // sun.reflect.GeneratedConstructorAccessor17.newInstance(Unknown Source)
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
  public void test11()  throws Throwable  {
      int int0 = 0;
      int int1 = 0;
      int int2 = 0;
      TLongLongHashMap tLongLongHashMap0 = new TLongLongHashMap(int2);
      long[] longArray0 = new long[8];
      longArray0[0] = (long) int2;
      longArray0[1] = (long) int1;
      long long0 = 0L;
      longArray0[2] = long0;
      longArray0[3] = (long) int0;
      longArray0[4] = (long) int1;
      longArray0[5] = (long) int0;
      longArray0[6] = (long) int2;
      longArray0[7] = (long) int0;
      tLongLongHashMap0.values(longArray0);
      TLongLongHashMap tLongLongHashMap1 = new TLongLongHashMap(int1);
      tLongLongHashMap1.remove((long) int1);
      TLongLongHashMap tLongLongHashMap2 = new TLongLongHashMap((TLongLongMap) tLongLongHashMap1);
      TLongLongHashMap tLongLongHashMap3 = new TLongLongHashMap();
      float float0 = (-1687.2686F);
      String string0 = "t.JN";
      FileInputStream fileInputStream0 = null;
      try {
        fileInputStream0 = new FileInputStream(string0);
        fail("Expecting exception: FileNotFoundException");
      
      } catch(FileNotFoundException e) {
         //
         // t.JN (No such file or directory)
         //
      }
  }

  @Test
  public void test12()  throws Throwable  {
      int int0 = 0;
      float float0 = (-1.0F);
      int int1 = 0;
      TLongLongHashMap tLongLongHashMap0 = new TLongLongHashMap(int1);
      tLongLongHashMap0.valueCollection();
      assertEquals(0L, tLongLongHashMap0.getNoEntryKey());
      assertEquals(0L, tLongLongHashMap0.getNoEntryValue());
      
      TLongLongHashMap tLongLongHashMap1 = new TLongLongHashMap(int0, float0);
      long long0 = (-735L);
      long long1 = (-1216L);
      boolean boolean0 = tLongLongHashMap1.contains(long1);
      assertEquals(false, boolean0);
      
      long long2 = tLongLongHashMap1.get(long0);
      assertEquals(0L, tLongLongHashMap1.getNoEntryKey());
      assertEquals(0L, long2);
  }

  @Test
  public void test13()  throws Throwable  {
      TLongLongHashMap tLongLongHashMap0 = new TLongLongHashMap();
      long long0 = 0L;
      tLongLongHashMap0.containsKey(long0);
      long long1 = 701L;
      tLongLongHashMap0.containsValue(long1);
      tLongLongHashMap0.tempDisableAutoCompaction();
      int int0 = 0;
      tLongLongHashMap0.ensureCapacity(int0);
      TLongLongHashMap tLongLongHashMap1 = new TLongLongHashMap(int0, int0);
      tLongLongHashMap0.containsKey(long0);
      InputStream inputStream0 = null;
      ObjectInputStream objectInputStream0 = null;
      try {
        objectInputStream0 = new ObjectInputStream(inputStream0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test
  public void test14()  throws Throwable  {
      TLongLongHashMap tLongLongHashMap0 = new TLongLongHashMap();
      long long0 = 0L;
      OutputStream outputStream0 = null;
      int int0 = 76;
      BufferedOutputStream bufferedOutputStream0 = new BufferedOutputStream(outputStream0, int0);
      boolean boolean0 = true;
      String string0 = "";
      PrintStream printStream0 = null;
      try {
        printStream0 = new PrintStream((OutputStream) bufferedOutputStream0, boolean0, string0);
        fail("Expecting exception: UnsupportedEncodingException");
      
      } catch(UnsupportedEncodingException e) {
         //
         // 
         //
      }
  }

  @Test
  public void test15()  throws Throwable  {
      int int0 = (-1268);
      TLongLongHashMap tLongLongHashMap0 = new TLongLongHashMap(int0);
      tLongLongHashMap0.clear();
      int int1 = (-723);
      byte[] byteArray0 = new byte[8];
      byte byte0 = (byte)5;
      byteArray0[0] = byte0;
      byte byte1 = (byte) (-109);
      tLongLongHashMap0.compact();
      byteArray0[1] = byte1;
      byte byte2 = (byte)125;
      byteArray0[2] = byte2;
      byte byte3 = (byte) (-71);
      byteArray0[3] = byte3;
      byte byte4 = (byte) (-1);
      byteArray0[4] = byte4;
      byte byte5 = (byte) (-84);
      byteArray0[5] = byte5;
      TLongProcedure tLongProcedure0 = null;
      tLongLongHashMap0.forEach(tLongProcedure0);
      byte byte6 = (byte) (-76);
      byteArray0[6] = byte6;
      long long0 = 0L;
      long long1 = (-236L);
      tLongLongHashMap0.put(long0, long1);
      byte byte7 = (byte)23;
      byteArray0[7] = byte7;
      tLongLongHashMap0._states = byteArray0;
      TLongLongHashMap tLongLongHashMap1 = new TLongLongHashMap(int1, int1);
      float float0 = 1.0F;
      tLongLongHashMap0.setAutoCompactionFactor(float0);
      assertEquals(1, tLongLongHashMap0.size());
      
      TLongLongHashMap tLongLongHashMap2 = new TLongLongHashMap((TLongLongMap) tLongLongHashMap1);
      long long2 = 1L;
      tLongLongHashMap2.put(long2, long2);
      int int2 = (-997);
      long long3 = 0L;
      TLongLongHashMap tLongLongHashMap3 = new TLongLongHashMap(int2, (float) int2, long3, long3);
      // Undeclared exception!
      try {
        tLongLongHashMap3.setAutoCompactionFactor((float) int2);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Factor must be >= 0: -997.0
         //
      }
  }

  @Test
  public void test16()  throws Throwable  {
      int int0 = (-775);
      float float0 = 0.0F;
      long long0 = 0L;
      long long1 = 0L;
      TLongLongHashMap tLongLongHashMap0 = new TLongLongHashMap(int0, float0, long0, long1);
      TLongLongHashMap tLongLongHashMap1 = null;
      try {
        tLongLongHashMap1 = new TLongLongHashMap((TLongLongMap) tLongLongHashMap0);
        fail("Expecting exception: OutOfMemoryError");
      
      } catch(OutOfMemoryError e) {
         //
         // Java heap space
         //
      }
  }

  @Test
  public void test17()  throws Throwable  {
      int int0 = 71;
      float float0 = (-410.22302F);
      TLongLongHashMap tLongLongHashMap0 = new TLongLongHashMap(int0, float0);
      long[] longArray0 = new long[9];
      longArray0[0] = (long) int0;
      longArray0[1] = (long) int0;
      longArray0[2] = (long) int0;
      longArray0[3] = (long) int0;
      longArray0[4] = (long) int0;
      longArray0[5] = (long) int0;
      longArray0[6] = (long) int0;
      longArray0[7] = (long) int0;
      longArray0[8] = (long) int0;
      tLongLongHashMap0._set = longArray0;
      assertEquals(0L, tLongLongHashMap0.getNoEntryKey());
      assertEquals(0L, tLongLongHashMap0.getNoEntryValue());
      
      int int1 = 153;
      float float1 = 0.0F;
      TLongLongHashMap tLongLongHashMap1 = new TLongLongHashMap(int1, float1, (long) int1, (long) int1);
      boolean boolean0 = false;
      tLongLongHashMap1.reenableAutoCompaction(boolean0);
      tLongLongHashMap1.isEmpty();
      tLongLongHashMap1.isEmpty();
      tLongLongHashMap1.size();
      tLongLongHashMap1.isEmpty();
      assertEquals(153L, tLongLongHashMap1.getNoEntryValue());
      assertEquals(153L, tLongLongHashMap1.getNoEntryKey());
  }

  @Test
  public void test18()  throws Throwable  {
      int int0 = 638;
      float float0 = 0.0F;
      long long0 = (-552L);
      TLongLongHashMap tLongLongHashMap0 = new TLongLongHashMap(int0);
      tLongLongHashMap0.valueCollection();
      assertEquals(0L, tLongLongHashMap0.getNoEntryValue());
      assertEquals(0L, tLongLongHashMap0.getNoEntryKey());
      
      TLongLongHashMap tLongLongHashMap1 = new TLongLongHashMap(int0, float0, long0, long0);
      boolean boolean0 = true;
      long long1 = tLongLongHashMap1.get((long) int0);
      assertEquals((-552L), long1);
      
      tLongLongHashMap1.reenableAutoCompaction(boolean0);
      assertEquals((-552L), tLongLongHashMap1.getNoEntryKey());
      
      TLongLongHashMap tLongLongHashMap2 = new TLongLongHashMap();
      long long2 = 2L;
      tLongLongHashMap2.setAutoCompactionFactor((float) long2);
      tLongLongHashMap2.increment(long2);
      long long3 = tLongLongHashMap2.getNoEntryKey();
      assertEquals(0L, tLongLongHashMap2.getNoEntryValue());
      assertEquals(0L, long3);
      assertEquals(23, tLongLongHashMap2.capacity());
  }
}
