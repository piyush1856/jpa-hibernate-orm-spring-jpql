package com.masai.usecases;

import com.masai.Library;
import com.masai.LibraryDao;
import com.masai.LibraryDaoImpl;

import java.util.Scanner;

public class GetInformationByIDUseCase {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter ID :");
        int id = sc.nextInt();
        Library l = null;

        LibraryDao dao = new LibraryDaoImpl();
        l = dao.getInformationByID(id);

        System.out.println(l);







    }
}
