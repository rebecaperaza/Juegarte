package cr.ac.ucr.juegarte;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class QuestionsActivity extends AppCompatActivity implements View.OnClickListener{

    private TextView tvQuestion;
    private int ids_btn[] = {
            R.id.btn_answer_1, R.id.btn_answer_2, R.id.btn_answer_3, R.id.btn_answer_4,
    };

    private Answers answer;
    private Questions question;
    private int random;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questionary);

        answer = new Answers();
        question = new Questions();

        random = new Random().nextInt((3 - 0) + 1) + 0;

        tvQuestion = findViewById(R.id.tv_question);
        tvQuestion.setText(question.getQuestion(random));

        for (int i = 0; i < ids_btn.length; i++){
            Button btn = findViewById(ids_btn[i]);
            btn.setText(answer.getAnswer(random, i));
        }
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btn_answer_1:
                checkAnswer(answer.getAnswer(random, 0));
                break;
            case R.id.btn_answer_2:
                checkAnswer(answer.getAnswer(random, 1));
                break;
            case R.id.btn_answer_3:
                checkAnswer(answer.getAnswer(random, 2));
                break;
            case R.id.btn_answer_4:
                checkAnswer(answer.getAnswer(random, 3));
                break;
        }
    }

    public void checkAnswer(String answer){
        String[] CorrectAnswer = getResources().getStringArray(R.array.answers);
        if(CorrectAnswer[random].equalsIgnoreCase(answer)){
            Toast.makeText(this, "Correcto", Toast.LENGTH_SHORT).show();
        } else{
            Toast.makeText(this, "Incorrecto", Toast.LENGTH_SHORT).show();
        }
    }
}

