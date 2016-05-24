import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Random;

/**
 * Created by Bryan on 4/5/2016.
 */
public class HaikuCreator {
    SyllableDatabase syllableDatabase = new SyllableDatabase();
    private Random FTFY = new Random();

    public int Random(int x) {
        SecureRandom random = new SecureRandom();
        try {
            random = SecureRandom.getInstance("SHA1PRNG");
            //Creates a random number based on the SHA1PRNG algorithm (still Psedo Random, more effective on Windows)
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        return random.nextInt(x);
        // x = < max num
    }

    public String fiveSylLn() {
        int currentSyllable = currentSyllable = Random(6);
        ;
        String line = null;
        while (currentSyllable != 0) {
            if (currentSyllable == 5) {
                line = syllableDatabase.fiveSyllable(25);
                // add a random 5 syllable number between the first string and 25th string
                return line;
            }
            if (currentSyllable == 4) {
                line = syllableDatabase.fourSyllable(25);
                line = line + syllableDatabase.oneSyllable(25);
                return line;
            }
            if (currentSyllable == 3) {
                line = syllableDatabase.threeSyllable(25);
                if (FTFY.nextInt(2) == 1) {
                    line = line + syllableDatabase.oneSyllable(25);
                    line = line + syllableDatabase.oneSyllable(25);
                    return line;
                } else {
                    line = line + syllableDatabase.twoSyllable(25);
                    return line;
                }
            }
            if (currentSyllable == 2) {
                line = syllableDatabase.twoSyllable(25);
                int tmpRandThree = FTFY.nextInt(3);
                if (tmpRandThree == 0) {
                    line = line + syllableDatabase.oneSyllable(25);
                    if (Random(2) == 1) {
                        line = line + syllableDatabase.oneSyllable(25);
                        line = line + syllableDatabase.oneSyllable(25);
                        return line;
                    } else {
                        line = line + syllableDatabase.twoSyllable(25);
                        return line;
                    }
                }
                if (tmpRandThree == 1) {
                    line = line + syllableDatabase.twoSyllable(25);
                    line = line + syllableDatabase.oneSyllable(25);
                    return line;
                }
                if (tmpRandThree == 2) {
                    line = line + syllableDatabase.threeSyllable(25);
                    return line;
                }
            }
            if (currentSyllable == 1) {
                line = syllableDatabase.oneSyllable(25);
                int tmpRandFour = Random(4);
                int tmpRandThree = Random(3);
                if (tmpRandFour == 0) {
                    line = line + syllableDatabase.oneSyllable(25);
                    if (tmpRandThree == 0) {
                        line = line + syllableDatabase.oneSyllable(25);
                        if (Random(2) == 1) {
                            line = line + syllableDatabase.oneSyllable(25);
                            line = line + syllableDatabase.oneSyllable(25);
                            return line;
                        } else {
                            line = line + syllableDatabase.twoSyllable(25);
                            return line;
                        }
                    }
                }
                if (tmpRandFour == 1) {
                    line = line + syllableDatabase.twoSyllable(25);
                    if (tmpRandThree == 0) {
                        if (Random(2) == 1) {
                            line = line + syllableDatabase.oneSyllable(25);
                            line = line + syllableDatabase.oneSyllable(25);
                            return line;
                        } else {
                            line = line + syllableDatabase.twoSyllable(25);
                             return line;
                        }
                    }
                }
            }

        }
        return line;
    }
}
