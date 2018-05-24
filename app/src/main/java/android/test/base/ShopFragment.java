package android.test.base;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.android.commonlib.base.LazyFragment;

/**
 * Created by yong.liao on 2018/5/24 0024.
 */

public class ShopFragment extends LazyFragment {
    public static final String KEY_TAG = "ShopFragment";

    @Override
    protected View setContentView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_shop,container,false);
    }

    @Override
    public void firstVisible() {

    }

}
