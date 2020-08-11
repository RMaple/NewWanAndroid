package com.nyar.newwanandroid.base

import android.os.Bundle
import androidx.fragment.app.Fragment
import com.nyar.newwanandroid.IBasePresenter
import com.nyar.newwanandroid.IBaseView

abstract class BaseFragment<P : IBasePresenter> : Fragment(), IBaseView {

    protected var mPresenter: P? = null;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mPresenter = createPresenter()
        mPresenter?.let {
            mPresenter?.attachView(this)
        }
    }

    protected abstract fun createPresenter(): P?
    protected abstract fun init(savedInstanceState: Bundle?)
    protected abstract fun getLayoutId():Int

    override fun onError(e: String) {

    }

    override fun onDestroy() {
        super.onDestroy()
        mPresenter?.detachView()
    }

}