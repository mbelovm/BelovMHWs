package org.tuni.belovMInheritanceHW;

public class Image extends MediaEntry {
    private final boolean colored;

    public Image(String author, String date, String message, String type, int size, boolean hiddencontent, boolean colored) {
        super(author, date, message, type, size, hiddencontent);
        this.colored = colored;
    }

    public boolean isColored() {
        return colored;
    }

    public void zoom() {
        System.out.printf("The \"%s\" photo was zoomed!\n", getMessage());
    }

    @Override
    public void getContent() {
        System.out.println(getAuthor() + " " + getDate() + " " + getMessage() + " " + getType() + " " + getSize() + " " + isHiddenContent() + " " + isColored());
    }
}
