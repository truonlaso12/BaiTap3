package com.phuoctruong.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class dangnhap extends AppCompatActivity {

    Button signin;
    EditText edtemail, edtpassword;
    TextView createacc;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.giaodien_dangnhap);

        edtemail=(EditText) findViewById(R.id.edtEmail);
        edtpassword=(EditText) findViewById(R.id.edtPassword);
        signin=(Button) findViewById(R.id.btn_signin);
        createacc =(TextView) findViewById(R.id.createacc);

        signin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ControlButton();
            }
        });
        createacc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(dangnhap.this, main.class);
                startActivity(intent);
            }
        });
    }
    private void ControlButton() {
        if (edtemail.getText().length() != 0 && edtpassword.getText().length() != 0) {
            if (edtemail.getText().toString().equals("phuoctruong") && edtpassword.getText().toString().equals("123")) {

                Intent intent = new Intent(dangnhap.this, MainActivity.class);
                startActivity(intent);
            } else {
                Toast.makeText(dangnhap.this, "Đăng Nhập Thắt Bại", Toast.LENGTH_SHORT).show();
            }
        } else {
            Toast.makeText(dangnhap.this, "Nhập Đầy Đủ Thông Tin", Toast.LENGTH_SHORT).show();
        }
    }
}