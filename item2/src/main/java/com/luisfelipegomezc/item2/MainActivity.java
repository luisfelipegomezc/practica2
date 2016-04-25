package com.luisfelipegomezc.item2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int opcion=0;
    double total;
    EditText eNum1, eNum2, eResul;
    Button bCalcular;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bCalcular = (Button) findViewById(R.id.bCalc);
        eNum1 = (EditText) findViewById(R.id.eNumero1);
        eNum2 = (EditText) findViewById(R.id.eNumero2);
        eResul = (EditText) findViewById(R.id.eResul);

       bCalcular.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
                if(opcion==1){
                    total = Double.parseDouble(eNum1.getText().toString()) + Double.parseDouble(eNum2.getText().toString());
                    eResul.setText(String.valueOf(total));
                    Toast toast = Toast.makeText(getApplicationContext(), "Ingrese Nuevos datos", Toast.LENGTH_LONG);
                    toast.show();
                }else{
                    if (opcion==2){
                        total = Double.parseDouble(eNum1.getText().toString()) - Double.parseDouble(eNum2.getText().toString());
                        eResul.setText(String.valueOf(total));
                        Toast toast = Toast.makeText(getApplicationContext(), "Ingrese Nuevos datos", Toast.LENGTH_LONG);
                        toast.show();
                    }else{
                        if (opcion==3){
                            total = Double.parseDouble(eNum1.getText().toString()) * Double.parseDouble(eNum2.getText().toString());
                            eResul.setText(String.valueOf(total));
                            Toast toast = Toast.makeText(getApplicationContext(), "Ingrese Nuevos datos", Toast.LENGTH_LONG);
                            toast.show();
                        }else{
                            if (opcion==4){
                                total = Double.parseDouble(eNum1.getText().toString()) / Double.parseDouble(eNum2.getText().toString());
                                eResul.setText(String.valueOf(total));
                                Toast toast = Toast.makeText(getApplicationContext(), "Ingrese Nuevos datos", Toast.LENGTH_LONG);
                                toast.show();
                            }
                        }
                    }
                }
           }
       });




    }
        public void onRadioButtonClicked(View view) {
            // Is the button now checked?
            boolean checked = ((RadioButton) view).isChecked();

            // Check which radio button was clicked
            switch(view.getId()) {
                case R.id.rSuma:
                    opcion=1;
                    //if (checked)
                        // opción sumar
                        break;
                case R.id.rResta:
                    opcion=2;
                    //if (checked)
                        // opción resta
                        break;
                case R.id.rMult:
                    opcion=3;
                    //if (checked)
                        // opción multiplicación
                        break;
                case R.id.rDiv:
                    opcion=4;
                    //if (checked)
                        // opción división
                        break;
            }
        }

}
