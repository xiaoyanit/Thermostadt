
package novoda.lib.immunity.runner;

import android.os.Bundle;
import android.test.AndroidTestRunner;
import android.test.InstrumentationTestRunner;
import android.util.Log;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Map.Entry;

public class ImmunityTestRunner extends InstrumentationTestRunner {

    @Override
    public void onCreate(Bundle arguments) {
        Log.i("TEST", System.getProperties().toString());
        Log.i("TEST", System.getenv().toString());

        for (Entry<String, String> entry : System.getenv().entrySet()) {
            Log.i("TEST", entry.getKey() + ":" + entry.getValue());
        }

        String line = "";
        try {
            Process ifc = Runtime.getRuntime().exec("getprop");
            line = inputStreamAsString(ifc.getInputStream());
        } catch (java.io.IOException e) {
        }
        
        Log.i("TEST",
                arguments.toString() + Arrays.toString(arguments.keySet().toArray(new String[] {})));
        Log.i("TEST", arguments.getString("log") + arguments.getString("carl"));
        super.onCreate(arguments);
    }

    @Override
    protected AndroidTestRunner getAndroidTestRunner() {
        return super.getAndroidTestRunner();
    }

    public static String inputStreamAsString(InputStream stream) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(stream));
        StringBuilder sb = new StringBuilder();
        String line = null;

        while ((line = br.readLine()) != null) {
            sb.append(line).append("\n");
        }

        br.close();
        return sb.toString();
    }
}
