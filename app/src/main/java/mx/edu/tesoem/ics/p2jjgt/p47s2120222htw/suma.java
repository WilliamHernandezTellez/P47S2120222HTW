package mx.edu.tesoem.ics.p2jjgt.p47s2120222htw;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class suma extends AppCompatActivity {

    Button btnregresa, btnscalcula;
    EditText txtn1, txtn2;
    TextView lblr;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_suma);

        txtn1 = findViewById(R.id.txtn1);
        txtn2 =findViewById(R.id.txtn2);

        lblr= findViewById(R.id.lblr);

        btnscalcula = findViewById(R.id.btnscalcula);
        btnscalcula.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num1 = Integer.parseInt(txtn1.getText().toString());
                int num2 = Integer.parseInt(txtn2.getText().toString());

                lblr.setText(String.valueOf(num1+num2));

            }
        });

        btnregresa=findViewById(R.id.btnsregresa);
        btnregresa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });
    }
}
