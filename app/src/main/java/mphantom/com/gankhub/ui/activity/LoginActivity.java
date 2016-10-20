package mphantom.com.gankhub.ui.activity;

import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import mphantom.com.gankhub.R;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ViewDataBinding afa = DataBindingUtil.setContentView(this, R.layout.activity_login);
//        setContentView(R.layout.activity_login);

    }
}
