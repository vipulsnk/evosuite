/*
 * This file was automatically generated by EvoSuite
 */

package gnu.trove.impl.hash;

import org.junit.Test;
import static org.junit.Assert.*;
import gnu.trove.map.TShortIntMap;
import gnu.trove.map.hash.TShortIntHashMap;
import gnu.trove.procedure.TShortIntProcedure;
import gnu.trove.procedure.TShortProcedure;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutput;
import java.io.PrintStream;
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

public class TShortIntHashEvoSuite_Random {

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
      short[] shortArray0 = new short[7];
      short short0 = (short)229;
      shortArray0[0] = short0;
      short short1 = (short)42;
      shortArray0[1] = short1;
      short short2 = (short)0;
      shortArray0[2] = short2;
      short short3 = (short) (-1198);
      shortArray0[3] = short3;
      short short4 = (short) (-1);
      shortArray0[4] = short4;
      short short5 = (short) (-1);
      shortArray0[5] = short5;
      short short6 = (short) (-1690);
      shortArray0[6] = short6;
      int[] intArray0 = new int[2];
      int int0 = 0;
      intArray0[0] = int0;
      intArray0[1] = (int) shortArray0[2];
      TShortIntHashMap tShortIntHashMap0 = new TShortIntHashMap(shortArray0, intArray0);
      short short7 = (short) (-1015);
      boolean boolean0 = tShortIntHashMap0.containsKey(short7);
      assertEquals("{42=0, 229=0}", tShortIntHashMap0.toString());
      assertEquals(false, boolean0);
      assertEquals(0, tShortIntHashMap0.getNoEntryValue());
  }

  @Test
  public void test1()  throws Throwable  {
      int int0 = 5471;
      float float0 = (-1.0F);
      int int1 = 889;
      TShortIntHashMap tShortIntHashMap0 = new TShortIntHashMap(int1);
      ObjectOutput objectOutput0 = null;
      // Undeclared exception!
      try {
        tShortIntHashMap0.writeExternal(objectOutput0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test
  public void test2()  throws Throwable  {
    Future<?> future = executor.submit(new Runnable(){ 
            public void run() { 
        try {
          int int0 = 33461;
          TShortIntHashMap tShortIntHashMap0 = new TShortIntHashMap(int0);
          tShortIntHashMap0.compact();
          tShortIntHashMap0.tempDisableAutoCompaction();
          TShortIntHashMap tShortIntHashMap1 = new TShortIntHashMap((TShortIntMap) tShortIntHashMap0);
          tShortIntHashMap1.values();
          int int1 = 25717;
          TShortIntHashMap tShortIntHashMap2 = new TShortIntHashMap();
          int int2 = 1647;
          tShortIntHashMap2.ensureCapacity(int2);
          short short0 = (short)1;
          int int3 = (-337);
          tShortIntHashMap1.getNoEntryValue();
          TShortIntHashMap tShortIntHashMap3 = new TShortIntHashMap(int1, (float) short0);
          tShortIntHashMap3.values();
          Locale locale0 = Locale.CANADA;
          String string0 = locale0.toLanguageTag();
          tShortIntHashMap3.equals((Object) string0);
          PrintStream printStream0 = null;
          try {
            printStream0 = new PrintStream(string0);
            fail("Expecting exception: SecurityException");
          
          } catch(SecurityException e) {
             //
             // Security manager blocks (\"java.io.FilePermission\" \"en-CA\" \"write\")
             // java.lang.Thread.getStackTrace(Thread.java:1567)
             // org.evosuite.sandbox.MSecurityManager.checkPermission(MSecurityManager.java:303)
             // java.lang.SecurityManager.checkWrite(SecurityManager.java:979)
             // java.io.FileOutputStream.<init>(FileOutputStream.java:203)
             // java.io.FileOutputStream.<init>(FileOutputStream.java:104)
             // java.io.PrintStream.<init>(PrintStream.java:208)
             // sun.reflect.GeneratedConstructorAccessor14.newInstance(Unknown Source)
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
  public void test3()  throws Throwable  {
    Future<?> future = executor.submit(new Runnable(){ 
            public void run() { 
        try {
          TShortIntHashMap tShortIntHashMap0 = new TShortIntHashMap();
          String string0 = "_()yVB>qo>I?";
          tShortIntHashMap0.getNoEntryValue();
          File file0 = new File(string0, string0);
          // Undeclared exception!
          try {
            File.createTempFile(string0, string0, file0);
            fail("Expecting exception: SecurityException");
          
          } catch(SecurityException e) {
             //
             // Security manager blocks (\"java.io.FilePermission\" \"_()yVB>qo>I?/_()yVB>qo>I?/_()yVB>qo>I?5448560035134389344_()yVB>qo>I?\" \"write\")
             // java.lang.Thread.getStackTrace(Thread.java:1567)
             // org.evosuite.sandbox.MSecurityManager.checkPermission(MSecurityManager.java:303)
             // java.lang.SecurityManager.checkWrite(SecurityManager.java:979)
             // java.io.File.createTempFile(File.java:1871)
             // sun.reflect.GeneratedMethodAccessor51.invoke(Unknown Source)
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
//       int int0 = 0;
//       float float0 = 91.845566F;
//       TShortIntHashMap tShortIntHashMap0 = new TShortIntHashMap(int0, float0);
//       int int1 = tShortIntHashMap0.getNoEntryValue();
//       assertEquals(0, tShortIntHashMap0.getNoEntryKey());
//       assertEquals(0, int1);
//       
//       TShortIntHashMap tShortIntHashMap1 = new TShortIntHashMap();
//       TShortIntHashMap tShortIntHashMap2 = new TShortIntHashMap((TShortIntMap) tShortIntHashMap1);
//       tShortIntHashMap2.size();
//       assertEquals(0, tShortIntHashMap1.getNoEntryKey());
//       assertEquals(0, tShortIntHashMap1.getNoEntryValue());
//       assertEquals(23, tShortIntHashMap1.capacity());
//       assertEquals(0, tShortIntHashMap2.getNoEntryValue());
//   }

  @Test
  public void test5()  throws Throwable  {
      TShortIntMap tShortIntMap0 = null;
      TShortIntHashMap tShortIntHashMap0 = null;
      try {
        tShortIntHashMap0 = new TShortIntHashMap(tShortIntMap0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test
  public void test6()  throws Throwable  {
      int int0 = 1;
      short short0 = (short)0;
      TShortIntHashMap tShortIntHashMap0 = new TShortIntHashMap(int0, (float) int0, short0, int0);
      String string0 = "";
      FileInputStream fileInputStream0 = null;
      try {
        fileInputStream0 = new FileInputStream(string0);
        fail("Expecting exception: FileNotFoundException");
      
      } catch(FileNotFoundException e) {
         //
         //  (No such file or directory)
         //
      }
  }

  @Test
  public void test7()  throws Throwable  {
    Future<?> future = executor.submit(new Runnable(){ 
            public void run() { 
          int int0 = 0;
          int int1 = 1;
          int int2 = 2016;
          TShortIntHashMap tShortIntHashMap0 = new TShortIntHashMap(int2);
          tShortIntHashMap0.isEmpty();
          TShortIntHashMap tShortIntHashMap1 = new TShortIntHashMap();
          int int3 = (-1230);
          TShortIntHashMap tShortIntHashMap2 = new TShortIntHashMap(int3);
          TShortIntProcedure tShortIntProcedure0 = null;
          tShortIntHashMap2.forEachEntry(tShortIntProcedure0);
          TShortIntHashMap tShortIntHashMap3 = new TShortIntHashMap(int1);
          tShortIntHashMap3.trimToSize();
          FileDescriptor fileDescriptor0 = FileDescriptor.out;
          FileOutputStream fileOutputStream0 = null;
          try {
            fileOutputStream0 = new FileOutputStream(fileDescriptor0);
            fail("Expecting exception: SecurityException");
          
          } catch(SecurityException e) {
             //
             // Security manager blocks (\"java.lang.RuntimePermission\" \"writeFileDescriptor\")
             // java.lang.Thread.getStackTrace(Thread.java:1567)
             // org.evosuite.sandbox.MSecurityManager.checkPermission(MSecurityManager.java:303)
             // java.lang.SecurityManager.checkWrite(SecurityManager.java:954)
             // java.io.FileOutputStream.<init>(FileOutputStream.java:244)
             // sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)
             // sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:57)
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
      } 
    }); 
    future.get(6000, TimeUnit.MILLISECONDS); 
  }

//   @Test
//   public void test8()  throws Throwable  {
//       TShortIntHashMap tShortIntHashMap0 = new TShortIntHashMap();
//       short short0 = (short)0;
//       boolean boolean0 = tShortIntHashMap0.contains(short0);
//       assertEquals(false, boolean0);
//       
//       byte[] byteArray0 = tShortIntHashMap0._states;
//       short[] shortArray0 = tShortIntHashMap0._set;
//       assertEquals(23, tShortIntHashMap0.capacity());
//       assertEquals(0, tShortIntHashMap0.getNoEntryValue());
//       assertEquals(0, tShortIntHashMap0.getNoEntryKey());
//   }

  @Test
  public void test9()  throws Throwable  {
    Future<?> future = executor.submit(new Runnable(){ 
            public void run() { 
        try {
          int int0 = 0;
          TShortIntHashMap tShortIntHashMap0 = new TShortIntHashMap(int0, int0);
          String string0 = "[#t,Xf";
          File file0 = new File(string0);
          PrintStream printStream0 = null;
          try {
            printStream0 = new PrintStream(file0);
            fail("Expecting exception: SecurityException");
          
          } catch(SecurityException e) {
             //
             // Security manager blocks (\"java.io.FilePermission\" \"[#t,Xf\" \"write\")
             // java.lang.Thread.getStackTrace(Thread.java:1567)
             // org.evosuite.sandbox.MSecurityManager.checkPermission(MSecurityManager.java:303)
             // java.lang.SecurityManager.checkWrite(SecurityManager.java:979)
             // java.io.FileOutputStream.<init>(FileOutputStream.java:203)
             // java.io.FileOutputStream.<init>(FileOutputStream.java:165)
             // java.io.PrintStream.<init>(PrintStream.java:279)
             // sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)
             // sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:57)
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
      short[] shortArray0 = new short[6];
      short short0 = (short)242;
      shortArray0[0] = short0;
      short short1 = (short)0;
      shortArray0[1] = short1;
      short short2 = (short)819;
      shortArray0[2] = short2;
      short short3 = (short) (-1299);
      shortArray0[3] = short3;
      short short4 = (short)0;
      shortArray0[4] = short4;
      short short5 = (short)519;
      shortArray0[5] = short5;
      int[] intArray0 = new int[9];
      intArray0[0] = (int) short2;
      intArray0[1] = (int) short5;
      intArray0[2] = (int) short3;
      intArray0[3] = (int) short1;
      intArray0[4] = (int) short2;
      intArray0[5] = (int) short5;
      intArray0[6] = (int) shortArray0[5];
      intArray0[7] = (int) shortArray0[0];
      intArray0[8] = (int) shortArray0[2];
      TShortIntHashMap tShortIntHashMap0 = new TShortIntHashMap(shortArray0, intArray0);
      TShortIntHashMap tShortIntHashMap1 = new TShortIntHashMap((TShortIntMap) tShortIntHashMap0);
      TShortIntHashMap tShortIntHashMap2 = new TShortIntHashMap();
      tShortIntHashMap2.clear();
      boolean boolean0 = false;
      short short6 = (short)17;
      tShortIntHashMap2.put(short6, short6);
      tShortIntHashMap2.reenableAutoCompaction(boolean0);
      TShortIntHashMap tShortIntHashMap3 = new TShortIntHashMap();
      short short7 = (short) (-923);
      int int0 = 1690;
      tShortIntHashMap2.values();
      int int1 = 721;
      tShortIntHashMap2.adjustOrPutValue(short7, int0, int1);
      short short8 = (short) (-1128);
      tShortIntHashMap3.put(short8, short8);
      tShortIntHashMap3.keys();
      int int2 = tShortIntHashMap2.get(short7);
      tShortIntHashMap3.put(short7, int2);
      float float0 = (-1454.097F);
      tShortIntHashMap3.reenableAutoCompaction(boolean0);
      // Undeclared exception!
      try {
        tShortIntHashMap3.setAutoCompactionFactor(float0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Factor must be >= 0: -1454.097
         //
      }
  }

  @Test
  public void test11()  throws Throwable  {
      int int0 = 0;
      int int1 = 730;
      TShortIntHashMap tShortIntHashMap0 = new TShortIntHashMap(int1, int0);
      TShortIntHashMap tShortIntHashMap1 = null;
      try {
        tShortIntHashMap1 = new TShortIntHashMap((TShortIntMap) tShortIntHashMap0);
        fail("Expecting exception: OutOfMemoryError");
      
      } catch(OutOfMemoryError e) {
         //
         // Java heap space
         //
      }
  }

//   @Test
//   public void test12()  throws Throwable  {
//       short[] shortArray0 = new short[7];
//       short short0 = (short) (-350);
//       shortArray0[0] = short0;
//       short short1 = (short)1579;
//       shortArray0[1] = short1;
//       short short2 = (short)0;
//       shortArray0[2] = short2;
//       short short3 = (short) (-780);
//       shortArray0[3] = short3;
//       short short4 = (short)55;
//       shortArray0[4] = short4;
//       short short5 = (short) (-1375);
//       shortArray0[5] = short5;
//       short short6 = (short)0;
//       shortArray0[6] = short6;
//       int[] intArray0 = new int[2];
//       intArray0[0] = (int) short6;
//       intArray0[1] = (int) shortArray0[4];
//       TShortIntHashMap tShortIntHashMap0 = new TShortIntHashMap(shortArray0, intArray0);
//       TShortIntHashMap tShortIntHashMap1 = new TShortIntHashMap((TShortIntMap) tShortIntHashMap0);
//       tShortIntHashMap1.isEmpty();
//       assertEquals("{-350=0, 1579=55}", tShortIntHashMap0.toString());
//       assertEquals(0, tShortIntHashMap1.getNoEntryKey());
//       assertEquals(0, tShortIntHashMap1.getNoEntryValue());
//       assertEquals("{1579=55, -350=0}", tShortIntHashMap1.toString());
//       
//       TShortIntHashMap tShortIntHashMap2 = new TShortIntHashMap();
//       tShortIntHashMap2.size();
//       assertEquals(0, tShortIntHashMap2.getNoEntryValue());
//       assertEquals(0, tShortIntHashMap2.getNoEntryKey());
//       assertFalse(tShortIntHashMap2.equals(tShortIntHashMap1));
//   }

  @Test
  public void test13()  throws Throwable  {
      TShortIntHashMap tShortIntHashMap0 = new TShortIntHashMap();
      short short0 = (short)2029;
      int int0 = tShortIntHashMap0.capacity();
      int int1 = tShortIntHashMap0.put(short0, short0);
      tShortIntHashMap0.compact();
      TShortIntHashMap tShortIntHashMap1 = new TShortIntHashMap(int0, int1);
      int int2 = (-2005);
      TShortIntHashMap tShortIntHashMap2 = new TShortIntHashMap(int2, int2);
      short short1 = (short) (-4219);
      tShortIntHashMap2.toString();
      tShortIntHashMap2.capacity();
      tShortIntHashMap2.getNoEntryKey();
      tShortIntHashMap0.setAutoCompactionFactor((float) int0);
      tShortIntHashMap2.getNoEntryKey();
      int int3 = (-1898);
      boolean boolean0 = false;
      short[] shortArray0 = tShortIntHashMap2._set;
      tShortIntHashMap0.reenableAutoCompaction(boolean0);
      tShortIntHashMap0.ensureCapacity(int3);
      TShortProcedure tShortProcedure0 = null;
      // Undeclared exception!
      try {
        tShortIntHashMap0.forEachKey(tShortProcedure0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test
  public void test14()  throws Throwable  {
      short[] shortArray0 = new short[8];
      short short0 = (short)231;
      shortArray0[0] = short0;
      short short1 = (short)0;
      shortArray0[1] = short1;
      short short2 = (short)1553;
      shortArray0[2] = short2;
      short short3 = (short)187;
      shortArray0[3] = short3;
      short short4 = (short)1841;
      shortArray0[4] = short4;
      short short5 = (short)0;
      shortArray0[5] = short5;
      short short6 = (short)30655;
      shortArray0[6] = short6;
      short short7 = (short)195;
      shortArray0[7] = short7;
      int[] intArray0 = new int[1];
      intArray0[0] = (int) shortArray0[7];
      TShortIntHashMap tShortIntHashMap0 = new TShortIntHashMap(shortArray0, intArray0);
      assertEquals("{231=195}", tShortIntHashMap0.toString());
      
      tShortIntHashMap0._set = shortArray0;
      assertEquals("{}", tShortIntHashMap0.toString());
      assertEquals(0, tShortIntHashMap0.getNoEntryValue());
  }

  @Test
  public void test15()  throws Throwable  {
      TShortIntHashMap tShortIntHashMap0 = new TShortIntHashMap();
      String string0 = tShortIntHashMap0.toString();
      assertNotNull(string0);
      
      tShortIntHashMap0.clear();
      tShortIntHashMap0.capacity();
      tShortIntHashMap0.keys();
      assertEquals(23, tShortIntHashMap0.capacity());
      
      int int0 = 1154;
      tShortIntHashMap0.ensureCapacity(int0);
      // Undeclared exception!
      try {
        File.createTempFile(string0, string0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Prefix string too short
         //
      }
  }

  @Test
  public void test16()  throws Throwable  {
      short[] shortArray0 = new short[10];
      short short0 = (short)0;
      shortArray0[0] = short0;
      short short1 = (short) (-1361);
      shortArray0[1] = short1;
      short short2 = (short) (-1);
      shortArray0[2] = short2;
      short short3 = (short)65;
      shortArray0[3] = short3;
      short short4 = (short) (-1);
      shortArray0[4] = short4;
      short short5 = (short) (-1266);
      shortArray0[5] = short5;
      short short6 = (short)212;
      shortArray0[6] = short6;
      short short7 = (short)1;
      shortArray0[7] = short7;
      short short8 = (short)0;
      shortArray0[8] = short8;
      short short9 = (short) (-1279);
      shortArray0[9] = short9;
      int[] intArray0 = new int[2];
      intArray0[0] = (int) short7;
      intArray0[1] = (int) shortArray0[8];
      TShortIntHashMap tShortIntHashMap0 = new TShortIntHashMap(shortArray0, intArray0);
      tShortIntHashMap0.keys(shortArray0);
      int int0 = 933;
      TShortIntHashMap tShortIntHashMap1 = new TShortIntHashMap(int0, int0);
      String string0 = "l";
      FileInputStream fileInputStream0 = null;
      try {
        fileInputStream0 = new FileInputStream(string0);
        fail("Expecting exception: FileNotFoundException");
      
      } catch(FileNotFoundException e) {
         //
         // l (No such file or directory)
         //
      }
  }

  @Test
  public void test17()  throws Throwable  {
      int int0 = 392;
      short[] shortArray0 = new short[7];
      short short0 = (short) (-915);
      shortArray0[0] = short0;
      short short1 = (short)208;
      shortArray0[1] = short1;
      short short2 = (short) (-836);
      shortArray0[2] = short2;
      short short3 = (short)0;
      shortArray0[3] = short3;
      short short4 = (short)0;
      shortArray0[4] = short4;
      short short5 = (short)565;
      shortArray0[5] = short5;
      short short6 = (short) (-995);
      shortArray0[6] = short6;
      int[] intArray0 = new int[4];
      intArray0[0] = (int) shortArray0[3];
      intArray0[1] = (int) short5;
      intArray0[2] = (int) shortArray0[6];
      intArray0[3] = (int) short2;
      TShortIntHashMap tShortIntHashMap0 = new TShortIntHashMap(shortArray0, intArray0);
      TShortIntHashMap tShortIntHashMap1 = new TShortIntHashMap(int0);
      short short7 = (short) (-1193);
      short short8 = (short)0;
      tShortIntHashMap1.get(short8);
      int int1 = tShortIntHashMap1.put(short7, short7);
      assertEquals(1, tShortIntHashMap1.size());
      assertEquals(0, int1);
  }
}
