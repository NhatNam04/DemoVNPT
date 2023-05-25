package com.demovnpt.app.modules.xembnhngcanhnvin.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.demovnpt.app.R
import com.demovnpt.app.appcomponents.base.BaseActivity
import com.demovnpt.app.databinding.ActivityXemBNHNgCANhNViNBinding
import com.demovnpt.app.modules.xembnhngcanhnvin.`data`.viewmodel.XemBNHNgCANhNViNVM
import com.demovnpt.app.modules.xemqunlbnhng.ui.XemQuNLBNHNgActivity
import kotlin.String
import kotlin.Unit

class XemBNHNgCANhNViNActivity :
    BaseActivity<ActivityXemBNHNgCANhNViNBinding>(R.layout.activity_xem_b_n_h_ng_c_a_nh_n_vi_n) {
  private val viewModel: XemBNHNgCANhNViNVM by viewModels<XemBNHNgCANhNViNVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.xemBNHNgCANhNViNVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageIconparksolid.setOnClickListener {
      val destIntent = XemQuNLBNHNgActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "XEM_B_N_H_NG_C_A_NH_N_VI_N_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, XemBNHNgCANhNViNActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
