package org.tuni.belovMInheritanceHW;

public abstract class AbstractEntry {
    private final String author;
    private final String date;
    private final String message;
    private final String type;
    private final int size;

    public AbstractEntry(String author, String date, String message, String type, int size) {
        this.author = author;
        this.date = date;
        this.message = message;
        this.type = type;
        this.size = size;
    }

    public String getAuthor() {
        return author;
    }

    public String getDate() {
        return date;
    }

    public String getMessage() {
        return message;
    }

    public String getType() {
        return type;
    }

    public int getSize() {
        return size;
    }

    public void getContent() {
        System.out.println(author + " " + date + " " + message + " " + type + " " + size);
    }


    public abstract int getMaxSize();

}
