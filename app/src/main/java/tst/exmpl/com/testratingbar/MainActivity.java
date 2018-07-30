package tst.exmpl.com.testratingbar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.RatingBar;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final RatingBar bar = (RatingBar) findViewById(R.id.ratingBar);

        bar.setRating(2);
        bar.setIsIndicator(true);


    }
}
