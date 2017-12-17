package com.example.admin.myapplication;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
                final AlertDialog.Builder builder = new AlertDialog.Builder(this);
                LinearLayout linerout = (LinearLayout)getLayoutInflater().inflate(R.layout.alertdialog,null);
                builder.setView(linerout);
                builder.show();

    }


}
