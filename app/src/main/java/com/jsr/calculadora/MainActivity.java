package com.jsr.calculadora;
//import com.github.gbenroscience:parserng-android:0.1.1;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.itis.libs.parserng.android.expressParser.MathExpression;

public class MainActivity extends AppCompatActivity {
    TextView textView2;
    int angle = 0;
    TextView textView19;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView2 = (TextView)findViewById(R.id.textView2);
        textView19 = (TextView)findViewById(R.id.textView19);



    }
    public void doLog(String text){
        Log.d("MYAPP-Calculadora",text+" clicked");
    }
    public void one(android.view.View v){
        doLog("one");
        CharSequence txt = textView2.getText();
        textView2.setText(txt+"1");

    }
    public void two(android.view.View v){
        doLog("two");
        CharSequence txt = textView2.getText();
        textView2.setText(txt+"2");
    }
    public void three(android.view.View v){
        doLog("three");
        CharSequence txt = textView2.getText();
        textView2.setText(txt+"3");
    }
    public void four(android.view.View v){
        doLog("four");
        CharSequence txt = textView2.getText();
        textView2.setText(txt+"4");
    }
    public void five(android.view.View v){
        doLog("five");
        CharSequence txt = textView2.getText();
        textView2.setText(txt+"5");
    }
    public void six(android.view.View v){
        doLog("six");
        CharSequence txt = textView2.getText();
        textView2.setText(txt+"6");
    }
    public void seven(android.view.View v){
        doLog("seven");
        CharSequence txt = textView2.getText();
        textView2.setText(txt+"7");
    }
    public void eight(android.view.View v){
        doLog("eight");
        CharSequence txt = textView2.getText();
        textView2.setText(txt+"8");
    }
    public void nine(android.view.View v){
        doLog("nine");
        CharSequence txt = textView2.getText();
        textView2.setText(txt+"9");
    }
    public void zero(android.view.View v){
        doLog("zero");
        CharSequence txt = textView2.getText();
        textView2.setText(txt+"0");
    }
    public void plus(android.view.View v){
        doLog("+");
        CharSequence txt = textView2.getText();
        textView2.setText(txt+"+");
    }
    public void less(android.view.View v){
        doLog("-");
        CharSequence txt = textView2.getText();
        textView2.setText(txt+"-");
    }
    public void multiply(android.view.View v){
        doLog("*");
        CharSequence txt = textView2.getText();
        textView2.setText(txt+"*");
    }
    public void divide(android.view.View v){
        doLog("/");
        CharSequence txt = textView2.getText();
        textView2.setText(txt+"/");
    }
    public void equal(android.view.View v){
        doLog("=");
        CharSequence txt = textView2.getText();
        MathExpression expr = new MathExpression((String) txt);
        //degrees = 0;rads = 1;grads = 2;
        expr.setDRG(angle);
        textView2.setText(expr.solve());
    }
    public void del(android.view.View v){
        doLog("del");
        CharSequence txt = textView2.getText();
        int i = txt.length();
        textView2.setText("");
    }
    public void degNrad(android.view.View v){
        doLog("changed angular unit");
        if(angle == 0){
            angle = 1;
            textView19.setText("rad");
        }
        else{
            angle = 0;
            textView19.setText("deg");
        }
    }
    public void sin(android.view.View v){
        doLog("sin");
        CharSequence txt = textView2.getText();
        textView2.setText(txt+"sin(");
    }
    public void cos(android.view.View v){
        doLog("cos");
        CharSequence txt = textView2.getText();
        textView2.setText(txt+"cos(");
    }
    public void tan(android.view.View v){
        doLog("tan");
        CharSequence txt = textView2.getText();
        textView2.setText(txt+"tan(");
    }
    public void openparenthesis(android.view.View v){
        doLog("(");
        CharSequence txt = textView2.getText();
        textView2.setText(txt+"(");
    }
    public void closeparenthesis(android.view.View v){
        doLog(")");
        CharSequence txt = textView2.getText();
        textView2.setText(txt+")");
    }
    public void pi(android.view.View v){
        doLog("PI");
        CharSequence txt = textView2.getText();
        String pi = Double.toString(Math.PI);
        textView2.setText(txt+pi);
    }
    public void dot(android.view.View v){
        doLog(".");
        CharSequence txt = textView2.getText();
        textView2.setText(txt+".");
    }

}