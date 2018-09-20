package toong.vn.androidbottomnavigationview.screen.main;

import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import toong.vn.androidbottomnavigationview.R;
import toong.vn.androidbottomnavigationview.screen.main.home.HomeFragment;
import toong.vn.androidbottomnavigationview.screen.main.home.SearchFragment;
import toong.vn.androidbottomnavigationview.screen.main.home.SettingFragment;

public class MainActivity extends AppCompatActivity {

    private BottomNavigationView bottomNavigationView;
    private String lastShownFragmentTag;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bottomNavigationView = findViewById(R.id.bottom_navigation);
        bottomNavigationView.setOnNavigationItemSelectedListener(
                new BottomNavigationView.OnNavigationItemSelectedListener() {
                    @Override
                    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                        hideLastShownFragment();
                        switch (item.getItemId()) {
                            case R.id.menu_home:
                                goToHome();
                                break;
                            case R.id.menu_search:
                                goToSearch();
                                break;
                            case R.id.menu_setting:
                                goToSetting();
                                break;
                        }
                        return true;
                    }
                });
        goToHome();
    }

    private void showFragment(String tag) {
        Fragment targetFragment = getSupportFragmentManager().findFragmentByTag(tag);
        if (targetFragment != null) {
            getSupportFragmentManager().beginTransaction().show(targetFragment).commit();
        } else {
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.frame_main, createNewFragmentByTag(tag), tag)
                    .commit();
        }
        lastShownFragmentTag = tag;
    }

    private void hideLastShownFragment() {
        Fragment lastShowFragment =
                getSupportFragmentManager().findFragmentByTag(lastShownFragmentTag);
        getSupportFragmentManager().beginTransaction().show(lastShowFragment).commit();
    }

    private Fragment createNewFragmentByTag(String tag) {
        switch (tag) {
            case HomeFragment.TAG:
                return HomeFragment.newInstance();
            case SearchFragment.TAG:
                return SearchFragment.newInstance();
            case SettingFragment.TAG:
                return SettingFragment.newInstance();
        }
        return null;
    }

    private void goToHome() {
        showFragment(HomeFragment.TAG);
    }

    private void goToSearch() {
        showFragment(SearchFragment.TAG);
    }

    private void goToSetting() {
        showFragment(SettingFragment.TAG);
    }
}
