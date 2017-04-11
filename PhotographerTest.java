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

  @Test
  public void canRemoveCamera(){
    photographer.addCamera(analogCamera);
    photographer.addCamera(analogCamera);
    photographer.removeCamera();
    assertEquals(1, photographer.camerasCount());
  }

  @Test
  public void canPrintDetails(){
    photographer.addCamera(analogCamera);
    photographer.addCamera(digitalCamera);
    assertEquals("Real photographers do it in the dark..01 megapixels", photographer.cameraDeets());
  }
}