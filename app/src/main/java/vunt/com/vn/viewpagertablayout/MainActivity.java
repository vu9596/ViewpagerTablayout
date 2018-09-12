package vunt.com.vn.viewpagertablayout;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ViewPager viewPager = findViewById(R.id.pager);
        TabLayout tabLayout = findViewById(R.id.tab_layout);
        tabLayout.setupWithViewPager(viewPager);
        initViewPager(viewPager, tabLayout);
    }

    private void initViewPager(ViewPager viewPager, TabLayout tabLayout) {
        MainPagerAdapter pagerAdapter = new MainPagerAdapter(getSupportFragmentManager());
        pagerAdapter.addFragment(new SampleFragment(), getString(R.string.tittle_tab_1));
        pagerAdapter.addFragment(new SampleFragment(), getString(R.string.title_tab_2));
        pagerAdapter.addFragment(new SampleFragment(), getString(R.string.title_tab_3));
        pagerAdapter.addFragment(new SampleFragment(), getString(R.string.title_tab_4));
        pagerAdapter.addFragment(new SampleFragment(), getString(R.string.title_tab_5));
        pagerAdapter.addFragment(new SampleFragment(), getString(R.string.title_tab_6));
        viewPager.setAdapter(pagerAdapter);
        setupTabIcon(tabLayout);
    }

    private void setupTabIcon(TabLayout tabLayout) {
        for (int i = 0; i < tabLayout.getTabCount(); i++) {
            tabLayout.getTabAt(i).setIcon(R.drawable.ic_tab_spider);
        }
    }
}

