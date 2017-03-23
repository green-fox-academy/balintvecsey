/**
 * Created by Bálint on 2017. 03. 23..
 */
public class UrlFixer {
  public static void main(String... args){
    String url = "https//www.reddit.com/r/nevertellmethebots";

    // Accidentally I got the wrong URL for a funny subreddit. It's probably "odds" and not "bots"
    // Also, the URL is missing a crutial component, find out what it is and insert it too!
    // Try to solve it more than once using different String functions!

    String firstPart = url.substring(0, 5);
    String secondPart = url.substring(5);
    String odds = secondPart.replace("bots", "odds");
    String replacedUrl1 = firstPart + ":" + odds;

    String replacedUrl2 = url.replace("bots", "odds");

    System.out.println(replacedUrl1);
    System.out.println(replacedUrl2);
  }
}
