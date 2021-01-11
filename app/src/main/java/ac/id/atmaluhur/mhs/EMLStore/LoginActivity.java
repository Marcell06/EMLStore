package ac.id.atmaluhur.mhs.EMLStore;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;


public class LoginActivity extends AppCompatActivity {

    private Button mBtn_profile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_activity);

        mBtn_profile = (Button)findViewById(R.id.button_profile);

        mBtn_profile.setOnClickListener(v -> {
            Intent iLogin = new Intent(getApplicationContext(), ProfileActivity.class);
            startActivity(iLogin);
        });
    }
}