
package novoda.lib.immunity;

/**
 * Default log for the app
 */
public class Log {

    public static final String TAG = "immunity";

    private Log() {
    }

    public static final boolean infoLoggingEnabled() {
        return android.util.Log.isLoggable(TAG, android.util.Log.INFO);
    }

    public static final boolean debugLoggingEnabled() {
        return android.util.Log.isLoggable(TAG, android.util.Log.DEBUG);
    }

    public static final boolean verboseLoggingEnabled() {
        return android.util.Log.isLoggable(TAG, android.util.Log.VERBOSE);
    }

    public static final boolean errorLoggingEnabled() {
        return android.util.Log.isLoggable(TAG, android.util.Log.ERROR);
    }

    public static final void i(String msg) {
        android.util.Log.i(TAG, msg);
    }

    public static final void i(String TAG, String msg) {
        android.util.Log.i(TAG, msg);
    }

    public static final void d(String msg) {
        android.util.Log.d(TAG, msg);
    }

    public static final void d(String TAG, String msg) {
        android.util.Log.d(TAG, msg);
    }

    public static final void v(String msg) {
        android.util.Log.v(TAG, msg);
    }

    public static final void vp(String msg) {
        android.util.Log.v(TAG, msg);
    }

    public static final void v(String TAG, String msg) {
        android.util.Log.v(TAG, msg);
    }

    public static final void e(String msg) {
        android.util.Log.e(TAG, msg);
    }

    public static final void e(String TAG, String msg) {
        android.util.Log.e(TAG, msg);
    }

    public static final void e(String msg, Throwable e) {
        android.util.Log.e(TAG, msg, e);
    }

    public static final void e(String TAG, String msg, Throwable e) {
        android.util.Log.e(TAG, msg, e);
    }

    public static final void i(String msg, Throwable e) {
        android.util.Log.e(TAG, msg, e);
    }
}
