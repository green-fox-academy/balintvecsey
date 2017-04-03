/**
 * Created by Bálint on 2017. 04. 03..
 */
public class FleetOfThings {

  public static void main(String[] args) {
    Fleet fleet = new Fleet();
    // Create a fleet of things to have this output:
    // 1. [ ] Get milk
    // 2. [ ] Remove the obstacles
    // 3. [x] Stand up
    // 4. [x] Eat lunch
    Thing standUp = new Thing("Stand up");
    standUp.complete();
    Thing lunch = new Thing("Eat lunch");
    lunch.complete();

    fleet.add(new Thing("Get milk"));
    fleet.add(new Thing("Remove the obstacles"));
    fleet.add(standUp);
    fleet.add(lunch);

    System.out.println(fleet);
  }
}
