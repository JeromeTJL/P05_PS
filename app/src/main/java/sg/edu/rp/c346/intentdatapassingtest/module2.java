package sg.edu.rp.c346.intentdatapassingtest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class module2 extends AppCompatActivity {

    TextView module2details;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_module2);

        module2details = findViewById(R.id.module2details);
        module2details.setText("Module Code: C349 \nModule Name: iPad Programming \nAcademic Year: 2019 \nSemester: 1 \nModule Credit: 4 \nVenue: W65Q");
    }
}
