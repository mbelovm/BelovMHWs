package org.tuni.belovMInterfacesHW;

public class Image extends MediaEntry{
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
        super.getContent();
        System.out.print(" " + isColored());
        System.out.println("");
    }


    public void print() {
        System.out.printf("The \"%s\" image file is being printed... \n", getMessage());
    }
}
