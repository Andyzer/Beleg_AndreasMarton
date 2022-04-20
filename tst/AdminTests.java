import admin.*;
import mediaDB.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AdminTests {



    @Test
    public void goodCreate() {
        Admin admin = new AdminImpl();

        admin.createFile();

    }
}
