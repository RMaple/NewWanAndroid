package com.nyar.newwanandroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment

class MainActivity : BaseActivity<IBasePresenter>() {

    private val fragmentList by lazy { mutableListOf<Fragment>() }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun createPresenter(): IBasePresenter? {
        return null
    }

    override fun getLayoutId(): Int {
        return R.layout.activity_main
    }

    override fun init() {
        initFragment()
    }

    private fun initFragment() {


    }

    override fun onError(e: String) {
        TODO("Not yet implemented")
    }
}