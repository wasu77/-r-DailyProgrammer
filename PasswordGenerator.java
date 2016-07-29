import java.util.Random;
import java.util.Scanner;
/**
 * DailyProgrammer #4 EASY - RandomPaswordGenerator
 You're challenge for today is to create a random password generator!
 For extra credit, allow the user to specify the amount of passwords to generate.
 For even more extra credit, allow the user to specify the length of the strings he wants to generate!
 */
public class PasswordGenerator {

    private int passwordLength;
    private int passwordNumber;

        private void prompt() {
            Scanner input = new Scanner(System.in);
            System.out.println("Define length of your password: ");
            passwordLength = input.nextInt();
            System.out.println("Define number of passwords you want: ");
            passwordNumber = input.nextInt();
        }
        private void generator() {
            String list = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ!?@#$1234567890";
            int j = 0;
            while (j < passwordNumber) {
                StringBuilder password = new StringBuilder(passwordLength);
                for(int i = 0; i < passwordLength; i++) {

                    Random indexChecker = new Random();
                    password.append(list.charAt(indexChecker.nextInt(list.length())));
                                    }
                System.out.println(password);
                j++;
            }
        }

    public static void main(String[] args){
        PasswordGenerator p1 = new PasswordGenerator();
        p1.prompt();
        p1.generator();
    }
}
