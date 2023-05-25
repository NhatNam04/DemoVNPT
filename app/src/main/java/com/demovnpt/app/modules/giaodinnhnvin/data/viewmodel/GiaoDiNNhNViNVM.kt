package com.demovnpt.app.modules.giaodinnhnvin.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.demovnpt.app.modules.giaodinnhnvin.`data`.model.GiaoDiNNhNViNModel
import com.demovnpt.app.modules.giaodinnhnvin.`data`.model.SpinnerThngCounterModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class GiaoDiNNhNViNVM : ViewModel(), KoinComponent {
  val giaoDiNNhNViNModel: MutableLiveData<GiaoDiNNhNViNModel> =
      MutableLiveData(GiaoDiNNhNViNModel())

  var navArguments: Bundle? = null

  val spinnerThngCounterList: MutableLiveData<MutableList<SpinnerThngCounterModel>> =
      MutableLiveData()
}
