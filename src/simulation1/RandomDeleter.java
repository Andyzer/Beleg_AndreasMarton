package simulation1;

import admin.Admin;
import mediaDB.Content;

import java.util.ArrayList;
import java.util.Random;

public class RandomDeleter extends Thread {

    private final Admin admin;
    private final Random r;

    public RandomDeleter(Admin admin) {
        this.admin = admin;
        this.r = new Random();
    }

    @Override
    public void run() {
        while(true) {
            System.out.println("Try to delete something");
            ArrayList<Content> contents = this.admin.showAllFiles();
            if (contents.size()>0) {
                this.admin.deleteMedia(contents.get(r.nextInt(contents.size())));
            }
        }

    }
}
