package com.example.bookmart;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class home extends AppCompatActivity {

    private BottomNavigationView bottomNavigation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        bottomNavigation = findViewById(R.id.bottomNavigation);
        bottomNavigation.setOnItemSelectedListener(item -> {
            Fragment selectedFragment = null;

            if (item.getItemId() == R.id.navigation_home) {
                selectedFragment = new HomeFragment(); // Replace with your actual HomeFragment
            } else if (item.getItemId() == R.id.navigation_explore) {
                selectedFragment = new explore(); // Replace with your actual ExploreFragment
            } else if (item.getItemId() == R.id.navigation_cart) {
                selectedFragment = new cart(); // Replace with your actual CartFragment
            } else if (item.getItemId() == R.id.navigation_setting) {
                selectedFragment = new setting(); // Replace with your actual SettingFragment
            }

            loadFragment(selectedFragment);
            return true;
        });

        // Set the default selected item
        bottomNavigation.setSelectedItemId(R.id.navigation_home);
    }

    private void loadFragment(Fragment fragment) {
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.fragment_container, fragment)
                .commit();
    }
}