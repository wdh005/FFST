package com.example.ffst;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;
import com.example.ffst.Fragment.CameraFragment;
import com.example.ffst.Fragment.ChatFragment;
import com.example.ffst.Fragment.HomeFragment;
import com.example.ffst.Fragment.MyFragment;
import com.example.ffst.Fragment.NoteFragment;

public class ContentPagerAdapter extends FragmentStatePagerAdapter {
    private int mPageCount;

    public ContentPagerAdapter(FragmentManager fm, int pageCount) {

        super(fm);

        this.mPageCount = pageCount;

    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                HomeFragment homeFragment = new HomeFragment();
                return homeFragment;

            case 1:
                NoteFragment noteFragment = new NoteFragment();
                return noteFragment;

            case 2:
                CameraFragment cameraFragment = new CameraFragment();
                return cameraFragment;

            case 3:
                ChatFragment chatFragment = new ChatFragment();
                return chatFragment;

            case 4:
                MyFragment myFragment = new MyFragment();
                return myFragment;
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return mPageCount;
    }
}
