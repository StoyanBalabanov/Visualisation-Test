import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestJunit {
	
   int a = 2;
   int b =  3;

   @Test
   public void testPrintMessage() {
      assertEquals(2 + 3,5);
   }
}