package toong.vn.androidbottomnavigationview.screen.main.home;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import toong.vn.androidbottomnavigationview.R;

public class SettingFragment extends Fragment {
    public static final String TAG = "SettingFragment";

    public static SettingFragment newInstance() {
         Bundle args = new Bundle();
         SettingFragment fragment = new SettingFragment();
        fragment.setArguments(args);
        return fragment;
    }
    
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
            @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_setting, container, false);
        return view;
    }
}
