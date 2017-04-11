import java.util.*;

public class Photographer{
  private ArrayList<Printable> cameras;
  private HashMap<String, Integer>journal;

  public Photographer(){
    this.cameras = new ArrayList<Printable>();
    this.journal = new HashMap<String, Integer>();
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

  public void journalEntry(String cameraName, Integer numOfPhotos){
    this.journal.put(cameraName, numOfPhotos);
  }

  public int totalPhotosTaken(){
    int photosTaken = 0;
    for(Integer journal : this.journal.values()){
      int x = journal;
      photosTaken += x;
    }
    return photosTaken;
  }

  // public String totalCameras(){
  //   String allCameras = "";
  //   for(String journal : this.journal.key()){
  //     String x = journal;
  //     allCameras += x;
  //   }
  //   return allCameras;
  // }
  

}