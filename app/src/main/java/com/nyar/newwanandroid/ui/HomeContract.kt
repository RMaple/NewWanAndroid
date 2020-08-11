package com.nyar.newwanandroid.ui

import com.nyar.newwanandroid.BannerBean
import com.nyar.newwanandroid.base.IBasePresenter
import com.nyar.newwanandroid.base.IBaseView

class HomeContract {
    interface IView : IBaseView {
        fun setBannerData(list: MutableList<BannerBean>)
        fun setTopArticleData(list: MutableList<ArticleBean>)
        fun setArticleData(list: MutableList<ArticleBean>)
        fun collectSuccess()
        fun unCollectSuccess()
    }

    interface IPresenter : IBasePresenter {
        fun getBannerData()
        fun getTopArticleData()
        fun getArticleData()
        fun collect(id: Int)
        fun unCollect(id: Int)
    }
}