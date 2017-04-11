import java.util.*;

public class Photographer{
  private ArrayList<Printable> cameras;

  public Photographer(){
    this.cameras = new ArrayList<Printable>();
  }

  public void addCamera(Printable printable){
    cameras.add(printable);
  }

  public Printable removeCamera(){
    if(camerasCount() > 0){
    return cameras.remove(0);
    }
    return null;
  }

  public int camerasCount(){
    return cameras.size();
  }

  public String cameraDeets(){
    String deets = "";
    for(Printable printable : this.cameras){
      String x = printable.printDetails();
      deets += x;
    }
    return deets;
  }

}