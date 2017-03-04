public class transaction {
    String bookTitle,borrowerName,timeStamp,dueBy;
    boolean returned = false;

    public transaction(String bTitle,String bName,String tStamp,String dBy) {
        bookTitle = bTitle;
        borrowerName = bName;
        timeStamp = tStamp;
        dueBy = dBy;
    }

    public String getBookTitle(){
        return bookTitle;
    }

    public String getBorrowerName(){
        return borrowerName;
    }

    public String getTimeStamp(){
        return timeStamp;
    }

    public String getDueBy(){
        return dueBy;
    }

    public String printInfo(){
        return "Book title : " + bookTitle + ", Borrower Name : " + borrowerName;
    }

    public setReturned() { //set the book as returned
        returned = true;
    }

    public boolean getReturned(){ // get the boolean if it was returned yet
        return returned;
    }

}
