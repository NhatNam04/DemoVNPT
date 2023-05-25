package com.demovnpt.app.modules.xemqunlbnhng.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.demovnpt.app.modules.xemqunlbnhng.`data`.model.SpinnerThngCounterModel
import com.demovnpt.app.modules.xemqunlbnhng.`data`.model.XemQuNLBNHNgModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class XemQuNLBNHNgVM : ViewModel(), KoinComponent {
  val xemQuNLBNHNgModel: MutableLiveData<XemQuNLBNHNgModel> = MutableLiveData(XemQuNLBNHNgModel())

  var navArguments: Bundle? = null

  val spinnerThngCounterList: MutableLiveData<MutableList<SpinnerThngCounterModel>> =
      MutableLiveData()
}
