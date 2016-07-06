package mphantom.com.gankhub;

import android.app.Application;

import mphantom.com.gankhub.dagger.component.AppComponent;
import mphantom.com.gankhub.dagger.component.DaggerAppComponent;
import mphantom.com.gankhub.dagger.modules.AppModule;
import mphantom.com.gankhub.dagger.modules.RetrofitServiceModle;

/**
 * Created by wushaorong on 16-7-6.
 */

public class App extends Application {

    AppComponent component;


    @Override
    public void onCreate() {
        super.onCreate();

        component = DaggerAppComponent.builder()
                .appModule(new AppModule(this))
                .retrofitServiceModle(new RetrofitServiceModle())
                .build();
    }
}
