package pl.coderslab.repository;

import pl.coderslab.entity.Book;

import java.util.List;
import java.util.Optional;

public interface BookService {

    public Optional<Book> get(Long id);
    public void delete(Long id);
    public void add(Book book);
    public void update(Book book);
    public List<Book> getBooks();
}
