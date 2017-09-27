import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestDate {
    public static void main(String[]args) throws ParseException {
        Date date = new SimpleDateFormat("yyyy-MM-dd").parse("2017-09-07 00:00:00.000");
        System.out.println(date.getTime());
    }

}
