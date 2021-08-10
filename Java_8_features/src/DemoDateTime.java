import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;

public class DemoDateTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      LocalDate date = LocalDate.now();
      System.out.println("date:" + date);
      
      LocalTime time = LocalTime.now(ZoneId.of("Asia/Kolkata"));
      System.out.println("time:" + time);
      
      System.out.println(ZoneId.getAvailableZoneIds());
	}

}
