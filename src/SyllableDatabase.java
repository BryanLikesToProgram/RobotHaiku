import javax.print.DocFlavor;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
/**
 * Created by Bryan on 4/5/2016.
 */
public class SyllableDatabase {
    //pubic String intToSyl (int a){
       // if (a == 5)
   // }

    public String fiveSyllable (int a) {
        ArrayList<String> fiveSyllableDatabase = new ArrayList<String>();
        File file = new File("SyllableDatabase/fiveSyllable.txt");
        try {
            Scanner scanner = new Scanner(file).useDelimiter("\\s*,\\s*");
            while (scanner.hasNext()) {
                fiveSyllableDatabase.add(scanner.next());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        String randomFiveSyl = (fiveSyllableDatabase.get(a)).toString();
        return randomFiveSyl;
    }

    public String fourSyllable (int a) {
        ArrayList<String> fourSyllableDatabase = new ArrayList<String>();
        File file = new File("SyllableDatabase/fourSyllable.txt");
        try {
            Scanner scanner = new Scanner(file).useDelimiter("\\s*,\\s*");
            while (scanner.hasNext()) {
                fourSyllableDatabase.add(scanner.next());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        String randomFourSyl = (fourSyllableDatabase.get(a)).toString();
        return randomFourSyl;
    }

    public String threeSyllable (int a) {
        ArrayList<String> threeSyllableDatabase = new ArrayList<String>();
        File file = new File("SyllableDatabase/threeSyllable.txt");
        try {
            Scanner scanner = new Scanner(file).useDelimiter("\\s*,\\s*");
            while (scanner.hasNext()) {
                threeSyllableDatabase.add(scanner.next());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        String randomThreeSyl = (threeSyllableDatabase.get(a)).toString();
        return randomThreeSyl;
    }

    public String twoSyllable (int a) {
        ArrayList<String> twoSyllableDatabase = new ArrayList<String>();
        File file = new File("SyllableDatabase/twoSyllable.txt");
        try {
            Scanner scanner = new Scanner(file).useDelimiter("\\s*,\\s*");
            while (scanner.hasNext()) {
                twoSyllableDatabase.add(scanner.next());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        String randomTwoSyl = (twoSyllableDatabase.get(a)).toString();
        return randomTwoSyl;
    }

    public String oneSyllable (int a) {
        ArrayList<String> oneSyllableDatabase = new ArrayList<String>();
        File file = new File("SyllableDatabase/oneSyllable.txt");
        try {
            Scanner scanner = new Scanner(file).useDelimiter("\\s*,\\s*");
            while (scanner.hasNext()) {
                oneSyllableDatabase.add(scanner.next());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        String randomOneSyl = (oneSyllableDatabase.get(a)).toString();
        return randomOneSyl;
    }
}

