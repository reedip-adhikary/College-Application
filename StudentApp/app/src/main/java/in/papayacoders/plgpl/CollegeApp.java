package in.papayacoders.plgpl;

import android.app.Application;

import com.onesignal.OneSignal;

public class CollegeApp extends Application {

    private static final String ONESIGNAL_APP_ID = "32ac68dd-d092-42d5-bcc6-7e03674b2a71";

    @Override
    public void onCreate() {
        super.onCreate();

        // OneSignal Initialization
        OneSignal.initWithContext(this);
        OneSignal.setAppId(ONESIGNAL_APP_ID);
    }
}
