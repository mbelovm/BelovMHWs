package org.tuni.belovMInheritanceHW;

public class MediaEntry extends AbstractEntry {
    private boolean hiddencontent;

    public MediaEntry(String author, String date, String message, String type, int size, boolean hiddencontent) {
        super(author, date, message, type, size);
        this.hiddencontent = hiddencontent;

    }

    public boolean isHiddenContent() {
        return hiddencontent;
    }

    @Override
    public void getContent() {
        System.out.println(getAuthor() + " " + getDate() + " " + getMessage() + " " + getType() + " " + getSize() + " " + isHiddenContent());
    }

    @Override
    public int getMaxSize() {
        return 4096;
    }
}
