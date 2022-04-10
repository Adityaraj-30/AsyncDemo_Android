package in.codingtimes.asyncdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView myTextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myTextView = (TextView) findViewById(R.id.myTextView);

    }
    public void buttonClick(View view){
        int i =0;
        while(i<=20){
            try {
                Thread.sleep(1000);
                i++;
            }
            catch (Exception e) {

            }
        }
        myTextView.setText("Button Pressed");
    }
}