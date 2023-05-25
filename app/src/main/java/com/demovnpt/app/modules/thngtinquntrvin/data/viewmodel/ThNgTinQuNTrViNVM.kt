package com.demovnpt.app.modules.thngtinquntrvin.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.demovnpt.app.modules.thngtinquntrvin.`data`.model.ThNgTinQuNTrViNModel
import org.koin.core.KoinComponent

class ThNgTinQuNTrViNVM : ViewModel(), KoinComponent {
  val thNgTinQuNTrViNModel: MutableLiveData<ThNgTinQuNTrViNModel> =
      MutableLiveData(ThNgTinQuNTrViNModel())

  var navArguments: Bundle? = null
}
