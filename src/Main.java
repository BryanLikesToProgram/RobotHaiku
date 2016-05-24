/**
 * Project RobotHaiku
 * Created by Bryan
 * On 4/5/2016
 */
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random FTFY = new Random();
        if (FTFY.nextInt(2) == 1){
            System.out.println("equals one");
        }
        else{
            System.out.println("not equals one");
        }

        SyllableDatabase syllableDatabase = new SyllableDatabase();
        HaikuCreator haikuCreator = new HaikuCreator();
        System.out.println(syllableDatabase.fiveSyllable(haikuCreator.Random(25)));
        System.out.println(syllableDatabase.fourSyllable(haikuCreator.Random(25)));
        System.out.println(syllableDatabase.threeSyllable(haikuCreator.Random(25)));
        System.out.println(syllableDatabase.twoSyllable(haikuCreator.Random(25)));
        System.out.println(syllableDatabase.oneSyllable(haikuCreator.Random(25)));
        System.out.println(haikuCreator.Random(2));
        System.out.println(FTFY.nextInt(2));
        System.out.println(haikuCreator.fiveSylLn());
    }
}




