package jake.tiranozavr.servicelesson;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;

public class MyService extends Service {
    public MyService() {
        Log.d("MYLOGS","Service - myService");
    }

    @Override
    public void onCreate() {
        super.onCreate();
        Log.d("MYLOGS", "Service - onCreate");
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Log.d("MYLOGS", "Service - onStartCommand");
        super.onStartCommand(intent, flags, startId);
    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        throw new UnsupportedOperationException("Not yet implemented");
    }
}
