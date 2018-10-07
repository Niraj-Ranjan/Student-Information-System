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

public class Register extends Activity
{
    Button b10,b14;
    EditText ed10,ed11,ed12,ed13;

    TextView tx1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.register);

        b10 = (Button) findViewById(R.id.button10);
        ed10 = (EditText) findViewById(R.id.editText10);
        ed11 = (EditText) findViewById(R.id.editText11);
        ed12 = (EditText) findViewById(R.id.editText12);
        ed13 = (EditText) findViewById(R.id.editText13);


        b10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {

                Intent intent10 = new Intent(Register.this,MainActivity.class);



                    startActivity(intent10);


                }





        });


    }


}
