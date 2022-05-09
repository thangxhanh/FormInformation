package com.example.forminformation;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    public EditText name, mssv, cccd, phone, email, hometown, address;
    public CalendarView birthday;
    public RadioGroup majors;
    public RadioButton it1, it2;
    public CheckBox terms, java, c, python, javascript;
    public Button buttonOk;
    public TextView text1, text2;
    public Toast toast;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name = (EditText) findViewById(R.id.Edit_Name);
        mssv = (EditText) findViewById(R.id.Edit_MSSV);
        cccd = (EditText) findViewById(R.id.Edit_CCCD);
        phone = (EditText) findViewById(R.id.Edit_Phone);
        email = (EditText) findViewById(R.id.Edit_email);
        hometown = (EditText) findViewById(R.id.Edit_home);
        address = (EditText) findViewById(R.id.Edit_Add);
        birthday = (CalendarView) findViewById(R.id.calendarView);
        majors = (RadioGroup) findViewById(R.id.Major);
        it1 = (RadioButton) findViewById(R.id.KHMT);
        it2 = (RadioButton) findViewById(R.id.KTMT);
        terms = (CheckBox) findViewById(R.id.Terms);
        java = (CheckBox) findViewById(R.id.Java);
        c = (CheckBox) findViewById(R.id.C);
        python = (CheckBox) findViewById(R.id.Python);
        javascript = (CheckBox) findViewById(R.id.Javascript);
        buttonOk = (Button) findViewById(R.id.button_OK);
        text1 = (TextView) findViewById(R.id.Text);
        text2 = (TextView) findViewById(R.id.Text_2);

        buttonOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(name.getText().toString().length() == 0){
                    name.setHint("Name is require!");
                    name.setHintTextColor(Color.RED);
                }
                if(mssv.getText().toString().length() == 0){
                    mssv.setHint("MSSV is require!");
                    mssv.setHintTextColor(Color.RED);
                }
                if(cccd.getText().toString().length() == 0){
                    cccd.setHint("CCCD is require!");
                    cccd.setHintTextColor(Color.RED);
                }
                if(phone.getText().toString().length() == 0){
                    phone.setHint("Phone is require!");
                    phone.setHintTextColor(Color.RED);
                }
                if(email.getText().toString().length() == 0){
                    email.setHint("Email is require!");
                    email.setHintTextColor(Color.RED);
                }

                if (name.getText().toString().length() != 0 && mssv.getText().toString().length() != 0 &&
                        cccd.getText().toString().length() != 0 && phone.getText().toString().length() != 0 && email.getText().toString().length() != 0
                        && terms.isChecked()){
                    toast = Toast.makeText(MainActivity.this,"Nhập dữ liệu thành công", Toast.LENGTH_LONG);
                    toast.show();
                }
            }
        });

        birthday.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @Override
            public void onSelectedDayChange(@NonNull CalendarView calendarView, int year, int month, int dayOfMonth) {
                text2.setText("Ngày sinh: "+ dayOfMonth + "/" + month + "/" + year);
                birthday.setVisibility(birthday.GONE);
            }
        });

        text2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                birthday.setVisibility(birthday.VISIBLE);
            }
        });

    }
}