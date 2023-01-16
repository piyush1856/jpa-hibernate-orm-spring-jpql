package com.sbi.usecase;

import com.sbi.StateBankDao;
import com.sbi.StateBankDaoImpl;

import java.util.Scanner;

public class DeleteAccountByIdUseCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter ID :");
        int id = sc.nextInt();

        StateBankDao dao = new StateBankDaoImpl();
        String res = dao.deleteAccountById(id);

        System.out.println(res);





    }



}
