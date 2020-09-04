package cr.ac.ucr.juegarte;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class TrueOrFalse extends AppCompatActivity implements View.OnClickListener {

    TextView pregunta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_true_or_false);

        pregunta = findViewById(R.id.question);

        String[] questions = getResources().getStringArray(R.array.questions);
        String q1 = questions[0];
        String[] parts = q1.split(";");
        pregunta.setText(parts[0]);

    }

    @Override
    public void onClick(View view) {

    }
}