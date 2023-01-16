package com.sbi.usecase;

import com.sbi.Account;
import com.sbi.StateBankDao;
import com.sbi.StateBankDaoImpl;

import java.util.Scanner;

public class FindAccountByIDUseCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter ID :");
        int id = sc.nextInt();
        Account a = null;

        StateBankDao dao = new StateBankDaoImpl();
        a = dao.findAccountById(id);

        System.out.println(a);





    }
}
