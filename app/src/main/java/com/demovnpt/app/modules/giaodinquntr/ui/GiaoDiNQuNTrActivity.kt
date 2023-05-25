package com.demovnpt.app.modules.giaodinquntr.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.demovnpt.app.R
import com.demovnpt.app.appcomponents.base.BaseActivity
import com.demovnpt.app.databinding.ActivityGiaoDiNQuNTrBinding
import com.demovnpt.app.modules.giaodinquntr.`data`.viewmodel.GiaoDiNQuNTrVM
import com.demovnpt.app.modules.nhpqunlbnhng.ui.NhPQuNLBNHNgActivity
import com.demovnpt.app.modules.thngtinquntrvin.ui.ThNgTinQuNTrViNActivity
import com.demovnpt.app.modules.xemqunlbnhng.ui.XemQuNLBNHNgActivity
import kotlin.String
import kotlin.Unit

class GiaoDiNQuNTrActivity :
    BaseActivity<ActivityGiaoDiNQuNTrBinding>(R.layout.activity_giao_di_n_qu_n_tr) {
  private val viewModel: GiaoDiNQuNTrVM by viewModels<GiaoDiNQuNTrVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.giaoDiNQuNTrVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnNhpQunLBnHng.setOnClickListener {
      val destIntent = NhPQuNLBNHNgActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.btnXemQunLBnHng.setOnClickListener {
      val destIntent = XemQuNLBNHNgActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageMorehorizontal.setOnClickListener {
      val destIntent = ThNgTinQuNTrViNActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "GIAO_DI_N_QU_N_TR_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, GiaoDiNQuNTrActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
