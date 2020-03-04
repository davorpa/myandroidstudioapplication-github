package com.davorpa.labs.androidstudio.github;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import butterknife.BindString;
import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.TextView)
    TextView textView;

    @BindString(R.string.hello_world)
    String helloWorldText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Capture the layout's components, resources... handled by ButterKnife annotations
        ButterKnife.bind(this);

        // configure each view component
        configureTextView(savedInstanceState);
    }


    protected void configureTextView(final Bundle savedInstanceState) {
        textView.setText(helloWorldText);
    }

}
