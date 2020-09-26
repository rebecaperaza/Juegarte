package cr.ac.ucr.juegarte;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class TrueOrFalse extends AppCompatActivity implements View.OnClickListener {

    private TextView tv_question;
    private String correct_answer;
    private Button btn_false;
    private Button btn_true;
    private String[] all_questions;
    private String question;
    private String[] parts;
    private int num_question;
    public int puntos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_true_or_false);

        tv_question = findViewById(R.id.question);
        btn_false = findViewById(R.id.false_btn);
        btn_true = findViewById(R.id.true_btn);
        all_questions = getResources().getStringArray(R.array.questions);
        num_question = 0;
        puntos = 0;
        setQuestion();
    }

    @Override
    public void onClick(View view) {

        if (num_question < 5){

            correct_answer = parts[1];

            if (btn_true.isPressed()){
                if (correct_answer.equals("true")){
                    Toast.makeText(this, "CORRECTO", Toast.LENGTH_SHORT).show();
                    puntos = puntos + 5;
                } else {
                    Toast.makeText(this, "INCORRECTO", Toast.LENGTH_SHORT).show();
                }
            } if (btn_false.isPressed()){
                if (correct_answer.equals("false")){
                    Toast.makeText(this, "CORRECTO", Toast.LENGTH_SHORT).show();
                    puntos = puntos + 5;
                } else {
                    Toast.makeText(this, "INCORRECTO", Toast.LENGTH_SHORT).show();
                }
            }

            num_question ++;
            setQuestion();

        } else {
            tv_question.setText(String.valueOf(puntos));
        }
    }

    public void setQuestion(){
        question = all_questions[num_question];
        parts = question.split(";");
        tv_question.setText(parts[0]);
    }

    public void changeQuestion(){
        for (num_question=0; num_question < 5; num_question++){
            correct_answer = parts[1];
            setQuestion();
        }
    }

}