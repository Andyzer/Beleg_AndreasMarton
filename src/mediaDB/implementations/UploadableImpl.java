package mediaDB.implementations;

import mediaDB.Uploadable;

import java.util.Calendar;
import java.util.Date;

public class UploadableImpl implements Uploadable {

    private final String uploader;
    private final Date uploadDate;

    public UploadableImpl() {
        this.uploader = getUploader();
        this.uploadDate = Calendar.getInstance().getTime();
    }

    @Override
    public String getUploader() {
        return this.uploader;
    }

    @Override
    public Date getUploadDate() {
        return this.uploadDate;
    }
}
