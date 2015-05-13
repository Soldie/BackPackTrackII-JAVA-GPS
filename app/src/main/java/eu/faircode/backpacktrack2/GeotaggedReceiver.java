package eu.faircode.backpacktrack2;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

public class GeotaggedReceiver extends BroadcastReceiver {
    private static final String TAG = "BPT2.GeotaggedReceiver";

    @Override
    public void onReceive(Context context, Intent intent) {
        Log.w(TAG, "Received " + intent);
        Intent geotaggedIntent = new Intent(context, LocationService.class);
        geotaggedIntent.setAction(LocationService.ACTION_GEOTAGGED);
        context.startActivity(geotaggedIntent);
    }
}