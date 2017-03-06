import java.time.LocalDateTime;

/**
 * Created by joerimmer on 2017-03-06.
 */
public class Transaction
{
    public String BookID;
    public String Borrower;
    public LocalDateTime CheckedOutTimestamp;
    public LocalDateTime DueByTimestamp;

    public Transaction(String BookID, String Borrower, LocalDateTime CheckedOutTimestamp, LocalDateTime DueByTimestamp)
    {
        this.BookID = BookID;
        this.Borrower = Borrower;
        this.CheckedOutTimestamp = CheckedOutTimestamp;
        this.DueByTimestamp = DueByTimestamp;
    }
}
