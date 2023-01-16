package com.sbi.usecase;

import com.sbi.Account;
import com.sbi.StateBankDao;
import com.sbi.StateBankDaoImpl;

import java.time.LocalDate;
import java.util.Date;
import java.util.Scanner;

public class SaveAccountUseCase {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter email :");
        String email = sc.nextLine();
        System.out.println("Enter address :");
        String add = sc.nextLine();
        System.out.println("Enter Balance");
        Double bal = sc.nextDouble();

        StateBankDao dao = new StateBankDaoImpl();

        Account acc = new Account(email,add,bal, new Date());
        dao.saveAccount(acc);







    }
}
