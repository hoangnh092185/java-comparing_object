import org.junit.*;
import static org.junit.Assert.*;
import java.time.LocalDateTime;


public class KittenTest{

  @Test
  public void kittiesAreTheSame(){
    Kitten firstKitten = new Kitten("squekers");
    Kitten secondKitten = new Kitten("squekers");
    assertTrue(firstKitten.equals(secondKitten));
  }
}
