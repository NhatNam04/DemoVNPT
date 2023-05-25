package com.demovnpt.app.modules.nhpqunlbnhng.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.demovnpt.app.modules.nhpqunlbnhng.`data`.model.NhPQuNLBNHNgModel
import com.demovnpt.app.modules.nhpqunlbnhng.`data`.model.SpinnerMenuTnModel
import com.demovnpt.app.modules.nhpqunlbnhng.`data`.model.SpinnerThngCounterModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class NhPQuNLBNHNgVM : ViewModel(), KoinComponent {
  val nhPQuNLBNHNgModel: MutableLiveData<NhPQuNLBNHNgModel> = MutableLiveData(NhPQuNLBNHNgModel())

  var navArguments: Bundle? = null

  val spinnerThngCounterList: MutableLiveData<MutableList<SpinnerThngCounterModel>> =
      MutableLiveData()

  val spinnerMenuTnList: MutableLiveData<MutableList<SpinnerMenuTnModel>> = MutableLiveData()
}
