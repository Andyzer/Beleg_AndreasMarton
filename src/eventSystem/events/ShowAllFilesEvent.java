package eventSystem.events;

import java.util.EventObject;

public class ShowAllFilesEvent extends EventObject {
    /**
     * Constructs a prototypical Event.
     *
     * @param source the object on which the Event initially occurred
     * @throws IllegalArgumentException if source is null
     */
    public ShowAllFilesEvent(Object source) {
        super(source);
    }
}
