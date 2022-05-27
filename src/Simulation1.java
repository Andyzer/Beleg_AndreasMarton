import admin.Admin;
import simulation1.RandomDeleter;
import simulation1.RandomUploader;

import java.util.Random;

public class Simulation1 {
    public static void main(String[] args) {

        Admin admin = new Admin();
        RandomDeleter deleter = new RandomDeleter(admin);
        RandomUploader uploader = new RandomUploader(admin);

        uploader.start();
        deleter.start();
    }
}
