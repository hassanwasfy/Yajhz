package com.abaferas.yajhz.data.repository

sealed class YajhzException(val msg: String): Exception(){
    data object NullData: YajhzException("Null Data Error!")
    data object Failure: YajhzException("Request Failed!")
    data object NotAuthorized: YajhzException("Not Authorized!")
    data object UnknownError: YajhzException("Un-known Error!")
    data object UnknownHostException: YajhzException("Un-known Host Exception!")
    data object SocketTimeoutException: YajhzException("Socket Exception!")



}