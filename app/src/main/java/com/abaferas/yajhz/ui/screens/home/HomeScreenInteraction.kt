package com.abaferas.yajhz.ui.screens.home

interface HomeScreenInteraction {
    fun onClickBack()
    fun onSearchValueChange(newValue: String)
    fun onClickSearch()
    fun onClickFilter()
    fun onClickCategory()
    fun onClickPopular()
    fun onClickTrending()

}