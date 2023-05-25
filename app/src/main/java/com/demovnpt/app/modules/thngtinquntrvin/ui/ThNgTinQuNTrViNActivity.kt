package com.demovnpt.app.modules.thngtinquntrvin.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.demovnpt.app.R
import com.demovnpt.app.appcomponents.base.BaseActivity
import com.demovnpt.app.databinding.ActivityThNgTinQuNTrViNBinding
import com.demovnpt.app.modules.giaodinquntr.ui.GiaoDiNQuNTrActivity
import com.demovnpt.app.modules.ngnhp.ui.NgNhPActivity
import com.demovnpt.app.modules.thngtinquntrvin.`data`.viewmodel.ThNgTinQuNTrViNVM
import kotlin.String
import kotlin.Unit

class ThNgTinQuNTrViNActivity :
    BaseActivity<ActivityThNgTinQuNTrViNBinding>(R.layout.activity_th_ng_tin_qu_n_tr_vi_n) {
  private val viewModel: ThNgTinQuNTrViNVM by viewModels<ThNgTinQuNTrViNVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.thNgTinQuNTrViNVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.linearRowvolume.setOnClickListener {
      val destIntent = NgNhPActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageIconparksolid.setOnClickListener {
      val destIntent = GiaoDiNQuNTrActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "TH_NG_TIN_QU_N_TR_VI_N_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, ThNgTinQuNTrViNActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
