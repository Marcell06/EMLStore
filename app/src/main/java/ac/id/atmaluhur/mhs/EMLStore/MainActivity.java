package ac.id.atmaluhur.mhs.EMLStore;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.content.Intent;


public class MainActivity extends AppCompatActivity {

    private Button mBtn_login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_activity);

        mBtn_login = (Button)findViewById(R.id.button_login);

        mBtn_login.setOnClickListener(v -> {
            Intent iLogin = new Intent(getApplicationContext(), LoginActivity.class);
            startActivity(iLogin);
        });
    }
}