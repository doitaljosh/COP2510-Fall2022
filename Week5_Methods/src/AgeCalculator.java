import java.util.Calendar;
import java.util.Date;

public class AgeCalculator {
    public static int CalculateAge(int startYear, int startMonth, int startDay) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date());

        int startDateFormatted = (startYear * 10000) + (startMonth * 100) + startDay;
        int endDateFormatted = (
                        (calendar.get(Calendar.YEAR) * 10000) +
                        (calendar.get(Calendar.MONTH) * 100) +
                        (calendar.get(Calendar.DAY_OF_MONTH))
                );
        return ((endDateFormatted - startDateFormatted) / 10000);
    }
}
