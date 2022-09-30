package mx.edu.tesoem.ics.p2jjgt.p47s2120222htw;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnsuma, btnresta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnsuma=findViewById(R.id.btnsuma);
        btnresta=findViewById(R.id.btnresta);

        btnsuma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent psuma = new Intent(MainActivity.this,suma.class);
                startActivity(psuma);

            }
        });
        btnresta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent presta = new Intent(MainActivity.this,resta.class);
                startActivity(presta);
            }
        });
    }
}
