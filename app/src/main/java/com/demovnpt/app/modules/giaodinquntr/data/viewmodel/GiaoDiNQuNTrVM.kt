package com.demovnpt.app.modules.giaodinquntr.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.demovnpt.app.modules.giaodinquntr.`data`.model.GiaoDiNQuNTrModel
import org.koin.core.KoinComponent

class GiaoDiNQuNTrVM : ViewModel(), KoinComponent {
  val giaoDiNQuNTrModel: MutableLiveData<GiaoDiNQuNTrModel> = MutableLiveData(GiaoDiNQuNTrModel())

  var navArguments: Bundle? = null
}
