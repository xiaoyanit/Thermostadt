
package novoda.lib.immunity.runner;

import android.os.Bundle;
import android.test.AndroidTestRunner;
import android.test.InstrumentationTestRunner;
import android.util.Log;

import java.util.Arrays;

public class ImmunityTestRunner extends InstrumentationTestRunner {

    @Override
    public void onCreate(Bundle arguments) {
        Log.i("TEST",
                arguments.toString() + Arrays.toString(arguments.keySet().toArray(new String[] {})));
        Log.i("TEST", arguments.getString("log") + arguments.getString("carl"));
        super.onCreate(arguments);
    }

    @Override
    protected AndroidTestRunner getAndroidTestRunner() {

        return super.getAndroidTestRunner();
    }
}
