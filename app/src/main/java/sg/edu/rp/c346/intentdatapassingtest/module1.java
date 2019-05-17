package sg.edu.rp.c346.intentdatapassingtest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class module1 extends AppCompatActivity {

    TextView module1details;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_module1);

        module1details = findViewById(R.id.module1details);
        module1details.setText("Module Code: C346 \nModule Name: Android Programming \nAcademic Year: 2019 \nSemester: 1 \nModule Credit: 4 \nVenue: W65Q");
    }
}
