package mediaDB.implementations;

import mediaDB.Content;
import mediaDB.LicensedAudio;
import mediaDB.Tag;

import java.math.BigDecimal;
import java.time.Duration;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.UUID;

public class LicensedAudioImpl implements LicensedAudio {

    private final String uploader;

    private final String holder;
    private final BigDecimal bitrate;
    private final BigDecimal size;
    private final Duration length;
    private final long accessCount;
    private final Date uploadDate;
    public int samplingRate;
    private Collection<Tag> tags;

    public LicensedAudioImpl(String uploader, Content content, String holder, BigDecimal bitrate, BigDecimal size, Duration length) {
        this.uploader = uploader;
        this.holder = holder;
        this.bitrate = bitrate;
        this.size = size;
        this.length = length;

        this.accessCount = 0;
        this.uploadDate = Calendar.getInstance().getTime();
        this.samplingRate = getSamplingRate();
    }


    @Override
    public int getSamplingRate() {
        return samplingRate = (this.bitrate.intValue() * this.size.intValue() / 100);
    }

    @Override
    public UUID getAddress() {
        return null;
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

}
