package manzi.ur.login;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Welcome extends AppCompatActivity {
TextView tv;
String st;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        tv = (TextView)findViewById(R.id.tv);

        st = getIntent().getExtras().getString(key:"Value");
        tv.setText(st);
    }
}
