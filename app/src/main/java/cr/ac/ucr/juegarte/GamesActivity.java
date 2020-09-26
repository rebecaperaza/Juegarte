package cr.ac.ucr.juegarte;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class GamesActivity extends AppCompatActivity implements View.OnClickListener{

    private Button btn_true_false;
    private Button btn_questinary;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_games);

        btn_true_false = findViewById(R.id.btn_true_false);
        btn_questinary = findViewById(R.id.btn_questionary);
    }


    @Override
    public void onClick(View view) {
        if (btn_questinary.isPressed()){
            Intent intent = new Intent(this, QuestionsActivity.class);
            startActivity(intent);
        } if (btn_true_false.isPressed()){
            Intent intent = new Intent(this, TrueOrFalse.class);
            startActivity(intent);
        }
    }
}