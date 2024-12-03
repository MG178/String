package org.example;

import java.util.Arrays;

public class testName {

        private static final String[] english = {"A","B","C","D","E","F","G","H","L","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
        private static final String[] russ = {"А","Б","В","Г","Д","Е","Ё","Ж","З","И","Й","К","Л","М","Н","О","П","Р","С","Т","У","Ф","Х","Ц","Ч","Ш","Щ","Ъ","Ы","Ь","Э","Ю","Я"};
public static String generateLogin(String data){
    String[] regex ={"-\\ \\.\\,"};
    String[] dateName = data.split (Arrays.toString(regex));
    String surName = dateName[0].toLowerCase()+ ".";
    String firstNameLetter = dateName[1].toLowerCase().substring(0,1) + ".";
    String firstPatronomycLetter = dateName[2].toLowerCase().substring(0,1) + ".";
    String login = surName + firstNameLetter + firstPatronomycLetter;
    return makeLoginEnglish(login);
}

    private static String makeLoginEnglish(String login) {


    String englishLogin = "";
    String[] loginArr = login.split("");
        for (int i = 0; i < loginArr.length; i++) {
            for (int j = 0; j < russ.length; j++) {
                if (loginArr[i].equals(russ[j])){
                    englishLogin = english[j];
                    break;

                }
                else if (j + 1 == russ.length){
                    englishLogin+=loginArr[i];
                }

            }

        }
    return englishLogin;

    }

    public static void main(String[] args) {
        System.out.println(generateLogin("Ширалиев Магаммед Х"));
    }

// SUBSTRING - ОН БЕРЕТ ИЗ СЛОВА КАКУЮ-ТО ЧАСТЬ КОТОРКУЮ ТЫ ХОЧЕШЬ ПОТОМ ЕЕ ПИШЕТЬ
        // SUBSTRING(0,1) СЛОВО ИВАН, ОН ВОЗЬМЕТ ПЕРВУЮ БУКВУ, А ЕСЛИ ХОЧЕШЬ ВЗЯТЬ ПЕРВЫЕ ТРИ БУКВЫ, ТО НУЖНО SUBSTRING(0,4), А ЕСЛИ ХОЧЕШЬ НАПИСАТЬ СО 3 БУКВЫ ТО МОЖНО ПИСАТЬ ТАК: SUBSTRING(3).
        // АЛЬТ ЭНТЕР СОЗДАЕТ НОВЫЙ МЕТОД КОТОРОГО НЕТ, НО ТЕБЕ ОН НУЖЕН.
}

