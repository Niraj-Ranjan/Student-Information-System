package niraj.com.studentinformationsystem;

import android.app.Activity;
import android.widget.TextView;
import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.view.View;
import android.view.View.OnClickListener;
import android.content.Intent;



public class ThirdActivity extends Activity
{
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        TextView tx3;
        tx3 = (TextView) findViewById(R.id.textView1);

        Bundle bundle = getIntent().getExtras();



    }

}
