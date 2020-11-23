public class NumberOfDaysInMonth {
    public static int getDaysInMonth(int month, int year) {
        if (year < 1 || year > 9999) {
            return -1;
        }
        if (month > 12 || month < 1) {
            return -1;
        }
        int numDays;
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                numDays = 31;
            break;
            case 2 :
                if(isLeapYear(year)){
                    numDays = 29;
                } else {
                    numDays = 28;
                }
            break;
            case 4:
            case 6:
            case 9:
            case 11:
                numDays = 30;
            break;
            default:
                numDays= 31;
                break;
        }
        return numDays;
    }

    public static boolean isLeapYear(int year) {
        if (year < 1 || year > 9999) {
            return false;
        }

        if (year % 4 != 0) {
            return false;
        }

        if (year % 100 != 0) {
            return true;
        }

        if (year % 400 != 0) {
            return false;
        }

        return true;
    }
}
