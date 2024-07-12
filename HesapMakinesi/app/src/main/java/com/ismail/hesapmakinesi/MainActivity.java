package com.ismail.hesapmakinesi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText txtsayi1;
    EditText txtsayi2;
    TextView txtsonuc;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         txtsayi1 = findViewById(R.id.txtBirinciSayi);
         txtsayi2 = findViewById(R.id.txtIkinciSayi);
         txtsonuc = findViewById(R.id.txtSonuc);


    }



    public void topla(View view)
    {
        if(txtsayi1.getText().toString().equals("") || txtsayi2.getText().toString().equals(""))
        {
            txtsonuc.setText("Boş kutu olamaz ! ");
        }
        else
        {
            float sayi1 = Float.parseFloat(txtsayi1.getText().toString());
            float sayi2 =Float.parseFloat(txtsayi2.getText().toString());
            float sonuc ;
            sonuc = sayi1+sayi2;
            txtsonuc.setText("Sonuç = "+sonuc);
        }
    }
    public  void cikar(View view)
    {
        if(txtsayi1.getText().toString().equals("") || txtsayi2.getText().toString().equals(""))
        {
            txtsonuc.setText("Boş kutu olamaz ! ");
        }
        else
        {
            float sayi1 = Float.parseFloat(txtsayi1.getText().toString());
            float sayi2 =Float.parseFloat(txtsayi2.getText().toString());
            float sonuc ;
            sonuc = sayi1-sayi2;
            txtsonuc.setText("Sonuç = "+sonuc);
        }
    }
    public void carp(View view)
    {
        if(txtsayi1.getText().toString().equals("") || txtsayi2.getText().toString().equals(""))
        {
            txtsonuc.setText("Boş kutu olamaz ! ");
        }
        else
        {
            float sayi1 = Float.parseFloat(txtsayi1.getText().toString());
            float sayi2 =Float.parseFloat(txtsayi2.getText().toString());
            float sonuc ;
            sonuc = sayi1*sayi2;
            txtsonuc.setText("Sonuç = "+sonuc);
        }
    }
    public void bol(View view)
    {
        if(txtsayi1.getText().toString().equals("") || txtsayi2.getText().toString().equals(""))
        {
            txtsonuc.setText("Boş kutu olamaz ! ");
        }
        else
        {
            if(txtsayi2.getText().toString().equals("0"))
            {
                txtsonuc.setText("Bir sayı 0'a bölünemez !");
            }
            else
            {
                float sayi1 = Float.parseFloat(txtsayi1.getText().toString());
                float sayi2 =Float.parseFloat(txtsayi2.getText().toString());
                float sonuc ;
                sonuc = sayi1/sayi2;
                txtsonuc.setText("Sonuç = "+sonuc);
            }

        }
    }
}