package com.foxminded.anagram;

import java.util.Scanner;

public class InputText {

    public static void main(String[] args) {

        //String inputText = "a11sd3f  ыва4ар6р";
        //*---------------------------------------------------
        String inputText = "";

        while ( true ) {

            System.out.println("Input the word and press Enter or input Enter for exit");
            Scanner myObj = new Scanner(System.in);
            String inputWord = myObj.nextLine();
                if (inputWord.equals("")) {
                    if (!inputText.equals("")){
                        break;
                    }else{
                        System.out.println("You don't input anything");
                    }
                }
                if (!inputText.equals("")){
                    inputText = inputText + " " + inputWord;
                }else{
                    inputText = inputWord;
                }

            System.out.println("your input text = " + inputText);

        }
        //*///-----------------------------------------------------
        Reverse reverseInputText = new Reverse();
        System.out.println(reverseInputText.reverse(inputText));
    }

}

