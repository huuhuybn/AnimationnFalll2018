package vn.edu.poly.animationnfalll2018;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button btnProperty;
    private Button btnView;
    private Button btnDrawable;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
        initActions();
    }


    public void initActions() {
        btnDrawable.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                openNewActivity(DrawableActivity.class);

            }
        });
        btnProperty.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                openNewActivity(PropertyActivity.class);

            }
        });
        btnView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                openNewActivity(ViewActivity.class);

            }
        });

    }

    public void openNewActivity(Class target) {
        Intent intent = new Intent(this, target);
        startActivity(intent);
    }

    public void initViews() {

        btnProperty = findViewById(R.id.btnProperty);
        btnView = findViewById(R.id.btnView);
        btnDrawable = findViewById(R.id.btnDrawable);

    }
}
