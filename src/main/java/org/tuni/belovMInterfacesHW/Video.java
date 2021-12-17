package org.tuni.belovMInterfacesHW;

public class Video extends MediaEntry implements PlayIF{
    private final String quality;

    public Video(String author, String date, String message, String type, int size, boolean hiddencontent, String quality) {
        super(author, date, message, type, size, hiddencontent);
        this.quality = quality;
    }

    public String getQuality() {
        return quality;
    }

    public void reduceQuality() {
        System.out.printf("\"%s\" Video quality was reduced!\n", getMessage());
    }

    @Override
    public void getContent() {
        super.getContent();
        System.out.println(" " + getQuality());
        System.out.println("");
    }

    public void play() {
        System.out.printf("The \"%s\" video is playing now! \n", getMessage());
    }
}
