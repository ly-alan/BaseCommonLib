package android.test.base;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentTransaction;
import android.view.View;
import android.widget.TextView;

import com.android.commonlib.base.BaseActivity;
import com.android.commonlib.utils.ActionUtils;

public class MainActivity extends BaseActivity implements View.OnClickListener {
    private static final String KEY_TAG = "MainActivity";

    /**
     * 页面位置
     */
    public static final String KEY_TAB_INDEX = "TAB_INDEX";
    /**
     * tab首页
     */
    public static final int TAB_MAIN_HOME = 0;
    /**
     * tab发现
     */
    public static final int TAB_MAIN_FIND = 1;
    /**
     * tab店铺
     */
    public static final int TAB_MAIN_SHOP = 2;
    /**
     * tab我的
     */
    public static final int TAB_MAIN_USER = 3;
    /**
     * 首页
     */
    private TextView mTabHome;
    /**
     * 发现
     */
    private TextView mTabFind;
    /**
     * 店铺
     */
    private TextView mTabShop;
    /**
     * 我的
     */
    private TextView mTabUser;
    /**
     * 4个tab页
     */
    private HomeFragment mHomeFragment;
    private FindFragment mFindFragment;
    private ShopFragment mShopFragment;
    private UserFragment mUserFragment;
    /**
     * 当前界面
     */
    private int mCurrentTab = TAB_MAIN_HOME;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (savedInstanceState != null) {
            mCurrentTab = savedInstanceState.getInt(KEY_TAB_INDEX, 0);
        }
        if (getIntent() != null) {
            mCurrentTab = getIntent().getIntExtra(KEY_TAB_INDEX, 0);
        }
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt(KEY_TAB_INDEX, mCurrentTab);
    }

    @Override
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        if (intent != null) {
            mCurrentTab = intent.getIntExtra(KEY_TAB_INDEX, TAB_MAIN_HOME);
            showFragment(mCurrentTab);
        }
    }

    @Override
    public void initView() {
        super.initView();
        mTabHome = (TextView) findViewById(R.id.tv_main_tab_home);
        mTabFind = (TextView) findViewById(R.id.tv_main_tab_find);
        mTabShop = (TextView) findViewById(R.id.tv_main_tab_shop);
        mTabUser = (TextView) findViewById(R.id.tv_main_tab_user);
    }

    @Override
    public void setListener() {
        super.setListener();
        mTabHome.setOnClickListener(this);
        mTabFind.setOnClickListener(this);
        mTabShop.setOnClickListener(this);
        mTabUser.setOnClickListener(this);
    }

    @Override
    public void setView() {
        super.setView();
        showFragment(mCurrentTab);
    }

    @Override
    public void onClick(View v) {
        if (ActionUtils.isFastDoubleClick(200)) {
            return;
        }
        switch (v.getId()) {
            case R.id.tv_main_tab_home:
                if (TAB_MAIN_HOME != mCurrentTab) {
                    mCurrentTab = TAB_MAIN_HOME;
                    showFragment(TAB_MAIN_HOME);
                }
                break;
            case R.id.tv_main_tab_find:
                if (TAB_MAIN_FIND != mCurrentTab) {
                    mCurrentTab = TAB_MAIN_FIND;
                    showFragment(TAB_MAIN_FIND);
                }
                break;
            case R.id.tv_main_tab_shop:
                if (TAB_MAIN_SHOP != mCurrentTab) {
                    mCurrentTab = TAB_MAIN_SHOP;
                    showFragment(TAB_MAIN_SHOP);
                }
                break;
            case R.id.tv_main_tab_user:
                if (TAB_MAIN_USER != mCurrentTab) {
                    mCurrentTab = TAB_MAIN_USER;
                    showFragment(TAB_MAIN_USER);
                }
                break;
        }
    }

    /**
     * 切换界面
     *
     * @param tab
     */
    public void switchTabIndex(int tab) {
        mCurrentTab = TAB_MAIN_FIND;
        showFragment(tab);
    }


    /**
     * 切换tab
     *
     * @param tab int
     */
    private void showFragment(int tab) {
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        if (checkFragmentIsNull(TAB_MAIN_HOME)) {
            mHomeFragment = new HomeFragment();
            transaction.add(R.id.layout_main_content, mHomeFragment, HomeFragment.KEY_TAG);

        }
        if (checkFragmentIsNull(TAB_MAIN_FIND)) {
            mFindFragment = new FindFragment();
            transaction.add(R.id.layout_main_content, mFindFragment, FindFragment.KEY_TAG);
        }
        if (checkFragmentIsNull(TAB_MAIN_SHOP)) {
            mShopFragment = new ShopFragment();
            transaction.add(R.id.layout_main_content, mShopFragment, ShopFragment.KEY_TAG);

        }
        if (checkFragmentIsNull(TAB_MAIN_USER)) {
            mUserFragment = new UserFragment();
            transaction.add(R.id.layout_main_content, mUserFragment, UserFragment.KEY_TAG);
        }
        transaction.hide(mHomeFragment);
        transaction.hide(mFindFragment);
        transaction.hide(mShopFragment);
        transaction.hide(mUserFragment);
        mTabHome.setSelected(false);
        mTabFind.setSelected(false);
        mTabShop.setSelected(false);
        mTabUser.setSelected(false);
        switch (tab) {
            case TAB_MAIN_HOME:
                transaction.show(mHomeFragment);
                mTabHome.setSelected(true);
                break;
            case TAB_MAIN_FIND:
                transaction.show(mFindFragment);
                mTabFind.setSelected(true);
                break;
            case TAB_MAIN_SHOP:
                transaction.show(mShopFragment);
                mTabShop.setSelected(true);
                break;
            case TAB_MAIN_USER:
                transaction.show(mUserFragment);
                mTabUser.setSelected(true);
                break;
        }
        transaction.commitAllowingStateLoss();
    }

    /**
     * @param tab
     * @return fragment为空返回true，表示第一次添加。返回false，已经添加过
     */
    private boolean checkFragmentIsNull(int tab) {
        switch (tab) {
            case TAB_MAIN_HOME:
                if (mHomeFragment == null) {
                    mHomeFragment = (HomeFragment) getSupportFragmentManager().findFragmentByTag(HomeFragment.KEY_TAG);
                    if (mHomeFragment == null) {
                        return true;
                    }
                }
                break;
            case TAB_MAIN_FIND:
                if (mFindFragment == null) {
                    mFindFragment = (FindFragment) getSupportFragmentManager().findFragmentByTag(FindFragment.KEY_TAG);
                    if (mFindFragment == null) {
                        return true;
                    }
                }
                break;
            case TAB_MAIN_SHOP:
                if (mShopFragment == null) {
                    mShopFragment = (ShopFragment) getSupportFragmentManager().findFragmentByTag(ShopFragment.KEY_TAG);
                    if (mShopFragment == null) {
                        return true;
                    }
                }
                break;
            case TAB_MAIN_USER:
                if (mUserFragment == null) {
                    mUserFragment = (UserFragment) getSupportFragmentManager().findFragmentByTag(UserFragment.KEY_TAG);
                    if (mUserFragment == null) {
                        return true;
                    }
                }
                break;
        }
        return false;
    }

    @Override
    public String getTAG() {
        return KEY_TAG;
    }
}
