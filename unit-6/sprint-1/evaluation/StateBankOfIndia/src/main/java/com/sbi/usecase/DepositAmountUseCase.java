package com.sbi.usecase;

import com.sbi.StateBankDao;
import com.sbi.StateBankDaoImpl;

import java.util.Scanner;

public class DepositAmountUseCase {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter ID :");
        int id = sc.nextInt();
        System.out.println("Enter amount :");
        double amt = sc.nextDouble();


        StateBankDao dao = new StateBankDaoImpl();
        dao.depositInAccount(amt,id);







    }
}
