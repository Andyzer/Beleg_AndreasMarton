package eventSystem.events;

import java.util.EventObject;

public class ShowAllProducersEvent extends EventObject {
    /**
     * Constructs a prototypical Event.
     *
     * @param source the object on which the Event initially occurred
     * @throws IllegalArgumentException if source is null
     */
    public ShowAllProducersEvent(Object source) {
        super(source);
    }
}
