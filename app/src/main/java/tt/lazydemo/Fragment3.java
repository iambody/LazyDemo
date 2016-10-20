package tt.lazydemo;

import android.util.Log;
import android.view.View;

/**
 * Created by datutu on 2016/10/20.
 */

public class Fragment3 extends BaseLazyFragment {
    @Override
    protected void onFirstUserVisible() {
        Log.i("f", "第三个===>onFirstUserVisible");
    }

    @Override
    protected void onUserVisible() {
        Log.i("f", "第三个===>onUserVisible");
    }

    @Override
    protected void DetoryViewAndThing() {
        Log.i("f", "第三个===>DetoryViewAndThing");
    }

    @Override
    protected void onUserInvisible() {
        Log.i("f", "第三个===>onUserInvisible");
    }

    @Override
    protected int getContentViewLayoutID() {
        return R.layout.ccc;
    }

    @Override
    protected void initViewsAndEvents(View view) {
        Log.i("f", "第三个===>initViewsAndEvents");
    }
}
