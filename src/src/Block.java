import javafx.util.Pair;
import java.math.BigInteger;
import java.util.ArrayList;

/**
 * Created by joerimmer on 2017-03-06.
 */
public class Block
{
    public ArrayList<Pair<Transaction, BigInteger>> Transactions;   // tx-signature pairs

    public Block()
    {
        Transactions = new ArrayList<Pair<Transaction, BigInteger>>();
    }
}
