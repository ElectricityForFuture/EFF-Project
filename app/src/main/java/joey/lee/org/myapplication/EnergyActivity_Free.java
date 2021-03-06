package joey.lee.org.myapplication;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.EventListener;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.FirebaseFirestoreException;

public class EnergyActivity_Free extends AppCompatActivity {


    private Button btn_back;
    private Button btn_subscribe;
    private Button btn_trial;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_energy__free);

        btn_back = findViewById(R.id.btn_back);
        btn_subscribe = findViewById(R.id.btn_subscribe);
        btn_trial = findViewById(R.id.btn_trial);

        btn_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        btn_subscribe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(EnergyActivity_Free.this, Activity5_2.class);
                startActivity(intent);

            }
        });

        btn_trial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(EnergyActivity_Free.this, TrialActivity.class);
                startActivity(intent);
            }
        });

    }
}