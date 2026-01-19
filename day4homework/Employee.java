package day4homework;

import java.util.ArrayList;
import java.util.List;

public class Employee {
    public static void main(String[] args){
        List<Employees> emp=new ArrayList<>();
        emp.add(new Employees("Alice",60000));
        emp.add(new Employees("Bob",45000));
        emp.add(new Employees("Charlie",75000));
        emp.add(new Employees("David",60000));
        emp.add(new Employees("Eva",90000));

        List<Integer> emp1=emp.stream().filter(e->e.salary>50000).map(e->e.salary*12).distinct().sorted((o1,o2)->o2-o1).toList();
        System.out.println("Annual Salary after processing: "+emp1);
        System.out.println("Count: "+emp1.size());

        List<Integer> prices = List.of(
                500, 1200, 2500, 1200, 3000, 800, 2500
        );
        List<Integer> price=prices.stream().filter(p->p>1000).distinct().sorted((o1,o2)->o2-o1).toList();
        long count=price.stream().filter(p->p>2000).count();
        System.out.println("Processed Prices: "+price);
        System.out.println("Count of prices > 2000: "+count);

        List<Bank> bank=new ArrayList<>();
        bank.add(new Bank("TXN1001","SAVINGS",12000));
        bank.add(new Bank("TXN1002","CURRENT",15000));
        bank.add(new Bank("TXN1003","SAVINGS",20000));
        bank.add(new Bank("TXN1004","SAVINGS",12000));
        bank.add(new Bank("TXN1005","SAVINGS",8000));
        bank.add(new Bank("TXN1006","CURRENT",30000));

        List<Integer> amounts=bank.stream().filter(b->b.AccountType.equals("SAVINGS") && b.Amount>=10000).map(b-> (int) (b.Amount+(b.Amount*0.18))).distinct().sorted((o1,o2)->o2-o1).toList();
        long result=amounts.stream().filter(a->a>20000).count();
        System.out.println("Processed Amounts: "+amounts);
        System.out.println("Count of amounts > 20000: "+result);



    }
}
class Employees{
    String name;
    int salary;

    public Employees(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }
}
class Bank{
    String TransactionId;
    String AccountType;
    int Amount;

    public Bank(String transactionId, String accountType, int amount) {
        this.TransactionId = transactionId;
        this.AccountType = accountType;
        this.Amount = amount;
    }
}