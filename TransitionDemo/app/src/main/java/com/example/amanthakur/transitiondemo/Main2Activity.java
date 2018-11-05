package com.example.amanthakur.transitiondemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.transition.Explode;
import android.transition.Fade;
import android.view.Window;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().requestFeature(Window.FEATURE_CONTENT_TRANSITIONS);
        getWindow().setAllowEnterTransitionOverlap(true);

// set an exit transition
        getWindow().setEnterTransition(new Explode());
        setContentView(R.layout.activity_main2);
        // inside your activity (if you did not enable transitions in your theme)

    }
}
