package eventSystem.events;

import java.util.EventObject;

public class DeleteMediaEvent extends EventObject {
    /**
     * Constructs a prototypical Event.
     *
     * @param source the object on which the Event initially occurred
     * @throws IllegalArgumentException if source is null
     */
    public DeleteMediaEvent(Object source) {
        super(source);
    }
}
