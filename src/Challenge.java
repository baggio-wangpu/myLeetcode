public class Challenge {

    public static String numberToOrdinal(Integer number) {
        if (number == null || number.equals(0)) {
            return number.toString();
        }

        String ordinal, ordinalSuffix;

        if(isCommonSuffix(number)) {
            ordinalSuffix = "th";
        } else {
            ordinalSuffix = generateBasicSuffix(number);
        }

        ordinal = number.toString();

        return ordinal + ordinalSuffix;
    }

    private static boolean isCommonSuffix(Integer number){
        int toTen = number % 10;
        int toHundred = number % 100;
        return ((toHundred - toTen) == 10);
    }

    private static String generateBasicSuffix(Integer number){
        String basicSuffix;
        number = number % 10;
        switch (number){
            case 1:
                basicSuffix = "st";
                break;
            case 2:
                basicSuffix = "nd";
                break;
            case 3:
                basicSuffix = "rd";
                break;
            default:
                basicSuffix = "th";
                break;
        }
        return basicSuffix;
    }

}
