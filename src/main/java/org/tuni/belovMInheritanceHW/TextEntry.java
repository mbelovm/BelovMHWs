package org.tuni.belovMInheritanceHW;

public class TextEntry extends AbstractEntry {
    private final int fontsize;

    public TextEntry(String author, String date, String message, String type, int size, int fontsize) {
        super(author, date, message, type, size);
        this.fontsize = fontsize;
    }

    public int getFontsize() {
        return fontsize;
    }

    public void copytext() {
        System.out.printf("The \"%s\" was copied.\n", getMessage());
    }

    @Override
    public void getContent() {
        System.out.println(getAuthor() + " " + getDate() + " " + getMessage() + " " + getType() + " " + getSize() + " " + getFontsize());
    }

    @Override
    public int getMaxSize() {
        return 4;
    }
}
