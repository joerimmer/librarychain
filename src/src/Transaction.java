import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
/**
 * Created by joerimmer on 2017-03-06.
 */
public class Transaction
{
    public String BookID;
    public String Borrower;
    public LocalDateTime CheckedOutTimestamp;
    public LocalDateTime DueByTimestamp;

    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");

    public Transaction(String BookID, String Borrower, LocalDateTime CheckedOutTimestamp, LocalDateTime DueByTimestamp)
    {
        this.BookID = BookID;
        this.Borrower = Borrower;
        this.CheckedOutTimestamp = CheckedOutTimestamp;
        this.DueByTimestamp = DueByTimestamp;
    }

    public String getBookID() {
        return BookID;
    }

    public String getBorrower(){
        return Borrower;
    }

    public String getCheckedOutTimestamp(){//Return the Checked out timestamp
        return CheckedOutTimestamp.format(formatter); //convert to string and return
    }

    public String getDueByTimestamp() {//return due by timestamp
        return DueByTimestamp.format(formatter); //convert to string and return
    }
}
