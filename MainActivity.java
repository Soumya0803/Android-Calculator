package com.example.soumya.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

//import static com.example.soumya.calculator.R.id.backbutton;
//import static com.example.soumya.calculator.R.id.six;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button add;
    Button subtract;
    Button multiply;
    Button divide;
    Button percentage;

    Button equal;
    Button dot;
    Button backbutton;



    Button one;
    Button two;
    Button three;
    Button four;
    Button five;
    Button six;

    Button seven;
    Button eight;
    Button nine;
    Button zero;

    TextView textview;
    Double result=0.0;
    //boolean plus;
    Double var=0.0;
    int id;
    int opid;

  // String num;
   // String num1;


/*

    String et="";
    double ans;
    double var;
    double var2;
    double flag;
*/


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_activity);



         add=(Button)findViewById(R.id.add);
         subtract=(Button)findViewById(R.id.minus);
         multiply=(Button)findViewById(R.id.multiply);
         divide=(Button)findViewById(R.id.divide);
         percentage=(Button)findViewById(R.id.percentage);

         equal=(Button)findViewById(R.id.equal);
         dot=(Button)findViewById(R.id.dot);
         backbutton=(Button)findViewById(R.id.backbutton);



         one=(Button)findViewById(R.id.one);
         two=(Button)findViewById(R.id.two);
         three=(Button)findViewById(R.id.three);
         four=(Button)findViewById(R.id.four);
         five=(Button)findViewById(R.id.five);
         six=(Button)findViewById(R.id.six);

         seven=(Button)findViewById(R.id.seven);
         eight=(Button)findViewById(R.id.eight);
         nine=(Button)findViewById(R.id.nine);
         zero=(Button)findViewById(R.id.zero);

        textview=(TextView)findViewById(R.id.textView);

        one.setOnClickListener(this);
        two.setOnClickListener(this);
        three.setOnClickListener(this);
        four.setOnClickListener(this);
        five.setOnClickListener(this);
        six.setOnClickListener(this);
        seven.setOnClickListener(this);
        eight.setOnClickListener(this);
        nine.setOnClickListener(this);
        zero.setOnClickListener(this);
        backbutton.setOnClickListener(this);
        add.setOnClickListener(this);
        subtract.setOnClickListener(this);
        multiply.setOnClickListener(this);
        divide.setOnClickListener(this);
        percentage.setOnClickListener(this);
        dot.setOnClickListener(this);
        equal.setOnClickListener(this);


    }
    public void add()
    {
        result = result + Double.parseDouble(textview.getText().toString());
        opid=id;
        textview.setText("");
    }
  public void sub()
  {
      if(result==0)

      {
          result = Double.parseDouble(textview.getText().toString());
      }

      else {
          result = result - Double.parseDouble(textview.getText().toString());
      }
      opid=id;
      textview.setText("");

  }

    public void mul()
    {
        if(result==0)

        {
            result = Double.parseDouble(textview.getText().toString());
        }

        else {
            result = result - Double.parseDouble(textview.getText().toString());
        }
        opid=id;
        textview.setText("");

    }

    public void div()
    {
        if(result==0)

        {
            result = Double.parseDouble(textview.getText().toString());
        }
        else {
            result = result /Double.parseDouble(textview.getText().toString());
        }
        opid=id;
        textview.setText("");
    }

    @Override
    public void onClick(View view) {


        id = view.getId();
        if (id == R.id.one) {
            textview.setText(textview.getText() + "1");
            // num=num+"1";

            //textview.setText();
        }
        if (id == R.id.two) {
            textview.setText(textview.getText() + "2");

        }

        if (id == R.id.three) {
            textview.setText(textview.getText() + "3");
        }
        if (id == R.id.four) {
            textview.setText(textview.getText() + "4");

        }

        if (id == R.id.five) {
            textview.setText(textview.getText() + "5");
        }
        if (id == R.id.six) {
            textview.setText(textview.getText() + "6");
        }
        if (id == R.id.seven) {
            textview.setText(textview.getText() + "7");
        }
        if (id == R.id.eight) {
            textview.setText(textview.getText() + "8");
        }
        if (id == R.id.nine) {
            textview.setText(textview.getText() + "9");
        }
        if (id == R.id.zero) {
            textview.setText(textview.getText() + "0");
        }
        if (id == R.id.backbutton) {
            textview.setText("");
        }
        if (id == R.id.dot) {
            textview.setText(textview.getText() + ".");
        }




        /*if (id == R.id.add)
        {
            result = result + Double.parseDouble(textview.getText().toString());
            opid=id;
            textview.setText("");
            //result = result + Double.parseDouble(textview.getText().toString());
            //result=result+Double.parseDouble(textview.getText().toString());

        }
         if (id == R.id.minus) {
            if(result==0)

            {
                result = Double.parseDouble(textview.getText().toString());
            }

                else {
                result = result - Double.parseDouble(textview.getText().toString());
               }
            opid=id;
            textview.setText("");

        }
        if (id == R.id.multiply)
        {
            if(result==0)

            {
                result = Double.parseDouble(textview.getText().toString());
            }
            else {
                result = result * Double.parseDouble(textview.getText().toString());
            }
            opid=id;
            textview.setText("");
            //result = result + Double.parseDouble(textview.getText().toString());
            //result=result+Double.parseDouble(textview.getText().toString());

        }

        if (id == R.id.divide)
        {
            if(result==0)

            {
                result = Double.parseDouble(textview.getText().toString());
            }
            else {
                result = result /Double.parseDouble(textview.getText().toString());
            }
            opid=id;
            textview.setText("");
            //result = result + Double.parseDouble(textview.getText().toString());
            //result=result+Double.parseDouble(textview.getText().toString());

        }*/

        if(id== R.id.add) //|| id== R.id.minus || id==R.id.multiply ||R.id.divide)
        {
            if(opid==R.id.add)
            {
                add();
            }
           else if(opid==R.id.minus)
            {
                sub();
            }
           else if(opid==R.id.multiply)
            {
                mul();
            }
           else if(opid==R.id.divide)
            {
                div();
            }
            else
            {
                result=Double.parseDouble(textview.getText().toString());
            }
            opid=R.id.add;
        }
        if(id== R.id.minus) //|| id== R.id.minus || id==R.id.multiply ||R.id.divide)
        {
            if(opid==R.id.add)
            {
                add();
            }
           else   if(opid==R.id.minus)
            {
                sub();
            }
          else    if(opid==R.id.multiply)
            {
                mul();
            }
           else if(opid==R.id.divide)
            {
                div();
            }
            else
            {
                result=Double.parseDouble(textview.getText().toString());
            }
            opid=R.id.minus;
        }

        if(id== R.id.multiply) //|| id== R.id.minus || id==R.id.multiply ||R.id.divide)
        {
            if(opid==R.id.add)
            {
                add();
            }
            else   if(opid==R.id.minus)
            {
                sub();
            }
            else    if(opid==R.id.multiply)
            {
                mul();
            }
            else if(opid==R.id.divide)
            {
                div();
            }
            else {
                result = Double.parseDouble(textview.getText().toString());
            }
            opid=R.id.multiply;
        }

        if(id== R.id.divide) //|| id== R.id.minus || id==R.id.multiply ||R.id.divide)
        {
            if(opid==R.id.add)
            {
                add();
            }
            else   if(opid==R.id.minus)
            {
                sub();
            }
            else    if(opid==R.id.multiply)
            {
                mul();
            }
            else if(opid==R.id.divide)
            {
                div();
            }
            else
            {
                result=Double.parseDouble(textview.getText().toString());
            }
            opid=R.id.divide;
        }



        if (id == R.id.equal) {
            if (opid==R.id.add) {
                 var= Double.parseDouble(textview.getText().toString());

                result = result+var;
                textview.setText(result+ "");
                result = 0.0;
                var= 0.0;
                //plus=false;
            }
            else if (opid==R.id.minus) {

                var  = Double.parseDouble(textview.getText().toString());
                result=result-var;
                textview.setText(result + "");
                result = 0.0;
                var = 0.0;
                //subtract=false;
            }
              else if (opid==R.id.multiply) {

                var  = Double.parseDouble(textview.getText().toString());
                result=result*var;
                textview.setText(result + "");
                result = 0.0;
                var = 0.0;
                //subtract=false;
            }
           else  if (opid==R.id.divide) {

                var  = Double.parseDouble(textview.getText().toString());
                result=result/var;
                textview.setText(result + "");
                result = 0.0;
                var = 0.0;
                //subtract=false;
            }
        }

        }


        }