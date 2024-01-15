package examples.j14;


public class SwitchExpression {

    public boolean isWorkingDay(String day){
        boolean isWorkingDay = false;
        switch (day) {
            case "MONDAY":
            case "TUESDAY":
            case "WEDNESDAY":
            case "THURSDAY":
            case "FRIDAY":
                isWorkingDay = true;
                break;
            case "SATURDAY":
            case "SUNDAY":
                isWorkingDay = false;
                break;
            default:
                throw new IllegalArgumentException("What's a " + day);
        }

        return isWorkingDay;
    }

    public boolean isWorkingDayNew(String day){
        return switch (day) {
            case "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY" -> true;
            case "SATURDAY", "SUNDAY" -> false;
            default -> throw new IllegalArgumentException("What's a " + day);
        };
    }
}
