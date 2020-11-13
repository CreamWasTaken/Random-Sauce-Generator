package com.example.saucegenerator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView Display = (TextView)findViewById(R.id.txt_link);
        Button btnGen = (Button)findViewById(R.id.Btn_Gen);
        final EditText CopySauce = (EditText)findViewById(R.id.EDT_copy);

        btnGen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int Count = 0;
                int e = (int)Math.ceil(Math.random() * 3);
                int[] arr = new int[5];
               // System.out.print("Sauce is nhentai.net/g/" + e);

                while(Count<5){
                    int iNum = (int)Math.ceil(Math.random() * 9);
                   arr[Count]= iNum;
                    Count++;
                }
				
			    for(int PrintS : arr){
					CopySauce.setText("nhentai.net/g/" + e + PrintS);
				}

                Toast.makeText(MainActivity.this,"Sauce Created! Enjoy!",Toast.LENGTH_LONG).show();
            }
        });



    }
}
