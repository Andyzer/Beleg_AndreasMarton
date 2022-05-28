package admin;

import mediaDB.*;

import java.util.ArrayList;
import java.util.Collection;

public class Admin {

    private final ArrayList<Content> contentList = new ArrayList<>();
    private final ArrayList<Uploader> uploaderList = new ArrayList<>();
    private final Collection<Tag> tagCollection = new ArrayList<>();

    /**
     * A method to add all different types of Content
     * Checks if the Content name? already exists or if it's a null
     * @param newContent to be added
     * @return true if it worked, false if it didn't
     */
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

    /**
     * Method to create a new Uploader.
     * Checks if Uploader is already present or if the Uploader to be added == null
     * @param newUploader Uploader name to be added
     * @return true if it worked, false if it didn't
     */

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
     * @return prints out all existent Files
     * I'm sure it will, given time
     */
    public synchronized ArrayList<Content> showAllFiles() {
        return this.contentList;
    }

    /**
     * @return prints out all existent Uploaders
     */
    public synchronized ArrayList<Uploader> showAllUploader() {
        return this.uploaderList;
    }

    /**
     * @param file which AccessCounter should be increased
     */
    public void updateAccessCounter(Content file) {
        file.getAccessCount();
        return void;
    }

    /**
     * @param file to be deleted
     * @return file deleted
     */
    public synchronized boolean deleteMedia(Content file) {
        return this.contentList.remove(file);
    }

    /**
     * @param uploader
     * @return
     */
    public synchronized boolean deleteProducer(Uploader uploader) {
        return this.uploaderList.remove(uploader);
    }

    /**
     * @return
     */
    public synchronized Collection<Tag> showAllTags() {
        return this.tagCollection;
    }


}
