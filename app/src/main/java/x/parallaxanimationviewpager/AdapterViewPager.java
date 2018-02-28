package x.parallaxanimationviewpager;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

/**
 * Created by franky.wijanarko on 27/02/18.
 */

public class AdapterViewPager extends FragmentStatePagerAdapter{

    public AdapterViewPager(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0: return Fragment1.newInstance(new Bundle());
            case 1: return Fragment2.newInstance(new Bundle());
            default: return null;
        }
    }

    @Override
    public int getCount() {
        return 2;
    }
}
