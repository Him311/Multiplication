
package exportkit.xd;

import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

	public class main_activity extends AppCompatActivity implements View.OnClickListener{

		@Override
		protected void onCreate(Bundle savedInstanceState) {
			super.onCreate(savedInstanceState);
			setContentView(R.layout.main);
			Button button1 = findViewById(R.id.button1);
			button1.setOnClickListener(this);
		}
		public void onClick(View v){
			switch(v.getId()){
				case R.id.button1: {
					Intent i = new Intent(main_activity.this,contents_activity.class);
					startActivity(i);
					break;
				}
			}
		}
	}

	
	