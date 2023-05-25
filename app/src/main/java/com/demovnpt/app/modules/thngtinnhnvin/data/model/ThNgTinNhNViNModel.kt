package com.demovnpt.app.modules.thngtinnhnvin.`data`.model

import com.demovnpt.app.R
import com.demovnpt.app.appcomponents.di.MyApp
import kotlin.String

data class ThNgTinNhNViNModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtThngTinNhn: String? = MyApp.getInstance().resources.getString(R.string.msg_th_ng_tin_nh_n)
  ,
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
  var txtChcDanhNhn: String? = MyApp.getInstance().resources.getString(R.string.msg_ch_c_danh_nh_n)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtVTrNhnVi: String? = MyApp.getInstance().resources.getString(R.string.msg_v_tr_nh_n_vi)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSinThoi: String? = MyApp.getInstance().resources.getString(R.string.msg_s_i_n_tho_i)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtNgXut: String? = MyApp.getInstance().resources.getString(R.string.lbl_ng_xu_t)

)
