package com.example.calculate;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.calculate.R;

public class MainActivity extends AppCompatActivity {
    Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn0;
    Button btnminus, btnplus,btnmulti,btndvd,btnclr,btndot,btnequal;
    EditText ed1;
    float result1,result2;
    boolean Add,Sub,Multi,Div;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1=(Button)findViewById(R.id.btn1) ;
        btn2=(Button)findViewById(R.id.btn2) ;
        btn3=(Button)findViewById(R.id.btn3) ;
        btn4=(Button)findViewById(R.id.btn4) ;
        btn5=(Button)findViewById(R.id.btn5) ;
        btn6=(Button)findViewById(R.id.btn6) ;
        btn7=(Button)findViewById(R.id.btn7) ;
        btn8=(Button)findViewById(R.id.btn8) ;
        btn9=(Button)findViewById(R.id.btn9) ;
        btn0=(Button)findViewById(R.id.btn0) ;
        btnplus=(Button)findViewById(R.id.btnplus) ;
        btnminus=(Button)findViewById(R.id.btnminus) ;
        btnmulti=(Button)findViewById(R.id.btnmulti) ;
        btndvd=(Button)findViewById(R.id.btndvd) ;
        btnequal=(Button)findViewById(R.id.btnequal) ;
        btndot=(Button)findViewById(R.id.btndot) ;
        btnclr=(Button)findViewById(R.id.btnclr) ;
        ed1=(EditText) findViewById(R.id.editText);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText() +"1");
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText() +"2");
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText() +"3");
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText() +"4");
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText() +"5");
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText() +"2");
            }
        });
        btndot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText() +".");
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText() +"7");
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText() +"8");
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText() +"9");
            }
        });
        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText() +"0");
            }
        });
        btnplus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ed1 == null) {
                    ed1.setText("");
                } else {
                    result1 = Float.parseFloat(ed1.getText() + "");
                    Add = true;
                    ed1.setText(null);
                }
            }
        });
        btnminus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ed1 == null) {
                    ed1.setText("");
                } else {
                    result1 = Float.parseFloat(ed1.getText() + "");
                    Sub = true;
                    ed1.setText(null);
                }
            }
        });
        btnmulti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ed1 == null) {
                    ed1.setText("");
                } else {
                    result1 = Float.parseFloat(ed1.getText() + "");
                    Multi = true;
                    ed1.setText(null);
                }
            }
        });
        btndvd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ed1 == null) {
                    ed1.setText("");
                } else {
                    result1 = Float.parseFloat(ed1.getText() + "");
                    Div = true;
                    ed1.setText(null);
                }
            }
        });
        btnequal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result2=Float.parseFloat(ed1.getText()+"");
                if(Add==true)
                {
                    ed1.setText(result1+result2+"");
                    Add=false;
                }
                if(Sub==true)
                {
                    ed1.setText(result1-result2+"");
                    Sub=false;
                }
                if(Multi==true)
                {
                    ed1.setText(result1*result2+"");
                    Multi=false;
                }
                if(Div==true)
                {
                    ed1.setText(result1/result2+"");
                    Div=false;
                }
            }
        });
        btnclr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText("");
            }
        });

    }
}