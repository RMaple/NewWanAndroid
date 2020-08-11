package com.nyar.newwanandroid.base

interface IBasePresenter {
    fun attachView(view: IBaseView)

    fun detachView()
}