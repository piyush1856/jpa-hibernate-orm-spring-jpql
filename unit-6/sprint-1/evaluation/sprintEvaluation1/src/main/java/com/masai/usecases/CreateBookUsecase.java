package com.masai.usecases;

import com.masai.Library;
import com.masai.LibraryDao;
import com.masai.LibraryDaoImpl;

import java.sql.Timestamp;
import java.util.Date;
import java.util.Scanner;

public class CreateBookUsecase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Book Name :");
        String name = sc.nextLine();
        System.out.println("Book Author :");
        String auth = sc.nextLine();
        System.out.println("Book Publication :");
        String pub = sc.nextLine();
        System.out.println("Book Category :");
        String cat = sc.nextLine();
        System.out.println("Book Pages :");
        int page = sc.nextInt();
        System.out.println("Book Price :");
        int price = sc.nextInt();


        Library library = new Library(name,auth,pub,cat,page,price,new Timestamp(new Date().getTime()));

        LibraryDao dao = new LibraryDaoImpl();
        dao.createBook(library);





    }
}
