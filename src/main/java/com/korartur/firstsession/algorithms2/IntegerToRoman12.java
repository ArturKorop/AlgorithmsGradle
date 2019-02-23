package com.korartur.firstsession.algorithms2;

public class IntegerToRoman12 {

    public String intToRoman(int num) {
        StringBuilder sb = new StringBuilder();

        int thousands = num / 1000;
        num = num % 1000;
        for (int i = 0; i < thousands; i++) {
            sb.append('M');
        }

        int hundreds = num / 100;
        num = num % 100;
        setValue(sb, 'M', 'D', 'C', hundreds);
        int tens = num / 10;
        setValue(sb, 'C', 'L', 'X', tens);
        num = num % 10;

        setValue(sb, 'X', 'V', 'I', num);

        return sb.toString();
    }

    private void setValue(StringBuilder sb, char big, char middle, char small, int value){
        if(value == 9){
            sb.append(small);
            sb.append(big);
        } else if(value >= 5) {
            sb.append(middle);
            for(int i = 0; i < value -5; i++){
                sb.append(small);
            }
        } else if(value == 4){
            sb.append(small);
            sb.append(middle);
        } else {
            for(int i = 0; i < value;i++){
                sb.append(small);
            }
        }
    }

}
