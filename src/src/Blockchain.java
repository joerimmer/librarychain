import javafx.util.Pair;

import java.math.BigInteger;
import java.util.ArrayList;

/**
 * Created by joerimmer on 2017-03-06.
 */
public class Blockchain
{
    public ArrayList<Pair<Block, BigInteger>> Chain;

    public Blockchain()
    {
        Chain = new ArrayList<Pair<Block, BigInteger>>(); // block-signature pairs
    }
}
