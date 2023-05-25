package com.demovnpt.app.modules.giaodinquntr.`data`.model

import com.demovnpt.app.R
import com.demovnpt.app.appcomponents.di.MyApp
import kotlin.String

data class GiaoDiNQuNTrModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtTnQunTrVi: String? = MyApp.getInstance().resources.getString(R.string.msg_t_n_qu_n_tr_vi)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtMHRMVNP0052: String? = MyApp.getInstance().resources.getString(R.string.msg_m_hrm_vnp0052)

)
