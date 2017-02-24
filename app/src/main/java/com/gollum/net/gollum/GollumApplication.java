package com.gollum.net.gollum;

import android.app.Application;

import com.avos.avoscloud.AVOSCloud;

/**
 * Created by azhang335 on 2/24/17.
 */

public class GollumApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        AVOSCloud.initialize(this,"GqYBAizMp3mq0qWlve3DaDP1-gzGzoHsz","iXOSjNcboRSRTAVNL2VXbgyU");
    }
}
