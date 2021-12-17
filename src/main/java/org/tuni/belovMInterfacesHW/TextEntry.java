package org.tuni.belovMInterfacesHW;

public class TextEntry extends AbstractEntry implements PrintIF{
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
        super.getContent();
        System.out.print(" " + getFontsize());
        System.out.println("");
    }

    @Override
    public int getMaxSize() {
        return 4;
    }

    public void print() {
        System.out.printf("The \"%s\" text file is being printed... \n", getMessage());
    }
}
