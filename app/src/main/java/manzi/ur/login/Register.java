package manzi.ur.login;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Register extends AppCompatActivity {

    EditText fname, lname, username, email,phone, password, confirmpassword;
    TextView sucess;
    Button register;
    public String userpass, userconfirmpass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        fname = (EditText)findViewById(R.id.fname);
        lname = (EditText) findViewById(R.id.lname);
        username = (EditText) findViewById(R.id.username);
        email = (EditText) findViewById(R.id.email);
        phone = (EditText) findViewById(R.id.phone);
        password = (EditText) findViewById(R.id.password);
        confirmpassword = (EditText) findViewById(R.id.confirmpassword);

        register = (Button)findViewById(R.id.register);

        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

               userpass = password.getText().toString();
                userconfirmpass = confirmpassword.getText().toString();
                validateregistration(userpass, userconfirmpass);
            }
        });
    }
    public void validateregistration(String mypass, String myconfirmpass){
        if (mypass==myconfirmpass){

            Intent intent = new Intent(Register.this, MainActivity.class);
            startActivity(intent);
        }

        else {

            register.setEnabled(false);
        }
    }
}
