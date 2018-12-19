package fr.stjolorient.calculatrice;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    EditText Nombre1;
    EditText Nombre2;
    TextView affichage;
    Float Resultat;
    Float nb1temp;
    Float nb2temp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Nombre1 = (EditText) findViewById(R.id.Zonetext1);
        Nombre2 = (EditText) findViewById(R.id.Zonetext2);
        affichage = (TextView) findViewById(R.id.textView4);
        }

    public void addition(View view){
        if((Nombre1.getText().toString().isEmpty())||(Nombre2.getText().toString().isEmpty())){
            this.affichage.setText("Erreur");
        }else {
            nb1temp = (Float.parseFloat(this.Nombre1.getText().toString()));
            nb2temp = (Float.parseFloat(this.Nombre2.getText().toString()));
            Resultat = nb1temp + nb2temp;
            this.affichage.setText(String.valueOf(Resultat));
        }
    }

    public void soustraction(View view){
        if((Nombre1.getText().toString().isEmpty())||(Nombre2.getText().toString().isEmpty())){
            this.affichage.setText("Erreur");
        }else {
            nb1temp = (Float.parseFloat(this.Nombre1.getText().toString()));
            nb2temp = (Float.parseFloat(this.Nombre2.getText().toString()));
            Resultat = nb1temp - nb2temp;
            this.affichage.setText(String.valueOf(Resultat));
        }
    }

    public void division(View view){
        if((Nombre1.getText().toString().isEmpty())||(Nombre2.getText().toString().isEmpty())){
            this.affichage.setText("Erreur");
        }
            else{
            nb1temp = (Float.parseFloat(this.Nombre1.getText().toString()));
            nb2temp = (Float.parseFloat(this.Nombre2.getText().toString()));
            Resultat = nb1temp / nb2temp;
            this.affichage.setText(String.valueOf(Resultat));
        }
    }

   public void multiplication(View view){
       if((Nombre1.getText().toString().isEmpty())||(Nombre2.getText().toString().isEmpty())){
           this.affichage.setText("Erreur");
       }else {
           nb1temp = (Float.parseFloat(this.Nombre1.getText().toString()));
           nb2temp = (Float.parseFloat(this.Nombre2.getText().toString()));
           Resultat = nb1temp * nb2temp;
           this.affichage.setText(String.valueOf(Resultat));
       }
    }

}
