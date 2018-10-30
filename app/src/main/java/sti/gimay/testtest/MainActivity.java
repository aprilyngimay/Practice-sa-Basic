package sti.gimay.testtest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private static final String TAG = "MainActivity" ;
    EditText et_firstname,et_lastname;
    TextView tv_firstname,tv_lastname;

    Button clickme_button;

    String firstname_value, lastname_value,combine_value;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv_firstname=(TextView) findViewById(R.id.tv_fname);
        tv_lastname=(TextView) findViewById(R.id.tv_lname);

        et_firstname=(EditText)findViewById(R.id.et_enter_fname);
        et_lastname=(EditText)findViewById(R.id.et_enter_lname);

        clickme_button=(Button)findViewById(R.id.click_button);

        clickme_button.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        //firstname_value = et_firstname.getText().toString();
        //lastname_value = et_lastname.getText().toString();

        combine_value = et_firstname.getText().toString() + " " + et_lastname.getText().toString();

        //combine_value = "";
           // combine_value += "et_firstname ";
           // combine_value += "et_lastname";

        Intent secondIntent = new Intent(MainActivity.this, SecondActivity.class);
        //secondIntent.putExtra("firstname_value", firstname_value);
        //secondIntent.putExtra("lastname_value", lastname_value);

        secondIntent.putExtra("combine_value", combine_value);

        startActivity(secondIntent);

        Log.d(TAG,"Hi " + et_firstname.getText().toString() + " " + et_lastname.getText().toString());
    }
}
