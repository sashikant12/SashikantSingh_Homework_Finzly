package Problem1.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Libary {
    int ISBN;
    String Title,Author,Pyear;
@Id
    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }




    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String author) {
        Author = author;
    }

    public String getPyear() {
        return Pyear;
    }

    public void setPyear(String pyear) {
        Pyear = pyear;
    }

    @Override
    public String toString() {
        return "Libary{" +
                "ISBN=" + ISBN +
                ", Title='" + Title + '\'' +
                ", Author='" + Author + '\'' +
                ", Pyear='" + Pyear + '\'' +
                '}';
    }
}
