package niraj.com.studentinformationsystem;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.*;

import android.widget.Button;
import android.widget.EditText;

import android.widget.TextView;
import android.widget.Toast;
import android.content.Intent;

public class MainActivity extends Activity  {

    Button b1,b2;
    EditText ed1,ed2;

    TextView tx1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1 = (Button)findViewById(R.id.button);
        ed1 = (EditText)findViewById(R.id.editText);
        ed2 = (EditText)findViewById(R.id.editText2);
        b2=(Button)findViewById(R.id.button12);





        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {

                Intent intent = new Intent(MainActivity.this,FirstActivity.class);
                if(ed1.getText().toString().equals("admin") &&
                        ed2.getText().toString().equals("admin"))
                {
                    Toast.makeText(getApplicationContext(),
                            "Redirecting...",Toast.LENGTH_SHORT).show();
                    Intent intent1 = new Intent(MainActivity.this,FirstActivity.class);
                    startActivity(intent1);
                    finish();

                }else
                    {
                    Toast.makeText(getApplicationContext(), "Wrong Credentials",Toast.LENGTH_SHORT).show();

                    }




            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            public void onClick (View v)

            {

                Intent i2 = new Intent(MainActivity.this, Register.class);

                startActivity(i2);


            }
        });



    }
}