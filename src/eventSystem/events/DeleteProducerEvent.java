package eventSystem.events;

import java.util.EventObject;

public class DeleteProducerEvent extends EventObject {
    /**
     * Constructs a prototypical Event.
     *
     * @param source the object on which the Event initially occurred
     * @throws IllegalArgumentException if source is null
     */
    public DeleteProducerEvent(Object source) {
        super(source);
    }
}
