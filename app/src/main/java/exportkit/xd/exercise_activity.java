package exportkit.xd;

import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class exercise_activity extends AppCompatActivity implements View.OnClickListener{

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.exercise);
		Button button1 = findViewById(R.id.button1);
		ImageButton imageButton1 = findViewById(R.id.imageButton1);
		imageButton1.setOnClickListener(this);
		ImageButton imageButton2 = findViewById(R.id.imageButton2);
		imageButton2.setOnClickListener(this);
		ImageButton imageButton3 = findViewById(R.id.imageButton3);
		imageButton3.setOnClickListener(this);
		TextView textView1 = findViewById(R.id.Ex1);
		TextView textView2 = findViewById(R.id.Ex2);
		TextView textView3 = findViewById(R.id.Ex3);
		TextView ans1 = findViewById(R.id.ans1);
		TextView ans2 = findViewById(R.id.ans2);
		TextView ans3 = findViewById(R.id.ans3);
		TextView check1 = findViewById(R.id.check1);
		TextView check2 = findViewById(R.id.check2);
		TextView check3 = findViewById(R.id.check3);

		Intent intent = getIntent();
		int n = intent.getIntExtra("number_key", 0);

		final Random myRandom = new Random();
		int q1 = myRandom.nextInt(10);
		int q2 = myRandom.nextInt(10);
		int q3 = myRandom.nextInt(10);
		textView1.setText(getString(R.string.ex, n, q1));
		textView2.setText(getString(R.string.ex, n, q2));
		textView3.setText(getString(R.string.ex, n, q3));

		button1.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v)
			{
				int a1 = Integer.parseInt(ans1.getText().toString());
				int a2 = Integer.parseInt(ans2.getText().toString());
				int a3 = Integer.parseInt(ans3.getText().toString());

				if(a1 == n*q1){
					check1.setText("Correct!");
				}
				else{
					check1.setText(getString(R.string.ans,n*q1));
				}
				if(a2 == n*q2){
					check2.setText("Correct!");
				}
				else{
					check2.setText(getString(R.string.ans,n*q2));
				}
				if(a3 == n*q3){
					check1.setText("Correct!");
				}
				else{
					check1.setText(getString(R.string.ans,n*q3));
				}
			}
		});
	}
	public void onClick(View v){
		switch(v.getId()){
			case R.id.imageButton1: {
				Intent i = new Intent(exercise_activity.this, contents_activity.class);
				startActivity(i);
				break;
			}
			case R.id.imageButton2: {
				Intent i = new Intent(exercise_activity.this, learn_activity.class);
				startActivity(i);
				break;
			}
			case R.id.imageButton3: {
				Intent i = new Intent(exercise_activity.this, times_table_activity.class);
				startActivity(i);
				break;
			}
		}
	}
}