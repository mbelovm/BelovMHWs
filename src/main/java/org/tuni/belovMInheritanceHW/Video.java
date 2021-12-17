package org.tuni.belovMInheritanceHW;

public class Video extends MediaEntry {
    private final String quality;

    public Video(String author, String date, String message, String type, int size, boolean hiddencontent, String quality) {
        super(author, date, message, type, size, hiddencontent);
        this.quality = quality;
    }

    public String getQuality() {
        return quality;
    }

    public void playVideo() {
        System.out.printf("\"%s\" Video is playing!\n", getMessage());
    }

}
