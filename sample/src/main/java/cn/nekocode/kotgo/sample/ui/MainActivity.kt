package cn.nekocode.kotgo.sample.ui

import android.os.Bundle
import cn.nekocode.kotgo.component.ui.KtFragmentActivity
import cn.nekocode.kotgo.sample.ui.main.MainFragment

/**
 * @author nekocode (nekocode.cn@gmail.com)
 */
class MainActivity : KtFragmentActivity() {
    override fun onCreatePresenter(presenterFactory: PresenterFactory) {
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        window.setBackgroundDrawable(null)

        if (savedInstanceState == null)
            push(MainFragment::class.java.canonicalName, MainFragment::class.java)
    }
}
