package mphantom.com.gankhub.dagger.component;

import android.content.Context;

import javax.inject.Singleton;

import dagger.Component;
import mphantom.com.gankhub.dagger.modules.AppModule;
import mphantom.com.gankhub.dagger.modules.RetrofitServiceModle;
import mphantom.com.gankhub.request.GankService;

/**
 * Created by wushaorong on 16-7-6.
 */

@Singleton
@Component(modules = {AppModule.class, RetrofitServiceModle.class})
public interface AppComponent {

    Context getContext();

    GankService getService();
}