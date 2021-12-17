package org.tuni.belovMInheritanceHW;

public class Audio extends MediaEntry {
    private final int bitrate;

    public Audio(String author, String date, String message, String type, int size, boolean hiddencontent, int bitrate) {
        super(author, date, message, type, size, hiddencontent);
        this.bitrate = bitrate;
    }

    public int getBitrate() {
        return bitrate;
    }

    public void playMusic() {

        System.out.printf("The song \"%s\" is playing!\n", getMessage());
    }

    @Override
    public void getContent() {
        System.out.println(getAuthor() + " " + getDate() + " " + getMessage() + " " + getType() + " " + getSize() + " " + isHiddenContent() + " " + getBitrate());
    }
}
