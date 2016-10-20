package tt.lazydemo;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    ViewPager vp;
    private List<BaseLazyFragment> Frals = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        vp = (ViewPager) findViewById(R.id.vp);
        Frals.add(new Fragment1());
        Frals.add(new Fragment2());
        Frals.add(new Fragment3());
        vp.setAdapter(new MyPage(getSupportFragmentManager()));

    }

    private class MyPage extends FragmentPagerAdapter {

        public MyPage(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            return Frals.get(position);
        }

        @Override
        public int getCount() {
            return 3;
        }
    }

}
