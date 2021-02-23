package by.balvanovich.lesson5.Task2;

import javax.naming.Name;

public class Customer {
    int id;
    String LastName;
    String Name;
    String Patronymic;
    String Address;
    long CreditCardNumber;
    String BankAccountNumber;


    public Customer(int id, String LastName, String Name, String Patronymic, String Address, long CreditCardNumber, String BankAccountNumber) {
        this.id = id;
        this.LastName = LastName;
        this.Name = Name;
        this.Patronymic = Patronymic;
        this.Address = Address;
        this.CreditCardNumber = CreditCardNumber;
        this.BankAccountNumber = BankAccountNumber;
    }

    public static Customer[] sort(Customer[] mass) {
        for (int i = 1; i < mass.length; i++) {
            for (int j = 0; j < mass.length - i; j++) {
                if (mass[j].LastName.compareTo(mass[j + 1].LastName) > 0) {
                    Customer temp = mass[j];
                    mass[j] = mass[j + 1];
                    mass[j + 1] = temp;
                } else if (mass[j].LastName.compareTo(mass[j + 1].LastName) == 0) {
                    if (mass[j].Name.compareTo(mass[j + 1].Name) > 0) {
                        Customer temp = mass[j];
                        mass[j] = mass[j + 1];
                        mass[j + 1] = temp;
                } else if (mass[j].Name.compareTo(mass[j + 1].Name) == 0) {
                    if (mass[j].Patronymic.compareTo(mass[j + 1].Patronymic) > 0) {
                        Customer temp = mass[j];
                        mass[j] = mass[j + 1];
                        mass[j + 1] = temp;
                    }
                    }
                }
            }

        }
        return mass;
    }

    public static void print(Customer[] pr) {
        for (int i = 0; i < pr.length; i++) {
            System.out.println(pr[i].LastName + " " + pr[i].Name + " " + pr[i].Patronymic);

        }
        System.out.println(); //для отделения от результатов следющего задания
        ;
    }
    public static void minmax (Customer[] mass, long min, long max){
        for (int i = 0; i < mass.length; i++) {
            if (mass[i].CreditCardNumber <= max && mass[i].CreditCardNumber >=min){
                System.out.println(mass[i].LastName + " " + mass[i].Name + " " + mass[i].Patronymic + " " + mass[i].CreditCardNumber);
            }

        }
    }



    public static void main(String[] args) {
        Customer client[] = new Customer[5];
        client[0] = new Customer(12345, "Харламов", "Гарик", "Юрьевич", "Минск", 54456565, "BY123456799876543");
        client[1] = new Customer(23456, "Харламов", "Гарик", "Бульдог", "Брест", 54456566, "BY123456799876544");
        client[2] = new Customer(34567, "Воля", "Павел", "Александрович", "Витебск", 54456567, "BY123456799876545");
        client[3] = new Customer(45678, "Батрудинов", "Тимур", "Каштан", "Гомель", 54456568, "BY123456799876546");
        client[4] = new Customer(56789, "Рева", "Александр", "Владимирович", "Гродно", 54456569, "BY123456799876547");
        client = Customer.sort(client);
        Customer.print(client);
        Customer.minmax(client,54456566, 54456568);



    }

}
