package com.demovnpt.app.modules.giaodinnhnvin.`data`.model

import com.demovnpt.app.R
import com.demovnpt.app.appcomponents.di.MyApp
import kotlin.String

data class GiaoDiNNhNViNModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtTnNhnVin: String? = MyApp.getInstance().resources.getString(R.string.msg_t_n_nh_n_vi_n)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtMHRMVNP0053: String? = MyApp.getInstance().resources.getString(R.string.msg_m_hrm_vnp0053)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguage: String? = MyApp.getInstance().resources.getString(R.string.msg_qu_n_l_b_n_h_n)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSimDing: String? = MyApp.getInstance().resources.getString(R.string.lbl_sim_di_ng)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguageOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_ch_ti_u)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguageTwo: String? = MyApp.getInstance().resources.getString(R.string.lbl_s_l_ng)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTL: String? = MyApp.getInstance().resources.getString(R.string.lbl_t_l)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGroup228: String? = MyApp.getInstance().resources.getString(R.string.lbl_50)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGroup229: String? = MyApp.getInstance().resources.getString(R.string.lbl_35)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTextin: String? = MyApp.getInstance().resources.getString(R.string.lbl_70)

)
