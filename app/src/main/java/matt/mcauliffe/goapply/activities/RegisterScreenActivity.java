package matt.mcauliffe.goapply.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import matt.mcauliffe.goapply.R;

public class RegisterScreenActivity extends AppCompatActivity {
    static int id = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_screen);

        final LinearLayout genericUserRegistration = findViewById(R.id.genericUserRegistration);
        final LinearLayout recruiterRegistration = findViewById(R.id.recruiterRegistration);
        final LinearLayout comapnyRegistration = findViewById(R.id.companyRegistration);

        genericUserRegistration.setVisibility(View.VISIBLE);
        id = 1;

        Button genericUserButton = findViewById(R.id.userButton);
        Button recruiterButton = findViewById(R.id.recruiterButton);
        Button companyButton = findViewById(R.id.companyButton);
        Button register = findViewById(R.id.registerButton);
        Button cancel = findViewById(R.id.registrationCancelButton);

        genericUserButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                genericUserRegistration.setVisibility(View.VISIBLE);
                recruiterRegistration.setVisibility(View.GONE);
                comapnyRegistration.setVisibility(View.GONE);
                id = 1;
            }
        });
        recruiterButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                genericUserRegistration.setVisibility(View.GONE);
                recruiterRegistration.setVisibility(View.VISIBLE);
                comapnyRegistration.setVisibility(View.GONE);
                id = 2;
            }
        });
        companyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                genericUserRegistration.setVisibility(View.GONE);
                recruiterRegistration.setVisibility(View.GONE);
                comapnyRegistration.setVisibility(View.VISIBLE);
                id = 3;
            }
        });

        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch(id) {
                    case 1:

                        break;
                    case 2:

                        break;
                    case 3:

                        break;
                    default:
                        startActivity(new Intent(getBaseContext(), LoginScreenActivity.class));
                }
            }
        });

        cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getBaseContext(), LoginScreenActivity.class));
            }
        });
    }
}
