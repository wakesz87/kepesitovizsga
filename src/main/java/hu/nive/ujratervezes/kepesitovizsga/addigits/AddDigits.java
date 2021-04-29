package hu.nive.ujratervezes.kepesitovizsga.addigits;

public class AddDigits {

    private int n;

    public int addDigits(String input){
        if (input == null || input.isBlank()){
            return -1;
        }
        int count = 0;
        char[] chars= input.toCharArray();
        for (char c : chars){
            if(Character.isDigit(c)){
                count+=Integer.parseInt(Character.toString(c));
            }
        }

        return count;



    }

}
