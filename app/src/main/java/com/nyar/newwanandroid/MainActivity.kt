package com.nyar.newwanandroid

import android.os.Bundle
import androidx.fragment.app.Fragment
import com.nyar.newwanandroid.base.BaseActivity
import com.nyar.newwanandroid.base.IBasePresenter
import kotlinx.android.synthetic.main.activity_main.*

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
        initBottom()
    }


    private fun initFragment() {


    }

    private fun initBottom() {
        bn_main.setOnNavigationItemSelectedListener{
            when(it.itemId){
//                R.id.menu_home->
            }
        }
    }


    override fun onError(e: String) {
    }
}