package zedy.com.aisassiut.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import zedy.com.aisassiut.R;

public class SplashActivity extends AppCompatActivity {
    private ImageView image0;
    private Animation fade0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        image0 = (ImageView) findViewById(R.id.logo);
        fade0 = AnimationUtils.loadAnimation(this, R.anim.fade_in);

        image0.startAnimation(fade0);
        fade0.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {

                startActivity(new Intent(SplashActivity.this, MainActivity.class)
                        .addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_NEW_TASK));


            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });


    }


}
