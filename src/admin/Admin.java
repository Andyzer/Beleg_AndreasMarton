package admin;

import mediaDB.*;

import java.util.ArrayList;
import java.util.Collection;

public class Admin {

    private final ArrayList<Content> contentList = new ArrayList<>();
    private final ArrayList<Uploader> uploaderList = new ArrayList<>();
    private final Collection<Tag> tagCollection = new ArrayList<>();

//TODO: Make a fucking thing that works, Create File Methods

    public synchronized boolean createNewFile(Content newContent) {
        if (newContent == null) {
            return false;
        }
        if (contentList.contains(newContent)) {
            System.out.println("File already present.");
            return false;
        }
        this.contentList.add(newContent);
        return true;
    }



    public boolean createNewUploader(Uploader newUploader) {
        if (newUploader == null) {
            return false;
        }
        if (uploaderList.contains(newUploader)) {
            System.out.println("Uploader already present.");
            return false;
        }
        this.uploaderList.add(newUploader);
        return true;
    }


    /**
     * last 3 methods to be edited and better implemented
     * TODO: read method
     * TODO: update method
     * TODO: delete method
     */


    /**
     * @return should print out all the files available
     * I'm sure it will, given time
     */
    public synchronized ArrayList<Content> showAllFiles() { return this.contentList; }

    public synchronized ArrayList<Uploader> showAllUploader() { return this.uploaderList; }

    /**
     * @param file which AccessCounter should be increased
     */
    public void updateAccessCounter(Content file) {
        return void;
    }

    /**
     * @param file to be deleted
     * @return file deleted
     */
    public synchronized boolean deleteMedia(Content file) {
        return this.contentList.remove(file);
    }

    public synchronized boolean deleteProducer(Uploader uploader) { return this.uploaderList.remove(uploader); }

    public synchronized Collection<Tag> showAllTags() { return this.tagCollection; }


}
