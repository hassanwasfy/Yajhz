package com.abaferas.yajhz.ui.screens.home

import android.util.Log
import androidx.lifecycle.viewModelScope
import com.abaferas.yajhz.data.repository.IRepository
import com.abaferas.yajhz.data.repository.YajhzException
import com.abaferas.yajhz.data.service.TokenProvider
import com.abaferas.yajhz.ui.base.BaseViewModel
import com.abaferas.yajhz.ui.base.ErrorUiState
import com.abaferas.yajhz.ui.mappers.toUiState
import com.abaferas.yajhz.ui.mappers.toUiStateModel
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.async
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class ScreenHomeViewModel @Inject constructor(
    private val iRepository: IRepository,
    private val tokenProvider: TokenProvider
) : BaseViewModel<HomeUiState, HomeScreenUiEffect>(HomeUiState()), HomeScreenInteraction {

    init {
        getData()
    }

    override fun getData() {
        try {

            viewModelScope.launch {
                Log.i("X-Test",iRepository.getHomePopularSeller().data.toString())
            }

            /*viewModelScope.launch {
                val cats = async {
                    iRepository.getHomeBaseCategory()
                }.await()
                val pops = async {
                    iRepository.getHomePopularSeller()
                }.await()
                Log.w("X-TEST", "getHomePopularSeller: $pops")
                val tren = async {
                    iRepository.getHomeTrendingSeller()
                }.await()
                Log.w("X-TEST", "getHomeTrendingSeller: $tren")
            }*/
            /*viewModelScope.launch(Dispatchers.IO) {
                val categories = async { iRepository.getHomeBaseCategory() }
                val popularSeller = async { iRepository.getHomePopularSeller() }
                val trending = async { iRepository.getHomeTrendingSeller() }

                iState.update {
                    it.copy(
                        isLoading = false,
                        error = ErrorUiState(),
                        name = tokenProvider.getName(),
                        address = tokenProvider.getAddress(),
                        categoriesList = categories.await().toUiStateModel(),
                        popularList = popularSeller.await().toUiStateModel(),
                        trendingList = trending.await().toUiStateModel()
                    )
                }
            }*/
        }catch (e: YajhzException){
            onError(e.msg)
        }
    }

    private fun onError(msg: String){
        iState.update {
            it.copy(
                error = ErrorUiState(true,msg)
            )
        }
    }

    override fun onClickBack() {

    }

    override fun onSearchValueChange(newValue: String) {
        iState.update {
            it.copy(
                searchValue = newValue
            )
        }
    }

    override fun onClickSearch() {

    }

    override fun onClickFilter() {

    }

    override fun onClickCategory() {

    }

    override fun onClickPopular() {

    }

    override fun onClickTrending() {

    }
}