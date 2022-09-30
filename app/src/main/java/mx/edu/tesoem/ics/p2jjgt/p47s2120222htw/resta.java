package mx.edu.tesoem.ics.p2jjgt.p47s2120222htw;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class resta extends AppCompatActivity {

    Button btnregresa2, btncalcula2;
    EditText txtn3, txtn4;
    TextView lblr2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resta);

        txtn3=findViewById(R.id.txtn3);
        txtn4=findViewById(R.id.txtn4);

        lblr2=findViewById(R.id.lblr2);

        btncalcula2=findViewById(R.id.btncalcula2);
        btncalcula2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num1 = Integer.parseInt(txtn3.getText().toString());
                int num2 = Integer.parseInt(txtn4.getText().toString());
                lblr2.setText(String.valueOf(num1-num2));
            }
        });
        btnregresa2=findViewById(R.id.btnregresa2);
        btnregresa2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });


    }
}
