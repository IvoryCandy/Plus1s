package plus1s.app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button bLogout = (Button)findViewById(R.id.main_logout);
    protected boolean loginStatus = false;
    protected void onCreate(Bundle savedInstanceState) {

        if (!loginStatus) {
            Intent loginIntent = new Intent(MainActivity.this, LoginActivity.class);
            MainActivity.this.startActivity(loginIntent);
        }
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
}
