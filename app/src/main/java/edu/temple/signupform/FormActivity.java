package edu.temple.signupform;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class FormActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.save).setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        //((android.widget.TextView)findViewById(R.id.infoText)).setText("You have clicked the button");
                        TextView textUsrName = (android.widget.TextView) findViewById(R.id.userName);
                        String strUserName = textUsrName.getText().toString();
                        if (strUserName.length() <= 0) {
                            Toast.makeText(getApplicationContext(), "You must enter user name.", Toast.LENGTH_LONG).show();
                            return;
                        }

                        TextView textEMail = (android.widget.TextView) findViewById(R.id.eMail);
                        if (textEMail.getText().toString().length() <= 0) {
                            Toast.makeText(getApplicationContext(), "You must enter eMail.", Toast.LENGTH_LONG).show();
                            return;
                        }

                        TextView textPassword1 = (android.widget.TextView) findViewById(R.id.password1);
                        String strPassword1 = textPassword1.getText().toString();
                        if (strPassword1.length() <= 0) {
                            Toast.makeText(getApplicationContext(), "You must enter Password.", Toast.LENGTH_LONG).show();
                            return;
                        }

                        TextView textPassword2 = (android.widget.TextView) findViewById(R.id.password2);
                        String strPassword2 = textPassword2.getText().toString();
                        if (strPassword2.length() <= 0) {
                            Toast.makeText(getApplicationContext(), "You must enter Password confirmation.", Toast.LENGTH_LONG).show();
                            return;
                        }

                        if (!strPassword1.equals(strPassword2)) {
                            Toast.makeText(getApplicationContext(), "Password confirmation doesn't match.", Toast.LENGTH_LONG).show();
                            return;
                        }

                        String strMsg = String.format("Welcome, %s, to the SignUpForm App", strUserName);
                        Toast.makeText(getApplicationContext(), strMsg, Toast.LENGTH_LONG).show();
                    }

                });


    }
}
