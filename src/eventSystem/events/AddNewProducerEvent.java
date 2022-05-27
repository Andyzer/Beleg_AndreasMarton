package eventSystem.events;

import java.util.EventObject;

public class AddNewProducerEvent extends EventObject {
    /**
     * Constructs a prototypical Event.
     *
     * @param source the object on which the Event initially occurred
     * @throws IllegalArgumentException if source is null
     */
    public AddNewProducerEvent(Object source) {
        super(source);
    }
}
