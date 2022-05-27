package mediaDB.implementations;

import mediaDB.LicensedVideo;
import mediaDB.Tag;

import java.math.BigDecimal;
import java.time.Duration;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.UUID;

public class LicensedVideoImpl implements LicensedVideo {

    String uploader;
    String holder;
    int accessCount;
    BigDecimal bitrate;
    Duration length;
    UUID address;
    Date uploadDate;
    BigDecimal size;
    Collection<Tag> tags;
    int resolution;

    public LicensedVideoImpl(String uploader, String holder, BigDecimal bitrate, BigDecimal size, Duration length, int resolution) {
        this.uploader = uploader;
        this.holder = holder;
        this.bitrate = bitrate;
        this.size = size;
        this.length = length;
        this.tags = tags;
        this.uploadDate = Calendar.getInstance().getTime();
        this.accessCount = 0;
        this.address = UUID.randomUUID();
        this.resolution = this.resolution;
    }

    @Override
    public UUID getAddress() {
        return this.address;
    }

    @Override
    public Collection<Tag> getTags() {
        return this.tags;
    }

    @Override
    public long getAccessCount() {
        return 0;
    }

    @Override
    public String getHolder() {
        return this.holder;
    }

    @Override
    public BigDecimal getBitrate() {
        return this.bitrate;
    }

    @Override
    public Duration getLength() {
        return this.length;
    }

    @Override
    public BigDecimal getSize() {
        return this.size;
    }

    @Override
    public String getUploader() {
        return this.uploader;
    }

    @Override
    public Date getUploadDate() {
        return this.uploadDate;
    }

    @Override
    public int getResolution() {
        return this.resolution;
    }
}
