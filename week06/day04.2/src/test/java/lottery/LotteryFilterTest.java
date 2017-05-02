package lottery;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Created by Bálint on 2017. 04. 27..
 */
public class LotteryFilterTest {

  @Test
  public void main() {
    LotteryFilter.main(new String[]{"-y", "2014"});
  }

}