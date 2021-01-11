package ac.id.atmaluhur.mhs.EMLStore;


import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;


import androidx.appcompat.app.AppCompatActivity;


public class ProfileActivity extends AppCompatActivity {

    private Button mBtn_logout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.profile_activity);

        mBtn_logout = (Button)findViewById(R.id.button_logout);

        mBtn_logout.setOnClickListener(v -> {
            Intent iLogin = new Intent(getApplicationContext(), MainActivity.class);
            startActivity(iLogin);
        });
    }
}