package com.masai;

public interface LibraryDao {

    public Library getInformationByID(int id);

    public void createBook(Library lib);

    public boolean deleteBook(int id);

    public void doublingPrice(int id);
}
