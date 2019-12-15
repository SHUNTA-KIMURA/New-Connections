package android.lifeistech.com.newconnections;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.FrameLayout;
import android.widget.ListView;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    BottomNavigationView bottomNavigationView;
    FrameLayout frameLayout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bottomNavigationView=(BottomNavigationView)findViewById(R.id.bottomNavigationView);
        bottomNavigationView.setSelectedItemId(R.id.item2);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.item1:
                        getSupportFragmentManager().beginTransaction()
                                .replace(R.id.frameLayout,new BlankFragment())
                                .commit();
                        return true;
                    case R.id.item2:
                        getSupportFragmentManager().beginTransaction()
                                .replace(R.id.frameLayout,new BlankFragment2())
                                .commit();
                        return true;
                    case R.id.item3:
                        getSupportFragmentManager().beginTransaction()
                                .replace(R.id.frameLayout,new BlankFragment3())
                                .commit();
                        return true;
                }
                return false;
            }
        });
    }
}
