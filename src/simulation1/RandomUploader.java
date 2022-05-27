package simulation1;

import admin.Admin;
import mediaDB.Content;
import mediaDB.implementations.AudioImpl;
import mediaDB.implementations.VideoImpl;

import java.math.BigDecimal;
import java.time.Duration;
import java.util.Random;

public class RandomUploader extends Thread {
    private final String[] UPLOADER_LISTE = {"Gösser", "Spreequell", "Artemis", "June", "RoterBogen", "Mensa"};
    private final int[] RESOLUTION = {360, 720, 1080};

    private final Admin admin;
    private final Random r;

    public RandomUploader(Admin admin) {
        this.admin = admin;
        this.r = new Random();
    }



    @Override
    public void run() {
        Content content;
       while (true) {
           System.out.println("Make a random file");
           int pick = r.nextInt(2);
           switch (pick) {
               case 0:
                   String uploader = UPLOADER_LISTE[r.nextInt(UPLOADER_LISTE.length)];
                   BigDecimal bitrate =  new BigDecimal(r.nextInt(700));
                   BigDecimal size = new BigDecimal(r.nextInt(750));
                   Duration length = Duration.ofSeconds(r.nextInt(300));
                   int resolution = RESOLUTION[r.nextInt(RESOLUTION.length)];

                   this.admin.createNewFile(new VideoImpl(uploader, bitrate, size, resolution, length ));
                   break;

               case 1:
                   uploader = UPLOADER_LISTE[r.nextInt(UPLOADER_LISTE.length)];
                   bitrate =  new BigDecimal(r.nextInt(700));
                   size = new BigDecimal(r.nextInt(750));
                   length = Duration.ofSeconds(r.nextInt(300));

                   this.admin.createNewFile(new AudioImpl(uploader, bitrate, size, length ));
                   break;
           }

       }

    }
}
