package android.test.base;

import android.os.Bundle;
import android.view.View;

import com.android.commonlib.base.TitleBarFragment;
import com.android.commonlib.utils.ResUtils;

/**
 * Created by yong.liao on 2018/5/24 0024.
 */

public class FindFragment extends TitleBarFragment {
    public static final String KEY_TAG = "FindFragment";

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_find);
    }

    @Override
    public void initView() {
        super.initView();
        getSupportTitleBar().setTitle(ResUtils.getString(R.string.main_tab_find));
        getSupportTitleBar().setMenuButton("确定", new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        getSupportTitleBar().setBackButton("取消", new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
}
