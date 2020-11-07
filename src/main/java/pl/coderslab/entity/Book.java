package pl.coderslab.entity;




import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "books")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
            (cascade = {CascadeType.ALL})
    @NotNull
    @Size(max=255)
    private Author author;

    @Size(max=255)
    private String isbn;

    @ManyToOne
            (cascade = {CascadeType.ALL})
    @NotNull
    @Size(max=255)
    private Publisher publisher;

    @Size(max=255)
    private String title;

    @Size(max=255)
    private String type;

    public Book() {
    }

    public Long getId() {
        return id;
    }

    public Book setId(Long id) {
        this.id = id;
        return this;
    }



    public String getIsbn() {
        return isbn;
    }

    public Book setIsbn(String isbn) {
        this.isbn = isbn;
        return this;
    }

    public Author getAuthor() {
        return author;
    }

    public Book setAuthor(Author author) {
        this.author = author;
        return this;
    }

    public Publisher getPublisher() {
        return publisher;
    }

    public Book setPublisher(Publisher publisher) {
        this.publisher = publisher;
        return this;
    }

    public String getTitle() {
        return title;
    }

    public Book setTitle(String title) {
        this.title = title;
        return this;
    }

    public String getType() {
        return type;
    }

    public Book setType(String type) {
        this.type = type;
        return this;
    }


    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", author=" + author +
                ", isbn='" + isbn + '\'' +
                ", publisher=" + publisher +
                ", title='" + title + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
