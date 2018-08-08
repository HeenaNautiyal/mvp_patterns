package com.example.caritas_heena.mvp_patterns;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
        implements SayHelloContract.View, View.OnClickListener {

    private SayHelloContract.Presenter mPresenter;

    private TextView mMessageView;
    private EditText mFirstView;
    private EditText mLastview;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
        // Creates presenter
        mPresenter = new SayHelloPresenter(this);
    }

    private void initView() {
        mMessageView = (TextView) findViewById(R.id.message);
        mFirstView = (EditText) findViewById(R.id.firstName);
        mLastview = (EditText) findViewById(R.id.lastName);

        findViewById(R.id.update).setOnClickListener(this);
        findViewById(R.id.showMessage).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()){
            case R.id.update:
                mPresenter.saveName(mFirstView.getText().toString(),
                        mLastview.getText().toString());
                break;
            case R.id.showMessage:
                mPresenter.loadmessage();
                break;

        }
    }

    @Override
    public void ShowMessage(String message) {
        mMessageView.setText(message);

    }

    @Override
    public void ShowError(String error) {
        Toast.makeText(getApplicationContext(),error,Toast.LENGTH_SHORT).show();
    }
}
