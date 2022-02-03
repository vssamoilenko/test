package com.foxminded.anagram;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Reverse {

    private String outputText ="";

    public String reverse(String text) {

/*
        String[] inputWords = text.split(" ");
        String[] outputWords = new String[inputWords.length];

        int  i = 0;
        for (String inputWord : inputWords) {

            outputWords[i] = convertingTheWord (inputWord);
            i++;
        }
        return String.join(" ", outputWords);
*/
/*
        List<String> words = Arrays.stream(text.split(" ")).collect(Collectors.toList());
        words.stream()
                .map(this::convertingTheWord)
                .forEach(this::prepareOutputWord);
        return this.outputText.substring(1);
*/
        List<String> words = Arrays.stream(text.split(" ")).collect(Collectors.toList());
        outputText = words.stream()
                .map(this::convertingTheWord)
                //.map(s -> s.toString())
                .map(Object::toString)
                .collect (Collectors.joining(" "));
        return outputText;
    }

    private void prepareOutputWord(String Words) {
        this.outputText = this.outputText + " " + Words;
    }

    private String convertingTheWord(String inputWord) {

        char[] inputWordBuild = inputWord.toCharArray();
        int indexStraight = 0;
        int indexBack = inputWord.length() - 1;
        boolean isStraightPositionCharLetter;
        boolean isBackPositionCharLetter;


        while (indexStraight <= indexBack) {
            isStraightPositionCharLetter = Character.isLetter(inputWordBuild[indexStraight]);
            isBackPositionCharLetter = Character.isLetter(inputWordBuild[indexBack]);
            if (isStraightPositionCharLetter) {
                if (isBackPositionCharLetter) {
                    swap( inputWordBuild, indexStraight, indexBack);
                    indexStraight++;
                }
                indexBack--;
            } else {
                indexStraight++;
                if (!isBackPositionCharLetter) {
                    indexBack--;
                }
            }
        }

        return String.valueOf(inputWordBuild);
    }

    private void swap(char[] inputWordBuild, int indexStraight, int indexBack) {

        char temp;
        temp = inputWordBuild[indexStraight];
        inputWordBuild[indexStraight] = inputWordBuild[indexBack];
        inputWordBuild[indexBack] = temp;

    }
}//public class Reverse end

