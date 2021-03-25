package com.example.vothikimyentinhbmi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText etChieucao, etCanNang;
    RadioButton rNam, rNu;
    Button btTinh;
    TextView txtKetqua, txtNhanXet;
    Double chiSo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //map voi giao dien
        etChieucao = findViewById(R.id.editChieuCao);
        etCanNang = findViewById(R.id.editCanNang);
        rNam = findViewById(R.id.radioNam);
        rNu = findViewById(R.id.radioNu);
        btTinh = findViewById(R.id.buttonTinh);
        txtKetqua = findViewById(R.id.tvKetqua);
        txtNhanXet = findViewById(R.id.tvNhanXet);
        btTinh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double chieuCao = Double.parseDouble(etChieucao.getText().toString())/100;
                double canNang = Double.parseDouble(etCanNang.getText().toString());
                chiSo = Math.round((canNang/Math.pow(chieuCao,2))*10.0)/10.0;
                if(rNam.isChecked()){
                    if(chiSo<18.5){
                        txtKetqua.setText(String.valueOf(chiSo));
                        txtNhanXet.setText("Bạn cần bổ sung dinh dưỡng");
                    }
                    else if(chiSo>=18.5&&chiSo<22.9){
                        txtKetqua.setText(String.valueOf(chiSo));
                        txtNhanXet.setText("Bạn bình thường!!!");
                    }else if(chiSo==25){
                        txtKetqua.setText(String.valueOf(chiSo));
                        txtNhanXet.setText("Bạn thừa cân");
                    }else if(chiSo>25&&chiSo<=29.9){
                        txtKetqua.setText(String.valueOf(chiSo));
                        txtNhanXet.setText("Bạn đang béo phì cấp thấp");
                    }else if(chiSo>=30&&chiSo<=34.9){
                        txtKetqua.setText(String.valueOf(chiSo));
                        txtNhanXet.setText("Bạn đang béo phì cấp 1");
                    }else if(chiSo>=35&&chiSo<=39.9){
                        txtKetqua.setText(String.valueOf(chiSo));
                        txtNhanXet.setText("Bạn đang béo phì cấp 2");
                    }else if(chiSo==40){
                        txtKetqua.setText(String.valueOf(chiSo));
                        txtNhanXet.setText("Bạn đang béo phì cấp 3");
                    }
                }
                else if(rNu.isChecked()){
                    if(chiSo<18.5){
                        txtKetqua.setText(String.valueOf(chiSo));
                        txtNhanXet.setText("Bạn cần bổ sung dih dưỡng");
                    }
                    else if(chiSo>=18.5&&chiSo<22.9){
                        txtKetqua.setText(String.valueOf(chiSo));
                        txtNhanXet.setText("Bạn bình thường!!!");
                    }else if(chiSo==23){
                        txtKetqua.setText(String.valueOf(chiSo));
                        txtNhanXet.setText("Bạn thừa cân");
                    }else if(chiSo>23&&chiSo<=24.9){
                        txtKetqua.setText(String.valueOf(chiSo));
                        txtNhanXet.setText("Bạn đang béo phì cấp thấp");
                    }else if(chiSo>=25&&chiSo<=29.9){
                        txtKetqua.setText(String.valueOf(chiSo));
                        txtNhanXet.setText("Bạn đang béo phì cấp 1");
                    }else if(chiSo>=30&&chiSo<=39.9){
                        txtKetqua.setText(String.valueOf(chiSo));
                        txtNhanXet.setText("Bạn đang béo phì cấp 2");
                    }else if(chiSo==40){
                        txtKetqua.setText(String.valueOf(chiSo));
                        txtNhanXet.setText("Bạn đang béo phì cấp 3");
                    }
                }
                else {
                    Toast.makeText(getApplicationContext(),
                            "Vui lòng chon giới tính!!!",
                            Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}