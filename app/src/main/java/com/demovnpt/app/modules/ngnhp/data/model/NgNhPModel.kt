package com.demovnpt.app.modules.ngnhp.`data`.model

import com.demovnpt.app.R
import com.demovnpt.app.appcomponents.di.MyApp
import kotlin.String

data class NgNhPModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtNgNhp: String? = MyApp.getInstance().resources.getString(R.string.lbl_ng_nh_p)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etUsernameValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etPasswordValue: String? = null
)
