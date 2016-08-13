package cn.edu.ustb.softwareprojectdesign.ui;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import cn.edu.ustb.softwareprojectdesign.R;

/**
 * create by sunchenhao on 2016/5/12
 */
public class EyeExceActivity extends AppCompatActivity {
    private MediaPlayer mPlayer = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eye_exce);
        mPlayer = MediaPlayer.create(this,R.raw.eyerelaxsound);
        mPlayer.setLooping(true);
        mPlayer.start();
    }

    @Override
    protected void onPause() {
        super.onPause();
        mPlayer.stop();
    }
}
