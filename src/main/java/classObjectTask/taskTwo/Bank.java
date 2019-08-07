package classObjectTask.taskTwo;

public class Bank {
    public static void main(String[] args) {
        Person person = new Person();
        person.name = "Jan";
        person.surname = "Kowalski";
        person.pesel = "90897812365";

        Address adres = new Address();
        adres.city = "Wolsztyn";
        adres.postCode = "64-200";
        adres.street = "Lesna";
        adres.numberOfFlat = 20;
        person.registredAdress = adres;
        person.liveofAddress = adres;

        BankAccount account1 = new BankAccount();
        account1.owner = person;
        account1.balance = 10000;

        Person person2 = new Person();
        person2.name = "Alina";
        person2.surname= "Kiepska";
        person2.pesel = "73168047319";
        person2.registredAdress = new Address();
        person2.registredAdress.city = "Wolsztyn";
        person2.registredAdress.street = "Krótka";
        person2.registredAdress.numberOfFlat = 43;
        person2.liveofAddress = adres;

        BankAccount account2 = new BankAccount();
        account2.owner = person2;
        account2.balance = 50000;

        Credit credit = new Credit();
        credit.borrower = person;
        credit.cashBorrowed = 20000;
        credit.interestRate = 0.05;
        credit.termMonth = 12;

        String personInfo = "Osoba: " + person.name + " " + person.surname + " " + person.pesel +
                 "\nMieszka w " + person.liveofAddress.city  + "\nMa na koncie: " + account1.balance;

        String personInfo2 = "Osoba: " + person2.name + " " + person2.surname + " " + person2.pesel +
                "\nMieszka w " + person2.liveofAddress.city + "\nMa na koncie: " + account2.balance;

        System.out.println(personInfo);
        System.out.println(personInfo2);
    }
}
