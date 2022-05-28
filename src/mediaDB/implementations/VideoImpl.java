package mediaDB.implementations;

import mediaDB.Content;
import mediaDB.Tag;
import mediaDB.Video;

import java.math.BigDecimal;
import java.time.Duration;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.UUID;

public class VideoImpl implements Video {


    private final String uploader;
    private final int accessCount;
    private final BigDecimal bitrate;
    private final Duration length;
    private final UUID address;
    private final Date uploadDate;
    private final BigDecimal size;
    private Collection<Tag> tags;
    public int resolution;

    public VideoImpl(String uploader, BigDecimal bitrate, BigDecimal size, int resolution, Duration length) {

        this.uploader = uploader;
        this.bitrate = bitrate;
        this.size = size;
        this.length = length;
        this.tags = tags;
        this.uploadDate = Calendar.getInstance().getTime();

        this.address = UUID.randomUUID();
        this.resolution = this.resolution;
        this.accessCount = 0;

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
        return this.accessCount;
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
