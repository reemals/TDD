package com.training;

import java.time.LocalTime;

public class TimeToTextConverter {
    public String convertTimeToText(LocalTime localTime) {
        if(localTime.getHour() == 12 && localTime.getMinute() == 0) {
            return "midday";
        }
        else if (localTime.getHour()==0 && localTime.getMinute()==0) {
            return "midnight";
        }
        else if (localTime.getMinute()==30) {
            return "HalfPastTheHour";
        }
        else if (localTime.getMinute()==15) {
            return "QuarterPast";
        }
        else if (localTime.getMinute()==45) {
            return "QuarterToTheHour";
        }
        else if (localTime.getMinute()==5) {
            return "FiveMinutePast";
        }
        else if (localTime.getMinute()==10) {
            return "TenMinutePast";
        }
        else if (localTime.getMinute()>55) {
            return "Almost";
        }
        else if (localTime.getMinute()<5) {
            return "JustAfter";
        }
        else {
            return null;
        }
    }
}
