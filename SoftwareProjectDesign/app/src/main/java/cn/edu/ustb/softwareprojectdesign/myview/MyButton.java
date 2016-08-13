package cn.edu.ustb.softwareprojectdesign.myview;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.Button;

/**
 * Created by 孙晨昊 on 2016/5/14.
 */
public class MyButton extends Button {
    public MyButton(Context context) {
        super(context);
    }

    public MyButton(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public MyButton(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public void updateTime(){
        Typeface type = Typeface.createFromAsset(getContext().getAssets(),"textstyle.ttf");
        setTypeface(type);
    }
}
