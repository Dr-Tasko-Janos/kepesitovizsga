package hu.nive.ujratervezes.kepesitovizsga.addigits;

public class AddDigits {

    private String input;

    public int addDigits(String input) {
        int result = 0;
        if(input == null || input.isEmpty()) {
            return -1;
        }

        for(int i = 0; i < input.length(); i++) {
            if(input.charAt(i) >= 48 && input.charAt(i) <= 57) {
                result += Character.getNumericValue(input.charAt(i));
            }
        }
        return result;
    }
}
