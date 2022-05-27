package eventSystem.events;

import java.util.EventObject;

public class ShowAllTagsEvent extends EventObject {
    /**
     * Constructs a prototypical Event.
     *
     * @param source the object on which the Event initially occurred
     * @throws IllegalArgumentException if source is null
     */
    public ShowAllTagsEvent(Object source) {
        super(source);
    }
}
