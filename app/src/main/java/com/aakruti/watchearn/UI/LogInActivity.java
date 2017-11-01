package com.aakruti.watchearn.UI;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.Html;
import android.view.View;
import android.widget.TextView;

import com.aakruti.watchearn.R;

public class LogInActivity extends AppCompatActivity {

    TextView textview_forget_password_login_screen,textview_sign_up_login_screen;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        textview_forget_password_login_screen=(TextView)findViewById(R.id.textview_forget_password_login_screen);
        textview_sign_up_login_screen=(TextView)findViewById(R.id.textview_sign_up_login_screen);

        textview_forget_password_login_screen.setText(Html.fromHtml("<p><u>Forget Password?</u></p>"));

        textview_sign_up_login_screen.setText(Html.fromHtml("<p>New User?<u>Sign Up Now</u></p>"));
    }

}
