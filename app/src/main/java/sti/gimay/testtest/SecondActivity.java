package sti.gimay.testtest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class SecondActivity extends AppCompatActivity {

    TextView tv2_fname ,tv2_lname;
    String firstname_value, lastname_value,combine_value;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent intent = getIntent();
        //firstname_value = intent.getStringExtra("firstname_value");
       // lastname_value = intent.getStringExtra("lastname_value");
        combine_value = intent.getStringExtra("combine_value");

        tv2_fname=(TextView) findViewById(R.id.tv2_fname);
        //tv2_lname=(TextView) findViewById(R.id.tv2_lname);

       // tv2_fname.setText(firstname_value);
       // tv2_lname.setText(lastname_value);

        tv2_fname.setText(combine_value);

    }
}
