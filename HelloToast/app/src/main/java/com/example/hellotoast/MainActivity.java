package com.example.hellotoast;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    int mCount=0;
    TextView mShowCount;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mShowCount=findViewById(R.id.textView);
    }

public void ShowToast(View view){
    Toast.makeText( this,"Button Toast Clicked", Toast.LENGTH_SHORT).show();

}
public void CountUp(View view){

    ++mCount;
        if (mShowCount !=null)
            mShowCount.setText(Integer.toString(mCount));
}
}