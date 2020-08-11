package com.nyar.newwanandroid

interface IBasePresenter {
    fun attachView(view:IBaseView)

    fun detachView()
}