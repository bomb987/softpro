package cn.edu.ustb.softwareprojectdesign.ui;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;

import cn.edu.ustb.softwareprojectdesign.R;

public class WebActivity extends AppCompatActivity {
    private WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web);
        init();
    }

    private void init() {
        webView = (WebView)findViewById(R.id.webview);
        webView.loadUrl("http://m.jianshenmi.com");
    }
}
