package com.nyar.newwanandroid

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

abstract class BaseActivity<P : IBasePresenter> : AppCompatActivity(), IBaseView {

    protected var mPresenter: P? = null;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mPresenter = createPresenter()
        mPresenter?.let {
            mPresenter?.attachView(this)
        }
        val layoutId = getLayoutId()
        if (layoutId != 0) {
            setContentView(layoutId)
        }
        init()
    }

    protected abstract fun createPresenter(): P?
    protected abstract fun getLayoutId(): Int
    protected abstract fun init()


    override fun onDestroy() {
        super.onDestroy()
        mPresenter?.detachView()
    }
}
