

package com.example.calculator;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import org.mozilla.javascript.Scriptable;






public class MainActivity  extends AppCompatActivity

{




    Button btn0,btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btnadd,
            btndiv,btnclr,btnmul,btnbracket,btnsub,btndot,btnans,btnpercent;
    TextView ip,op;
    String process;
    boolean CheckBracket=false;

    @Override
    protected void onCreate(Bundle savedInstanceState)

    {





        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn0 = findViewById(R.id.btn0);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);
        btn7 = findViewById(R.id.btn7);
        btn8 = findViewById(R.id.btn8);
        btn9 = findViewById(R.id.btn9);

        btnadd = findViewById(R.id.btnadd);
        btnsub = findViewById(R.id.btnsub);
        btnmul = findViewById(R.id.btnmul);
        btndiv = findViewById(R.id.btndiv);

        btnans = findViewById(R.id.btnans);
        btnclr = findViewById(R.id.btnclr);
        btnbracket = findViewById(R.id.btnbracket);
        btndot = findViewById(R.id.btndot);
        btnpercent = findViewById(R.id.btnpercent);

        ip = findViewById(R.id.input);
        op = findViewById(R.id.output);




                    btnclr.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view)
                        {
                            ip.setText("");
                            op.setText("");


                        }
                    });


                    btn0.setOnClickListener(new View.OnClickListener() {
                       @Override
                       public void onClick(View view)
                       {

                           process = ip.getText().toString();
                           ip.setText(process+"0");

                       }
                   });


        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {

                process = ip.getText().toString();
                ip.setText(process+"1");

            }
        });


        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {

                process = ip.getText().toString();
                ip.setText(process+"2");

            }
        });


        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {

                process = ip.getText().toString();
                ip.setText(process+"3");

            }
        });


        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {

                process = ip.getText().toString();
                ip.setText(process+"4");

            }
        });


        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {

                process = ip.getText().toString();
                ip.setText(process+"5");

            }
        });


        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {

                process = ip.getText().toString();
                ip.setText(process+"6");

            }
        });


        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {

                process = ip.getText().toString();
                ip.setText(process+"7");

            }
        });



        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {

                process = ip.getText().toString();
                ip.setText(process+"8");

            }
        });



        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {

                process = ip.getText().toString();
                ip.setText(process+"9");

            }
        });


        btnadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {

                process = ip.getText().toString();
                ip.setText(process+"+");

            }
        });

        btnsub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {

                process = ip.getText().toString();
                ip.setText(process+"-");

            }
        });


        btnmul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {

                process = ip.getText().toString();
                ip.setText(process+"x");

            }
        });


        btndiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {

                process = ip.getText().toString();
                ip.setText(process+"÷");

            }
        });

        btndot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {

                process = ip.getText().toString();
                ip.setText(process+".");

            }
        });


        btnpercent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {

                process = ip.getText().toString();
                ip.setText(process+"%");

            }
        });



        btnans.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {

                process = ip.getText().toString();
                process = process.replaceAll("x", "*");
                process = process.replaceAll("%", "/100");
                org.mozilla.javascript.Context rhino =   org.mozilla.javascript.Context.enter();

                rhino.setOptimizationLevel(-1);

                String finalresult = "";

                try {

                    Scriptable scriptable = rhino.initStandardObjects();
                     finalresult = rhino.evaluateString(scriptable,process,"javascipt",1,null).toString();
                }
                catch(Exception e)
                {
                    finalresult = "0";

                }

                op.setText(finalresult);
                
            }
        });




        btnbracket.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {

                    if(CheckBracket)
                        {
                                    process=ip.getText().toString();
                                    ip.setText(process+"(");
                                    CheckBracket= false;
                        }

                    else
                        {
                            process=ip.getText().toString();
                            ip.setText(process+")");
                            CheckBracket= true;
                        }


            }
        });






    }
}

