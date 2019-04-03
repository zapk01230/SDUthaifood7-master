package sdu.cs.sirichai.sduthaifood;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageButton imageButton;
    //
    int[] ints = new int[]{R.drawable.logo_01, R.drawable.logo_02, R.drawable.logo_03,
            R.drawable.logo_04, R.drawable.logo_05, R.drawable.logo_06, R.drawable.logo_07,
            R.drawable.logo_08, R.drawable.logo_09};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         imageButton = findViewById(R.id.imb1);

         imageButton.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 Intent inbIntent = new Intent(MainActivity.this, Detail.class);



             }
         });





    }
}
