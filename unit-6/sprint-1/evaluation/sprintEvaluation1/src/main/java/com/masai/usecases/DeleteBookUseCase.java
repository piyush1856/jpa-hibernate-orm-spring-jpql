package com.masai.usecases;

import com.masai.LibraryDao;
import com.masai.LibraryDaoImpl;

import java.util.Scanner;

public class DeleteBookUseCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter ID :");
        int id = sc.nextInt();
        LibraryDao dao = new LibraryDaoImpl();
        Boolean flag =  dao.deleteBook(id);

        if(flag){
            System.out.println("Deleted");
        }else{
            System.out.println("book noy found");
        }



    }
}
