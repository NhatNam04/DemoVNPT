package com.demovnpt.app.modules.thngtinnhnvin.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.demovnpt.app.R
import com.demovnpt.app.appcomponents.base.BaseActivity
import com.demovnpt.app.databinding.ActivityThNgTinNhNViNBinding
import com.demovnpt.app.modules.giaodinnhnvin.ui.GiaoDiNNhNViNActivity
import com.demovnpt.app.modules.ngnhp.ui.NgNhPActivity
import com.demovnpt.app.modules.thngtinnhnvin.`data`.viewmodel.ThNgTinNhNViNVM
import kotlin.String
import kotlin.Unit

class ThNgTinNhNViNActivity :
    BaseActivity<ActivityThNgTinNhNViNBinding>(R.layout.activity_th_ng_tin_nh_n_vi_n) {
  private val viewModel: ThNgTinNhNViNVM by viewModels<ThNgTinNhNViNVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.thNgTinNhNViNVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageIconparksolid.setOnClickListener {
      val destIntent = GiaoDiNNhNViNActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearRowvolume.setOnClickListener {
      val destIntent = NgNhPActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "TH_NG_TIN_NH_N_VI_N_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, ThNgTinNhNViNActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
