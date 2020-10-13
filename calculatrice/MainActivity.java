package com.entreprise1.projet2.calculatrice;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    // Déclarations de variable
    private TextView res;
    private Button btn0;
    private Button btn1;
    private Button btn2;
    private Button btn3;
    private Button btn4;
    private Button btn5;
    private Button btn6;
    private Button btn7;
    private Button btn8;
    private Button btn9;
    private Button btnc;
    private Button btnadd;
    private Button btnsus;
    private Button btnmul;
    private Button btndiv;
    private Button btnegl;
    private Button btnp;
    private float saveLastValue;
    private String opperateur;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    //liaisons entre mon controleurs(ma class) et ma vue
    this.res = findViewById(R.id.res);
    this.btn0 = findViewById(R.id.btn0);
    this.btn1 = findViewById(R.id.btn1);
    this.btn2 = findViewById(R.id.btn2);
    this.btn3 = findViewById(R.id.btn3);
    this.btn4 = findViewById(R.id.btn4);
    this.btn5 = findViewById(R.id.btn5);
    this.btn6 = findViewById(R.id.btn6);
    this.btn7 = findViewById(R.id.btn7);
    this.btn8 = findViewById(R.id.btn8);
    this.btn9 = findViewById(R.id.btn9);
    this.btnc = findViewById(R.id.btnc);
    this.btnp = findViewById(R.id.btnp);
    this.btnadd = findViewById(R.id.btnadd);
    this.btnsus = findViewById(R.id.btnsus);
    this.btnmul = findViewById(R.id.btnmul);
    this.btndiv = findViewById(R.id.btndiv);
    this.btnegl = findViewById(R.id.btnegl);


    //events (Quand tu clique tu vas trouver mon evenment onClick dans ma class)
    this.res.setOnClickListener(this);
    this.btn0.setOnClickListener(this);
    this.btn1.setOnClickListener(this);
    this.btn2.setOnClickListener(this);
    this.btn3.setOnClickListener(this);
    this.btn4.setOnClickListener(this);
    this.btn5.setOnClickListener(this);
    this.btn6.setOnClickListener(this);
    this.btn7.setOnClickListener(this);
    this.btn8.setOnClickListener(this);
    this.btn9.setOnClickListener(this);
    this.btnc.setOnClickListener(this);
    this.btnp.setOnClickListener(this);
    this.btnadd.setOnClickListener(this);
    this.btnsus.setOnClickListener(this);
    this.btnmul.setOnClickListener(this);
    this.btndiv.setOnClickListener(this);
    this.btnegl.setOnClickListener(this);



    }// fin de methode


    @Override
    public void onClick(View v) {

        if(this.btn0 == v){
            String lastcontent = this.res.getText().toString();

            if(lastcontent.equals("0")){

            }else{
                res.setText(lastcontent+"0");
            }

        }else if(this.btn1 == v){
            String lastcontent = this.res.getText().toString();

            if(lastcontent.equals("0")){
                res.setText("1");

            }else{
                res.setText(lastcontent+"1");
            }

        }else if(this.btn2 == v){
            String lastcontent = this.res.getText().toString();

            if(lastcontent.equals("0")){
                res.setText("2");

            }else{
                res.setText(lastcontent+"2");
            }

        }else if(this.btn3 == v){
            String lastcontent = this.res.getText().toString();

            if(lastcontent.equals("0")){
                res.setText("3");

            }else {
                res.setText(lastcontent+"3");
            }

        }else if(this.btn4 == v){
            String lastcontent = this.res.getText().toString();

            if(lastcontent.equals("0")){
                res.setText("4");

            }else{
                res.setText(lastcontent+"4");
            }

        }else if(this.btn5 == v){
            String lastcontent = this.res.getText().toString();

            if(lastcontent.equals("0")){
                res.setText("5");

            }else{
                res.setText(lastcontent+"5");
            }

        }else if(this.btn6 == v){
            String lastcontent = this.res.getText().toString();

            if(lastcontent.equals("0")){
                res.setText("6");

            }else{
                res.setText(lastcontent+"6");
            }

        }else if(this.btn7 == v){
            String lastcontent = this.res.getText().toString();

            if(lastcontent.equals("0")){
                res.setText("7");

            }else{
                res.setText(lastcontent+"7");
            }

        }else if(this.btn8 == v){
            String lastcontent = this.res.getText().toString();

            if(lastcontent.equals("0")){
                res.setText("8");

            }else{
                res.setText(lastcontent+"8");
            }

        }else if(this.btn9 == v){
            String lastcontent = this.res.getText().toString();

            if(lastcontent.equals("0")){
                res.setText("9");

            }else{
                res.setText(lastcontent+"9");
            }

        }else if(this.btnc == v){
            res.setText("0");

        }else if(this.btnadd == v){
            String lastcontent = this.res.getText().toString();

            this.saveLastValue = Float.parseFloat(lastcontent);

            this.opperateur = "+";

            this.res.setText("0");

        }else if(this.btnsus == v){
            String lastcontent = this.res.getText().toString();

            this.saveLastValue = Float.parseFloat(lastcontent);

            this.opperateur = "-";

            this.res.setText("0");


        }else if(this.btnmul == v){
            String lastcontent = this.res.getText().toString();

            this.saveLastValue = Float.parseFloat(lastcontent);

            this.opperateur = "x";

            this.res.setText("0");


        }else if(this.btndiv == v){
            String lastcontent = this.res.getText().toString();

            this.saveLastValue = Float.parseFloat(lastcontent);

            this.opperateur = "/";

            this.res.setText("0");


        }else if(this.btnp == v){

            String lastcontent = this.res.getText().toString();

            if(lastcontent.equals("0")){
                res.setText(lastcontent+".");

            }else if (lastcontent.indexOf(".") != -1) {

            }else{
                res.setText(lastcontent+".");
            }


        }else if(this.btnegl == v){
            String lastcontent = this.res.getText().toString();

            if(opperateur.equals("+")){
                float resultat = this.saveLastValue + Float.parseFloat(lastcontent);

                this.res.setText(""+resultat);

            }else if(opperateur.equals("-")){
                float resultat = this.saveLastValue - Float.parseFloat(lastcontent);

                this.res.setText(""+resultat);

            }else if(opperateur.equals("x")){
                float resultat = this.saveLastValue * Float.parseFloat(lastcontent);

                this.res.setText(""+resultat);
            }else if(opperateur.equals("/")){
                float resultat = this.saveLastValue / Float.parseFloat(lastcontent);

                this.res.setText(""+resultat);
            }

        }

    }//fin de methode
}//fin de class
