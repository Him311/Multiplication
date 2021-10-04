package exportkit.xd;

import android.content.Context;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class result_activity extends AppCompatActivity implements View.OnClickListener{
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.result);
		TextView resultLabel = (TextView) findViewById(R.id.resultLabel);
		TextView totalScoreLabel = (TextView) findViewById(R.id.totalScoreLabel);
		Button button1 = findViewById(R.id.try_again1);
		button1.setOnClickListener(this);
		ImageButton imageButton1 = findViewById(R.id.imageButton1);
		imageButton1.setOnClickListener(this);
		int score = getIntent().getIntExtra("RIGHT_ANSWER_COUNT",0);
		resultLabel.setText(score + " / 5");
		totalScoreLabel.setText("Total Score : " + score);

	}
	public void onClick(View v){
		switch(v.getId()){
			case R.id.button1: {
				Intent i = new Intent(result_activity.this,mc_quiz_activity.class);
				startActivity(i);
				break;
			}
			case R.id.imageButton1: {
				Intent i = new Intent(result_activity.this, contents_activity.class);
				startActivity(i);
				break;
			}
		}
	}
}