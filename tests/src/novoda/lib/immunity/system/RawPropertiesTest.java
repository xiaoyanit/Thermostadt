
package novoda.lib.immunity.system;

import android.test.AndroidTestCase;
import android.test.MoreAsserts;

import java.util.Map;

public class RawPropertiesTest extends AndroidTestCase {

    public void testGettingSystemPropertiesAsMap() throws Exception {
        Map<String, String> prop = RawProperties.get();
        MoreAsserts.assertContentsInAnyOrder(prop.keySet(), "ro.serialno", "ro.hardware");
    }
}
