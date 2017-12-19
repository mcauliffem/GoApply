package matt.mcauliffe.goapply.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import matt.mcauliffe.goapply.R;

public class OpenScreenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_open_screen);

        Button next = findViewById(R.id.continueToLoginButton);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent nextScreen = new Intent(getBaseContext(), LoginScreenActivity.class);
                startActivity(nextScreen);
            }
        });
    }
}
