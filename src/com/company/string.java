package com.company;

public class string {
    public static void main(String[] arg) {
        String stringinput = "Word";
        char[] inversat = stringinput.toCharArray();
        for (int i = inversat.length -1 ; i >= 0; i--){
            System.out.print(inversat[i]);
        }
    }
}
