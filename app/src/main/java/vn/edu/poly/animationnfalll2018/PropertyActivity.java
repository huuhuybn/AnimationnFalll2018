package vn.edu.poly.animationnfalll2018;

import android.animation.ObjectAnimator;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

/**
 * An example full-screen activity that shows and hides the system UI (i.e.
 * status bar and navigation/system bar) with user interaction.
 */
public class PropertyActivity extends AppCompatActivity {


    private ImageView imgIcon;
    private Button btnRotation;
    private Button btnX;
    private Button btnScale;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_property);


        imgIcon = findViewById(R.id.imgIcon);
        btnRotation = findViewById(R.id.btnRotation);
        btnX = findViewById(R.id.btnX);
        btnScale = findViewById(R.id.btnScale);


        btnRotation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Animation Property here!!!

                ObjectAnimator objectAnimator = ObjectAnimator.ofFloat
                        (imgIcon, "rotation", 0, 90f);
                objectAnimator.setDuration(2000);
                objectAnimator.setRepeatCount(5);
                objectAnimator.start();
            }
        });

        btnScale.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                ObjectAnimator objectAnimator = ObjectAnimator.ofFloat
                        (imgIcon, "scaleX", 0, 5f);
                objectAnimator.setDuration(2000);
                objectAnimator.setRepeatCount(5);
                objectAnimator.start();

                ObjectAnimator objectAnimator_ = ObjectAnimator.ofFloat
                        (imgIcon, "scaleY", 0, 5f);
                objectAnimator_.setDuration(2000);
                objectAnimator_.setRepeatCount(5);
                objectAnimator_.start();
            }
        });

        btnX.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                ObjectAnimator objectAnimator = ObjectAnimator.ofFloat
                        (imgIcon, "X", 0, 90f);
                objectAnimator.setDuration(2000);
                objectAnimator.setRepeatCount(5);
                objectAnimator.start();
            }
        });


    }


}
