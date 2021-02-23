package by.balvanovich.lesson5.Task3;

import javax.naming.Name;
import java.awt.print.Book;

public class Books {
    int id;
    String Name;
    String Author;
    String PublishingHouse;
    int Year;
    int Pages;
    double Cost;

    public Books(int id, String Name, String Author, String PublishingHouse, int Year, int Pages, double Cost){
        this.id = id;
        this.Name = Name;
        this.Author = Author;
        this.PublishingHouse = PublishingHouse;
        this.Year = Year;
        this.Pages = Pages;
        this.Cost = Cost;
    }
    public static Books[] sortAuthor(Books[] mass,String nameAuthor){
        Books temp[] = new Books[mass.length];
        int n = 0;
        for (int i = 0; i < mass.length; i++) {
            if (mass[i].Author.compareTo(nameAuthor) == 0){
                temp[n] = mass[i];
                n++;
            }
        }
        Books temp2 [] = new Books[n];
        for (int i = 0; i < n; i++) {
            temp2[i] = temp[i];
        }
        return temp2;
    }
    public static Books[] sortPublishingHouse(Books[] mass,String House){
        Books temp[] = new Books[mass.length];
        int n = 0;
        for (int i = 0; i < mass.length; i++) {
            if (mass[i].PublishingHouse.compareTo(House) == 0){
                temp[n] = mass[i];
                n++;
            }
        }
        Books temp2 [] = new Books[n];
        for (int i = 0; i < n; i++) {
            temp2[i] = temp[i];
        }
        return temp2;
    }
    public static Books[] sortYear(Books[] mass,int year){
        Books temp[] = new Books[mass.length];
        int n = 0;
        for (int i = 0; i < mass.length; i++) {
            if (mass[i].Year >= year){
                temp[n] = mass[i];
                n++;
            }
        }
        Books temp2 [] = new Books[n];
        for (int i = 0; i < n; i++) {
            temp2[i] = temp[i];
        }
        return temp2;
    }
    public static void print (Books[] print){
        for (int i = 0; i < print.length; i++) {
            System.out.println(print[i].Name);

        }
    }
    public static void main(String[] args){
        Books book[] = new Books[5];
        book[0] = new Books(123456789,"Гарри Поттер и философский камень","Дж.К.Роулинг", "Махаон", 2016,432, 28.31);
        book[1] = new Books(123456788,"Гарри Поттер и Тайная комната","Дж.К.Роулинг", "Махаон", 2019,480, 26.18);
        book[2] = new Books(123456787,"Хроники Нарнии","Клайв Стейплз Льюис", "Эксмо", 2017,912, 25.09);
        book[3] = new Books(123456786,"Sapiens. Краткая история человечества","Юваль Харари", "Синдбад", 2016,520, 37.24);
        book[4] = new Books(123456785,"Ведьмак. Последнее желание. Меч предназначения","Анджей Сапковский", "АСТ", 2020,672, 21.37);

        String nameAuthor = "Дж.К.Роулинг";
        Books tmp[];
        tmp = Books.sortAuthor(book, nameAuthor);
        Books.print(tmp);

        tmp =Books.sortPublishingHouse(book,"Эксмо");
        Books.print(tmp);

        tmp = Books.sortYear(book,2017);
        Books.print(tmp);
    }

}
