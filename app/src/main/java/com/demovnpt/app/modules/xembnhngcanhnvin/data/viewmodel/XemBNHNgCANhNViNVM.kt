package com.demovnpt.app.modules.xembnhngcanhnvin.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.demovnpt.app.modules.xembnhngcanhnvin.`data`.model.XemBNHNgCANhNViNModel
import org.koin.core.KoinComponent

class XemBNHNgCANhNViNVM : ViewModel(), KoinComponent {
  val xemBNHNgCANhNViNModel: MutableLiveData<XemBNHNgCANhNViNModel> =
      MutableLiveData(XemBNHNgCANhNViNModel())

  var navArguments: Bundle? = null
}
