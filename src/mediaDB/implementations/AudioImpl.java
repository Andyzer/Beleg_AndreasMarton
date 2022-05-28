package mediaDB.implementations;

import mediaDB.Audio;
import mediaDB.Content;
import mediaDB.Tag;

import java.math.BigDecimal;
import java.time.Duration;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.UUID;

public class AudioImpl implements Audio {

    private final String uploader;
    private final long accessCount;
    private final int samplingRate;
    private final BigDecimal bitrate;
    private final Duration length;
    private final UUID address;
    private final Date uploadDate;
    private final BigDecimal size;
    private Collection<Tag> tags;

    /**
     * Implementation for adding a new Audio file
     *
     * @param uploader name of the uploader
     * @param bitrate  bitrate of the file
     * @param size     filesize
     * @param length   duration of the file in seconds
     */

    public AudioImpl(String uploader, BigDecimal bitrate, BigDecimal size, Duration length) {
        this.uploader = uploader;
        this.bitrate = bitrate;
        this.size = size;
        this.length = length;
        this.tags = tags;
        this.uploadDate = Calendar.getInstance().getTime();

        this.address = UUID.randomUUID();
        this.samplingRate = bitrate.intValue() * size.intValue() / 100;
        this.accessCount = 0;
    }

    @Override
    public int getSamplingRate() {
        return 0;
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
}
