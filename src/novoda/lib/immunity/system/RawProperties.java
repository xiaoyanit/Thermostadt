
package novoda.lib.immunity.system;

import novoda.lib.immunity.Log;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RawProperties {

    private static final String GETPROP_COMMAND = "getprop";

    private static final String PROP_PATTERN = "\\[(.*)\\]: \\[(.*)\\]";

    public static Map<String, String> get() {
        Map<String, String> properties = new HashMap<String, String>();
        try {
            Matcher matcher;
            Pattern pattern = Pattern.compile(PROP_PATTERN);
            Process ifc = Runtime.getRuntime().exec(GETPROP_COMMAND);
            BufferedReader br = new BufferedReader(new InputStreamReader(ifc.getInputStream()));
            String line = null;
            while ((line = br.readLine()) != null) {
                matcher = pattern.matcher(line);
                properties.put(matcher.group(1), matcher.group(2));
            }
        } catch (java.io.IOException e) {
            Log.e("Can not parse properties", e);
        }
        return properties;
    }
}
