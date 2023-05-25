package com.demovnpt.app.modules.nhpqunlbnhng.`data`.model

import com.demovnpt.app.R
import com.demovnpt.app.appcomponents.di.MyApp
import kotlin.String

data class NhPQuNLBNHNgModel(
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
  var txtLanguage: String? = MyApp.getInstance().resources.getString(R.string.msg_nh_p_qu_n_l_b2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTnNhnVin: String? = MyApp.getInstance().resources.getString(R.string.lbl_t_n_nh_n_vi_n)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtChTiu: String? = MyApp.getInstance().resources.getString(R.string.lbl_ch_ti_u2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSimDing: String? = MyApp.getInstance().resources.getString(R.string.msg_sim_di_ng)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtChThch: String? = MyApp.getInstance().resources.getString(R.string.lbl_ch_th_ch2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSimDingOne: String? = MyApp.getInstance().resources.getString(R.string.msg_sim_di_ng)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtNhpbngFile: String? = MyApp.getInstance().resources.getString(R.string.lbl_nh_p_b_ng_file)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFileExcelxl: String? = MyApp.getInstance().resources.getString(R.string.msg_file_excel_xl)

)
