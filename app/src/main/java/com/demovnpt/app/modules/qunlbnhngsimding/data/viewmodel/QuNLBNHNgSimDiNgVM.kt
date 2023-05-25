package com.demovnpt.app.modules.qunlbnhngsimding.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.demovnpt.app.modules.qunlbnhngsimding.`data`.model.QuNLBNHNgSimDiNgModel
import com.demovnpt.app.modules.qunlbnhngsimding.`data`.model.SpinnerThngCounterModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class QuNLBNHNgSimDiNgVM : ViewModel(), KoinComponent {
  val quNLBNHNgSimDiNgModel: MutableLiveData<QuNLBNHNgSimDiNgModel> =
      MutableLiveData(QuNLBNHNgSimDiNgModel())

  var navArguments: Bundle? = null

  val spinnerThngCounterList: MutableLiveData<MutableList<SpinnerThngCounterModel>> =
      MutableLiveData()
}
