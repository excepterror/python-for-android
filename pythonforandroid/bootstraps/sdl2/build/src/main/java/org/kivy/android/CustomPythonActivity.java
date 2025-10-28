package org.kivy.android;

import android.os.Bundle;
import android.content.pm.ActivityInfo;
import android.util.Log;

public class CustomPythonActivity extends PythonActivity {
    private static final String TAG = "CustomPythonActivity";

    @Override
    protected void onPostCreate(Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
        try {
            // Make sure orientation is not forced at runtime
            setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_UNSPECIFIED);
            Log.v(TAG, "Orientation set to unspecified (unlocked)");
        } catch (Exception e) {
            Log.e(TAG, "Failed to clear orientation restriction", e);
        }
    }
}
