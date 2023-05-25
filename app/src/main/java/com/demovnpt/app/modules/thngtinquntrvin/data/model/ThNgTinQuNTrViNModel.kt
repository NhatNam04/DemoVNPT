package com.demovnpt.app.modules.thngtinquntrvin.`data`.model

import com.demovnpt.app.R
import com.demovnpt.app.appcomponents.di.MyApp
import kotlin.String

data class ThNgTinQuNTrViNModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtThngTinQun: String? = MyApp.getInstance().resources.getString(R.string.msg_th_ng_tin_qu_n)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTnQunTrVi: String? = MyApp.getInstance().resources.getString(R.string.msg_t_n_qu_n_tr_vi)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtMHRMVNP0052: String? = MyApp.getInstance().resources.getString(R.string.msg_m_hrm_vnp0052)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtChcDanhGim: String? = MyApp.getInstance().resources.getString(R.string.msg_ch_c_danh_gi_m)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtVTrGim: String? = MyApp.getInstance().resources.getString(R.string.msg_v_tr_gi_m)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSinThoi: String? = MyApp.getInstance().resources.getString(R.string.msg_s_i_n_tho_i2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtNgXut: String? = MyApp.getInstance().resources.getString(R.string.lbl_ng_xu_t)

)
