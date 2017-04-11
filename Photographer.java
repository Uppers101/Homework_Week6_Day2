import java.util.*;

public class Photographer{
  private ArrayList<Printable> cameras;

  public Photographer(){
    this.cameras = new ArrayList<Printable>();
  }

  public void addCamera(Printable printable){
    cameras.add(printable);
  }

  public int camerasCount(){
    return cameras.size();
  }
}