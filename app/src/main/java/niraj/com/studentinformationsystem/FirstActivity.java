package niraj.com.studentinformationsystem;
import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.widget.Button;
        import android.widget.EditText;
        import android.widget.TextView;
        import android.view.View;
        import android.view.View.OnClickListener;
        import android.content.Intent;

public class FirstActivity extends Activity {
    TextView tx1;
    EditText edt1,edt2,edt3;
    Button b1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        tx1 = (TextView) findViewById(R.id.textView);

        edt1 = (EditText) findViewById(R.id.editText2);
        edt2 = (EditText) findViewById(R.id.editText3);
        edt3 = (EditText) findViewById(R.id.editText4);


        b1 = (Button) findViewById(R.id.button);



        b1.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {

                Intent intent2 = new Intent(FirstActivity.this,ThirdActivity.class);
                String fname = edt1.getText().toString();
                String lname = edt2.getText().toString();
                String mobno = edt3.getText().toString();



                startActivity(intent2);

            }
        });


    }
}