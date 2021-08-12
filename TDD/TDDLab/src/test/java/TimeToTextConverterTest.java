import com.training.TimeToTextConverter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalTime;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TimeToTextConverterTest {

    private TimeToTextConverter timeToTextConverter;
    private String timeAsText;
    @BeforeEach
    public void setup() {
        timeToTextConverter = new TimeToTextConverter();
    }

    @Test
    public void canDoMidnight() {
        timeAsText = timeToTextConverter.convertTimeToText(LocalTime.MIDNIGHT); // this method doesn't exist either!
        assertEquals("midnight", timeAsText);
    }

    @Test
    public void canDoMidday() {
        timeAsText = timeToTextConverter.convertTimeToText(LocalTime.NOON); // this method doesn't exist either!
        assertEquals("midday", timeAsText);
    }

    @Test
    public void canDoHalfPastHour() {
        timeAsText = timeToTextConverter.convertTimeToText(LocalTime.of(12,30)); // this method doesn't exist either!
        assertEquals("HalfPastTheHour", timeAsText);
    }

    @Test
    public void canDoQuarterPast() {
        timeAsText = timeToTextConverter.convertTimeToText(LocalTime.of(3,15)); // this method doesn't exist either!
        assertEquals("QuarterPast", timeAsText);
    }

    @Test
    public void canDoQuarterToTheHour() {
        timeAsText = timeToTextConverter.convertTimeToText(LocalTime.of(3,45)); // this method doesn't exist either!
        assertEquals("QuarterToTheHour", timeAsText);
    }

    @Test
    public void canDoFiveMinutesPast() {
        timeAsText = timeToTextConverter.convertTimeToText(LocalTime.of(3,5)); // this method doesn't exist either!
        assertEquals("FiveMinutePast", timeAsText);
    }

    @Test
    public void canDoTenMinutesPast() {
        timeAsText = timeToTextConverter.convertTimeToText(LocalTime.of(3,10)); // this method doesn't exist either!
        assertEquals("TenMinutePast", timeAsText);
    }

    @Test
    public void canDoJustAfter() {
        timeAsText = timeToTextConverter.convertTimeToText(LocalTime.of(3,3)); // this method doesn't exist either!
        assertEquals("JustAfter", timeAsText);
    }

    @Test
    public void canDoAlmost() {
        timeAsText = timeToTextConverter.convertTimeToText(LocalTime.of(3,58)); // this method doesn't exist either!
        assertEquals("Almost", timeAsText);
    }
}
