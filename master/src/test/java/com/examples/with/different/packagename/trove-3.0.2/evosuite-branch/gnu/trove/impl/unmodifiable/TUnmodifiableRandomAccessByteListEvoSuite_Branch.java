/*
 * This file was automatically generated by EvoSuite
 */

package gnu.trove.impl.unmodifiable;

import org.junit.Test;
import static org.junit.Assert.*;
import gnu.trove.impl.unmodifiable.TUnmodifiableRandomAccessByteList;
import gnu.trove.list.TByteList;
import gnu.trove.list.array.TByteArrayList;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;

public class TUnmodifiableRandomAccessByteListEvoSuite_Branch {

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
   * 1 gnu.trove.impl.unmodifiable.TUnmodifiableRandomAccessByteList.subList(II)Lgnu/trove/list/TByteList;: root-Branch
   * 2 gnu.trove.impl.unmodifiable.TUnmodifiableRandomAccessByteList.<init>(Lgnu/trove/list/TByteList;)V: root-Branch
   */

  @Test
  public void test0()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      TByteArrayList tByteArrayList0 = TByteArrayList.wrap(byteArray0);
      TUnmodifiableRandomAccessByteList tUnmodifiableRandomAccessByteList0 = new TUnmodifiableRandomAccessByteList((TByteList) tByteArrayList0);
      // Undeclared exception!
      try {
        tUnmodifiableRandomAccessByteList0.subList((int) (byte) (-8), (int) (byte) (-8));
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // begin index can not be < 0
         //
      }
  }
}
