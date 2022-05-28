package mediaDB.implementations;

import mediaDB.AudioVideo;
import mediaDB.Tag;
import mediaDB.Uploader;

import java.math.BigDecimal;
import java.time.Duration;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.UUID;

public class AudioVideoImpl implements AudioVideo {

    private final String uploader;
    private final long accessCount;
    private final BigDecimal bitrate;
    private final Duration length;
    private final UUID address;
    private final Date uploadDate;
    private final BigDecimal size;
    private Collection<Tag> tags;
    public int samplingRate;
    public int resolution;

    public AudioVideoImpl(String uploader, BigDecimal bitrate, BigDecimal size, Duration length, int resolution) {
        this.uploader = uploader;
        this.bitrate = bitrate;
        this.size = size;
        this.length = length;
        this.tags = tags;
        this.uploadDate = Calendar.getInstance().getTime();
        this.resolution = resolution;

        this.address = UUID.randomUUID();
        this.samplingRate = getSamplingRate();
        this.accessCount = 0;
    }

    @Override
    public int getSamplingRate() {
        return samplingRate = (bitrate.intValue() * size.intValue() / 100);
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
