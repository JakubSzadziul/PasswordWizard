package main;



import java.util.Random;
import java.util.stream.Stream;

public class PasswordGenerator {

 private  static String allowedCharacters1 = "qwertyuiopasdfghjklzxcvbnmQWERTYUIOPASDFGHJKLZXCVBNM0123456789!@#$%^&*()_+-=";
 private static  String allowedCharacters2 ="qwertyuiopasdfghjklzxcvbnmQWERTYUIOPASDFGHJKLZXCVBNM0123456789";
 private static  String allowedCharacters3 ="qwertyuiopasdfghjklzxcvbnmQWERTYUIOPASDFGHJKLZXCVBNM";

   private static Random generator = new Random();



    public static StringBuilder generatePassword1 (int length){
        StringBuilder password = new StringBuilder(length);
        for (int i=0;i<length;++i){
            password.append(allowedCharacters1.charAt(generator.nextInt(allowedCharacters1.length())));
        }
        return password;
    }

    public static StringBuilder generatePassword2 (int length){
        StringBuilder password = new StringBuilder(length);
        for (int i=0;i<length;++i){
            password.append(allowedCharacters2.charAt(generator.nextInt(allowedCharacters2.length())));
        }

        return password;
    }

    public static StringBuilder generatePassword3 (int length){
        StringBuilder password = new StringBuilder(length);
        for (int i=0;i<length;++i){
            password.append(allowedCharacters3.charAt(generator.nextInt(allowedCharacters3.length())));
        }

        return password;
    }


}
