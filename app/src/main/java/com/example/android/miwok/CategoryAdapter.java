package com.example.android.miwok;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;

/**
 * Created by Hesham on 9/16/2017.
 */

public class CategoryAdapter extends android.support.v4.app.FragmentPagerAdapter{

    private Context mContext;

    public CategoryAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;

    }

    @Override
    public Fragment getItem(int position) {
        if(position == 0) {
            return new NumbersFragment();
        }else if(position == 1) {
            return new ColorsFragment();
        }else if(position == 2){
            return new FamilyFragment();
        }else {
            return new PhrasesFragment();
        }
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if(position == 0) {
            return mContext.getString(R.string.category_numbers);
        }else if(position == 1) {
            return mContext.getString(R.string.category_colors);
        }else if(position == 2){
            return mContext.getString(R.string.category_family);
        }else {
            return mContext.getString(R.string.category_phrases);
        }
    }
}
