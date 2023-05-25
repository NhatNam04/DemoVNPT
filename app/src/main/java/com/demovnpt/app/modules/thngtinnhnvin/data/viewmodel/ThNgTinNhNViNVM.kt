package com.demovnpt.app.modules.thngtinnhnvin.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.demovnpt.app.modules.thngtinnhnvin.`data`.model.ThNgTinNhNViNModel
import org.koin.core.KoinComponent

class ThNgTinNhNViNVM : ViewModel(), KoinComponent {
  val thNgTinNhNViNModel: MutableLiveData<ThNgTinNhNViNModel> =
      MutableLiveData(ThNgTinNhNViNModel())

  var navArguments: Bundle? = null
}
