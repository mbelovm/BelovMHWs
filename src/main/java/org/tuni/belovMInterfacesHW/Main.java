package org.tuni.belovMInterfacesHW;

public class Main {
    public static void main(String[] args) {
        final TextEntry story1 = new TextEntry("Mikhail", "19.11", "Story of my life", "Comment", 4, 12);
        final TextEntry story2 = new TextEntry("John", "29.01", "Sad story", "Comment", 10, 14);

        final Image photo1 = new Image("Olga", "12.12", "Me and my mom", "Repost", 100, false, true);
        final Audio birthhdaysong = new Audio("Peter", "01/03", "New Birthday song", "Entry", 300, false, 256);
        final Video weddingceremony = new Video("Alex", "31.10", "Wedding ceremony Video", "Entry", 4096, false, "High");


        story1.getFontsize();
        story2.copytext();
        birthhdaysong.downloadMusic();
        photo1.zoom();
        weddingceremony.reduceQuality();
        System.out.println("");
        photo1.getContent();

        story1.getContent();

        weddingceremony.getContent();
        birthhdaysong.getContent();

        story1.print();
        photo1.print();

        System.out.println("");

        birthhdaysong.play();
        weddingceremony.play();
    }
}
