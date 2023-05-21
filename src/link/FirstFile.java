package link;

public class FirstFile<E> {
    E data;
    FirstFile<E> next;

    FirstFile(E data) {
        this.data = data;
    }
}