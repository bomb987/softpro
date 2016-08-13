package cn.edu.ustb.softwareprojectdesign.ui;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import cn.edu.ustb.softwareprojectdesign.R;

public class ColorActivity extends AppCompatActivity {
    private int[] colors = {R.drawable.color286, R.drawable.color291, R.drawable.color2_9, R.drawable.color60, R.drawable.color62, R.drawable.color628, R.drawable.color69, R.drawable.color6_0, R.drawable.color816, R.drawable.color88, R.drawable.color9, R.drawable.color98, R.drawable.color98_2};
    private String[] colorstrs = {"286", "291", "29", "60", "62", "628", "69", "60", "816", "88", "9", "98", "98"};
    private EditText editText;
    private ImageView imageView;
    private int index;
    private int colortime = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_color);
        init();
    }

    private void init() {
        editText = (EditText)findViewById(R.id.coloret);
        imageView = (ImageView)findViewById(R.id.imagecolor);
        setPicture();
    }

    private void setPicture() {
        index = (int)(Math.random()*13);
        imageView.setImageResource(colors[index]);
    }

    public void colorenter(View view) {
        String str = editText.getText().toString();
        if (str.equals(colorstrs[index])){
            setPicture();
            editText.setText("");
            colortime++;
        }else {
            Toast.makeText(this, "很遗憾，你答错了，建议你去医院做一下检查", Toast.LENGTH_LONG).show();
            finish();
        }
        if (colortime>=5){
            Toast.makeText(this,"恭喜你的辨色能力正常",Toast.LENGTH_LONG).show();
            finish();
        }
    }
}
