package cn.edu.ustb.softwareprojectdesign.ui;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import cn.edu.ustb.softwareprojectdesign.R;

/**
 * create by sunchenhao on 2016/5/12
 */
public class MainActivity extends AppCompatActivity {
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void openBeatrateActivity(View view) {
        intent = new Intent(this,BeatrateActivity.class);
        startActivity(intent);
    }

    public void openEyeExceActivity(View view) {
        intent = new Intent(this,EyeExceActivity.class);
        startActivity(intent);
    }


    public void openStepcountActivity(View view) {
        intent = new Intent(this,StepcountActivity.class);
        startActivity(intent);
    }

    public void openColorActivity(View view) {
        intent = new Intent(this,ColorActivity.class);
        startActivity(intent);
    }

    public void openWebActivity(View view) {
        intent = new Intent(this,WebActivity.class);
        startActivity(intent);
    }
}
