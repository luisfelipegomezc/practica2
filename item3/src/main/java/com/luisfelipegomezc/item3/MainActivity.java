package com.luisfelipegomezc.item3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int opcion = 0;
    Double resultado;
    EditText eBase, eLado, eAltura, eRadio, eResul;
    TextView tBase, tLado, tAltura, tRadio;
    Button bCalcular;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bCalcular = (Button) findViewById(R.id.bCalc);
        eBase = (EditText) findViewById(R.id.eBase);
        eLado = (EditText) findViewById(R.id.eLado);
        eAltura = (EditText) findViewById(R.id.eAltura);
        eRadio = (EditText) findViewById(R.id.eRadio);
        eResul = (EditText) findViewById(R.id.eResul);
        tBase = (TextView) findViewById(R.id.tBase);
        tLado = (TextView) findViewById(R.id.tLado);
        tAltura = (TextView) findViewById(R.id.tAltura);
        tRadio = (TextView) findViewById(R.id.tRadio);

        bCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(opcion==1){
                    if (eBase.getText().toString().equals("")){
                        eResul.setText("Error");
                        Toast toast = Toast.makeText(getApplicationContext(), "Ingrese Nuevos datos", Toast.LENGTH_LONG);
                        toast.show();
                    }else{
                        resultado = Math.pow(Double.parseDouble(eBase.getText().toString()), 2) ;
                        eResul.setText(String.valueOf(resultado));

                    }
                }else{
                    if (opcion==2){
                        if ((eBase.getText().toString().equals(""))||(eLado.getText().toString().equals(""))){
                            eResul.setText("Error");
                            Toast toast = Toast.makeText(getApplicationContext(), "Ingrese Nuevos datos", Toast.LENGTH_LONG);
                            toast.show();
                        }else{
                            resultado = Double.parseDouble(eBase.getText().toString()) * Double.parseDouble(eLado.getText().toString());
                            eResul.setText(String.valueOf(resultado));
                        }

                    }else{
                        if (opcion==3){
                            if ((eBase.getText().toString().equals(""))||(eAltura.getText().toString().equals(""))){
                                eResul.setText("Error");
                                Toast toast = Toast.makeText(getApplicationContext(), "Ingrese Nuevos datos", Toast.LENGTH_LONG);
                                toast.show();
                            }else{
                                resultado = (Double.parseDouble(eBase.getText().toString()) * Double.parseDouble(eAltura.getText().toString())/2);
                                eResul.setText(String.valueOf(resultado));
                            }

                        }else{
                            if (opcion==4){
                                if (eRadio.getText().toString().equals("")){
                                    eResul.setText("Error");
                                    Toast toast = Toast.makeText(getApplicationContext(), "Ingrese Nuevos datos", Toast.LENGTH_LONG);
                                    toast.show();
                                }else{
                                    resultado = Math.pow(Double.parseDouble(eRadio.getText().toString()),2)* 3.1416;
                                    eResul.setText(String.valueOf(resultado));
                                }

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
            case R.id.rCuadrado:
                opcion=1;
                eBase.setVisibility(View.VISIBLE);
                eLado.setVisibility(View.INVISIBLE);
                eAltura.setVisibility(View.INVISIBLE);
                eRadio.setVisibility(View.INVISIBLE);
                tBase.setVisibility(View.VISIBLE);
                tLado.setVisibility(View.INVISIBLE);
                tAltura.setVisibility(View.INVISIBLE);
                tRadio.setVisibility(View.INVISIBLE);
                //if (checked)
                // opción sumar
                break;
            case R.id.rRectangulo:
                opcion=2;
                eBase.setVisibility(View.VISIBLE);
                eLado.setVisibility(View.VISIBLE);
                eAltura.setVisibility(View.INVISIBLE);
                eRadio.setVisibility(View.INVISIBLE);
                tBase.setVisibility(View.VISIBLE);
                tLado.setVisibility(View.VISIBLE);
                tAltura.setVisibility(View.INVISIBLE);
                tRadio.setVisibility(View.INVISIBLE);
                //if (checked)
                // opción resta
                break;
            case R.id.rTriangulo:
                opcion=3;
                eBase.setVisibility(View.VISIBLE);
                eLado.setVisibility(View.INVISIBLE);
                eAltura.setVisibility(View.VISIBLE);
                eRadio.setVisibility(View.INVISIBLE);
                tBase.setVisibility(View.VISIBLE);
                tLado.setVisibility(View.INVISIBLE);
                tAltura.setVisibility(View.VISIBLE);
                tRadio.setVisibility(View.INVISIBLE);
                //if (checked)
                // opción multiplicación
                break;
            case R.id.rCirculo:
                opcion=4;
                eBase.setVisibility(View.INVISIBLE);
                eLado.setVisibility(View.INVISIBLE);
                eAltura.setVisibility(View.INVISIBLE);
                eRadio.setVisibility(View.VISIBLE);
                tBase.setVisibility(View.INVISIBLE);
                tLado.setVisibility(View.INVISIBLE);
                tAltura.setVisibility(View.INVISIBLE);
                tRadio.setVisibility(View.VISIBLE);
                //if (checked)
                // opción división
                break;
        }
    }
}
