package com.phone178.www.android178phone;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import android.view.Window;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
/**
 * 启动界面
 *
 * @author Li Dongran
 * @version %I%, %G%
 */

public class WelcomeActivity extends Activity {
    private AlphaAnimation alphaAnimation = null;
    private View welcomeView = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        welcomeView=View.inflate(this, R.layout.welcome, null);
        setContentView(welcomeView);

        initData();

    }


    private void initData() {
        alphaAnimation = new AlphaAnimation(0.1f,1.0f);
        alphaAnimation.setDuration(3600);
        welcomeView.startAnimation(alphaAnimation);
        alphaAnimation.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {
                goMainActivity();
            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });

    }
    private void goMainActivity() {
        Intent myIntent = new Intent(getApplicationContext(), MainActivity.class);
        startActivity(myIntent);
        finish();
    }

}