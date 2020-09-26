package cr.ac.ucr.juegarte;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private Button btn_profile;
    private Button btn_games;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_profile = findViewById(R.id.btn_profile);
        btn_games = findViewById(R.id.btn_games);

    }

    @Override
    public void onClick(View view) {
        if (btn_games.isPressed()){
            Intent intent = new Intent(this, TrueOrFalse.class);
            startActivity(intent);
        }
    }
}