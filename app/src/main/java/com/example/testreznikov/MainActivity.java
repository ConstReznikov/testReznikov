package com.example.testreznikov;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
        Button answer1, answer2, answer3, answer4;
        TextView score, questions;
        private Questions nQuestions = new Questions();
        private String nAnswer;
        private int nScore = 0;
        private int nQuestionLength = nQuestions.nQuestions.length;

        Random r;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        r = new Random();

        answer1 = (Button) findViewById(R.id.answer1);
        answer2 = (Button) findViewById(R.id.answer2);
        answer3 = (Button) findViewById(R.id.answer3);
        answer4 = (Button) findViewById(R.id.answer4);
        score = (TextView) findViewById(R.id.score);
        questions = (TextView) findViewById(R.id.question);

        score.setText("Score: " + nScore);

        updateQuestion(r.nextInt(nQuestionLength));

        answer1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                if(answer1.getText() == nAnswer){
                    nScore++;
                    score.setText("Score: " + nScore);
                    updateQuestion(r.nextInt(nQuestionLength));
                }
                else{
                    GameOver();
                }
            }
        });
        answer2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                if(answer2.getText() == nAnswer){
                    nScore++;
                    score.setText("Score: " + nScore);
                    updateQuestion(r.nextInt(nQuestionLength));
                }
                else{
                    GameOver();
                }
            }
        });
        answer3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                if(answer3.getText() == nAnswer){
                    nScore++;
                    score.setText("Score: " + nScore);
                    updateQuestion(r.nextInt(nQuestionLength));
                }
                else{
                    GameOver();
                }
            }
        });
        answer4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                if(answer4.getText() == nAnswer){
                    nScore++;
                    score.setText("Score: " + nScore);
                    updateQuestion(r.nextInt(nQuestionLength));
                }
                else{
                    GameOver();
                }
            }
        });
    }
    private void updateQuestion(int num){
        questions.setText(nQuestions.getQuestion(num));
        answer1.setText(nQuestions.getChoice1(num));
        answer2.setText(nQuestions.getChoice2(num));
        answer3.setText(nQuestions.getChoice3(num));
        answer4.setText(nQuestions.getChoice4(num));
        nAnswer = nQuestions.getCorrectAnswer(num);
    }
    private void GameOver(){
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(MainActivity.this);
        alertDialogBuilder
                .setMessage("Ты проиграл, gg ez, набрал всего лишь: " + nScore +" фрагов")
                .setCancelable(false)
                .setPositiveButton("Заново", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        startActivity(new Intent(getApplicationContext(), MainActivity.class));
                        finish();
                    }
                })
                .setNegativeButton("Покинуть", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) { finish();
                            }
                        });
                AlertDialog alertDialog = alertDialogBuilder.create();
                alertDialog.show();
    }
}