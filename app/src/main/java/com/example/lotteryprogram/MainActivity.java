package com.example.lotteryprogram;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.HashSet;

public class MainActivity extends AppCompatActivity {
    private TextView num0, num1, num2, num3, num4, num5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );

        num0 = findViewById( R.id.num0 );
        num1 = findViewById( R.id.num1 );
        num2 = findViewById( R.id.num2 );
        num3 = findViewById( R.id.num3 );
        num4 = findViewById( R.id.num4 );
        num5 = findViewById( R.id.num5 );

    }

    public void lottery(View view) {
        HashSet<Integer> set = new HashSet<>();/**HashSet內容不重複方法*/
        while (set.size() < 6) {
            set.add( (int) (Math.random() * 49 + 1) );
        }
        int i = 0;
        int[] lottery = new int[6];
        for (Integer num : set) {
            lottery[i] = num;
            i++;
        }
        num0.setText( "" + lottery[0] );
        num1.setText( "" + lottery[1] );
        num2.setText( "" + lottery[2] );
        num3.setText( "" + lottery[3] );
        num4.setText( "" + lottery[4] );
        num5.setText( "" + lottery[5] );
    }
}