package com.demovnpt.app.modules.ngnhp.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.demovnpt.app.modules.ngnhp.`data`.model.NgNhPModel
import org.koin.core.KoinComponent

class NgNhPVM : ViewModel(), KoinComponent {
  val ngNhPModel: MutableLiveData<NgNhPModel> = MutableLiveData(NgNhPModel())

  var navArguments: Bundle? = null
}
