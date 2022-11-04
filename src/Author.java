import java.util.Objects;

public class Author {
     private final String name;
     private final String surname;

    public Author(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }
    public String getName() { return this.name; }
    public String getSurname() { return this.surname; }

    public String toString() {
        return "автор кноги " + getName() + " " + getSurname();
    }

    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Author author = (Author) object;
        return Objects.equals(name, author.name);
    }

    public int hashCode() {
        return Objects.hash(name);
    }
}
