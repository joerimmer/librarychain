import java.math.BigInteger;
import java.util.Random;

/**
 * Created by joerimmer on 2017-03-04.
 */
public class Signer {

    public static void SignTransaction(Transaction tx, int privateKey){
        Random rand = new Random();

        int hash = tx.hashCode();
        BigInteger p = BigInteger.probablePrime(160, new Random());
        BigInteger e;

        do {
            e = new BigInteger(160, new Random());
        } while (e.compareTo(p.subtract(BigInteger.ONE)) > 0);

        int x = rand.nextInt();
        long y = Math.round(Math.sqrt(Math.pow(x, 3) - x));
    }
}
