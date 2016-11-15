package aiidziis.clanmanager;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import aiidziis.clanmanager.fragment.HomeFragment;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        getSupportFragmentManager()
                .beginTransaction()
                .replace(android.R.id.content, new HomeFragment())
                .commit();
    }
}
