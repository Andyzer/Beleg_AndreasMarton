package mediaDB;

import java.util.Collection;
import java.util.UUID;

public interface Content {

    UUID getAddress();
    Collection<Tag> getTags();
    long getAccessCount();

}
