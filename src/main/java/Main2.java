public class Main2 {
    public static void main(String[] args) {
            String str = "Мага Ширалиев 57";
            String firstName;
            String surName;
            String nickname;

            String[] arrString = str.split(" ");

       surName = arrString[1];
       firstName = arrString[0];
       nickname = arrString[2];
//        System.out.println("фамилия = "+ surName.toUpperCase());
//        System.out.println("имя = " + firstName.toUpperCase());
//        System.out.println("никнайм = " + nickname);
        System.out.println(surName.toUpperCase() + " "+ firstName.charAt(0)
        +"." + surName.charAt(0)+ "." );
            }

    }

