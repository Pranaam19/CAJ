package lab3_2;

public class Bookshop {
    private double rate;
    private String Author;
    private int Bookid;
    private String Title;
    private String publisher;
    private int copy;

    Bookshop(int bookid,String author,String title,String publisher,int copy, int rate){
        this.Bookid = bookid;
        this.Author = author;
        this.publisher = publisher;
        this.Title = title;
        this.copy = copy;

    }

    @Override
    public String toString() {
        return "Bookid: "+getBookid()+getAuthor()+"|Title: "+getTitle()+"|Publisher: "+getPublisher()+"|Rate: "+getRate()+"|Copy: "+getCopy();
    }

    public boolean ispresent(int bookid){
        if(this.Bookid==Bookid)
            return true;
        return false;
    }

    public double getRate() {
        return rate;
    }

    public int getCopy() {
        return copy;
    }

    public String getAuthor() {
        return Author;
    }

    public int getBookid() {
        return Bookid;
    }

    public String getPublisher() {
        return publisher;
    }

    public String getTitle() {
        return Title;
    }

    public void setAuthor(String author) {
        Author = author;
    }

    public void setBook(int bookid) {
        Bookid = bookid;
    }

    public void setCopy(int copy) {
        this.copy = copy;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public void setTitle(String title) {
        Title = title;
    }
}
