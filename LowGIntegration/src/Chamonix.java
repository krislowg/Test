
/**
 * Subclass. Child of City.
 * Represents the things that you can do in Chamonix.
 * @author Kristy Low
 *
 */
public class Chamonix extends City {
  /*
   * private String mountainName;
   * 
   * public void Chamonix(String Language) { super("French"); }
   * 
   * 
   * public String getMoN() { return mountainName; }
   */
  
  /* (non-Javadoc)
   * @see City#doActivities()
   */
  public void doActivities() {
    super.doActivities();
    System.out.println(
        "En Chamonix, vous pouvez faire du ski en la Aiguille du midi " /* + mountainName */);
  }
}
