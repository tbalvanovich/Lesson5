package by.balvanovich.lesson5.Task4;

public class Main {
    public static void main(String[] args) {
        Fraction a = new Fraction(3, 4);
        Fraction b = new Fraction(12, 3);
        Fraction c = Fraction.addition(a, b);
        c.print();
        c = Fraction.subtraction(a, b);
        c.print();
        c = Fraction.multiplication(a,b);
        c.print();
        c = Fraction.division(a, b);
        c.print();
        //вторая часть задания
        Fraction mass[] = new Fraction[5];
        mass[0] = new Fraction(5, 15);
        mass[1] = new Fraction(1, 18);
        mass[2] = new Fraction(3, 7);
        mass[3] = new Fraction(12, 24);
        mass[4] = new Fraction(9, 81);

        mass = Fraction.Mass(mass);
        for (int i = 0; i < mass.length; i++) {
            mass[i].print();

        }

    }
}



class Fraction {
    int m; //числитель
    int n; //знаменатель

    public Fraction(int m, int n){
        this.m = m;
        this.n = n;
    }

    public static Fraction addition (Fraction a, Fraction b){ // сложение
        int d = (a.m * b.n) + (b.m * a.n); // числитель
        int e = a.n * b.n; // знаменатель
    Fraction c = new Fraction(d, e);
    return c;
    }
    public void print(){
        System.out.println(m + "/" +n);
    }

    public static Fraction subtraction (Fraction a, Fraction b){ //вычитание
        int d = (a.m * b.n) - (b.m * a.n); // числитель
        int e = a.n * b.n; // знаменатель
        Fraction c = new Fraction(d, e);
        return c;
    }
    public static Fraction multiplication (Fraction a, Fraction b){ //умножение
        int d = a.m * b.m; // числитель
        int e = a.n * b.n; // знаменатель
        Fraction c = new Fraction(d, e);
        return c;
    }
    public static Fraction division (Fraction a, Fraction b){ //деление
        int d = a.m * b.n; // числитель
        int e = a.n * b.m; // знаменатель
        Fraction c = new Fraction(d, e);
        return c;
    }
    public static Fraction[] Mass (Fraction[] mass){
        int e = 0;
        if (mass.length % 2 != 0){
            e = 1;
        }
        for (int i = 0; i < mass.length - e; i= i + 2) {
            mass[i] = Fraction.addition(mass[i], mass[i + 1]);

        }
        return mass;
    }
}