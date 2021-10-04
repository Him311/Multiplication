
package exportkit.xd;

import android.content.DialogInterface;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class mc_quiz_activity extends AppCompatActivity {

	private TextView countLabel;
	private TextView questionLabel;
	private Button answerBtn1;
	private Button answerBtn2;
	private Button answerBtn3;
	private Button answerBtn4;

	private String rightAnswer;
	private int rightAnswerCount = 0;
	private int quizCount = 1;
	static final private int QUIZ_COUNT = 5;

	ArrayList<ArrayList<String>> quizArray = new ArrayList<>();

	String quizData[][] = {
			{"5 X 7", "35", "28", "45", "32"},
			{"1 X 9", "9", "10", "19", "91"},
			{"3 X 8", "24", "27", "32", "21"},
			{"9 X 6", "54", "45", "48", "56"},
			{"4 X 2", "8", "6", "12", "24"},
			{"10 X 10", "100", "50", "11", "10"},
			{"8 X 7", "56", "64", "52", "49"},
			{"6 X 3", "18", "28", "12", "15"},
			{"2 X 1", "2", "1", "21", "12"},
			{"7 X 4", "28", "21", "26", "34"},
	};

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.mc_quiz);

		countLabel = (TextView)findViewById(R.id.countLabel);
		questionLabel = (TextView)findViewById(R.id.questionLabel);
		answerBtn1 = (Button)findViewById(R.id.answerBtn1);
		answerBtn2 = (Button)findViewById(R.id.answerBtn2);
		answerBtn3 = (Button)findViewById(R.id.answerBtn3);
		answerBtn4 = (Button)findViewById(R.id.answerBtn4);

		for(int i = 0; i< quizData.length; i++){
			ArrayList<String> tmpArray = new ArrayList<>();
			tmpArray.add(quizData[i][0]);
			tmpArray.add(quizData[i][1]);
			tmpArray.add(quizData[i][2]);
			tmpArray.add(quizData[i][3]);
			tmpArray.add(quizData[i][4]);

			quizArray.add(tmpArray);
		}
		showNextQuiz();
	}

	public void showNextQuiz(){

		countLabel.setText("MC Quiz " + quizCount);
		Random random = new Random();
		int randomNum = random.nextInt(quizArray.size());

		ArrayList<String> quiz = quizArray.get(randomNum);

		questionLabel.setText(quiz.get(0));
		rightAnswer = quiz.get(1);
		quiz.remove(0);
		Collections.shuffle(quiz);

		answerBtn1.setText(quiz.get(0));
		answerBtn2.setText(quiz.get(1));
		answerBtn3.setText(quiz.get(2));
		answerBtn4.setText(quiz.get(3));

		quizArray.remove(randomNum);
	}
	public void checkAnswer(View view) {

		Button answerBtn = (Button) findViewById(view.getId());
		String btnText = answerBtn.getText().toString();

		String alertTitle;

		if(btnText.equals(rightAnswer)){
			alertTitle = "Correct!";
			rightAnswerCount++;
		} else {
			alertTitle = "Wrong...";

		}
		AlertDialog.Builder  builder =new AlertDialog.Builder(this);
		builder.setTitle(alertTitle);
		builder.setMessage("Answer : " + rightAnswer);
		builder.setPositiveButton("OK", new DialogInterface.OnClickListener(){
			@Override
			public void onClick(DialogInterface dialogInterface, int i){
				if (quizCount == QUIZ_COUNT){
					Intent intent = new Intent(mc_quiz_activity.this,result_activity.class);
					intent.putExtra("RIGHT_ANSWER_COUNT", rightAnswerCount);
					startActivity(intent);
				} else {
					quizCount++;
					showNextQuiz();
				}
			}
		});
		builder.setCancelable(false);
		builder.show();
	}
}

	
	