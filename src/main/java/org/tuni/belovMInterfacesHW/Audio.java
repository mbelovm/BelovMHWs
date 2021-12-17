package org.tuni.belovMInterfacesHW;

public class Audio extends MediaEntry implements PlayIF {
    private final int bitrate;

    public Audio(String author, String date, String message, String type, int size, boolean hiddencontent, int bitrate) {
        super(author, date, message, type, size, hiddencontent);
        this.bitrate = bitrate;
    }

    public int getBitrate() {
        return bitrate;
    }

    public void downloadMusic() {

        System.out.printf("The song \"%s\" was downloaded!\n", getMessage());
    }

    @Override
    public void getContent() {
        super.getContent();
        System.out.println(" " + getBitrate());
        System.out.println("");
    }

    public void play() {
        System.out.printf("The \"%s\" song is playing now!\n", getMessage());
    }
}