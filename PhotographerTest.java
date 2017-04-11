import static org.junit.Assert.*;
import org.junit.*;

public class PhotographerTest{
  Photographer photographer;
  AnalogCamera analogCamera;
  DigitalCamera digitalCamera;

  @Before
  public void before(){
    photographer = new Photographer();
    analogCamera = new AnalogCamera();
    digitalCamera = new DigitalCamera();
  }

  @Test
  public void canAddCamera(){
    photographer.addCamera(analogCamera);
    assertEquals(1, photographer.camerasCount());
  }
}