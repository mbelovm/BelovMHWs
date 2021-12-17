package org.tuni.belovMInterfacesHW;

public class MediaEntry extends AbstractEntry {
    private final boolean hiddencontent;

    public MediaEntry(String author, String date, String message, String type, int size, boolean hiddencontent) {
        super(author, date, message, type, size);
        this.hiddencontent = hiddencontent;

    }

    public boolean isHiddenContent() {
        return hiddencontent;
    }

    @Override
    public void getContent() {
        super.getContent();
        System.out.print(" " + isHiddenContent());
    }

    @Override
    public int getMaxSize() {
        return 4096;
    }
}
